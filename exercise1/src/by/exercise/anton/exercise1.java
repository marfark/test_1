package by.exercise.anton;

import java.util.Scanner;


public class exercise1 {

	public static void main(String[] args) {
//---------------
//		------------
//		----------

		Scanner scan = new Scanner(System.in);
		
		String s="";
		label:while (true){
			System.out.println("��� �� ������ �������? �������� (������|�����). ");
			s = scan.next();
			scan.nextLine();

			switch (s) {
			case ("������"):
			case ("������"):
				ReadStrings.readFromConsole(1, scan);
				break label;
			
			case ("�����"):
			case ("�����"):
				ReadStrings.readFromConsole("123qwe", scan);
				break label;
				
			default:
				//System.out.println("��� �� ������ �������? �������� (������|�����). ");
				//s = scan.next();
				//scan.nextLine();
				break;
			}
		}
		
		scan.close();
	}

}
