import java.util.Scanner;
public class LunarYear {

	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
			
		if(year %400 == 0){
				System.out.println(year+"���� �����Դϴ�.");}
		else if(year % 100 ==0){
			System.out.println(year+"���� ����Դϴ�.");}
		else if(year % 4 ==0){
		System.out.println(year+"���� �����Դϴ�.");}
		else {System.out.println(year+"���� ����Դϴ�.");
		}
		
}

	
}