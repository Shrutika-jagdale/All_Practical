//simple
import java.util.*;
public class fibonacci
{
 public static void main(String[] args)
 {
  int num1=0,num2=1,num3;
  System.out.println("enter the value");
    Scanner sc=new Scanner(System.in);
    num3=sc.nextInt();
    for(int i=0; i<num3; i++)
    {
      System.out.println(num1);
      int sum=num1+num2;
      num1=num2;
      num2=sum;
     }
      
    }
 }

 //Using Exception Handling
 import java.util.*;
public class fibo
{
 public static void main(String[] args)
 {
  int num1=0,num2=1,num3;
  System.out.println("enter the value");
  try
  {
    Scanner sc=new Scanner(System.in);
    num3=sc.nextInt();
    for(int i=0; i<num3; i++)
    {
      System.out.println(num1);
      int sum=num1+num2;
      num1=num2;
      num2=sum;
     }
      }catch(Exception e)
      {
        System.out.println("Missmatch Exception");
      }
    }
 }

 //Using while loop-
 import java.util.*;
public class fibo2
{
 public static void main(String[] args)
 {
  int num1=0,num2=1,num3;
  System.out.println("enter the value");
    Scanner sc=new Scanner(System.in);
    num3=sc.nextInt();
    int i=1;
   while(i<=num3)
    {
      System.out.println(num1);
      int sum=num1+num2;
      num1=num2;
      num2=sum;
      i++;
     }
     }}

   //Using Do-While loop-
 import java.util.*;
public class fibo2
{
 public static void main(String[] args)
 {
  int num1=0,num2=1,num3;
  System.out.println("enter the value");
    Scanner sc=new Scanner(System.in);
    num3=sc.nextInt();
    int i=1;
    do
    {
    i++;
    System.out.println(num1);
    in t sum=num1+num2;
    num1=num2;
    num2=sum;
    }while(i<=num3);
      
    }
 }


 //
