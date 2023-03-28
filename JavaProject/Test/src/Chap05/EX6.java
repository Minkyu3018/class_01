package Chap05;

public class EX6 {

	public static void main(String[] args) {
		
		System.out.println("Card width : " + Card.width);
		System.out.println("Card height : " + Card.height);
		
		
		Card c1 = new Card();
		c1.kind = "space";
		c1.number = 6;
		
		System.out.println("카드모양 : " + c1.kind);
		System.out.println("카드숫자 : " + c1.number);
		
			
		
	}
	
static class Card {
	String kind;
	int number;
	static int width =100;
	static int height =200;
}

}
