package com.app.Example;

import java.lang.String;

public class Laptop implements Comparable<Laptop> {

	private String company;
	private int price;
	private String ram;

	public Laptop(String company, int price, String ram) {
		super();
		this.company = company;
		this.price = price;
		this.ram = ram;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", price=" + price + ", ram=" + ram + "]";
	}

	@Override
	public int compareTo(Laptop l2) {
		String s1 = this.ram;
		String s2 = l2.ram;

		return -s1.compareTo(s2);

	}

}
