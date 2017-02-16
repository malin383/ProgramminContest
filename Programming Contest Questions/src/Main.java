import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner user = new Scanner(System.in);
		
		System.out.println("Pick a number between 1 and 10");
		int x = user.nextInt();
		int y = 0;
		
		for(int i = 0; i < x; i ++){
			System.out.println();
			y += 1;
			for(int j = 0; j <= i; j++ )
				System.out.print("#");
		}
		
	}

}
