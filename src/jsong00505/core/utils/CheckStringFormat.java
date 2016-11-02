package jsong00505.core.utils;

public class CheckStringFormat {
	public static boolean isNumericString(String str) {
		String regex = "^[0-9]+$";
		if(str.matches(regex)) {
			return true;
		}
		return false;
	}
	
	public static boolean isAlphaNumericString(String str) {
		String regex = "^([A-Za-z]|[0-9])+$";
		if(str.matches(regex)) {
			return true;
		}
		return false;
	}
	
	public static boolean isAlphabeticString(String str) {
		String regex = "^[A-Za-z]+$";
		if(str.matches(regex)) {
			return true;
		}
		return false;
	}

}
