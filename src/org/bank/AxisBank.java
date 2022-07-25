package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void saving() {
		System.out.println("saving bank =10");
		super.saving();
	}
	@Override
	public void fixed() {
		System.out.println("fixed =12");
		super.fixed();
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.saving();
		a.fixed();
	}
	

}

