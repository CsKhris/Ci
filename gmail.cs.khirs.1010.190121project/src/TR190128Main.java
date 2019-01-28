//main 메소드를 가지고 있는 클래스가 실행 클래스 입니다.

public class TR190128Main {

	public static void main(String[] args) {
		//Data 클래스의 인스턴스 만들기
		//인스턴스를 만들 때는 new 생성자()가 기본
		Data data = new Data();
		data.name = "Cs";
		data.age = 29;
		data.height = 183.5;
	
		//인스턴스 변수는 클래스 이름으로 접근이 불가
		//Data.name = "이순신";
		
		//static 변수는 클래스이름과 인스턴스 이름으로 접근 가능
		Data.school = "부천동초등학교";
		//인스턴스 이름으로 접근하면 경고
		data.school = "역곡중학교";
		
		
		
		//중복된 코드를 여러번 작성하게 될 경우 유지보수가 어려워집니다.
		//변경을 하고자 하는 경우 전부 찾아서 직접 변경해야 합니다.
		//이렇게 중복된 코드를 스파게티 코드라고 합니다.
		//이 문제는 중복된 코드를 함수로 만들어서 해결합니다.
		for(int i=0; i<5; i=i+1) {
			System.out.println("Hello NoMethod");
		}		
		
		for(int i=0; i<5; i=i+1) {
			System.out.println("Hello NoMethod");
		}
		data.wall(1);
		
		//인스턴스를 이용해서 Data 클래스에 만든 insa 메소드 호출
		data.insa();
		data.insa();
		
		data.wall(1);

		//매개변수가 있는 메소드
		//매개변수가 있으면 없을 때 보다 다양하게 작업을 할수 있습니다.
		data.insa(7);
		
		
		
	}

}
