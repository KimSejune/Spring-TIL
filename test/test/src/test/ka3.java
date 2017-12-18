package test;

/**
 * 직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때, 나머지 한 점의 좌표를 구하려고 합니다.
 * 점 3개의 좌표가 들어있는 배열 v가 매개변수로 주어질 때, 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 return 하도록 solution 함수를 완성해주세요.
 * 단, 직사각형의 각 변은 x축, y축에 평행하며, 반드시 직사각형을 만들 수 있는 경우만 입력으로 주어집니다.
 */


public class ka3 {
	public static void main(String[] args) {
		int[][] arr = {{1,3},{1,10},{5,3}};
		int[] answer = new int[2];
		answer[0] = 0;
		answer[1] = 0;
		for(int i = 0; i<arr.length; i++) {
			answer[0] ^= arr[i][0];
			answer[1] ^= arr[i][1];
		}
		System.out.println(answer[0]+" "+answer[1]);

	}
}
