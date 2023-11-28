package pl.strefakursow.eLunchApp.model;

import pl.strefakursow.eLunchApp.model.enums.Sex;

import jakarta.annotation.Nullable;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class PersonalData {

	@Nullable
	private String name;

	@Nullable
	private String surname;

	@Nullable
	@Enumerated(EnumType.STRING)
	private Sex sex;

	@Nullable
	private String phone;

	@Nullable
	private String email;


	@Nullable
	public String getName() {
		return name;
	}

	public void setName(@Nullable String name) {
		this.name = name;
	}

	@Nullable
	public String getSurname() {
		return surname;
	}

	public void setSurname(@Nullable String surname) {
		this.surname = surname;
	}

	@Nullable
	public Sex getSex() {
		return sex;
	}

	public void setSex(@Nullable Sex sex) {
		this.sex = sex;
	}

	@Nullable
	public String getPhone() {
		return phone;
	}

	public void setPhone(@Nullable String phone) {
		this.phone = phone;
	}

	@Nullable
	public String getEmail() {
		return email;
	}

	public void setEmail(@Nullable String email) {
		this.email = email;
	}
}
