package test;

public class ka3test {
	public static void main(String[] args) {
		
		int[][] v = {{3,1},{5,1},{5,10}};
		int[] answer = {0, 0};
			
		for(int i=0; i<v.length; i++) {
			answer[0] ^= v[i][0];
			answer[1] ^= v[i][1];
		}
		
		System.out.println(answer[0]+" "+answer[1]);
	}
}
