package Chap05Re;

public class SmartPhoneMain {

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();

		System.out.println("color : " + sp.color);
		System.out.println("size : " + sp.size);
		System.out.println("volume : " + sp.volume);

		sp.call();
		sp.volumeUp();
		sp.color = "green";

	}
}
