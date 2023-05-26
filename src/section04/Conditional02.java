package section04;
/*
 * 1-2 	
 *     if-else 문
 * 		if(조건식) {
 * 				조건식이 true 일 때 실행 명령문
 * 		} else {
 * 				조건식이 false 일 때 실행 명령문
 * 		}
 * 
 * 
 * 	1-3
 * 	   if-else   if-else
 * 		if(조건식1) {
 * 				조건식1이 true일 때 실행 명령문
 * 		} else if(조건식2) {
 * 				조건식2가 true 일 때 실행 명령문
 * 		} else {
 * 				조건식1, 조건식2 모두 false일 때 명령문
 *     }
 * 		
 */
public class Conditional02 {
	public static void main(String[] args) {
		int num = 11;
		
		if(num % 2 == 0) {
			System.out.println("num은 짝수입니다.");
		} else {
			System.out.println("num은 홀수입니다.");
		}
		
		String id = "java01";
		String pwd = "helloworld";
		
		if(id == "java01") {
			System.out.println("아이디가 일치합니다.");
		} else if(pwd == "helloworld") {
			System.out.println("비밀번호가 일치합니다.");
		}
		
		int num2 = 13;
		if(num2 % 3 == 0) {
			System.out.println("num2는 나머지가 0입니다.");
		} else if(num2 % 3 == 1) {
			System.out.println("num2는 나머지가 1입니다.");
		} else if(num2 % 3 == 2) {
			System.out.println("num2 는 나머지가 2입니다.");
		} else {
			System.out.println("num2는 정수가 아닙니다.");
		}
	}

}
