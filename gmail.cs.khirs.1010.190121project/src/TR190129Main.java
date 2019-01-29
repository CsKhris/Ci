import java.util.Scanner;

public class TR190129Main {

	public static void main(String[] args) {
//sample 클래스의 'cav' 메소드와 'car' 메소드를 사용

		int n = 10;
		int [] br = {10, 20, 30}; 
		
//cav 메소드와 car 메소드를 호출
//static메소드가 아니므로 인스턴스를 먼저 생성
		Sample sp = new Sample();
		
		sp.cav(n);
//n은 'value'형 이므로 값이 변경되지 않습니다.
		System.out.println("n = " + n);
		
//br 데이터를 가지고 메소드 호출
		sp.car(br);
//br은 'reference'형 이므로 값이 변경될수 있습니다.
		System.out.println("br[0] = " + br[0]);
		
//double을 return하는 메소드 호출
		double result = sp.doubleAdd(10.3, 7.2);
		System.out.println("Result = " + result);
		
//메소드의 수행결과도 '데이터' 이므로 '메소드' 안에서 '메소드'를 '매개변수'로 사용할수 있습니다.
		result = sp.doubleAdd(sp.doubleAdd(17.5, 2.2), 10.5);
		System.out.println("Result = " + result);
		
		//static 변수나 메소드는 클래스 이름으로 호출이 가능합니다.
		Sample.staticMethod();
		
		sp.sameName(20);
		
		
		
		//Person 클래스의 인스턴스를 생성
		Person person1 = new Person();
		
		//setter를 호출해서 데이터를 저장
		person1.setName("Cs");
		person1.setAge(27);
		person1.setHeight(183);
		
		//getter를 이용해서 데이터를 출력
		System.out.println("Name : " + person1.getName());
		System.out.println("Age : " + person1.getAge());
		System.out.println("Height : " + person1.getHeight());
		
		//문자열을 매개변수로 받는 생성자를 이용해서 인스턴스를 생성
		Person person2 = new Person("noname");
		System.out.println("Name : " + person2.getName());
		System.out.println("Age : " + person2.getAge());
		System.out.println("Height : " + person2.getHeight());

		
		Scanner sc = new Scanner(System.in);
		
		
		
	}

}
