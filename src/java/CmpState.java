package sample1;
public class CmpState {
	boolean result = false;
public boolean compareState(String str1,String str2) {
if (str1 == null||str2 == null) {
return result;
}
if(str1.equalsIgnoreCase((str2)))
result = true;
else
result = false;


System.out.println("insiide compare satae");
return result;
}



}
