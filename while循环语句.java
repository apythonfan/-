

import java.io.*;

public class whileѭ����� {

	public static void main(String[] args) throws IOException{
		// TODO �Զ����ɵķ������
        char ch;
        System.out.println("��1/2/3���ּ��ɵô�!");
        System.out.println("���ո�����ٰ��س������˳�ѭ������");
        
        while ((ch=(char)System.in.read())!=' ') {
        	System.in.skip(2);                      //�����س���
        	switch (ch) {
        	case '1':
        		System.out.println("��õ�һ����");
        		break;
        	case '2':
        		System.out.println("��õ�һ̨�ʵ�");
        	    break;
        	case '3':
        		System.out.println("��õ�һ̨����");
        		break;
        	default:
        		System.out.println("û�н�Ʒ����");
        	}
        }
	}

}
