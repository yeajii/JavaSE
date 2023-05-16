package section01;
/*
 * 여러 줄 주석
 * 코드에 영향을 주지 않는 개발자가 사용하는 메모 공간
 * 
 */

public class Hello {
      public static void main(String[] args) {
    	  // 한 줄 주석 
		System.out.println("Hello, Java!");
		System.out.println("안녕! 안녕!");
		
		printNum(516);
		
	}
	
      /* * JavaDoc 주석
       * 
       *  입력받은 정수 출력하는 메소드
       * @param num - 입력받은 정수
       */
      
      public static void printNum(int num) {
    	  System.out.println("num: " + num);
    	  
    
      }
      
}
