// 5 vs 5.0
// 정수 (ex. 5)--> int 라고생각
// 실수(ex. 5.0)--> double 이라고생각
//문자열 : 문자열들의 나열---> 따옴표(")를 사용 --> String
//문자 : 문자 한글자 --> 홑따옴표(')를 사용 --> char

public class Ex102 {
	public static void main(String[] args) {
		int n = 5; //(표현이해) "변수의 선언괴 동시에 초기화"
		System.out.println("n : "+ n);
		double n2 = 5; // 소숫점이 있으면 실수 없으면 정수 // 5.0에서 5로 고쳐도 에러 없음
		System.out.println("n2 : "+n2);
		
		String s = "ABC";
		System.out.println("문자열s : "+s);
		
		char c = 'A';  // 한글자(문자)
		System.out.println(c);

	}

}
