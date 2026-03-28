import java.util.Scanner;
class Employee
{
    int eid;
    String name,address,subject;
    double salary;
    Employee (int no,String na,double sal,String addr)
    {
        eid=no;
        name=na;
        salary=sal;
        address=addr;

    }
}
class Teacher extends Employee
{
    String dept,subject;
    Teacher (int no,String na,double sal,String addr,String dep,String sub)
    {
        super(no,na,sal,addr);
        dept=dep;
        subject=sub;
    }
    void display()
    {
        System.out.println("Employee id:"+eid);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Department:"+dept);
        System.out.println("Subject:"+subject);


    }

}
class EmpInheritance
{
    public static void main(String[]args)
    {
        System.out.println("Enter the no.of employees:");
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        Teacher arr[]=new Teacher[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("\nEnter Employee-"+(i+1)+"details:id,Employee Name,Salary,Address,Department,Subject");
            int eid=s.nextInt();
            String name=s.next();
            double salary=s.nextDouble();
            String address=s.next();
            String dept=s.next();
            String subject=s.next();
            arr[i]=new Teacher(eid,name,salary,address,dept,subject);
        }
        System.out.println("Information of all employees:");
        for(int i =0;i<num;i++)
        {
            System.out.println("Employee-"+(i+1)+"details");
            System.out.println("---------------------------");
            arr[i].display();
        }
        s.close();
        }
    }