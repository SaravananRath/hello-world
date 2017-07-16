import java.util.*;
public class SpiralPrint {
	public static void main(String[] args)  {
	int i,j;
//	int[][]n={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	Scanner sc = new Scanner(System.in);
	int[][]n=new int [4][4];
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			n[i][j]=sc.nextInt();
		}
	}
	
	
	int rsi=0,rei=4,csi=0,cei=4;
	
	while(rsi<rei&&csi<cei){
		
		for(i=csi;i<cei;i++){
			System.out.println(n[rsi][i]);
		}
		rsi++;
		
		for(i=rsi;i<rei;i++){
			System.out.println(n[i][cei-1]);
		}
		cei--;
		
	if(rsi<rei){
			for(i=cei-1;i>=csi;i--){
			System.out.println(n[rei-1][i]);

		}
			rei--;
		}
		
		if(csi<cei){
		for(i=rei-1;i>=rsi;i--){
			System.out.println(n[i][csi]);
		}
	csi++;
		}
	}
		
	
	}
}

