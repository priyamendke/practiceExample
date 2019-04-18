package com.app.Example;

class BankAccount {

	private double balance;

	public void setBalance(double balance) {
		if (balance <= 0) {
			System.out.println("not allow negative value");
		} else {

			this.balance = balance;
		}
	}

	public double getBalance() {
		return balance;
	}
}

public class Clerk {

	public static void main(String[] args) {
		BankAccount bc = new BankAccount();
		bc.setBalance(5000);
		System.out.println(bc.getBalance());

		
		bc.setBalance(-5000);
		System.out.println(bc.getBalance());

	}

}
