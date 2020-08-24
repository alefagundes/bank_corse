package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.println("inform the number ou account:");
		int number = sc.nextInt();
		System.out.println("inform the name ou account");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("dou you want make a initial Deposit:");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("imforme the value of deposit:");
			double initialDeposit = sc.nextDouble();
			account = new Account(holder, number, initialDeposit);
		} else {
			account = new Account(holder, number);
		}
		System.out.println();
		System.out.println("Account data:");

		System.out.println(account);
		System.out.println();
		System.out.print("inform the value of deposit:");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println();
		System.out.println("Uppdated account data:");
		System.out.println(account);
		System.out.println("inform the value of withdraw:");
		depositValue = sc.nextDouble();
		account.withdraw(depositValue);
		System.out.println();
		System.out.println(account);
		
		sc.close();
	}

}
