import java.util.Scanner;
public  class MatrixAddition2
{
    public static void main(String args[])
    {
        int row,col,i,j,r1,c1,r2,c2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of rows and columns in 1st Matrix:");
        r1=s.nextInt();
        c1=s.nextInt();
        System.out.println("Enter no of rows and columns in 2nd matrix:");
        r2=s.nextInt();
        c2=s.nextInt();
        if(r1==r2&&c1==c2)
        {
            int mat1[][]=new int[r1][c1];
            int mat2[][]=new int[r2][c2];
            int res[][]=new int[r1][c1];
            System.out.println("Enter elements of Matrix-1:");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    mat1[i][j]=s.nextInt();
                }
            }  
            System.out.println("Enter the elements of Matrix-2:");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    mat2[i][j]=s.nextInt();
                    res[i][j]=mat1[i][j]+mat2[i][j];
                }
            }
            System.out.println("Sum of Matrices:");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(res[i][j]+"\t");
                }
                    System.out.println();
                
            }
            
        }
        else
        {
          System.out.println("Matrix Addition not possible!!");  
        }
        

    }
}
