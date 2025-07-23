package com.springjpa.StudentSpringJPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="aid")
	int aid;
	@Column(name="mobile")
	long mobile;
	@Column(name="house_no")
	String house_no;
	@Column(name="street")
	String street;
	@Column(name="area")
	String area;
	@Column(name="city")
	String city;
	@Column(name="country")
	String country;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", mobile=" + mobile + ", house_no=" + house_no + ", street=" + street
				+ ", area=" + area + ", city=" + city + ", country=" + country + "]";
	}
	public Address() {
		super();
	}
	public Address(int aid, long mobile, String house_no, String street, String area, String city, String country) {
		super();
		this.aid = aid;
		this.mobile = mobile;
		this.house_no = house_no;
		this.street = street;
		this.area = area;
		this.city = city;
		this.country = country;
	}
	public Address(long mobile, String house_no, String street, String area, String city, String country) {
		super();
		this.mobile = mobile;
		this.house_no = house_no;
		this.street = street;
		this.area = area;
		this.city = city;
		this.country = country;
	}
	
	
}
