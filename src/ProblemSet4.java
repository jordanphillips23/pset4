

/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps4 = new ProblemSet4();
		
		System.out.println(ps4.surroundMe(null, null));
		System.out.println(ps4.endsMeet(null, 2));
		System.out.println(ps4.middleMan(null));
		System.out.println(ps4.doubleVision(null));
		System.out.println(ps4.centered("baby" , "aby"));
		System.out.println(ps4.upOrDown(1.5, 'l'));
		System.out.println(ps4.countMe(null, 'l'));
		System.out.println(ps4.triplets(null));
		System.out.println(ps4.addMe(null, false));
		System.out.println(ps4.isNotEqual(null));
		
	}
	
	public String surroundMe(String out, String in) {
		if (out == (null)|| in == (null)) {
			return null;
		}
		
		if (out.length() != 4 || in.length() != 3 ) {
			return null;
		}
		
		return out.substring(0, 2) + in + out.substring(2,4);
	}
	
	public String endsMeet(String str, int n) {
		if (str == (null) || str.length() > 10 || str.length() < 1 || n < 1 || n >= str.length()) {
			return null;
		}
		
		return str.substring(0, n) + str.substring(str.length() - n , str.length());
	}
	
	public String middleMan(String str) {
		if (str == (null)|| (str.length() % 2) == 0 || str.length() < 3) {
			return null;
		}
		return str.substring((str.length() / 2) - 1 , (str.length() / 2) + 2);
	}
	
	public String doubleVision(String str) {
		if (str == (null)) {
			return null;
		}
		
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			output += "" + str.charAt(i) + str.charAt(i);
		}
		
		return output;
	}
	
	public Boolean centered(String str, String target) {
		if (str == (null) || target == (null) || target.length() != 3) {
			return false;
		}
		
		if (target.equals( str.substring((str.length() / 2) - 1 , (str.length() / 2) + 2))) {
			return true;
		}
		return false;
	}
	
	public int upOrDown(double number, char operation) {
		
		if (operation == 'r') {
			return (int) Math.round(number);
		}
		else if (operation == 'f') {
			return (int) Math.floor(number);
		}
		else if (operation == 'c') {
			return (int) Math.ceil(number);
		}
		else {
			return -1;
		}
	}
	
	public int countMe(String text, char end) {
		if (text == (null)) {
			return -1;
		}
		if (!Character.isLetter(end)) {
			return -1;
		}
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == end && text.charAt(i + 1) == ' ') {
				count++;
			}
		}
		return count;
	}
	
	public boolean isNotEqual(String str) {
		if (str == (null)) {
			return false;
		}
		int iscounter = 0;
		int notcounter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
				iscounter++;
			}
			else if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't') {
				notcounter++;
			}
		}
		return iscounter == notcounter;
		
	}
	
	public int triplets(String str) {
		if (str == (null)) {
			return -1;
		}
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (Character.isLetter(str.charAt(i)) == false) {
				return -1;
			}
			
			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
				count++;
			}
			
		} 
		return count;
	}
	
	public int addMe(String str, boolean digits) {
		if (str == null) {
			return -1;
		}
		int sum = 0;
		int current = 0;
	
		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isWhitespace(str.charAt(i))) {
				return -1;
			}
			if (digits) {
				if (Character.isDigit(str.charAt(i))) {
					sum += str.charAt(i) - '0';
				}
			}
			else {
				if (Character.isDigit(str.charAt(i))) {
					current *= 10;
					current += str.charAt(i) - '0';
				}
				else {
					sum += current;
					current = 0;
				}
			}
		}
		
		sum += current;
		return sum;
	} 
	
}