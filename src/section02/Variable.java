package section02;
/*
 * 변수(Variable)
 * 		값을 저장하기 위한 메모리 공간
 * 		변수는 이름을 통해 해당 메모리 공간에 접근하고 값을 읽거나 수정 가능
 * 
 * 변수 선언 및 초기화 
 * 		자료형 변수명 = 값;
 * 
 * 기본 자료형
 * 		자바에서 기본적으로 제공해주는 자료형
 *  			정수형 - byte, short, int, long
 *  		 	실수형 -float, double
 *  			문자형 - char
 *  			논리형 - boolean 
 */

public class Variable {
	public static void main(String[] args) {
		// 정수형 변수 선언하고 값 대입하기
		int numInt = 10;
		
		// 실수형 변수 선언하고 값 대입하기
		double numDouble = 10.1;
		
		// 문자열 변수 선언하고 값 대입하기
		String str = "Hello";
		
		System.out.println(numInt);
		System.out.println( numDouble);
		System.out.println(str);
		
	}
}
