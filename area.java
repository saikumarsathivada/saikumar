import java.io.*;
import java.util.*;
import java.lang.*;
class area extends ac
{
 public static void main(String args[])
 { 
  ac o=new ac();
  o.displayar(15);
 }
}
class ac
{
 double p=3.14,a;
 void displayar(double r)
 {
  double a;
  a=p*r*r;
  System.out.println("area of circle"+a);
 }
}
