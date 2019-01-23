
public class TR190122 {

	public static void main(String[] args) {
		//번호(정수='int')와 몸무게(실수='double'), 키(실수='double')를 저장하고 출력하기
		
		//변수 선언부
		int numb = 17; //변수를 생성하며 바로 값을 대입
		double muge, ki;  //동일한 자료형을 묶어서 생성
		
		//double ki;
		
		//데이터 저장부
		//numb = 17;
		
		muge = 75.5;
		ki = 185.5;
		
		//데이터 출력부
		System.out.println("번호 : " + numb + "번");
		System.out.println("무게 : " + muge + "Kg");
		System.out.println("신장 : " + ki+ "Cm");
		
		//문자는 char로 생성하고 코드값을 대입해도 되고 ''안에 하나의 문자를 대입해도 됨
		//0:48 A:65 a:97
		
		char ch = 'A';
		System.out.println("CH is : " + ch);
		ch = 65;
		System.out.println("CH is : " + ch);
		ch = 'A' + 2;
		System.out.println("CH is : " + ch);
		
		//Boolean은 참(true) 거짓(false)을 저장하기 위한 자료형
		//boolean은 boolean이라는 표시를 하기 위해서 is로 시작하는 경우가 많음
		//20세 이상 여부를 저장
		
		
		boolean isAdt = true;

		System.out.println(isAdt);
		
		
		
	}
}
