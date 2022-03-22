package com.company;// package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class ReadArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input total row: ");
        int rows = sc.nextInt();
        System.out.print("Input total column: ");
        int columns = sc.nextInt();

        int [][] matrix = new int[rows][columns];
        for (int i = 0; i< rows; i++) {
            for (int j = 0; j<columns; j++) {
                System.out.println("Row ["+i+"]: Column "+j+" :");
                matrix[i][j] = sc.nextInt();
            }
        }

    }
    public void getMaximumOfEveryColumn (ReadArray A) {
        for ( int i = 0; i < A.length; i++ )
        {
            int max = Integer.MIN_VALUE;
            for ( int j = 0; j < A [ i ].length; j++ )
                if ( A [ j ] [ i ] > max )
                    max = A [ j ] [ i ];
            System.out.println( "Maximum of column " + i + " = " + max );
        }
    }

    public void getMinimumOfEveryColumn (ReadArray A)
    {
        for ( int i = 0; i < A.length; i++ )
        {
            int min = Integer.MAX_VALUE;
            for ( int j = 0; j < A [ i ].length; j++ )
                if ( A [ j ] [ i ] < min )
                    min = A [ j ] [ i ];
            System.out.println( "Minimum of column " + i + " = " + min );
        }
    }
}
