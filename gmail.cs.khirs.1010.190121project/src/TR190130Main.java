
public class TR190130Main {

	public static void main(String[] args) {
		//���� Ŭ������ �ν��Ͻ� ���� - Base
		Base b = new Base(20);
		b.print();
		
		//���� Ŭ������ �ν��Ͻ� ���� - Derived
		//�ڽ��� public �޼ҵ�� Base�� public �޼ҵ� ��� ����
		
		//���� Ŭ������ �ν��Ͻ��� �����ϸ�, 
		//���� Ŭ������ �����ڸ� ȣ���ؼ� ���� Ŭ������ �ν��Ͻ� �κ��� �����,
		//���� Ŭ������ �����ڸ� ȣ���ؼ� ���� Ŭ������ �ν��Ͻ� �κ��� �����մϴ�.
		
		Derived d = new Derived();
		d.print();
		d.disp();
		

		
	}

}