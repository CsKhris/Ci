import java.util.Random;
import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		//무한 반복
		Random r = new Random();
		while(true) {
			System.out.println("Choose Your Robot");
			String input = sc.nextLine();
			//0-99까지의 램덤한 정수의 추출
			i = r.nextInt(100);
			if(i % 6 == 0 || i % 6 == 2 || i % 6 ==4) {
				System.out.println("Megatron");
			}else if(i % 6 == 1 || i % 6 == 3 ) {
				System.out.println("Bumblbee");
			}else {
				System.out.println("Optimus");
			}
			//i = i + 1;
		}	

	}

	
}
