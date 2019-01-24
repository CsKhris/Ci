
public class Loop {

	public static void main(String[] args) {
		// 동일한 작업이나 일정한 패턴을 가진 작업은 반복문을 이용해서 작성이 가능합니다.
		
		/*
		//'Hello Java', '3'번 출력 - 'while'을 사용하여 작업
		int HJ = 1;
		while(HJ < 4) {
			System.out.println("Hello Java");
			HJ = HJ + 1;	
		}
		
		//'1'부터 '5'까지 '순서'대로 출력 - 'do-while'을 사용하여 작업
		//1, 2, 3, 4, 5, - 2, 4, 6, 8, 10 - 1, 3, 5, 7, 9
		HJ = 0;
		do{
			System.out.println(2*HJ + 1);
			HJ = HJ + 1;
		} while(HJ < 5); 
		*/
		
		//'for'을 이용해서 'Hello Java', '5'번 출력
		
		for(int i = 0; i < 5; i = i + 1) {			
			System.out.println("Hello Java");
		}
		
		//System.out.println("*'i' Result = " + i);
		
		
		for(int i=1; i<10; i=i+1) {
			//'i'가 '4'의 '배수'일 'i=i+1'로 이동
			//'continue'는 '아래'에 있는 문장을 수행하지 않습니다.
			if(i % 4 == 0) {
				continue;
			}
			System.out.println("*Result 'i' = " + i);
		}
		
		
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
	
		
	}

}




