package section03;
/*
 *  2.  증감연산자
 *  	++ : 1씩 증가시킨다
 *  	-- : 1씩 감소시킨다
 * 
 */

public class Operator02 {
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println(num);  	 // num: 1
		num++;
		System.out.println(num); 	 // num: 2
		// 전위 증감연산자
		System.out.println(++num);	// num: 3
		// 후위 증감연산자 -> 괄호안에서 1증가 안하고 프린트 한 다음에 1증가함으로 생각
		System.out.println(num++);	// num: 3   
		System.out.println(num); 		//num: 4
		
	}

}
