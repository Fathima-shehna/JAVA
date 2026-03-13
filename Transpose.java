import java.util.Scanner;
public class Transpose
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the rows and columns:");
        int rows=s.nextInt();
        int col=s.nextInt();
        int[][]matrix=new int [rows][col];
        int[][]matrixT=new int [rows][col];
        if(rows!=col)
        {
            System.out.println("Not a Square Matrix");
        
        }
        else
        {
            System.out.println("Enter elements of matrix:");
            for(int k=0;k<rows;k++)
            {
                for(int l=0;l<col;l++)
                {
                    matrix[k][l]=s.nextInt();
                    matrixT[k][l]=matrix[l][k];
                }
            }
            System.out.println("Transpose Matrix:");
            for(int k=0;k<rows;k++)
            {
                for(int l=0;l<col;l++)
                {
                    System.out.print(matrix[l][k]+"\t");
                }
                System.out.println();
            }
        }
    }
}
