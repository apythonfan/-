package 书本例题;

public class LeapYear {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        for(int i=1;i<=3000;i++) {
        	if(i%400==0) {
        		System.out.println(i+"年是闰年");
        	}
        	else if(i%4==0&&i%100!=0) {
        		System.out.println(i+"年是闰年");
        	}
        }
	}

}
