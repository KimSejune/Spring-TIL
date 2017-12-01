package gcd;


public class intfibonacci {
	
	// long type을 사용하는 것이 중요하다.
	public long fibonacci(int num) {
		int answer = 0;
		int[] arr = new int[num + 1];

		arr[0] = 0;
		arr[1] = 1;
		if (num <= 2) {
			answer = 1;
		} else {
			for (int i = 2; i <= num; i++) {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		answer = arr[num];
		return answer;
	}

	public static void main(String[] args) {
		intfibonacci c = new intfibonacci();
		for (int i = 2; i <= 70; i++) {
			System.out.println(i + " " + c.fibonacci(i));
		}

	}
}


