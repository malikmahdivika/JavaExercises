package lesson.twelve;
import java.util.regex.*;

public class JavaStrings {
	private static Pattern SECRET_CODE_REGEX = Pattern.compile("[AEIOUaeiou]");
	
	public static Pattern getSECRET_CODE_REGEX() {
		return SECRET_CODE_REGEX;
	}

	public static void main(String[] args) {
		JavaStrings javaStrings = new JavaStrings();
		System.out.println(javaStrings.addTogether("  asdf  ", " df ad  a  "));
		
		System.out.println(javaStrings.idProcessing("Edward", "Mikkelsen", "Diorne", 2010));
		
		System.out.println(javaStrings.secretCode("POTATO"));
		System.out.println(javaStrings.secretCode("tomato"));
		
		System.out.println(javaStrings.dateNormalizer("2025-02-02"));
		System.out.println(javaStrings.dateNormalizer("2025.02.02"));
		System.out.println(javaStrings.dateNormalizer("2025/02/02"));
		System.out.println(javaStrings.dateNormalizer("02.02.2025"));
		System.out.println(javaStrings.dateNormalizer("02-02-2025"));
	}
	
	public int addTogether(String str1, String str2) {
		str1.trim();
		str2.trim();
		
		String result = str1.concat(str2);
		
		return result.length();
	}
	
	public String idProcessing(String fName, String lName, String pName, int year) {
		String result = fName.substring(0, 1).concat(lName.substring(0, 1));
		result = result.concat(pName.substring(0, 1)).concat(String.valueOf(year));
		
		return result;
	}
	
	public String secretCode(String ingredient) {
		Pattern code = JavaStrings.getSECRET_CODE_REGEX();
		Matcher matcher = code.matcher(ingredient);
		
		return matcher.replaceAll("z");
	}
	
	public String dateNormalizer(String date) {
		Pattern normalDate = Pattern.compile("^\\d{2}[-.]\\d{2}[-.]\\d{4}$");
		Matcher normalMatcher = normalDate.matcher(date);
		
		Pattern reversedDate = Pattern.compile("^\\d{4}[-.]\\d{2}[-.]\\d{2}$");
		Matcher reversedMatcher = reversedDate.matcher(date);
		
		if (reversedMatcher.find()) {
			String year = date.substring(0, 4);
			String month = date.substring(5, 7);
			String day = date.substring(8);
			
			String normalizedDate = day + "-" + month + "-" + year;
			return normalizedDate;
		} else if (normalMatcher.find()) {
			date = date.replaceAll("\\.+", "-");
			return date;
		} else {
			return "";
		}
		
	}

}
