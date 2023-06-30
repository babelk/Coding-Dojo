package manipulator;

public class StringManipulatorTesting {

	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
		System.out.println(str); // HolaMundo 
		
		StringManipulator manipulator1 = new StringManipulator();
		char letter = 'n';
		int a = manipulator1.getIndexOrNull("Coding", letter);
		int b = manipulator1.getIndexOrNull("Hola Mundo", letter);
		int c = manipulator1.getIndexOrNull("Saludar", letter);
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // -1
		
		StringManipulator manipulator2 = new StringManipulator();
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		int a1 = manipulator2.getIndexOrNull(word, subString);
		int b1 = manipulator2.getIndexOrNull(word, notSubString);
		System.out.println(a1); // 2
		System.out.println(b1); // -1
		
		
		StringManipulator manipulator3 = new StringManipulator();
		String word1 = manipulator3.concatSubstring("Hola", 1, 3, "mundo");
		System.out.println(word1); // olmundo


	}
	
}
