import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt(); //테스트케이스 수
		
		
	
		for(int n=0; n<testcase; n++) {
			
			int day = sc.nextInt(); // 날의 수
			long stocks[] = new long[day]; //날 별 주가
			long max = 0 ;
			long profit = 0;
			
			
			for(int i=0; i<day; i++) {
				stocks[i] = sc.nextInt();
			}
			
			//핵심)) 뒤에서 부터 비교하면서 최댓값 - 현재값 = 이익 
			for(int j=day-1; j>=0; j--) {
				if(stocks[j] > max)
					max = stocks[j];
				else
					profit += (max - stocks[j]);
					
			}
			
			System.out.println(profit);
			
		}

	}

}
