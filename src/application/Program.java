package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			PrintService<String> printService = new PrintService<>();
			System.out.print("How many values: ");
			int nValues = sc.nextInt();
			for(int i=0; i<nValues; i++) {
			printService.addValue(sc.next());
		}
		printService.print();
		System.out.println("First: " + printService.first());
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}

	}

}
