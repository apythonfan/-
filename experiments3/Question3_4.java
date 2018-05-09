package hello1;

import java.util.Random;
public class Question3_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random r=new Random();
		for(int i=1;i<=10;i++) 
		{
		 int n2 = r.nextInt(1000);
         if(n2<100) {
        	 i-=1;
         }
         else 
         {   System.out.print(" "+n2);
		     if(i==5) {
			     System.out.println();
		 }
         }
         }
         

}
}