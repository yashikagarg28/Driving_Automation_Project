
import java.util.HashSet;
public class RemoveDuplicatesfromArray {
	public static void main(String args[])
	{
		 int[] arr = {7,4,5,6,6,2};
		 int n = arr.length;
		 remove(arr, n);
	}
	

static void remove(int num[],int n)
{
	HashSet<Integer> set = new HashSet<Integer>();
	
	for(int i=0;i<n;i++)
	{
		set.add(num[i]);
	}
	System.out.println(set);

}
}