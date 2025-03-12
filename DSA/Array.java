import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int sizeOfArray = sc.nextInt();

        int arr[] = new int[sizeOfArray];

        for(int i = 0; i<sizeOfArray; i++) {
            System.out.println("Enter the element at index " + i);
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<sizeOfArray; i++) {

            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        //2D Array
        
        // Taking input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Declaring a 2D array
        int[][] arr2 = new int[rows][cols];

        // Taking input for the 2D array
        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }

        // Printing the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        sc.close();
    }
}