package test;

import java.util.Arrays;
import java.util.Scanner;

public class submit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("input을 입력하세요 : ");
	
		String input = scan.nextLine();
		System.out.println(input);
		
		String[] arr = new String[2];
		arr = input.split(" ");
		
		System.out.print("nlist를 입력하세요 : ");
		String nlist = scan.nextLine();	
		String[] arr2 = nlist.split(" ");

		System.out.print("mlist를 입력하세요 : ");
		String mlist = scan.nextLine();	
		String[] arr3 = mlist.split(" ");

		
		if(arr2.length != Integer.parseInt(arr[0])) {
			System.out.println("error");
		} else {
			System.out.println(nlist);
		}
		
		if(arr3.length != Integer.parseInt(arr[1])) {
			System.out.println("error");
		} else {
			for(int i=0; i<arr3.length; i++) {
				System.out.println(arr3[i]);
			}
		}
		
		System.out.println("output");
	
		for(int i=0; i<arr3.length; i++) {
			Arrays.sort(arr2);
			int idx = Arrays.binarySearch(arr2, arr3[i]);
			if(idx >= 0 ){
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
		
		
	}

}
