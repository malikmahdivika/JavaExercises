/**
 * 
 */
package lesson.twelve;
import java.util.regex.*;

/**
 * 
 */
public class RegexExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myString = "ENSF Principles of Software Development";
		
		Pattern pattern = Pattern.compile("[eE]+");
		Matcher matcher = pattern.matcher(myString);
		
		String[] tokenizedMyString = myString.split(" ", 0);
		
		StringBuilder myNewString = new StringBuilder(myString);
		myNewString.insert(4, ":");
		String result = myNewString.toString();
		
		System.out.println(matcher.results().count());
		for (String value: tokenizedMyString) {
			System.out.println(value);
		}
		System.out.println(result);
	}

}
