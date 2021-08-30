package printarray;

public class PrintArray {
		//@method to display  values using generic approach
		public static <E> void printArray(E[] array)     
		{
			for(E ele :array)
			{
				System.out.printf("%s ",ele);
			}
			System.out.println();
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Integer[] intArray= {11,17,25,26,63};  //integer array
			Double[] doubleArray= {1.5,2.5,3.5,4.5};//double array
			Character[] charArray= {'B','R','I','D','G','E'}; //character array
			
			PrintArray.printArray(intArray);		//function call with integer array
			PrintArray.printArray(doubleArray);		//function call with double array
			PrintArray.printArray(charArray);		//function call with character array
		}
}
