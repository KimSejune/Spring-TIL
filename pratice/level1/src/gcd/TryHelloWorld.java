package gcd;

import java.util.Arrays;

// 최대공약수 최소공배수 !!!
public class TryHelloWorld {
	
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
    	int[] alist = new int[a];  
      	int[] blist = new int[b];  
      	int firstresult = 0;
      	int secondresult = 0;
      	
      	answer[0] = 0;
      	for(int i = 1; i <=a; i++) {
        	if(a%i == 0 ) {
            alist[i-1] = i;
            System.out.println("alist" + alist[i-1]);
          }
        }
        for(int i = 1; i <=b; i++) {
        	if(b%i == 0 ) {
            blist[i-1] = i;
            System.out.println("blist" + blist[i-1]);
          }
        }
        
        for(int i = 0; i<alist.length; i++) {
        	Arrays.sort(blist);
        	int idx = Arrays.binarySearch(blist, alist[i]);
        	if(idx>=0) {
        		if(answer[0] <= alist[i]) {
        			answer[0] = alist[i];
        		}
        	}
        }
        firstresult = (a/answer[0]);
        secondresult = (b/answer[0]);
        answer[1] = answer[0]*firstresult*secondresult;
				      
        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}



//import java.util.Arrays;
//
//class TryHelloWorld {
//    public int[] gcdlcm(int a, int b) {
//        int[] answer = new int[2];
//
//          answer[0] = gcd(a,b);
//        answer[1] = (a*b)/answer[0];
//        return answer;
//    }
//
//   public static int gcd(int p, int q)
//   {
//    if (q == 0) return p;
//    return gcd(q, p%q);
//   }
//
//    // 아래는 테스트로 출력해 보기 위한 코드입니다.
//    public static void main(String[] args) {
//        TryHelloWorld c = new TryHelloWorld();
//        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
//    }
//}
