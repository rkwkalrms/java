// 5 vs 5.0
// ���� (ex. 5)--> int ������
// �Ǽ�(ex. 5.0)--> double �̶�����
//���ڿ� : ���ڿ����� ����---> ����ǥ(")�� ��� --> String
//���� : ���� �ѱ��� --> Ȭ����ǥ(')�� ��� --> char

public class Ex102 {
	public static void main(String[] args) {
		int n = 5; //(ǥ������) "������ ���� ���ÿ� �ʱ�ȭ"
		System.out.println("n : "+ n);
		double n2 = 5; // �Ҽ����� ������ �Ǽ� ������ ���� // 5.0���� 5�� ���ĵ� ���� ����
		System.out.println("n2 : "+n2);
		
		String s = "ABC";
		System.out.println("���ڿ�s : "+s);
		
		char c = 'A';  // �ѱ���(����)
		System.out.println(c);

	}

}
