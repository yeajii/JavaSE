package section06;

public class ArrayHomework {
	public static void main(String[] args) {
		// 선언먼저 하고 for문으로 하기
		/*for(int i=1;i<50;i++) {
			System.out.print(i+"\t");
			if(i%7 == 0) {
				System.out.println();
			}
		} */
		
		/*
		int[][] nums = 
			{
					{1,2,3,4,5,6,7},
					{8,9,10,11,12,13,14},
					{15,16,17,18,19,20,21},
					{22,23,24,25,26,27,28},
					{29,30,31,32,33,34,35},
					{36,37,38,39,40,41,42},
					{43,44,45,46,47,48,49},
			};
		
		for (int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
		}
			System.out.println(  );
		}
	*/
		int[][] arrs = new int [7][7];
		
		for(int i = 0; i < arrs.length; i++ ) {	
			for(int j = 0; j <  arrs[i].length; j++) {
				arrs[i][j] = (j+1) + i*7;
			}
		}
		for(int i = 0; i < arrs.length; i++ ) {	
			for(int j = 0; j <  arrs[i].length; j++) {
				System.out.print(arrs[i][j]+" ");
			}
			System.out.println();
		}
		
		
	
	}
}