import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args) {
		int[][] numbers = new int [2][3];
		numbers[0][0] = 1;
		numbers[0][1] = 2;
		numbers[0][2] = 3;
		
		numbers[1][0] = 4;
		numbers[1][1] = 5;
		numbers[1][2] = 6;		
		
		//System.out.println(Arrays.toString(numbers));
		
		
		for (int i = 0;i <2;i++) {
			for (int j= 0; j< 3; j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
		
		
	}

}
