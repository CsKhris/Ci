import java.util.Scanner;

public class TR190129Main {

	public static void main(String[] args) {
//sample Ŭ������ 'cav' �޼ҵ�� 'car' �޼ҵ带 ���

		int n = 10;
		int [] br = {10, 20, 30}; 
		
//cav �޼ҵ�� car �޼ҵ带 ȣ��
//static�޼ҵ尡 �ƴϹǷ� �ν��Ͻ��� ���� ����
		Sample sp = new Sample();
		
		sp.cav(n);
//n�� 'value'�� �̹Ƿ� ���� ������� �ʽ��ϴ�.
		System.out.println("n = " + n);
		
//br �����͸� ������ �޼ҵ� ȣ��
		sp.car(br);
//br�� 'reference'�� �̹Ƿ� ���� ����ɼ� �ֽ��ϴ�.
		System.out.println("br[0] = " + br[0]);
		
//double�� return�ϴ� �޼ҵ� ȣ��
		double result = sp.doubleAdd(10.3, 7.2);
		System.out.println("Result = " + result);
		
//�޼ҵ��� �������� '������' �̹Ƿ� '�޼ҵ�' �ȿ��� '�޼ҵ�'�� '�Ű�����'�� ����Ҽ� �ֽ��ϴ�.
		result = sp.doubleAdd(sp.doubleAdd(17.5, 2.2), 10.5);
		System.out.println("Result = " + result);
		
		//static ������ �޼ҵ�� Ŭ���� �̸����� ȣ���� �����մϴ�.
		Sample.staticMethod();
		
		sp.sameName(20);
		
		
		
		//Person Ŭ������ �ν��Ͻ��� ����
		Person person1 = new Person();
		
		//setter�� ȣ���ؼ� �����͸� ����
		person1.setName("Cs");
		person1.setAge(27);
		person1.setHeight(183);
		
		//getter�� �̿��ؼ� �����͸� ���
		System.out.println("Name : " + person1.getName());
		System.out.println("Age : " + person1.getAge());
		System.out.println("Height : " + person1.getHeight());
		
		//���ڿ��� �Ű������� �޴� �����ڸ� �̿��ؼ� �ν��Ͻ��� ����
		Person person2 = new Person("noname");
		System.out.println("Name : " + person2.getName());
		System.out.println("Age : " + person2.getAge());
		System.out.println("Height : " + person2.getHeight());

		
		Scanner sc = new Scanner(System.in);
		
		
		
	}

}
