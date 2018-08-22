package com.thanhle.pojo;

import javax.persistence.Entity;

@Entity
public class Monhoc {
	private int mamonhoc;
	private String tenmonhoc;
	private int sotinchi;
	private int magiaovien;
	public Monhoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Monhoc(int mamonhoc, String tenmonhoc, int sotinchi, int magiaovien) {
		super();
		this.mamonhoc = mamonhoc;
		this.tenmonhoc = tenmonhoc;
		this.sotinchi = sotinchi;
		this.magiaovien = magiaovien;
	}
	public int getMamonhoc() {
		return mamonhoc;
	}
	public void setMamonhoc(int mamonhoc) {
		this.mamonhoc = mamonhoc;
	}
	public String getTenmonhoc() {
		return tenmonhoc;
	}
	public void setTenmonhoc(String tenmonhoc) {
		this.tenmonhoc = tenmonhoc;
	}
	public int getSotinchi() {
		return sotinchi;
	}
	public void setSotinchi(int sotinchi) {
		this.sotinchi = sotinchi;
	}
	public int getMagiaovien() {
		return magiaovien;
	}
	public void setMagiaovien(int magiaovien) {
		this.magiaovien = magiaovien;
	}
	
}
