// 상수 : 항상 그값이어서.	   // 상수의 선언 : 변수의 선언 앞에 "final"
// 변수 : 값이 변할 수 있어서. // 변수의 선언 : "데이터 타입 변수이름"
public class Ex106 {

	public static void main(String[] args) {
		final int a =5;// --->a는 이제 '상수' : 저장된 값을 두번 다시 바꿀 수 없다!
		//a = 10; //ERR. 상수는 값을 변경할수 없으니까.
		System.out.println(a); //10
			
	}

}
