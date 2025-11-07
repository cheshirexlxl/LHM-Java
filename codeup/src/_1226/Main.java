package _1226;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 6;			
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();			
		}
		
		int b = sc.nextInt();		
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();					
		}		
		
		int count = 0;
		int count2 = 0;		
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {            	
                if (arr1[i] == arr2[j]) {                     
                    count++;
                    break; // 중복 방지
                }
            }
        }
		boolean found = false;
		for (int j = 0; j < n; j++) {
			if(b == arr2[j]) {
				found = true;
                break;
			}
		}
		if (found) {            
            count2++;
        }		
		
		if ( count == 6) {
			System.out.println("1");
		}
		else if( count == 5 && count2 == 1) {
			System.out.println("2");
		}
		else if ( count == 5) {
			System.out.println("3");
		}
		else if ( count == 4) {
			System.out.println("4");
		}
		else if ( count == 3) {
			System.out.println("5");
		}
		else {
			System.out.println("0");
		}		

		sc.close();
	}
}
