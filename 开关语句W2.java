

public class 开关语句W2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        int c=28;
        switch (c<10?1:c<25?2:c<35?3:4) {
        case 1:
        	System.out.println(" "+c+"℃ 有点冷");
        case 2:
        	System.out.println(" "+c+"℃ 正合适");
        case 3:
        	System.out.println(" "+c+"℃ 有点热");
        default:
        	System.out.println(" "+c+"℃  太热了");
        }
	}

}
