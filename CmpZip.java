package sample1;

public class CmpZip  {
	boolean result = false;

	public boolean compareZip(String str1, String str2) {
		if (str1 == null || str2 == null) {
			return result;
		}
		if(str1.equalsIgnoreCase((str2)))
			result = true;
		else
			result = false;
		System.out.println("inside compare zip");
		return result;
	}
}
