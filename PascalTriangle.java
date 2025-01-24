import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the rows of the triangle: ");
        int rows = input.nextInt();

        System.out.println("Pascal's Triangle: ");

        for(int i = 0; i < rows; i++ ){
            for(int k = 0; k <= i; k++){
                System.out.print(pascal(i,k) + "");
            }
        }
        scanner.close();     

    }
    public static int pascal(int col, int row) {
        if (col == 0)
            return 1;
        else if (row == 0)
            return 1;
        else 
        return pascal(col - 1, row -1) + pascal(col, row - 1);  
       
        
    }   
    
}