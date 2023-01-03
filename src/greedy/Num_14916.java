package greedy;

import java.util.Scanner;

public class Num_14916 {
	public static void main(String[] args) {
		int m_change;
		Scanner sc = new Scanner(System.in);
		System.out.println("거스름돈을 입력하세요");
		m_change=sc.nextInt();

		int five=m_change/5;
		int two=(m_change%5)/2;
		int how_many = 0;
	
		if(m_change%5==0){
		    how_many=five;
		}else{
			
			if((m_change%5)%2!=0) {
				while(m_change%2!=0) {
					five--;
					m_change=m_change-five*5;
					two=m_change/2;
				}
			}
		    how_many=two+five;
		  
		}
		System.out.println(how_many);
	}
}
