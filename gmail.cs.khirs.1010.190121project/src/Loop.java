
public class Loop {

	public static void main(String[] args) {
		// ������ �۾��̳� ������ ������ ���� �۾��� �ݺ����� �̿��ؼ� �ۼ��� �����մϴ�.
		
		/*
		//'Hello Java', '3'�� ��� - 'while'�� ����Ͽ� �۾�
		int HJ = 1;
		while(HJ < 4) {
			System.out.println("Hello Java");
			HJ = HJ + 1;	
		}
		
		//'1'���� '5'���� '����'��� ��� - 'do-while'�� ����Ͽ� �۾�
		//1, 2, 3, 4, 5, - 2, 4, 6, 8, 10 - 1, 3, 5, 7, 9
		HJ = 0;
		do{
			System.out.println(2*HJ + 1);
			HJ = HJ + 1;
		} while(HJ < 5); 
		*/
		
		//'for'�� �̿��ؼ� 'Hello Java', '5'�� ���
		
		for(int i = 0; i < 5; i = i + 1) {			
			System.out.println("Hello Java");
		}
		
		//System.out.println("*'i' Result = " + i);
		
		
		for(int i=1; i<10; i=i+1) {
			//'i'�� '4'�� '���'�� 'i=i+1'�� �̵�
			//'continue'�� '�Ʒ�'�� �ִ� ������ �������� �ʽ��ϴ�.
			if(i % 4 == 0) {
				continue;
			}
			System.out.println("*Result 'i' = " + i);
		}
		
		
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
	
		
	}

}




