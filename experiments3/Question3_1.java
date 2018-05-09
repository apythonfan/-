package hello1;

public class Question3_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        run();
	}
	public static void run()
    {
        String s1 = "Hello ";
        String s2 = "World!";
        System.out.println("字符串1长：" + s1.length());
        System.out.println("字符串2长：" + s2.length());
        System.out.println(s1.concat(s2));//连接字符串
        String s3 = "Welcome ";
        String s4 = "to java!";
        String s5 = s3 + s4;
        System.out.println(s5);
        String s6 = "Nice to meet you.";
        String s7 = "Nice to meet you.";
        String s8 = new String("You are very nice. ");
        String s9 = new String("You are very nice. ");
        boolean c,d,e,f;
        c = s6 == s7;//s6和s7指向内存中同一个存储空间
        d = s6.equals(s7);
        e = s8 == s9;//s8和s9是两个不同的对象，在内存中占用两个不同的存储空间，他们用“==”比较时，两者的值不相等；
        f = s8.equals(s9);//equal方法比较的是两个变量的值；
        System.out.println(c + "   " + d);
        System.out.println(e + "   " + f);
        int i,j;
        i = s6.compareTo(s7);
        j = s6.compareTo(s9);
        System.out.println(i + "   " + j);   //返回比较前后asc码的差值
    }
}

