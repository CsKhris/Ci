
public class TR1901222 {

	public static void main(String[] args) {
		//byte < short < char < int < long < float < double 
		
		//숫자형 변수라면 자신의 크기보다 작은 데이터는 저장 가능
		double d = 10;
		
		//자신의 크기보다 큰 데이터는 저장 불가
		//int x = 10.7; //Error
		//byte b = 2000; //Error
		
		byte b1 = 10;
		byte b2 = 20;
		
		//int 보다 작은 데이터를 산술연산하면 int로 변경해서 연산을 수행하기 때문에 byte에 저장을 못함
		//byte result = b1 + b2;  
		
		//int result = b1 + b2;
		
		//연상의 결과는 3 = 정수와 정수가 연산하면 결과는 '정수'(r=3.0)
		//double r = b1 / 3;
		
		//하나의 데이터를 double로 형변환 하면 '실수'와 '정수'가 연산함으로 모두 '실수'로 변경해서 연산
		double r = (double)b1 / 3;
		System.out.println("r="+r);
		
		double sum = 0;
		for(int i = 0; i < 1000; i = i + 1) {
			sum = sum +0.1;
		}
		System.out.println("sum : " + sum);
		
		//더하는 값에 '10'을 곱하여 정수를 더하도록 하고, 결과를 다시 '10'으로 나누어서 원하는 결과를 얻어내야 합니다.
		//이러한 이유 때문에 간혹 실수를 정수로 변경하는 경우가 있습니다.
		sum = 0;
		for(int i = 0; i < 1000; i = i + 1) {
			sum = sum + 1;
		}
		System.out.println("sum : " + (sum/10));
		
		
		
		//실수를 정수로 변환하면 소수가 버려짐
		int k = (int)19.9;
		System.out.println("k : " + k);
		//큰 정수를 작은 정수로 변환하다 보면 'Overflow'나 'Underflow'가 발생
		
		//byte는 127까지 저장할수 있는데 더 큰 수를 강제로 변환하여 저장 : Overflow
		byte b = (byte)200; 
		System.out.println("k : " + b);		
		
		//byte는 -128까지 저장할수 있는데 더 작은 수를 강제로 변환해서 저장 : Underflow
		b = (byte)-200;
		System.out.println("k : " + b);
		
		
		
	}

}
