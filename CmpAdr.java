package sample1;
public class CmpAdr  {
	boolean result = false;
public boolean compareAdr(String str1,String str2,String str3,String str4) {
if (str1 == null||str2 == null) {
return result;
}
if(str1.equalsIgnoreCase((str3)) && str2.equalsIgnoreCase((str4)) || str1.equalsIgnoreCase((str4)) && str2.equalsIgnoreCase((str3)))
result = true;

else
result = false;
//comparison with swapped address fields



return result;
}



}
