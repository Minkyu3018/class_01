package Chapter05.other;

import Chapter05.ModifierProtected;

public class ModifierProtectedExends extends ModifierProtected{
	
	// 상속
	// name, age, tell() 
	
	public static void main(String[] args) {
		
		ModifierProtectedExends mpe = new ModifierProtectedExends();
		
		mpe.name = "이강인";
		mpe.age = 30;
		
		mpe.tell();
	}

}
