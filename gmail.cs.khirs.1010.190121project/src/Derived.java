
public class Derived extends Base {
	
	//���� ������ ������ �Ʒ��� ���� �����ڰ� ����
	//������
	public Derived(){
		//���� Ŭ������ �Ű������� ���� 1���� �����ڸ� ȣ��
		super(10); //new Base(int)�� ȣ��
	}

	int a = 10;
	public void disp() {
		System.out.println("���� Ŭ������ �޼ҵ�");
		int a = 20;
		//�ƹ��͵� ������ �ʾ����Ƿ� �޼ҵ� �ȿ������� ã�� : '20'
		System.out.println("A = " + a);
		
		//this.�� ������ �޼ҵ� �ȿ����� ã�� ���� : '10'
		System.out.println("this.A = " + this.a);
		
	}
	
	
	
	
	
}