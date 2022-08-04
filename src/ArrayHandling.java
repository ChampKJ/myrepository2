import java.util.Scanner;

public class ArrayHandling {
	
	public void dispArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayHandling o=new ArrayHandling();
		Scanner sc = new Scanner(System.in);
		int arr[] ={4,6,2,6,9,4,8,3,4,6,55,-3};
//		System.out.println("Enter Array Length :");
//		int len = sc.nextInt();
//		arr = new int[len];
		System.out.println(arr.length);
		//System.out.println("ENter array elements : ");
//		for(int i=0;i<=arr.length;i++)
//		{
//			
//			arr[i] = sc.nextInt();
//			
////		}
//		arr[3]=5667;
//		arr[2]=34;
		o.dispArray(arr);
		
	}

}
