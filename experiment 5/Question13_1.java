package hello1;

import javax.swing.JFrame;

public class Question13_1 {
	
	public static void main(String[] args) {
		run();
	}
    public static void run() {
        ComputeFrame frame1 = new ComputeFrame("Compute Frame");         //创建顶层容器frame1
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                //frame1设置退出方式
    }
}