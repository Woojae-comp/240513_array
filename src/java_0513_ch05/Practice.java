package java_0513_ch05;

public class Practice {
//	iterater -> 없을 때까지 100개를 데이터를 뺀다 - 어렵게 생각할 필요 없음
//	String은 함수임 = 문자열 타입이 있는 것이 아님
//	Char가 문자열 타입
//	참조타입 - 한번에 불러오는 것이 아니라 주소를 가져오는 것임
//	파이썬도 마찬가지임
//	함수도 메모리를 가짐
//	 - JVM Java vitual machine : 운영체제를 가리지 않음 / 각 os별로 jvm만 있으면 다 돌릴 수 있음 / 윈도우에도 깔려있음
//	코틀린 -> 원래 JAVA
//	알아서 모든 
//
//	참조타입 연산은 주소가 다르기 때문에 내용에 상관없이 ==, != 연산했을 경우 주소를 비교
//	참조타입 변수 비교는 주의
//	파이썬에서는 none
//	빈 객체 ! 이름만 만들어 놓는 것 a = null ->이런식으로 초기화 해도 됨
//
//	try - exception -> 예외처리 규정
//	예외 - Exception --> NullPointerException - 가장 많이 일어나는 에러 - null 값을 잘 못가리키는 값 
//	20대 남성 중에 홍길동을 내놓아라 -> 없으면 nullpointerception db에서 받은게 없는 것
//
//	String 문자열의 값이 같을 경우 하나만 존재 -- 그래서 주소값을 공유함
//	--> str1  == str2 == "신용권"
//
//	new 연산자는 다른 것임
//	문자열 비교는 equals로 해야함
//	*** boolean result = str1.equals(str2) 문자열 비교 ***
//
//	Java array != list 
//	사용법은 같음
//	저장되는 구조가 다름
//	array - 항상 이어져 - 아파트짓는 느낌 - 속도가 빠름 - 5개 짜리로 만들면 6개로 확장 불가능  -- 중간 삭제, 다시 고치기 쉽지 않음
//	앞으로 땡겨와야함 중간에 삭제하면, 구조 간단, 속도 빠름 - 인덱스로 사용하는 건 똑같음
//	- 정수면 정수, 문자열이면 문자열, 실수면 실수
//
//	list는 인덱스마다 주소가 다름, 번지수가 저장되어 있음 - 장점은 메모리가 더 효율적 - 짜투리 공간 가능함 - 단독주택 - 속도가 느림 -- 확장 가능 - 삽입 삭제 쉬움
}