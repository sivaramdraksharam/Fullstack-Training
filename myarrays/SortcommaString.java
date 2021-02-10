package myarrays;
import java.util.  Scanner;
public class SortcommaString {

public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   String a;
   a=sc.nextLine();
   int l=a.length();
   int z[]=new int[l];
   String x[]=new String[l];
   //splitting the string with delimiter comma and placing numbers in an int type array
   x=a.split(",");          
   for(int j=0;j<x.length;j++)     
     {
      x[j]=x[j].replaceAll("\\s","");  
      int y=Integer.parseInt(x[j]);    
      z[j]=y;
     }
   for(int i=0;i<x.length-1;i++)
     {
       for(int k1=i+1;k1<x.length;k1++)
        {
          if(z[i]>z[k1])
           {
             int temp=z[i];
             z[i]=z[k1];
             z[k1]=temp;
           }  
        }
     }
   for(int i=0;i<x.length;i++)
     {
       System.out.println(z[i]);
     }
  }
}