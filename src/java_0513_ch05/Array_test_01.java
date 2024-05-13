package java_0513_ch05;

public class Array_test_01 {

	public static void main(String[] args) {

		
		
		
		// 파이썬 list1 = [1,2,3,4,5]
		// {} 배열의 괄호 중괄호 
		
		// 올드한 방식
		int arrayInt[] = {1,2,3,4,5};  

		
		// 최근 방식, 선언과 동시에 하면 됨 
		int [] arrayInt2 = {1,2,3,4,5,6,7}; // 정수형 이름만 선언
		double[] arrayDouble = {1,2,3.14};
		String[] arrayStr = {"kor", "eng", "deu"};
		
		int[] arrayTest1 = null; // 참조하는 배열값이 없는 배열 이름만 선언
		// 파이썬 list1 = []
		
		//객체를 메모리에 만들어주는 연산자
		
		// 100번지에 5칸 만든 것임 new 연산자로 만들면 0으로 가득채워진 배열을 만듬
		// 몇칸 짜리인지는 만들어줘야함

		int[] arrayTest2 = new int[5];
		
		// 칸이 맞지 않을 경우 - 5로 할 경우
		// 소프트한 코딩은 length
		for(int i=0; i<5; i++) { // 배열 arrayTest2의 모든 원소를 출력
			System.out.print(arrayTest2[i]);
		
		}
		System.out.print("\n");

		// 상수보다는 length를 쓰는게 맞음
		for(int i=0; i<arrayTest2.length; i++) { // 배열 arrayTest2의 모든 원소를 출력
			System.out.println(arrayTest2[i]);
		
		}

	}

}
