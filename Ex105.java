// ++와 -- (뒤에서):
//Ex) int num = 5;
//	num++; // num의 값이 1증가!
//	sysout(num); //6
public class Ex105 {

	public static void main(String[] args) {
		//byte b = 128; // byte타입으로는 128이 표현 불가 ERR
		//short b = 128;
		byte b = 127;
		
		System.out.println(b);
		
		b++; // 1증가 // 'overflow'표현범위를 넘음 (참고)
		System.out.println(b);//128 ----> -128 [고급]
		
		//1) byte 타입의 변수는 절대로 +128을 표현할 수 없다.('표현범위')
	}

}
