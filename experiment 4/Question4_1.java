package hello1;

public class Question4_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        run();
	}
	 public static void run() {
	     Num a = new Num(3,6,9);
	     Num b = new Num(3,6,9);
	     Num c = new Num(6,9,3);
	     System.out.println(a.isSameNum(b));
	     System.out.println(b.isSameNum(c));
	     System.out.println(a.isSameSum(b));
	     System.out.println(b.isSameSum(c));
	    }    
}
