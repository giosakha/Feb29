package exception;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter Initial balance: ");
			double initialBalance = in.nextDouble();
			// nested try catch block
			try {
				System.out.println("Enter amount to withdraw: ");
				double withdrawalAmount = in.nextDouble();
				validateWithdrawalAmount(withdrawalAmount);
				double remainingBalance = updateBalance(initialBalance, withdrawalAmount);
				System.out.println(" Updated balance after the withdrawal $" + withdrawalAmount);
			}

			catch (InvalidWithdrawalException e) {

				System.out.println(" Invalid withdrawal amount " + e.getMessage());
			} catch (Exception e) {
				System.out.println(" An error occured " + e.getMessage());
			}
		} finally {
			// this code will always get executed
			System.out.println("finally block executed");
			in.close();
		}
	}

	private static void validateWithdrawalAmount(double withdrawalAmount) throws InvalidWithdrawalException {
		if (withdrawalAmount <= 0) {
			throw new InvalidWithdrawalException(" Withdrawal amount must be greater than Zero");
		}
	}

	static double updateBalance(double initialBalance, double withdrawalAmount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if (withdrawalAmount > initialBalance) {
			throw new InsufficientFundsException("Insufficient funds for withdrawal");
		}
		return initialBalance - withdrawalAmount;
	}

	static class InvalidWithdrawalException extends Exception {
		public InvalidWithdrawalException(String message) {
			super(message);
		}
	}

	static class InsufficientFundsException extends Exception {
		public InsufficientFundsException(String message) {
			super(message);
		}
	}
}
