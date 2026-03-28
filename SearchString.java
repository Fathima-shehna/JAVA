import java.util.Scanner;
public class SearchString
{
    public static void main(String args[])
    {
        int i, pos=0, j, f=0;
        boolean state=false;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int num=s.nextInt();
        String word[]=new String[num];
        System.out.println("enter"+num+"words");
        for(i=0;i<num;i++)
        {
            word[i]=s.next();
        }
      System.out.println("Enter the element to search");
           String search = s.next();
           for(i=0; i<num; i++)
               {
                if(word[i].equals(search))
                {
                    pos=i+1;
                    state=true;
                    break;
                }
               }          
         if(state)
         {
            System.out.println("element found at possition"+pos);

         }   
         else
         {
        System.out.println("element "+search+" not found");
        
         }    
    }
}