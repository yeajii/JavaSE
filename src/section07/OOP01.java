package section07;
/*
 * OOP (object Oriented Programming)
 * 		객체 지향 프로그래밍
 * 		프로그램을 작성할 때 데이터와 데이터와 조작하는 메소드를 하나의 논리적 단위인 객체로 묶는 방식
 *  
 * 	객체(Object)
 * 		물리적으로 존재하거나 추상적으로 생각할 수 있는 것
 * 		정의 가능하고 식별 가능
 * 		속성(변수)과 기능(메소드)으로 구성되어 있다
 *   	
 *   예) 물리적인 객체 - 사이트 회원, 컴퓨터, 자동차, 상품 등
 *   		추상적인 객체 - 주문정보, 생산정보, 회계장부 등
 *   
 *   객체 구성요소
 *   1) 속성
 *   2) 기능
 *   
 *   ex) 티모 객체 
 *    		속성 1) 공격력 - 10
 *    				 2) 방어력 - 3
 *    				 3) 체력(HP) -  800
 *    			     4) 이동속도 - 5
 *    		
 *    		기능 1) 실명 - 상대 시야 가리고 독 데미지 + 상대 스킬침묵
 *    				 2) 신속 - 이동속도 올라가는 스킬 {이동속도 *1.2;}
 *    
 *  Class 
 *    	객체를 만들기 위한 설계도
 *    	new 연산자를 통해 class에 작성된 코드를 읽어 인스턴스(객체)화 한다  => 메모리에 저장 또는 로드
 *    	
 *  클래스 구조
 *  (접근제한자) class 클래스명	 (extends 상속클래스)	 (implements 인터페이스 상속) { // 클래스 선언부
 *  	(생성자)  =>  초기화
 *  	변수(맴버변수, 맴버필드) => 속성
 *  	메소드(맴버메소드) => 기능
 *    }
 *    
 *  객체화 :	new 연산자로 인스턴스화 가능!
 *  클래스명(타입) 변수면 = new 클래스();
 *     
 *  가비지 컬렉터 (Garbage Collector)
 *     		자바에서 동적 할당된 메모리(heap 영역) 중에서 더 이상 사용되지 않는 
 *     		객체를 찾아 제거하는 프로세스
 *    	
 */

public class OOP01 {
	public static void main(String[] args) {
		Car c1 = new Car();		// 클래스를 이용해서 객체 생성
		Car c2 = new Car();
		
		System.out.println("바퀴 개수: " + c1.wheel);
		System.out.println("c2 바퀴 개수: " + c2.wheel);
		
		c1.wheel = 3;
		System.out.println("바퀴 개수: " + c1.wheel);
		System.out.println("c2 바퀴 개수: " + c2.wheel);
		
		c1.drive();   // System.out.println("운전을 해요!");
	}

}	

