package Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		StarC star = new Tr();
		star.Attack();

		star = new Pt();
		star.Attack();

		star = new Zg();
		star.Attack();		
		
	}

}
