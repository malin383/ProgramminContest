import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner datasets = new Scanner(System.in);
		Scanner user = new Scanner(System.in);
		int tree = 0;
		
		System.out.println("How many data sets?");
		int indexes = datasets.nextInt();
		int arrayTree[] = new int[indexes];
		System.out.println("Enter " + indexes + " values between 1 and 10");
		
		for(int k = 0; k < indexes; k++){//loops until all indexes have been assigned value
			arrayTree[k] = user.nextInt();
		}
		
		
		for(int i = 0; i < indexes; i++){//loops until number of data sets is complete
			tree = arrayTree[i]; //height of tree
			System.out.println();
			for(int j = 0; j < tree; j++){//loops until height is reached
				System.out.println();
				for(int k = 0; k <= j; k++){
					System.out.print("#");
				}
			}
			
		}
		
		
	}

}
