import java.util.Scanner;

public class ZohoPattern {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n");
	int i,j,k=0;
	int n = sc.nextInt();
	if(n>0){
	int rsi=0,rei=n,csi=0,cei=n;
	int a[][]=new int[n][n];
	
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			a[i][j]=0;
		}
	}
	while(rsi<rei&&csi<cei){
		
		for(i=csi;i<cei;i++)
			a[rsi][i]=n-k;
		rsi++;
		
		for(i=rsi;i<rei;i++)
			a[i][cei-1]=n-k;
		cei--;
		
		for(i=cei-1;i>=csi;i--)
			a[rei-1][i]=n-k;
		rei--;
		
		for(i=rei-1;i>=rsi;i--)
			a[i][csi]=n-k;
		csi++;
		k++;
}
	for(i=0;i<n;i++){
	for(j=0;j<n;j++){
		System.out.print(a[i][j]);
		}
	System.out.println();
	}}
	else
		System.out.println("Enter a positive number");
}
}
