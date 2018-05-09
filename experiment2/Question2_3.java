package hello1;

public class Question2_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	    System.out.println("输出以下数：");
	        for (int i=100; i<1000; i++) {
	            int a,b,c;
	            a = i / 100;
	            b = i / 10 % 10;
	            c = i % 10;
	            if (a*a*a+b*b*b+c*c*c==i)
	                System.out.println(i);
	        }
	}

}
