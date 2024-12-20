import java.util.*;
public class Random {
	public static void main(String[] args) {
		Random r =new Random();
		int arr[]=new int[5];
		
		for(int x=0;x<=arr.length-1;x++)
		 {
               arr[x]=r.nextInt(1,100);
		 }
		for(int x=0;x<=arr.length-1;x++)
		 {
			
		     System.out.println(arr[x]);
		 }
	}

}