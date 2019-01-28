
public class Data {
	//클래스 안에서 static이라는 키워드 없이 만드면 인스턴스 변수
	//각 인스턴스가 별도로 메모리 할당을 받아서 사용
	//인스턴스만 접근이 가능합니다.
	public String name;
	public int age;
	//접근 지정자가 public이면 클래스 내부와 외부에서 모두 사용 가능
	public double height;
	
	//접근 지정자가 private이 되면 클래스 외부에서는 사용이 불가능
	//private double height;
	
	
	
	//static 변수
	//클래스 코드 안에 1개만 생성
	//클래스와 인스턴스 모두 접근이 가능
	//데이터를 공유할 때 사용
	public  static String school;
	
	//static 초기화 : 클래스를 처음 사용할 때 한번만 수행하는 코드
	//인스턴스 변수는 사용할 수 없습니다.
	static {
		System.out.println("처음 한번만 수행되는 코드(=스플래시 코드(ex : Logo 화면))");
		school = "흑석초등학교";
		
		System.out.println(school);
		
		//인스턴스 변수를 사용해서 에러
		//name = "Cs";
	}
	
	public void insa() {
		for(int i=0; i<5; i=i+1) {
			System.out.println("Hello NoMethod");
		}
	}
	
	//함수를 호출할 때 대입한 정수만큼 문자열을 출력하는 메소드
	//이름은 위의 함수랑 동일한 insa인데 매개변수의 개수가 다릅니다.
	//이렇게 이름은 같고 매개변수의 개수나 자료형이 다른 메소드를 만드는 것을 Method Overloading이라고 합니다.
	//하는 일이 비슷한 메소드의 이름을 동일하게 만들기 위해서 사용합니다.
	public void insa(int n) {
		for(int i=0; i<n; i=i+1) {
			System.out.println("Hello ArMethod");
		}
	}	
	
	public void wall(int n) {
		for(int i=0; i<n; i=i+1) {
			System.out.println("================================================================");
		}
	}

}
