import java.util.Scanner;

public class exchange {
	
	public static void main(String[] args) {
		
		//거스름돈 입력받음
		Scanner sc = new Scanner(System.in);
		int coin = sc.nextInt();
		int result= 0;  //최종결과

		while(coin>=0) {
			if(coin %5 ==0) {
				System.out.println(result + (coin/5));
				break;
			}else {
				coin -= 2;
				result += 1;
			}
			if(coin < 0 ) {
				System.out.println(-1);
			}
		}
	}

}
