import java.util.*;
class armstrong 
{
	public static void main(String[] args) 
	{
		int n , t , r , sum = 0 ;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the no");
		n=sc.nextInt();
		t=n;
		while(n!=0)
		{
			r = n % 10 ;
			sum = sum + r*r*r;
			n = n /10 ;
		}
		if(t==sum)
		{
			System.out.println("armstrong no");
		}
		else
		{
			System.out.println("not Armstrong no");
		}


	}
}
