package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(scopeName = "singleton") it's by default 
@Scope(scopeName = "prototype")
public class Doctor implements Staff {

	/*
	 * private String qualification;
	 * 
	 * 
	 * private Nurse nurse;
	 * 
	 * public Nurse getNurse() { return nurse; }
	 * 
	 * public void setNurse(Nurse nurse) { this.nurse = nurse; }
	 * 
	 * 
	 * public Doctor(String qualification) { this.qualification = qualification; }
	 * 
	 * public String getQualification() { return qualification; }
	 * 
	 * public void setQualification(String qualification) { this.qualification =
	 * qualification; }
	 */

	private String qualification;

	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + "]";
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void assist() {
		System.out.println("Doctor is assisting");
	}

}
