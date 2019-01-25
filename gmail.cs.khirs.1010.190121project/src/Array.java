
public class Array {

	public static void main(String[] args) {
		//문자열 2차원 배열
		
		String [][] korea = 
			{{"윤봉길", "김좌진", "김구"}, {"남자현", "유관순", "논개"}};
		
		//2개의 데이터를 이용해서 데이터 순회
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
		
		//빠른 열거를 이용한 배열
		for(String [] temp : korea) {
			for(String imsi : temp) {
				System.out.println(imsi);
			}
		}
		
		
		
	}

}
