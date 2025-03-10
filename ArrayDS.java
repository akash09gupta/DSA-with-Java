/**
 * ArrayDS
 */
import java.util.Scanner;;
public class ArrayDS {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //array Declaration
        int a[]=new int[5];
        // //initialization
        // a[0]=5;
        // a[1]=4;
        // a[2]=3;
        // a[3]=2;
        // a[4]=1;
        //second method of initialzing the values by the user
        System.out.println("Enter the values for the array :");
        for(int i=0; i<a.length; i++) {
            a[i]=sc.nextInt();
        }
        //displaying the data of array
        System.out.println("Array Values : ");
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        //Declaration of 2D Array
        int a2[][]=new int[3][3];
        //initialization
        // a2[0][0]=2;
        // a2[0][1]=4;
        // a2[0][2]=6;
        // a2[1][0]=8;
        // a2[1][1]=1;
        // a2[1][2]=3;
        // a2[2][0]=5;
        // a2[2][1]=7;
        // a2[2][2]=9;
        //second method of initialzing the values by the user
        System.out.println("Enter the values for the 2D array :");
        //i for rows
        for(int i=0; i<a2.length; i++) {
            //j for columns
            for(int j=0; j<a2.length; j++) {
                a2[i][j]=sc.nextInt();
            }
        }
        //Printing the values for 2D array
        System.out.println("2D Array Values :");
        //i for rows
        for(int i=0; i<a2.length; i++) {
            //j for columns
            for(int j=0; j<a2.length; j++) {
                System.out.print(a2[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}