package com.thanhle.pojo;

public class Lop {
	 private int malop;
	 private String tenlop;
	 private String makhoa;
	 private int siso;
	public Lop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lop(int malop, String tenlop, String makhoa, int siso) {
		super();
		this.malop = malop;
		this.tenlop = tenlop;
		this.makhoa = makhoa;
		this.siso = siso;
	}
	public int getMalop() {
		return malop;
	}
	public void setMalop(int malop) {
		this.malop = malop;
	}
	public String getTenlop() {
		return tenlop;
	}
	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}
	public String getMakhoa() {
		return makhoa;
	}
	public void setMakhoa(String makhoa) {
		this.makhoa = makhoa;
	}
	public int getSiso() {
		return siso;
	}
	public void setSiso(int siso) {
		this.siso = siso;
	}
	 
	
}
