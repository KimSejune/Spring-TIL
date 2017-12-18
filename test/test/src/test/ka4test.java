package test;

public class ka4test {
	public static void main(String args[]) {
		int[][] result = {{0,1,1,1}, {0,1,1,0}, {0,1,1,0}, {0,0,0,0}};
		int w = 0;
		for(int i = 0; i<result.length; i++) {
			for(int j = 0; j<result[i].length; j++) {
				if(result[i][j] == 0) {
					continue;
				}
				if((i>0 && result[i-1][j]>0) && (j>0 && result[i][j-1]>0) && (i>0 && j>0 && result[i-1][j-1] > 0 )) {
					result[i][j] = Math.min(Math.min(result[i-1][j], result[i][j-1]), result[i-1][j-1])+1;
				}
				w = w < result[i][j] ? result[i][j] : w;
			}
			
		}
		System.out.println(w*w);
	}
}
