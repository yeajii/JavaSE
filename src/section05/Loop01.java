package section05;
/*
 *   	반복문 
 * 		특정한 부분의 코드가 반복적으로 수행될 수 있도록 하는 명령어
 * 
 * 		 while 문 : 반복문
 * 		 while(조건문) {
 * 			반복 수행 할 코드
 * 		}
 * 
 * 	    break 문 : 탈출문
 * 			반복문에서 break 문은 반복문을 즉시 종료하는 명령어!
 * 
 * 		continue 문
 * 			반복문에서 해당 반복을 (프린트)건너뛰고 다음 반복을 실행하도록 강제하는 명령어!
 * 
 */
public class Loop01 {
	public static void main(String[] args) {
		// while 문을 이용하여 0 ~ 99까지 출력하기    -? 왜 99까지인지
		
		/*
		int count = 0;
		while(true) {
			System.out.println(count);
			++count;
			if(count == 100)
				break;
		}
		*/
		
		/*
		int count = 0;
		while(count < 100) {
			System.out.println(count);
			++count;
		}
		*/
		
		/*
		int count = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println(count);
			++count;
			if(count == 100)
				isRun = false;
		}
		*/
		
		int i = 0;
		System.out.println(i);
		while(i < 7) {
			i++;
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}

	
	}
	

}
