package java_0513_ch05;

public class Array_test_02 {

	public static void main(String[] args) {
		//[행][열]
		int[][] score = new int[2][3];

		
		// [2행][3열]
		int[][] array1 = {
							{10,20,30},
							{40,50,60},
							{70,80,90}
						};
		
		// 파이썬
		// sum = 0
		// for i in arr1:
		// 		sum = sum + i

		int[] arr1 = {10,20,30,40,50};
		int sum = 0;
		for(int i=0; i<arr1.length;i++) {
			sum = sum + arr1[i];
		}
		System.out.println(sum);
				
		// 향상된 for문 --> 많이 씀
		int sum1 = 0;
		for(int i : arr1) {
			sum1 = sum1 + i;
		}
		
		System.out.println(sum1);
	}
}
