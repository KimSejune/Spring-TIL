package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class submit2 {

	public static void main(String[] args) throws IOException   {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("input입력 : ");
	    String input = br.readLine();
	    
	    System.out.println(input);
	    String[] arr = new String[2];
	    arr = input.split(" ");
	    
	    System.out.print("n 입력 : ");
	    String nlist = br.readLine();
	    String[] narr = nlist.split(" ");
	    
	    if ((narr.length != Integer.parseInt(arr[0])) && narr.length > 0 && narr.length < 20000) {
	      System.out.println("Input != nlist length Error");
	    } else {
	      System.out.println(nlist);
	    }
	    
	    
	    
	    System.out.print("m 입력 : ");
//	    for(int i = 0; i<marr.length; i++) {
//	      marr[i] = br.readLine();
//	    }
	    

	    if ((marr.length != Integer.parseInt(arr[1]))) {
	      System.out.println("Input != mlist length Error");
	    }else {
	    String[] marr = new String[Integer.parseInt(arr[1])];
	      for (int i = 0; i < marr.length; i++) {
	    	marr[i] = br.readLine();
	        System.out.println(marr[i]);
	      } 
	    }

	    System.out.println("Output");
	    
	    for(int i = 0; i < marr.length; i++) {
	      Arrays.sort(narr);
	      int index = Arrays.binarySearch(narr, marr[i]);
	      
	      if (index >= 0) {
	        System.out.println("True");
	      } else {
	        System.out.println("False");
	      }
	    }
	    
	    
	  }
}
