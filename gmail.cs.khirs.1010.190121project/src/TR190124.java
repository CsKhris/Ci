import java.util.Scanner;

public class TR190124 {

	public static void main(String[] args) {

		//Ű����� ���� �Է� �ޱ� ���� ��ü ����
		Scanner sc = new Scanner(System.in);
		
		//�ϳ��� ���ڿ� �Է¹ޱ�
		System.out.print("1.�ѽ� 2.�Ͻ� 3.�н� 4.�߽� : ");
		int menu = sc.nextInt();
		
		//switch �̿�
		switch(menu) {
		case 1:
			System.out.println("�ѽ��� ����");
			break;
		case 2:
			System.out.println("�Ͻ��� ����");
			break;
		case 3:
			System.out.println("�н��� ����");
			break;
		case 4:
			System.out.print("�߽��� ����");
			break;
		default:
			System.out.print("��ȣ�� �߸� �����ϼ̽��ϴ�.");
			break;		
		}
		
		//System.out.print("Check Your Score : ");
		//int score = sc.nextInt(); 
		/*
		//score�� 60�� �̻��̸� '�հ�'�̶�� ���
		if (score >= 60);{
			System.out.println("Pass");
		}
		*/
		
		/*
		//score�� 100�̻��̸� '����', �׷��� ������ '����'�� ���
		
		if (score >= 100) {
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		*/
		
		/*
		//score�� 90-100�̸� 'A', 80-89�� 'B', 70-79�� 'C' 0-59�� 'F' ���
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		}else if (score >= 80 && score < 90) {
			System.out.println("B");
		}else if (score >= 70 && score < 80) {
			System.out.println("C");
		}else if (score >= 0 && score < 70) {
			System.out.println("F");
		}else {
			System.out.println("Please Check Your Score(*Score Range Only 0-100)");
		}
		*/
		
		
		
		sc.close();

	}

}
