package hello1;

public class CircleArea {

    final static double PI=3.14159;
    
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        double r1=8.0,r2=5.0;
        System.out.println("�뾶Ϊ"+r1+"��Բ���="+area(r1));
        System.out.println("�뾶Ϊ"+r2+"��Բ���="+area(r2));
	}
	static double area(double r) {
		return (PI*r*r);
	}

}
