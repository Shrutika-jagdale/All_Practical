//simple
import java.util.*;
public class calculator
{
  public static void main(String[] args)
  {
    System.out.println("enter first value");
    Scanner sc= new Scanner(System.in);
    int num1= sc.nextInt();
    System.out.println("enter the 2nd value");
    int num2= sc.nextInt();
    System.out.print("ADD:-");
    int add=num1+num2;
    int sub=num1-num2;
     int mul=num1*num2;
     int div=num1/num2;
     
    System.out.println(add);
     System.out.println(sub);
      System.out.println(mul);
      System.out.println(div);
    
    }
    }

//Using Package
//A.java file
package input;

public class A {
    int a,b;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b=b;
    }
    public void sum(int ax, int bx)
    {
        int s=ax+bx;
        System.out.println("SUM:="+s);
    }

    public void sub(int ax, int bx)
    {
        int s=ax-bx;
        System.out.println("SUB:="+s);
    }

    public void mul(int ax, int bx)
    {
        int s=ax*bx;
        System.out.println("MUL:="+s);
    }

    public void div(int ax, int bx)
    {
        int s=ax/bx;
        System.out.println("DIV:="+s);
    }
}
//B.java
package operation;
import java.util.*;
import input.A;

public class B extends A {
    public static void main(String[] args) {
        System.out.println("calculator");
        B operations = new B();
        Scanner  sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int aa=sc.nextInt();
        System.out.println("Enter the secound number");
        int aa1=sc.nextInt();
        operations.setA(aa);
        operations.setB(aa1);
        operations.sum(operations.getA(),operations.getB());
        operations.sub(operations.getA(),operations.getB());
        operations.mul(operations.getA(),operations.getB());
        operations.div(operations.getA(),operations.getB());
}
}

//Exception Handling
import java.util.*;
import java.util.Scanner;
public class cal3 {
    public static void main(String[] args)
    {
        int a,b;
        char calcu;
        System.out.println("calculator");
        try
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the value of a");
            a=sc.nextInt();
            System.out.println("Enter the value of b");
            b= sc.nextInt();
            System.out.println("Enter the Operator");
            calcu= sc.next().charAt(0);
            if(calcu == '+')
            {
                System.out.println("Add:-"+(a+b));
            }
            else if(calcu == '-')
            {
                System.out.println("SUB:-"+(a-b));
            }
            else if(calcu== '*')
            {
                System.out.println("MUL:-"+(a*b));
            }
            else if(calcu== '/')
            {
                System.out.println("DIV:-"+(a/b));
            }
        }
        catch (Exception e)
        {
            System.out.println("Miss Match Exception");
        }
    }
}

//Using Switch
import java.util.*;
public class cal
{
    public static void main(String[] args)
    {
        int a,b;
        char calcu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:-");
        a = sc.nextInt();
        System.out.println("Enter the value of b:-");
        b = sc.nextInt();
        System.out.println("Enter the operator");
        calcu = sc.next().charAt(0);

        switch (calcu)
        {
            case '+':
               System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;

            default:
                System.out.println("wrong");


        }
    }
}


//Using IF-else
import java.util.*;
import java.util.Scanner;
public class cal1
{

    public static void main(String[] args)
    {
        int a,b;
        char calcu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:-");
        a = sc.nextInt();
        System.out.println("Enter the value of b:-");
        b = sc.nextInt();
        System.out.println("Enter the operator");
        calcu = sc.next().charAt(0);

        if(calcu == '+')
        {
           System.out.println("Add:-"+(a+b));
        }
        else if(calcu == '-')
        {
            System.out.println("SUB:-"+(a-b));
        }
        else if(calcu== '*')
        {
            System.out.println("MUL:-"+(a*b));
        }
        else if(calcu== '/')
        {
            System.out.println("DIV:-"+(a/b));
        }
        else
        {
            System.out.println("Error");
        }
    }
}
