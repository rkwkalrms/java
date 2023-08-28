// '변수' :값을 저장할수 있는 그릇.
// '변수의 선언' : 이름을 선언(이떄부터 자바가 그 이름을 알고있음)
// '변수의 초기화' : 변수의 최초로 값을 저장하는 사건. '초기 값'
public class Ex101 {
	public static void main(String[] args) {
		int num; // num 이라는 변수를 선언. (정수값을 저장)  // '변수의 초기화'이건 최초이기떄문에 초기화이고 초기값
		num = 5; // = -------->'대입연산자' : 오른쪽을 정리해서 왼쪽에 담는다.  //이건 변수의 초기화가 아님
		System.out.print("num : " + num); //문자열하고 무언가를 더하면 무조건 그 결과는 문자열이된다. ("num : " + 5 )--->  ("num : " + "5") 정수 5가 "5"문자열가됌
		System.out.println("num : " + num +num); // ("num : " + "5" + num) --->("num : " + "5" + "5")--> ("num : " + "55")
		//위에 ln을 지우면 줄바꿈이 안됌
		double num2; // 싷수 값을 저장할수 있는 변수num2를 선언
		num2 = 3.14; // '변수의 초기화'
		System.out.println("num2 : "+ num2); // 
		
		int num3;
		//System.out.println("num3 : "+ num3); // ERR. num3에 값을 저장하지않았기때문
		
		//num4 = 5.15; //ERR 변수의 선언 자체가 없어 자바가 이름 자체를 모르는것
		
		
		// 연습1. 정수형 변수 a를 선언하고, 10이라는 값으로 초기화.
		// "a :10" 이렇게 출력해보세요.
		
		int a;
		a = 10;
		System.out.println("a : "+ a);
		
		
		// 연습2 실수형 변수b를 선언하고 11.1 이라는 값으로 초기화
		// "b : 11.1" 이렇게 출력
		
		double b;
		b = 11.1;
		System.out.println( "b : " + b);
		
		
		
	}

}
