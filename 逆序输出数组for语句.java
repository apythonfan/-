package 书本例题;

public class 逆序输出数组for语句 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    int a[]=new int[5];
    for (int i=0;i<=4;i++) {
    	a[i]=i;
    }
    for (int i=4;i>=0;i--) {
    	System.out.println("a["+i+"]="+a[i]);
    }
	}

}
