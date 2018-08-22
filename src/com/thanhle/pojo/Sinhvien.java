package com.thanhle.pojo;

import javax.persistence.Entity;

@Entity
public class Sinhvien {
	private int mssv;
	private String hoten;
	private String namsinh;
	private String gioitinh;
	private String email;
	private String sdt;
	
	public Sinhvien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sinhvien(int mssv, String hoten, String namsinh, String gioitinh, String email, String sdt) {
		super();
		this.mssv = mssv;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
		this.email = email;
		this.sdt = sdt;
	}
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
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
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	
}
