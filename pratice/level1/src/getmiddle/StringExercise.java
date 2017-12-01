package getmiddle;

public class StringExercise {
	
	String getMiddle(String word) {
		if(word.length() % 2 == 0) {
			word = word.substring((word.length()/2)-1, word.length()/2+1);
		}else {
			word = word.substring(word.length()/2, (word.length()/2)+1);
		}
		return word;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		StringExercise se = new StringExercise();
		System.out.println(se.getMiddle("poweer"));
	}
}
