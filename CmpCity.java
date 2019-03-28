package sample1;
public class CmpCity {
	boolean result = false;
public boolean compareCity(String str1,String str2) {
if (str1 == null||str2 == null) {
return result;
}
if(str1.equalsIgnoreCase((str2)))
result = true;
else
result = false;


System.out.println("Inside compare city");
return result;
}



}
