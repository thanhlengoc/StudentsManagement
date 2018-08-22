package com.thanhle.pojo;

public class Giaovien {
	private int magiaovien;
	private String hoten;
	private String gioitinh;
	private String email;
	public Giaovien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Giaovien(int magiaovien, String hoten, String gioitinh, String email) {
		super();
		this.magiaovien = magiaovien;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.email = email;
	}
	public int getMagiaovien() {
		return magiaovien;
	}
	public void setMagiaovien(int magiaovien) {
		this.magiaovien = magiaovien;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
