package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class Num_11501 {
	
	public static <E> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�׽�Ʈ Ƚ���� ��������");
		int test=sc.nextInt();
		for(int i=0;i<test;i++) {
			
			sc = new Scanner(System.in);
			System.out.println("�ֽ��� �� ���� ��������.");
			int day=sc.nextInt();
			
			ArrayList<Integer> day_stock = new ArrayList<Integer>();
			System.out.println("������ �ְ��� ��������");
			for(int l=0;l<day;l++) {
				sc= new Scanner(System.in);
				day_stock.add(sc.nextInt());
			}
			int H_profit=0;
			int[] profit=new int[day_stock.size()];
			
			int a=1;
			
			for(int j=0;j<day_stock.size()-1;j++) {
				if(profit[j]>0) {
					profit[j]=day_stock.get(day_stock.size()-a)-day_stock.get(day_stock.size()-(j+2));
					if(profit[j]<=0) {
						a=a+j+1;
					}else {
						H_profit=H_profit+profit[j];
					}
				}
			}
				
		
			System.out.println(H_profit);
			
			
			
			
		
			
			
		}
	}
}
