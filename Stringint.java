import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Stringint  {
public static void main(String args[])throws IOException{
	try{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Integer n;
String s="";
System.out.println("Enter the String");
String str=br.readLine();
char a[]=str.toCharArray();
for(int i=0;i<a.length;i++){
if(a[i]=='0'||a[i]=='1'||a[i]=='2'||a[i]=='3'||a[i]=='4'||a[i]=='5'||a[i]=='6'||a[i]=='7'||a[i]=='8'||a[i]=='9'||a[i]=='-'||a[i]=='-')
		s=s+a[i];
}

 n=Integer.parseInt(s);
System.out.println(n);
}
catch (NumberFormatException e){
System.out.println("No numbers present in the string");
}

}
}
