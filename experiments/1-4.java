package hello1;

import java.util.Scanner;

public class Question1_4 {

    public static void main(String[] args) {		
		// TODO �Զ����ɵķ������
    	run();
    }
	
    public static void run() {
	String str ;
        System.out.println("Please input your name:");
        Scanner sc = new Scanner(System.in);
	str = sc.next();
        System.out.println("Your name is: " + str);
    }
}