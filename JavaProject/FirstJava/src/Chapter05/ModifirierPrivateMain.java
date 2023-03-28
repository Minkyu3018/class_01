package Chapter05;

public class ModifirierPrivateMain {

	public static void main(String[] args) {

		ModifierPrivate mp = new ModifierPrivate("손흥민", 20);
		
		//mp.age = 20;
		//mp.name = "손흥민";
		
		mp.tell();
	}

}
