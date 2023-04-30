package week.day1;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{    
			 int firstnum=0,secondnum=1,sum,i,count=11;    
			 System.out.print(firstnum+" "+secondnum);   
			    
			 for(i=2;i<count;i++)   
			 {    
			  sum=firstnum+secondnum;    
			  System.out.print(" "+sum);    
			  firstnum=secondnum;    
			  secondnum=sum;    
			 } }

}}
