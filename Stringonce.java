import java.io.*;

public class Stringonce {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str=br.readLine().toLowerCase();
		char c[]=str.toCharArray();
		int n=c.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(c[i]==c[j]&&i!=j)
				c[j]='\0';
			}
		}
		for(int i=0;i<n;i++){
			if(c[i]!='\0')
			System.out.print(c[i]);
		}
