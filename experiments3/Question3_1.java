package hello1;

public class Question3_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        run();
	}
	public static void run()
    {
        String s1 = "Hello ";
        String s2 = "World!";
        System.out.println("�ַ���1����" + s1.length());
        System.out.println("�ַ���2����" + s2.length());
        System.out.println(s1.concat(s2));//�����ַ���
        String s3 = "Welcome ";
        String s4 = "to java!";
        String s5 = s3 + s4;
        System.out.println(s5);
        String s6 = "Nice to meet you.";
        String s7 = "Nice to meet you.";
        String s8 = new String("You are very nice. ");
        String s9 = new String("You are very nice. ");
        boolean c,d,e,f;
        c = s6 == s7;//s6��s7ָ���ڴ���ͬһ���洢�ռ�
        d = s6.equals(s7);
        e = s8 == s9;//s8��s9��������ͬ�Ķ������ڴ���ռ��������ͬ�Ĵ洢�ռ䣬�����á�==���Ƚ�ʱ�����ߵ�ֵ����ȣ�
        f = s8.equals(s9);//equal�����Ƚϵ�������������ֵ��
        System.out.println(c + "   " + d);
        System.out.println(e + "   " + f);
        int i,j;
        i = s6.compareTo(s7);
        j = s6.compareTo(s9);
        System.out.println(i + "   " + j);   //���رȽ�ǰ��asc��Ĳ�ֵ
    }
}

