package test;

/**
 * 길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
 * 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.
 */

public class ka2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		System.out.println(checkduple(arr));
	}
	
	public static boolean checkduple(int[] arr) {
		
		boolean answer = true;
		boolean[] check = new boolean[arr.length+1];
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] <= arr.length && !check[arr[i]]) {
				check[arr[i]] = true;
			}else {
				answer = false;
				break;
			}
			System.out.println(check[i]);
		}
		
		return answer;
		
	}
		
}
