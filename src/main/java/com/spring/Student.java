package com.spring;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonIgnoreProperties({"lname","location"})
@JsonPropertyOrder({"lname","location"})
public class Student {
			@Size(min = 3, max = 10)
			@JsonProperty("First_name is ")
			private String fname;
			private String lname;
			private String location;
			
			public String getFname() {
				return fname;
			}
			public void setFname(String fname) {
				this.fname = fname;
			}
			public String getLname() {
				return lname;
			}
			public void setLname(String lname) {
				this.lname = lname;
			}
			public String getLocation() {
				return location;
			}
			public void setLocation(String location) {
				this.location = location;
			}
			
}
