package hello1;

public class CircleArea {

    final static double PI=3.14159;
    
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        double r1=8.0,r2=5.0;
        System.out.println("半径为"+r1+"的圆面积="+area(r1));
        System.out.println("半径为"+r2+"的圆面积="+area(r2));
	}
	static double area(double r) {
		return (PI*r*r);
	}

}
