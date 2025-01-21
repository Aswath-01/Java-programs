package String_Handling;

public class String_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=new String();
str="Sachin Tendulkar is the G.O.A.T";

System.out.println(str);

System.out.println(str.charAt(10));

int len=str.length();
System.out.println(len);

System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());

String str2="Hi how are u";
System.out.println(str.equals(str2));

System.out.println(str.valueOf(str));
System.out.println(str2.indexOf("a"));

System.out.println(str.startsWith("S"));
System.out.println(str.endsWith("T"));

System.out.println(str.substring(10,25));
System.out.println(str.contains("Sachin"));

System.out.println(str.trim());
System.out.println(str);
	}

}
