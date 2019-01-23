
public class TR1901222 {

	public static void main(String[] args) {
		//byte < short < char < int < long < float < double 
		
		//������ ������� �ڽ��� ũ�⺸�� ���� �����ʹ� ���� ����
		double d = 10;
		
		//�ڽ��� ũ�⺸�� ū �����ʹ� ���� �Ұ�
		//int x = 10.7; //Error
		//byte b = 2000; //Error
		
		byte b1 = 10;
		byte b2 = 20;
		
		//int ���� ���� �����͸� ��������ϸ� int�� �����ؼ� ������ �����ϱ� ������ byte�� ������ ����
		//byte result = b1 + b2;  
		
		//int result = b1 + b2;
		
		//������ ����� 3 = ������ ������ �����ϸ� ����� '����'(r=3.0)
		//double r = b1 / 3;
		
		//�ϳ��� �����͸� double�� ����ȯ �ϸ� '�Ǽ�'�� '����'�� ���������� ��� '�Ǽ�'�� �����ؼ� ����
		double r = (double)b1 / 3;
		System.out.println("r="+r);
		
		double sum = 0;
		for(int i = 0; i < 1000; i = i + 1) {
			sum = sum +0.1;
		}
		System.out.println("sum : " + sum);
		
		//���ϴ� ���� '10'�� ���Ͽ� ������ ���ϵ��� �ϰ�, ����� �ٽ� '10'���� ����� ���ϴ� ����� ���� �մϴ�.
		//�̷��� ���� ������ ��Ȥ �Ǽ��� ������ �����ϴ� ��찡 �ֽ��ϴ�.
		sum = 0;
		for(int i = 0; i < 1000; i = i + 1) {
			sum = sum + 1;
		}
		System.out.println("sum : " + (sum/10));
		
		
		
		//�Ǽ��� ������ ��ȯ�ϸ� �Ҽ��� ������
		int k = (int)19.9;
		System.out.println("k : " + k);
		//ū ������ ���� ������ ��ȯ�ϴ� ���� 'Overflow'�� 'Underflow'�� �߻�
		
		//byte�� 127���� �����Ҽ� �ִµ� �� ū ���� ������ ��ȯ�Ͽ� ���� : Overflow
		byte b = (byte)200; 
		System.out.println("k : " + b);		
		
		//byte�� -128���� �����Ҽ� �ִµ� �� ���� ���� ������ ��ȯ�ؼ� ���� : Underflow
		b = (byte)-200;
		System.out.println("k : " + b);
		
		
		
	}

}
