package com.spring.home.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.home.model.Physician;

import lombok.extern.log4j.Log4j2;


@Repository
@Log4j2
public class HospitalRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Physician> getHospitalData() {
		 String sql = "SELECT * FROM hospital.physician";
		List<Physician> physicianList = jdbcTemplate.query(
	                sql,
	                (rs, rowNum) ->
	                Physician.builder()
	                .employeeID(rs.getLong("EmployeeID"))
	                .name(rs.getString("Name"))
	                .position(rs.getString("Position"))
	                .ssn(rs.getLong("SSN")).build());
		for(Physician physician:physicianList) {
			log.info(physician.toString());
		}
		return physicianList;
	}

}
