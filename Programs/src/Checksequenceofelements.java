
public class Checksequenceofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] num = {2,2,3,4,5,5};
    int n = num.length;
    boolean hasrepeats = sequence(num, n);
    if(hasrepeats==true)
    {
    	System.out.println(" repeated elements");
    }
    else
    {
    	System.out.println("No repeated elements");
    }
	}
static boolean sequence(int arr[], int n)
{
	for(int i=0;i<n;i++)
	{
		for(int j= i+1;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				return true;
			}
		}
	}

	return false;
	
}
}
