
public class Array {

	public static void main(String[] args) {
		//���ڿ� 2���� �迭
		
		String [][] korea = 
			{{"������", "������", "�豸"}, {"������", "������", "��"}};
		
		//2���� �����͸� �̿��ؼ� ������ ��ȸ
		/*
		int rowSize = korea.length;
		for (int i=0; i<rowSize; i=i+1) {
			int colSize = korea[i].length;
			for(int j=0; j<colSize; j=j+1) {
				System.out.println(korea[i][j]);
			}
		
		}
		*/
		
		//int [i/3] [j%3];
		/*
		int size = korea.length * korea[0].length;
		for(int i=0; i<size; i=i+1){
			System.out.println(korea[i/korea[0].length][i%korea[0].length]);
		}
		*/
		
		//���� ���Ÿ� �̿��� �迭
		for(String [] temp : korea) {
			for(String imsi : temp) {
				System.out.println(imsi);
			}
		}
		
		
		
	}

}
