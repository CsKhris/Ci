
public class TR190123 {

	public static void main(String[] args) {
		//Shift(<<, >>, <<<)는 비트 단위로 밀어내는 연산자 입니다.
		//<<를 1번 할 때 마다 2배가 됩니다.
		//>>를 1번 할 떼 마다 1/2이 됩니다.
		//32번 이상 미는 것은 의미가 없어서 32로 나눈 나머지 만큼만 밀어 냅니다.
		
		int x = 17;
		
		System.out.println("X<<2 : " + (x<<2)); //68
		System.out.println("X<<34 : " + (x<<34)); //34%32= 2 : 68
		System.out.println("X>>2 : " + (x>>2)); //
		
		
		
		
		
		//비트 논리 연산자 : 비트 단위로 연산해서 정수로 결과를 리턴
		// &(and)  : 둘 다 '1'일 때만 '1' 나머지 경우는 '0'
		// |(or) : 둘 다 '0'일 때만 '0' 나머지 경우는 '1'
		// ^(exclusive or) : 같으면 '0', 다르면 '1'
		
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
		
		//현재 d2는 '17', d1은 '19'
		result = d1 > 10 && d2 ++ > 20;
		System.out.println("D2 : " + d2); //18
		
		//or는 앞의 조건이 true이면 뒤의 내용을 수행하지 않습니다.
		result = d1 > 10 || d2 ++ > 20;
		System.out.println("D2 : " + d2); //18
		
		
		
		
		
		//d1이 4의 배수인지 확인
		result = d1 % 4 == 0;
		System.out.println("D1은 4의 배수이다. : " + result); //
		
		//d1이 4의 배수이고, 100의 배수는 아니거나 400의 배수인지 확인
		result = d1 % 4 == 0 && d1 % 100 != 0 || d1 % 400 == 0;
		System.out.println("D1은 '4'의 배수이고, '100'의 배수는 아니거나, '400'의 배수이다. : " + result); //
		
		
		
		
		//d1이 d2 보다 크다면 d1, 그렇지 않다면 d2
		int max = d1 > d2 ? d1 : d2;
		System.out.println("Max : " + max);
		
		
		
		}
		
	}
