package ex04;

public class MyArray1 
{

	public static void main(String[] args) 
	{
		int[] n = new int[] {56,45,68,32};//宣告並建立陣列物件
		int sum = 0;
//		for (int i=0; i<4; i++) 
		for (int i=0; i<n.length; i++) 
		{
			System.out.println("n[" +i+ "]=" + n[i]);
			sum += n[i];
		}
		System.out.println("n陣列元素的總和為" + sum);
	}

}
