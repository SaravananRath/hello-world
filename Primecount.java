import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Primecount  {
public static void main(String args[])throws IOException{
int rs,re;	
int sumPrime=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the start of range");
rs=Integer.parseInt(br.readLine());
System.out.println("Enter the end of range");
re=Integer.parseInt(br.readLine());

if(rs>0&&re>0){
for(int i=rs;i<=re;i++){
	if(checkPrime(i)){
		sumPrime+=i;
	}
}
System.out.println(sumPrime);
}
else
	System.out.println("Invalid Inputs");
}
public static boolean checkPrime(int n){
	if(n==1)
		return false;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0){
			return false;
		}
	}
return true;
}
}
