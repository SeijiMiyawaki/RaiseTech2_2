package task2;

import java.util.Scanner;

public class WorkplaceCommunication implements Communication{

	boolean isWhere = false;

	public String greet(String str1) {
		if (str1.equals("hello")) {
			return "hello";
		} else {
			return "・・・";
		}
		}

	public Boolean isWhere(String work) {
		if(work.equals("職場")) {
			this.isWhere =true;
		} else {
			return isWhere;
		}
		return isWhere;


	}

	public static void main(String[] args) {


		WorkplaceCommunication wpc = new WorkplaceCommunication();

		Scanner sc = new Scanner(System.in);
		System.out.println("入力してください");
		String input_text = sc.nextLine();
		System.out.println(wpc.greet(input_text));
		System.out.println("---------------------------");
		System.out.println("ここはどこですか？");
		String where = sc.next();
		System.out.println("・・・");
		String work = sc.next();

		System.out.println("職場か判断しています。");

		if (work.equals("hello")) {
			if (wpc.isWhere(where) == true) {
				System.out.println("hello");
			} else {
				System.out.println("yeah!!");
				sc.close();
			}
		} else {
			System.out.println("ご機嫌よう！");
		}

		System.out.println("---------------");
		System.out.println("誰から話しかけられましたか？");

		try {
			String person = sc.next();
			if (person.equals("会長")) {
				throw new Exception("固まった！");
			} else if (person.equals("社長")) {
				throw new Exception("お辞儀した");
			} else {
				System.out.println(wpc.greet(person));
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
		}


	}

}
