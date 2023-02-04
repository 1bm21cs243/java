import java.util.Scanner; 
import java.lang.Math; 
class QuadraticEq {
public static void main(String args[])
{

int a,b,c; double d,r1,r2;
Scanner sc=new Scanner(System.in); 
System.out.println("Enter a,b and c in quadratic equation"); 
a=sc.nextInt();
b=sc.nextInt(); 
c=sc.nextInt(); 
d=Math.pow(b,2)-4*a*c; 
if(d==0)
{
r1=b/(2*a); 
r2=b/(2*a);
System.out.println("Roots are equal"); System.out.println("Roots are: "+r1+" and "+r2);
}
else if(d>0)
{
r1=(-b+Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a); 
System.out.println("Roots are distinct and unequal"); 
System.out.println("Roots are: "+r1+"and "+r2);
}
else
{
System.out.println("Imaginary roots");
}
}
}
 
