
public class TR190125 {

	public static void main(String[] args) {
		//초기 데이터를 가지고 배열 생성
		//정수형 배열
		int [] intAr = {10, 20, 30, 40, 50};
		
		//배열을 먼저 만들고 데이터를 나중에 대입
		//문자열 배열
		String [] stringAr = new String[5];
		stringAr[0] = "안중근";
		stringAr[1] = "유관순";
		stringAr[2] = "김구";
		stringAr[3] = "윤봉길";
		stringAr[4] = "김좌진";
		
		
		//stringAr[4] = "김좌진";
		
		//데이터가 '4개'이면 인덱스는 '0-3번'까지, 
		//그런데 4번을 이용하게 되면 'ArrayIndexOutOfBoundsException', '예외' 발생
		//stringAr[4] = "윤봉길";
		
		//배열의 전체 데이터를 순회
		/*
		for(int i=0; i<4; i=i+1) {
			String imsi = stringAr[i];
			System.out.println(imsi);
		}
		*/
		
		//배열의 데이터를 순회할 때 반복문의 데이터를 leteral로 입력하는 것은 별로 바람직하지 못합니다.
		//배열의 데이터 개수가 변경되면 수정해야 하기 때문입니다.
		
		//배열의 개수를 변수에 넣어두고 사용하면 배열의 데이터 개수가 변경되더라도 
		//출력하는 부분을 수정할 필요가 없습니다.
		int size = stringAr.length;
		for(int i=0; i<size; i=i+1) {
			String imsi = stringAr[i];
			System.out.println(imsi);
		}
		
		System.out.println("==================================");
		
		//빠른 열거(Fast Enumeration)을 이용한 배열 순회
		//intAr의 모든 데이터를 순서대로 temp에 대입하고 { }안의 내용 수행
		for(String temp : stringAr) {
			System.out.println(temp);
		}
		
		
		
	}

}













