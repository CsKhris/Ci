import java.util.Scanner;

public class TR190124 {

	public static void main(String[] args) {

		//키보드로 부터 입력 받기 위한 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//하나의 문자열 입력받기
		System.out.print("1.한식 2.일식 3.분식 4.중식 : ");
		int menu = sc.nextInt();
		
		//switch 이용
		switch(menu) {
		case 1:
			System.out.println("한식집 연결");
			break;
		case 2:
			System.out.println("일식집 연결");
			break;
		case 3:
			System.out.println("분식집 연결");
			break;
		case 4:
			System.out.print("중식집 연결");
			break;
		default:
			System.out.print("번호를 잘못 선택하셨습니다.");
			break;		
		}
		
		//System.out.print("Check Your Score : ");
		//int score = sc.nextInt(); 
		/*
		//score가 60점 이상이면 '합격'이라고 출력
		if (score >= 60);{
			System.out.println("Pass");
		}
		*/
		
		/*
		//score가 100이상이면 '성공', 그렇지 않으면 '실패'로 출력
		
		if (score >= 100) {
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		*/
		
		/*
		//score가 90-100이면 'A', 80-89면 'B', 70-79면 'C' 0-59는 'F' 출력
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		}else if (score >= 80 && score < 90) {
			System.out.println("B");
		}else if (score >= 70 && score < 80) {
			System.out.println("C");
		}else if (score >= 0 && score < 70) {
			System.out.println("F");
		}else {
			System.out.println("Please Check Your Score(*Score Range Only 0-100)");
		}
		*/
		
		
		
		sc.close();

	}

}
