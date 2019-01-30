
public class Base {
	//매개변수가 없는 생성자
	/*
	public Base() {
		System.out.println("상위 클래스의 매개변수가 없는 생성자");
	}
	*/
	
	
	
	//매개변수가 있는 생성자
	//매개변수가 없는 생성자가 없는 클래스를 상속받으면 기본적으로 error
	public Base(int a) {
		System.out.println("상위 클래스의 매개변수가 있는 생성자");
	}
	//자신이 만든 클래스라면 '매개변수가 없는 생성자'를 추가하는게 좋고
	//제공되는 클래스라면 상속 받는 클래스에서 '생성자'를 만든 후,
	//'super'를 이용해서 '상위 클래스의 생성자'를 호출해 주어야 합니다.
		
	
	
	//private - 자신은 클래스 내부에서만 사용 가능
	//'상속'은 되지만, 하위 클래스에서 접근 불가능
	//'인스턴스'도 접근 불가능
	private void in() {
		System.out.println("Private Method");
	}
	
	//public - 자신의 클래스 및 하위 클래스의 그리고 인스턴스도 사용 가능
	public void print() {
		System.out.println("Public Method");
	}
}
