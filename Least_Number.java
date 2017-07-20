package guvi_pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Least_Number {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		String str=br.readLine();
		System.out.println("Enter the number of digits to delete");
		Integer x=Integer.parseInt(br.readLine());
		Integer n= Integer.parseInt(str);
		Integer num[]= new Integer[str.length()];
		
		for(int i=0;i<str.length();i++){
			Integer m = n%10;
			num[i]=m;
			n=n/10;
		}
		Arrays.sort(num);
		
		for(int i=1;i<str.length();i++){
			num[i]=Math.abs(num[i]);
		}
		if(num[0]<0){
			for(int i=0;i<str.length()-x-1;i++){
				System.out.print(num[i]);
		}}
		else{
		for(int i=0;i<str.length()-x;i++){
			System.out.print(num[i]);
		}}
		
}}
