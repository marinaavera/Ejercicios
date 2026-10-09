package jUnit;

public class Palindromo {
	public static boolean isPalindrome(String sentence) {
		if (sentence.length() <= 1) {
		System.out.println("Sentence too short");
		return false;
		}
		String text =sentence.toLowerCase();
		int i = 0; // Avanza desdeel principio
		int j = text.length()-1; //Retrocede desde el final
		while (i <j) {
		if (text.charAt(i) == ' ') {
		i++;
		} else if(text.charAt(j) == ' '){
		j--;
		} else {
		if (text.charAt(i) != text.charAt(j))
		return false;
		i++;
		j--;
		}
		}
		return true;
		}
}
