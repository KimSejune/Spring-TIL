package test;

public class ka2test {
	public static void main(String[] args) {
		int n = 5;
		int[] arr = {1,2,2,4,5};
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length; j++) {
				if(arr[j] == arr[i]) {
					count++;
				}
			}
			if(count >1 ){
				System.out.println("false");
				break;
			}else {
				count = 0;
			}
		}
		
	}
		
}
