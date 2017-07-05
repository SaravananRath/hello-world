import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Factorial {

	public static void main(String[] args) throws IOException{
		int fact=1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		Integer n=Integer.parseInt(br.readLine());
		if(n>=0){
		for(int i=1;i<=n;i++){
			fact*=i;
		}
		System.out.println("The factorial of "+n+" is: "+fact);
		}
		
	else
		System.out.println("Invalid");
 }}
