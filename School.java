import java.util.Scanner;
class Sports
{
    String sport;
    int rating;
    Sports(String sp,int rt)
    {
        sport=sp;
        rating=rt;
    }
}
class Student extends Sports
{
    String grade;
    double overall_per;
    Student (String sp,int rt,String gd,double per)
    {
        super(sp,rt);
        grade=gd;
        overall_per=per;
    }
}
class Result extends Student
{
    Result(String sp,int rt,String gd,double per)
    {
        super(sp,rt,gd,per);
    }
void display()
{
    System.out.println("Sports details of Student:");
    System.out.println("--------------------------");
    System.out.println("Sport:"+sport);
    System.out.println("Rating:"+rating);
    System.out.println("Academic details of Student");
    System.out.println("---------------------------");
    System.out.println("Academic Grade:"+grade);
    System.out.println("Overall percentage:"+overall_per);
}
}
class School
{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Sports details of Student:");
    System.out.println("Sport:");
    String s=sc.next();
    System.out.print("Rating out of 10:");
    int r=sc.nextInt();
    System.out.println("Enter Academic Details of Student:");
    System.out.print("Grade(A-D):");
    String g=sc.next();
    System.out.print("Overall Percentage:");
    double p=sc.nextDouble();
    sc.close();
    Result obj=new Result(s,r,g,p);
    obj.display();
}
}