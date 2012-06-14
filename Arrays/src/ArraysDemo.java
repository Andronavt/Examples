import java.util.Arrays;


class ArraysDemo {
	public static void main(String args[]){
		
		int array[]=new int [10];
		for(int i=0;i<10;i++)
			array[i]=-3*i;
		
		System.out.print("initial contents: ");
		display(array);
		Arrays.sort(array);
		System.out.print("Sorted contents: ");
		display(array);
		
		Arrays.fill(array,2,6,-1);
		System.out.print("After fill: ");
		display(array);
		
		Arrays.sort(array);
		System.out.print("Again after sort");
		display(array);
		
		System.out.print("position value -9 ");
		int index=
				Arrays.binarySearch(array, -9);
		System.out.println(index);
		
	}

	private static void display(int[] array) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println("");
	}

}
