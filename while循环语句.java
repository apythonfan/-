

import java.io.*;

public class while循环语句 {

	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
        char ch;
        System.out.println("按1/2/3数字键可得大奖!");
        System.out.println("按空格键后再按回车键可退出循环操作");
        
        while ((ch=(char)System.in.read())!=' ') {
        	System.in.skip(2);                      //跳过回车键
        	switch (ch) {
        	case '1':
        		System.out.println("你得到一辆车");
        		break;
        	case '2':
        		System.out.println("你得到一台彩电");
        	    break;
        	case '3':
        		System.out.println("你得到一台冰箱");
        		break;
        	default:
        		System.out.println("没有奖品给你");
        	}
        }
	}

}
