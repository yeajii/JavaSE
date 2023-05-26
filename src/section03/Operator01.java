package section03;
/*
 * 연산자 (Operator)
 * 		프로그램에서 데이터를 처리하여 산출하는 것을 연산이라 함
 * 		연산에 사용되는 표시나 기호를 연산자(Operator) 라고 함
 * 
 * 		1 . 산술연산자
 * 			+, 	-, 		*,		 /, 	%
 * 
 * 			숫자 + 숫자 -> 숫자
 * 			문자에서 + 는 연결연산자이다
 * 			문자 + 문자 or 숫자 -> 문자 연결
 *  
 *        Ctrl + s 저장
 *         Ctrl + shift + s  전체저장
 * 		
 */

public class Operator01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// 두 수의 합을 구해서 sum이라는 int형 변수에 대입 
		int sum = num1 + num2;
		System.out.println("sum: " + sum);
		
		String result = num1 + "+" + num2 + "=" + sum;
		System.out.println(result);
		
		// 두 수의 곱을 구해서 multiply 라는 변수에 대입
		int multiply = num1 * num2;
		System.out.println("두 수의 곱: " + multiply);
		
		// 나누기
		int divide = 10/3;
		System.out.println("10/3 : " + divide);
		
		int divide2 = num1/num2;
		System.out.println(" num1/num2: " +divide2);
		
		// 나머지 값
		int resultNum = 9 % 5;
		System.out.println("9 % 5: " + resultNum);
		
		
 	}
	
}
