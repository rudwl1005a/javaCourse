package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.print("l:list, e:exit, r:remove 입력>");
			String str = scanner.nextLine();
			
			switch (str) {
			case "l":
				for (String s : list) {
					System.out.println(s);
				}
				break;
			case "e":
				run = false;
				break;
				
			case "r":
				// 마지막 입력한 item이 삭제
//				if (list.size() > 0) {
				if (!list.isEmpty()) {
					list.remove(list.size()-1);
				}
				break;
				
			default:
				list.add(str);
				break;
			}
		}
		
		scanner.close();
	}
}
