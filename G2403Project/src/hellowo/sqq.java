package hellowo;

public class sqq
{
	public static void main(String[] args)
	{
		System.out.println(sqqr(5));
	}


public static int sqqr(int x){
    int num = 1;
    int rez = 0;
    while(x>0){
        x-=num;
        num+=2;
        rez+=(x<0)?0:1;
    }
        return rez;
   }
}