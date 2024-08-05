package com.templeapps.temple.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Priest {
	@Id
	int id;
	
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	int age;
	String workassigned;
	String education;
	int experience;
	String place;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWorkassigned() {
		return workassigned;
	}
	public void setWorkassigned(String workassigned) {
		this.workassigned = workassigned;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Priest [name=" + name + ", age=" + age + ", workassigned=" + workassigned + ", education=" + education
				+ ", experience=" + experience + ", place=" + place + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, education, experience, name, place, workassigned);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Priest other = (Priest) obj;
		return age == other.age && Objects.equals(education, other.education) && experience == other.experience
				&& Objects.equals(name, other.name) && Objects.equals(place, other.place)
				&& Objects.equals(workassigned, other.workassigned);
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}

}
