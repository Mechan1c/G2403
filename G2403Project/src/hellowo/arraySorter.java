
package hellowo;

import java.util.Arrays;

public class arraySorter {
	int[] arrayObject;
	
	public static void main(String[] args) {
		int[] inputArray = {2, 5, 0, 9, 12, 5};
	arraySorter myArray = new arraySorter(inputArray);
		myArray.getBubbleSorted();
		System.out.println(Arrays.toString(myArray.arrayObject));
	}
	
	public arraySorter(int[] inputArray)
	{
		 arrayObject = inputArray;
	}
	public void getBubbleSorted(){
		for (int i = arrayObject.length-1; i > 0; i--){
			for (int j = 0; j < i; j++){
				if (arrayObject[j] > arrayObject[j+1]){
					int tmp = arrayObject[j];
					arrayObject[j] = arrayObject[j+1];
					arrayObject[j+1] = tmp;
				}
			}
		}
		for (int i = 0; i < arrayObject.length; i++) {
			System.out.println(arrayObject[i]);
		}
	}
}