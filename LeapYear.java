package �鱾����;

public class LeapYear {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        for(int i=1;i<=3000;i++) {
        	if(i%400==0) {
        		System.out.println(i+"��������");
        	}
        	else if(i%4==0&&i%100!=0) {
        		System.out.println(i+"��������");
        	}
        }
	}

}
