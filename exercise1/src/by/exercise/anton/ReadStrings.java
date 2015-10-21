package by.exercise.anton;

import java.util.Scanner;

public class ReadStrings {
	
	protected static void readFromConsole(int �, Scanner scan){

		System.out.println("������� ���������� �����: ");
		int i = scan.nextInt();
		
		scan.nextLine();
		System.out.println("i = "+ i);
		
		while (i<=0){
			System.out.println("������� ����� ��� ���: ");
			i = scan.nextInt();
		}
		
		System.out.print("������� ������ 1�: \n");
		String neededStr = scan.nextLine();
		System.out.println(neededStr);
		String nextStr;
		
		for (int k = 2; k <= i; k++) {
				System.out.println("������� " + k + "� ������: " );
				
				nextStr = scan.nextLine();
				if (nextStr.length() < neededStr.length())
					neededStr = nextStr;
		}
		
		System.out.println("����� �������� ������: " + neededStr);
		
		scan.close();
	}

//---------------------- READING THE WORDS -----------------------
protected static void readFromConsole(String str, Scanner scan){
		
		System.out.println("������� ���������� ����: ");
		int i = scan.nextInt();
		
		scan.nextLine();
		System.out.println("i = "+ i);
		
		while (i<=0){
			System.out.println("�������� ������. ������� ����� ��� ���: ");
			i = scan.nextInt();
			scan.nextLine();
		}
		
		System.out.print("������� 1 �����: \n");
		String neededStr = scan.next();
		System.out.println(neededStr);
		scan.nextLine();
		String nextStr;
		
		for (int k = 2; k <= i; k++) {
				System.out.println("������� " + k + " �����: " );
				
				nextStr = scan.next();
				scan.nextLine();
				if (nextStr.length() < neededStr.length())
					neededStr = nextStr;
		}
		
		System.out.println("����� �������� �����: " + neededStr);
		
		scan.close();
	}
}
