package by.exercise.anton;

import java.util.Scanner;

public class ReadStrings {
	
	protected static void readFromConsole(int о, Scanner scan){

		System.out.println("Введите количество строк: ");
		int i = scan.nextInt();
		
		scan.nextLine();
		System.out.println("i = "+ i);
		
		while (i<=0){
			System.out.println("Введите число еще раз: ");
			i = scan.nextInt();
		}
		
		System.out.print("Введите строку 1ю: \n");
		String neededStr = scan.nextLine();
		System.out.println(neededStr);
		String nextStr;
		
		for (int k = 2; k <= i; k++) {
				System.out.println("Введите " + k + "ю строку: " );
				
				nextStr = scan.nextLine();
				if (nextStr.length() < neededStr.length())
					neededStr = nextStr;
		}
		
		System.out.println("Самая короткая строка: " + neededStr);
		
		scan.close();
	}

//---------------------- READING THE WORDS -----------------------
protected static void readFromConsole(String str, Scanner scan){
		
		System.out.println("Введите количество слов: ");
		int i = scan.nextInt();
		
		scan.nextLine();
		System.out.println("i = "+ i);
		
		while (i<=0){
			System.out.println("Неверный формат. Введите число еще раз: ");
			i = scan.nextInt();
			scan.nextLine();
		}
		
		System.out.print("Введите 1 слово: \n");
		String neededStr = scan.next();
		System.out.println(neededStr);
		scan.nextLine();
		String nextStr;
		
		for (int k = 2; k <= i; k++) {
				System.out.println("Введите " + k + " слово: " );
				
				nextStr = scan.next();
				scan.nextLine();
				if (nextStr.length() < neededStr.length())
					neededStr = nextStr;
		}
		
		System.out.println("Самое короткое слово: " + neededStr);
		
		scan.close();
	}
}
