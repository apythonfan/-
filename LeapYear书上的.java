package �鱾����;

public class LeapYear���ϵ� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        boolean leap;
        int year=2008;
        //����1
        if ((year%4==0 && year%100!=0) || (year%400==0) )
        	System.out.println(year+"��������");
        else 
        	System.out.println(year+"�겻������");
        //����2
        year=2020;
        if(year%4!=0)
        	leap=false;
        else if (year%100!=0)
        	leap=true;
        else if (year%400!=0)
	        leap=false;
        else leap=true;
        if (leap==true)
        	System.out.println(year+"��������");
        else
        	System.out.println(year+"�겻������");
        //����3
        year=2050;
        if (year%4==0) {
	        if(year%100==0) {
	        	if(year%400==0)
	        		leap=true;
	        	else 
	        		leap=false;
	        }
	        else
	        	leap=false;
	    }    
	    else
		    leap=false;
	    if (leap==true)
	    	System.out.println(year+"��������");
	    else 
	    	System.out.println(year+"�겻������");
	

}
}