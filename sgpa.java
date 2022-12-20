import java.io.*;
import java.util.*;
import java.lang.*;
class sgpa
{
 public static void main(String args[])
 {
  String sub[]={"graphics","pps","java","chemistry","english","technical skills","data structures"};
  double credits[]={1,4,3,3,2,1.5,4};
  int i,gp=0;
  double total=0,sum=0,sgpa;
  Scanner s=new Scanner(System.in);
  for(i=0;i<sub.length;i++)
  { 
   System.out.println("enter"+sub[i]+"grade");
   String grade=s.next();
   switch(grade)
   {
    case "A+": gp=10;
               break;
    case "A": gp=9;
              break;
    case "B": gp=8;
              break;
    case "C": gp=7;
              break;
    case "D": gp=6;
              break;
    case "E": gp=5;
              break;
    case "F": gp=0;
              break;
    default:System.out.println("invalid grade");
    i--;
   }
   if(gp==0)
   {
    System.out.println("students failed");
    break;
   }
   else
   {
    total=total+credits[i]*gp;
    sum=sum+credits[i];
   }
   sgpa=total/sum;
   System.out.println("sgpa is"+sgpa);
  }
 }
}