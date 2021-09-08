package p06class.p01textbook.exercises.p20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int num = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("------------");
		System.out.println(" 계좌 생성 ");
		System.out.println("------------");
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("계좌주:");
		String owner = scanner.next();
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();
		if (num <= 100) {
			accountArray[num++] = new Account(ano, owner, balance);
			System.out.println("결과: 계좌가 생성되었습니다.");
		}
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("------------");
		System.out.println(" 계좌 목록 ");
		System.out.println("------------");
		for (int i = 0; i < num; i++) {
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("  예금  ");
		System.out.println("-----------");

		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("예금액:");
		int balance = scanner.nextInt();

		if (findAccount(ano) != null) {
			findAccount(ano).setBalance(findAccount(ano).getBalance() + balance);
			System.out.println("결과: 예금이 성공되었습니다.");
		} else
			System.out.println("일치하는 계좌 정보가 없습니다.");
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("  출금  ");
		System.out.println("-----------");

		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("출금액:");
		int balance = scanner.nextInt();

		if (findAccount(ano) != null) {
			if (balance <= findAccount(ano).getBalance()) {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
				System.out.println("결과: 출금이 성공되었습니다.");
			} else
				System.out.println("결과: 돈이 부족합니다.");
		} else
			System.out.println("일치하는 계좌 정보가 없습니다.");
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for (int i = 0; i < num; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
}
