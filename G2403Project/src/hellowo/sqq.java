package hellowo;

public class sqq
{
	public static void main(String[] args)
	{
		int x = 5;
		int num = 1;
		    int rez = 0;
		    while(x>0){
		        x-=num;
		        num+=2;
		        rez+=(x<0)?0:1;
		    }
		System.out.println(rez);
	}
}

