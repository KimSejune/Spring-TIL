package dynamicFibo;

import java.util.ArrayList;

public class fiboexample {
	
	// long type을 사용하는 것이 중요하다.
	public long fibonacci(int num) {
		long answer = 0;
		long[] arr = new long[num + 1];

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
		fiboexample c = new fiboexample();
		for (int i = 2; i <= 65; i++) {
			System.out.println(i + " " + c.fibonacci(i));
		}

	}
}

