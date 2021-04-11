class AgeException extends Exception
 {
  private int age;
  AgeException(int age)
  {
   this.age=age;
   }
public String toString()
{ 
return("Invalid Age:"+age);
}
}
class ADemo2
{
 public static void main(String a[])
{
int age=Integer.parseInt(a[0]);
try
  {
   if(age<18)
   throw new AgeException(age);
   System.out.println("Valid age:"+a);
   }
   catch(AgeException ae)
  {
  System.out.println(ae);
}
}
 } 