
public class TR190123 {

	public static void main(String[] args) {
		//Shift(<<, >>, <<<)�� ��Ʈ ������ �о�� ������ �Դϴ�.
		//<<�� 1�� �� �� ���� 2�谡 �˴ϴ�.
		//>>�� 1�� �� �� ���� 1/2�� �˴ϴ�.
		//32�� �̻� �̴� ���� �ǹ̰� ��� 32�� ���� ������ ��ŭ�� �о� ���ϴ�.
		
		int x = 17;
		
		System.out.println("X<<2 : " + (x<<2)); //68
		System.out.println("X<<34 : " + (x<<34)); //34%32= 2 : 68
		System.out.println("X>>2 : " + (x>>2)); //
		
		
		
		
		
		//��Ʈ �� ������ : ��Ʈ ������ �����ؼ� ������ ����� ����
		// &(and)  : �� �� '1'�� ���� '1' ������ ���� '0'
		// |(or) : �� �� '0'�� ���� '0' ������ ���� '1'
		// ^(exclusive or) : ������ '0', �ٸ��� '1'
		
		int d1 = 19; // 00000000 000000000 00000000 00010100
		int d2 = 17; // 00000000 000000000 00000000 00010001
		
		System.out.println("20&17 : " + (20&17)); //16
		System.out.println("20|17 : " + (20|17)); //16+4+1 : 21
		System.out.println("20^17 : " + (20^17)); //4+1 : 5
		
		
		
		boolean result = d1 > 10 && d2 > 10;
		System.out.println("result : " + result); //true
		result = d1 < 10 || d2 < 10;
		System.out.println("result : " + result); //false
		result = !result;
		System.out.println("result : " + result); //true
		
		//���� d2�� '17', d1�� '19'
		result = d1 > 10 && d2 ++ > 20;
		System.out.println("D2 : " + d2); //18
		
		//or�� ���� ������ true�̸� ���� ������ �������� �ʽ��ϴ�.
		result = d1 > 10 || d2 ++ > 20;
		System.out.println("D2 : " + d2); //18
		
		
		
		
		
		//d1�� 4�� ������� Ȯ��
		result = d1 % 4 == 0;
		System.out.println("D1�� 4�� ����̴�. : " + result); //
		
		//d1�� 4�� ����̰�, 100�� ����� �ƴϰų� 400�� ������� Ȯ��
		result = d1 % 4 == 0 && d1 % 100 != 0 || d1 % 400 == 0;
		System.out.println("D1�� '4'�� ����̰�, '100'�� ����� �ƴϰų�, '400'�� ����̴�. : " + result); //
		
		
		
		
		//d1�� d2 ���� ũ�ٸ� d1, �׷��� �ʴٸ� d2
		int max = d1 > d2 ? d1 : d2;
		System.out.println("Max : " + max);
		
		
		
		}
		
	}
