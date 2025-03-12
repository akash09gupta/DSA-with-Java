import java.util.Scanner;

class MultiArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of layers : ");
        int layers = sc.nextInt();
        System.out.println("Enter the size of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the size of cols : ");
        int cols = sc.nextInt();

        int arr[][][] = new int[layers][rows][cols];

        System.out.print("Enter elements for 3D Array :");
        for(int i = 0; i<layers; i++) {
            for(int j = 0; j<rows; j++) {
                for(int k = 0; k<cols; k++) {
                    System.out.println("Enter the element at position [" + i + "][" + j + "][" + k +"] :");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.print("3D Array : ");
        for(int i = 0; i<layers; i++) {
            System.out.println("Layer " + i + ":");
            for(int j = 0; j<rows; j++) {
                for(int k=0; k<cols; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}