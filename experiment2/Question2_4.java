package hello1;

public class Question2_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=0;
        for(int i=0;i<=1000;i++) {
    	    if(i%3==0&i%5==0) {
    	    	a+=i;
    	    }
    }
	     System.out.println("1000内能被3和5整除的数之和"+a);
	}
	

}
