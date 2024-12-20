public class Fibonacci {
	 public static void main(String[] args) {
		int a=0,b=1,n=10,sum=0;
		while(a<=n)
			a=b;
		    b=sum;
		    sum=a+b;
		    System.out.println(sum);
		    
		
	}
}