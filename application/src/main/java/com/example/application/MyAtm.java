package com.example.application;

/**
 * Created by adi on 6/11/18.
 */
public class MyAtm {

	private static final int account = 10;

	public static void withdrawMoney(int amount) throws InterruptedException {
		Thread.sleep(2000l); // processing going on here
		System.out.println("[Application] Successful Withdrawal of [{}] units!"+ amount);

	}
}
