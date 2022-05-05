import java.util.Arrays;
class Question1
{
	public static void main(String args[]){
		
		int[] a1 = {2,4,6,8,3};
		int n = a1.length;
		System.out.println("Size of an array is :"+" "+n);
		System.out.println("Before Sorting"+Arrays.toString(a1));
		for (int i = n-1;i>=0;i--)
		{
			int key = a1[i];
			int j = i-1;
			int temp = 0;
			while(j>=0 && a1[j]>=key){
				temp = a1[j+1]=a1[j];
				a1[j]=a1[j+1];
				a1[j+1]=temp;
				j--;
			
			}
			temp = a1[j+1];
			a1[j+1]=key;
			key=temp;
			
			System.out.println(Arrays.toString(a1));
		
		}
		//System.out.println("Sample Output");
		System.out.println("After sorting -" + Arrays.toString(a1));
		
	
	}
}