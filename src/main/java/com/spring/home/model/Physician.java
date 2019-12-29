package com.spring.home.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Physician {
	private long employeeID;
	private String name;
	private String position;
	private long ssn;
	
	@Override
	public String toString() {
		return "Physician [employeeID=" + employeeID + ", name=" + name + ", position=" + position + ", ssn=" + ssn
				+ "]";
	}
	
	
}
