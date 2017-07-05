import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reverseno {
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Number");
Integer rev=Integer.parseInt(br.readLine());
if(rev>=10){
String rev1= rev.toString();
StringBuffer sb=new StringBuffer(rev1);
System.out.println(sb.reverse());
}
else
	System.out.println("Invalid");

}
}
