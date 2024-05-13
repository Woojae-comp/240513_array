package java_0513_ch05;

public class String_test {

	public static void main(String[] args) {

		
		
		// 그저 주소값 비교
		String str1 = "홍길동";
		String str2 = "홍길동";;
		
		if (str1==str2) { // 홍길동 주소를 공유하고 있음 문자열 비교가 아니라 주소값을 비교
			System.out.println("참!");
		} else {
			System.out.println("거짓!");
		}
		
		
		
		//new 연산자 다른주소값 동명이인
		String strObject1 = new String("홍길동"); // 객체를 선언하는 것
		String strObject2 = new String("홍길동"); // new연산자 class로 객체를 만들어주는 거
	
		if (strObject1==strObject2) { // 하나 더 만들어지는 것임 - 주소값이 다름 동명이인 홍길동
			System.out.println("참!");
		} else {
			System.out.println("거짓!");
		}


		
		// A.equals(A') 실제 문자열이 같은지 비교하는 함수 --> equals()
		if (strObject1.equals(strObject2)) { // 하나 더 만들어지는 것임 - 주소값이 다름 동명이인 홍길동
			System.out.println("참!");
		} else {
			System.out.println("거짓!");
		}
}

}
