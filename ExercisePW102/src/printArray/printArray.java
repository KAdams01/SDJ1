package printArray;

public class printArray {

	public static void main(String[] args) {
		double[] array= {0,1,2.17,3.14};
		for (int i=0;i<array.length;i++)
		{
			if (i>array.length-2)
				System.out.print(array[i]);
			else
				System.out.print(array[i]+",");
		}
		

	}

}
