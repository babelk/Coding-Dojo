package manipulator;

public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        str1 = str1.trim(); 
        str2 = str2.trim();
        return str1.concat(str2);
    }
    public int getIndexOrNull(String str1, char letter) {
    	return str1.indexOf(letter);
    }
    
    public int getIndexOrNull(String str1, String str2) {
    	return str1.indexOf(str2);
    }
    
    public String concatSubstring(String str1, int num1, int num2, String str2) {
    	return str1.substring(num1, num2).concat(str2);
    }
}