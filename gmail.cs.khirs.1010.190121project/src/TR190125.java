
public class TR190125 {

	public static void main(String[] args) {
		//�ʱ� �����͸� ������ �迭 ����
		//������ �迭
		int [] intAr = {10, 20, 30, 40, 50};
		
		//�迭�� ���� ����� �����͸� ���߿� ����
		//���ڿ� �迭
		String [] stringAr = new String[5];
		stringAr[0] = "���߱�";
		stringAr[1] = "������";
		stringAr[2] = "�豸";
		stringAr[3] = "������";
		stringAr[4] = "������";
		
		
		//stringAr[4] = "������";
		
		//�����Ͱ� '4��'�̸� �ε����� '0-3��'����, 
		//�׷��� 4���� �̿��ϰ� �Ǹ� 'ArrayIndexOutOfBoundsException', '����' �߻�
		//stringAr[4] = "������";
		
		//�迭�� ��ü �����͸� ��ȸ
		/*
		for(int i=0; i<4; i=i+1) {
			String imsi = stringAr[i];
			System.out.println(imsi);
		}
		*/
		
		//�迭�� �����͸� ��ȸ�� �� �ݺ����� �����͸� leteral�� �Է��ϴ� ���� ���� �ٶ������� ���մϴ�.
		//�迭�� ������ ������ ����Ǹ� �����ؾ� �ϱ� �����Դϴ�.
		
		//�迭�� ������ ������ �־�ΰ� ����ϸ� �迭�� ������ ������ ����Ǵ��� 
		//����ϴ� �κ��� ������ �ʿ䰡 �����ϴ�.
		int size = stringAr.length;
		for(int i=0; i<size; i=i+1) {
			String imsi = stringAr[i];
			System.out.println(imsi);
		}
		
		System.out.println("==================================");
		
		//���� ����(Fast Enumeration)�� �̿��� �迭 ��ȸ
		//intAr�� ��� �����͸� ������� temp�� �����ϰ� { }���� ���� ����
		for(String temp : stringAr) {
			System.out.println(temp);
		}
		
		
		
	}

}













