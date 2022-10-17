package array;

public class deepclone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {0,3,7,5,9,10};
		int cloneArray[]=intArray.clone();
		System.out.println(intArray==cloneArray);
		for (int i=0;i<cloneArray.length;i++)
		{
			System.out.println(cloneArray[i]+" ");
			
		}
		
		System.out.println("Length of Array: " +intArray.length);
		
				

	}

}
