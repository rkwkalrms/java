//�ּ� �ۼ��ϴ¹��:
// 1) //���� �׹��� ������.
// 2) /*���� */����.  /**/ �ȿ� /**/�� �Ǿ��� �ߺ���
/*
����ũ�� : [Crtl] + [+/-]
���� :  [Crtl] + [S]
���� : [Crtl] + [F11]
���ٻ��� : [Crtl] + [D] 
*/

public class Ex100 {

	public static void main(String[] args) {
		System.out.println("Hello World"); //ȭ�����.
		System.out.println("Hello World, JY!"); //"���ڿ�"
		System.out.println(123);   // ����
		System.out.println(3.14);  // �Ǽ�
		
		String s1;    // s1�̶�� �̸��� ����('����' : s1�̶�� ���ڿ����� �ְ� ������ �� �ִ�.)
		s1 = "Hello"; // = �� �������� ���ʿ� ��´�. ������ ���ڿ� �����͸� ���ڸ� ���� �� �ִ� ������ ��´�.
		String s2;
		s2 = "World";
		System.out.println(s1 + s2); // ���ڿ��� +���ڿ� ('����'): +�� ���ڸ� �� ������ ���̴� ����
		
		System.out.println(5+3);
		System.out.println("5"+"3"); //���ڿ��̶� 53�̳���
		System.out.println("s1 + s2"); //13��� ��. ���� ����� ���ڿ��� Hello World �� �������� ���� �׳� ���ڿ��̶� s1+s2�� ���´�. 
		
		System.out.println("System.out.println(3);");
		
		//���� : �Ʒ� ������ ä���� I'm  _�̸�_������ ���.
		String name = "JY";
		System.out.println("I'm "+name);
	}

}
