package javatest;

public class Question2 {

	public static void main(String[] args) {
		int[] array=new int[4];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
	//	int[]tempNumber=new int[1];
		
		for (int count=0; count<array.length;count++)
		{
			System.out.println("array[" +(count)+"] = "+array[count]);
		}
		for (int count=0; count<array.length;count++)
		{
			if (count>0)
			{
//				int countEnd=(array.length-1);
//				
//				tempNumber[0]=array[count];
//				array[count]=array[countEnd];
//				array[countEnd]=tempNumber[0];
//				array[count]=array.length-count;
			}
			System.out.println("array[" +(count)+"] = "+array[count]);
		}

	}

}
