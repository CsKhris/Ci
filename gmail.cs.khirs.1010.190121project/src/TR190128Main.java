//main �޼ҵ带 ������ �ִ� Ŭ������ ���� Ŭ���� �Դϴ�.

public class TR190128Main {

	public static void main(String[] args) {
		//Data Ŭ������ �ν��Ͻ� �����
		//�ν��Ͻ��� ���� ���� new ������()�� �⺻
		Data data = new Data();
		data.name = "Cs";
		data.age = 29;
		data.height = 183.5;
	
		//�ν��Ͻ� ������ Ŭ���� �̸����� ������ �Ұ�
		//Data.name = "�̼���";
		
		//static ������ Ŭ�����̸��� �ν��Ͻ� �̸����� ���� ����
		Data.school = "��õ���ʵ��б�";
		//�ν��Ͻ� �̸����� �����ϸ� ���
		data.school = "�������б�";
		
		
		
		//�ߺ��� �ڵ带 ������ �ۼ��ϰ� �� ��� ���������� ��������ϴ�.
		//������ �ϰ��� �ϴ� ��� ���� ã�Ƽ� ���� �����ؾ� �մϴ�.
		//�̷��� �ߺ��� �ڵ带 ���İ�Ƽ �ڵ��� �մϴ�.
		//�� ������ �ߺ��� �ڵ带 �Լ��� ���� �ذ��մϴ�.
		for(int i=0; i<5; i=i+1) {
			System.out.println("Hello NoMethod");
		}		
		
		for(int i=0; i<5; i=i+1) {
			System.out.println("Hello NoMethod");
		}
		data.wall(1);
		
		//�ν��Ͻ��� �̿��ؼ� Data Ŭ������ ���� insa �޼ҵ� ȣ��
		data.insa();
		data.insa();
		
		data.wall(1);

		//�Ű������� �ִ� �޼ҵ�
		//�Ű������� ������ ���� �� ���� �پ��ϰ� �۾��� �Ҽ� �ֽ��ϴ�.
		data.insa(7);
		
		
		
	}

}
