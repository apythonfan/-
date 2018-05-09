package hello1;

public class Question3_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        run();
	}
	 public static void run() {
	        System.out.println("file.separator is set to " + System.getProperty("file.separator"));
	        System.out.println("java.class.path is set to " + System.getProperty("java.class.path"));
	        System.out.println("java.class.version is set to " + System.getProperty("java.class.version"));
	        System.out.println("java.home is set to " + System.getProperty("java.home"));
	        System.out.println("java.vendor is set to " + System.getProperty("java.vendor"));
	        System.out.println("java.vendor.url is set to " + System.getProperty("java.vendor.url"));
	        System.out.println("java.version is set to " + System.getProperty("java.version"));
	        System.out.println(System.getProperties());
	    }
	}
