// ++�� -- (�ڿ���):
//Ex) int num = 5;
//	num++; // num�� ���� 1����!
//	sysout(num); //6
public class Ex105 {

	public static void main(String[] args) {
		//byte b = 128; // byteŸ�����δ� 128�� ǥ�� �Ұ� ERR
		//short b = 128;
		byte b = 127;
		
		System.out.println(b);
		
		b++; // 1���� // 'overflow'ǥ�������� ���� (����)
		System.out.println(b);//128 ----> -128 [���]
		
		//1) byte Ÿ���� ������ ����� +128�� ǥ���� �� ����.('ǥ������')
	}

}
