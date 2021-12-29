import java.util.*;
public class Main {

	public static void main(String[] args) {
		// todo auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		int result=A*B*C;
		int num[]=new int[10];
		int cnt[]=new int[10];
		int divisor=1000000000;
		for(int i=0;i<10;i++)
		{			
			num[i]=(result/divisor);
			result=result-(num[i]*divisor);
			divisor/=10;
		}
		int j=0;
		while(num[j]==0)
		{			
			j++;
		}
		for(int i=j;i<10;i++)
		{
			
			switch(num[i])
				{
				case 0:
					cnt[0]++;
					break;
				case 1:
					cnt[1]++;
					break;
				case 2:
					cnt[2]++;
					break;
				case 3:
					cnt[3]++;
					break;
				case 4:
					cnt[4]++;
					break;
				case 5:
					cnt[5]++;
					break;
				case 6:
					cnt[6]++;
					break; 
				case 7:
					cnt[7]++;
					break;
				case 8:
					cnt[8]++;
					break;
				case 9:
					cnt[9]++;
					break;				
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(cnt[i]);
		}
	}
}
