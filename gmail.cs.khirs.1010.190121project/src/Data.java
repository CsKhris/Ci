
public class Data {
	//Ŭ���� �ȿ��� static�̶�� Ű���� ���� ����� �ν��Ͻ� ����
	//�� �ν��Ͻ��� ������ �޸� �Ҵ��� �޾Ƽ� ���
	//�ν��Ͻ��� ������ �����մϴ�.
	public String name;
	public int age;
	//���� �����ڰ� public�̸� Ŭ���� ���ο� �ܺο��� ��� ��� ����
	public double height;
	
	//���� �����ڰ� private�� �Ǹ� Ŭ���� �ܺο����� ����� �Ұ���
	//private double height;
	
	
	
	//static ����
	//Ŭ���� �ڵ� �ȿ� 1���� ����
	//Ŭ������ �ν��Ͻ� ��� ������ ����
	//�����͸� ������ �� ���
	public  static String school;
	
	//static �ʱ�ȭ : Ŭ������ ó�� ����� �� �ѹ��� �����ϴ� �ڵ�
	//�ν��Ͻ� ������ ����� �� �����ϴ�.
	static {
		System.out.println("ó�� �ѹ��� ����Ǵ� �ڵ�(=���÷��� �ڵ�(ex : Logo ȭ��))");
		school = "�漮�ʵ��б�";
		
		System.out.println(school);
		
		//�ν��Ͻ� ������ ����ؼ� ����
		//name = "Cs";
	}
	
	public void insa() {
		for(int i=0; i<5; i=i+1) {
			System.out.println("Hello NoMethod");
		}
	}
	
	//�Լ��� ȣ���� �� ������ ������ŭ ���ڿ��� ����ϴ� �޼ҵ�
	//�̸��� ���� �Լ��� ������ insa�ε� �Ű������� ������ �ٸ��ϴ�.
	//�̷��� �̸��� ���� �Ű������� ������ �ڷ����� �ٸ� �޼ҵ带 ����� ���� Method Overloading�̶�� �մϴ�.
	//�ϴ� ���� ����� �޼ҵ��� �̸��� �����ϰ� ����� ���ؼ� ����մϴ�.
	public void insa(int n) {
		for(int i=0; i<n; i=i+1) {
			System.out.println("Hello ArMethod");
		}
	}	
	
	public void wall(int n) {
		for(int i=0; i<n; i=i+1) {
			System.out.println("================================================================");
		}
	}

}
