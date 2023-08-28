//주석 작성하는방법:
// 1) //부터 그문장 끝까지.
// 2) /*부터 */까지.  /**/ 안에 /**/를 또쓰면 중복됌
/*
글자크기 : [Crtl] + [+/-]
저장 :  [Crtl] + [S]
실행 : [Crtl] + [F11]
한줄삭제 : [Crtl] + [D] 
*/

public class Ex100 {

	public static void main(String[] args) {
		System.out.println("Hello World"); //화면출력.
		System.out.println("Hello World, JY!"); //"문자열"
		System.out.println(123);   // 정수
		System.out.println(3.14);  // 실수
		
		String s1;    // s1이라는 이름을 선언('변수' : s1이라는 문자열값을 넣고 선언할 수 있다.)
		s1 = "Hello"; // = 은 오른쪽을 왼쪽에 담는다. 오른쪽 문자열 데이터를 문자를 담을 수 있는 변수에 담는다.
		String s2;
		s2 = "World";
		System.out.println(s1 + s2); // 문자열과 +문자열 ('결합'): +는 문자를 그 옆으로 붙이는 역할
		
		System.out.println(5+3);
		System.out.println("5"+"3"); //문자열이라 53이나옴
		System.out.println("s1 + s2"); //13행과 비교. 위엔 선언된 문자열인 Hello World 가 나오지만 여긴 그냥 문자열이라 s1+s2가 나온다. 
		
		System.out.println("System.out.println(3);");
		
		//연습 : 아래 빈줄을 채워서 I'm  _이름_식으로 출력.
		String name = "JY";
		System.out.println("I'm "+name);
	}

}
