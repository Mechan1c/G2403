
package hellowo;

import java.util.Arrays;

public class sortArrayBubble {

 public static void main(String[] args) {
  int[] myArray = {2, 5, 0, 9, 12, 5};
  getBubbleSorted(myArray);
  System.out.println(Arrays.toString(myArray));
 }
 public static void getBubbleSorted(int[] arr){
  for (int i = arr.length-1; i > 0; i--){
   for (int j = 0; j < i; j++){
    if (arr[j] > arr[j+1]){
     int tmp = arr[j];
     arr[j] = arr[j+1];
     arr[j+1] = tmp;
    }
   }
  }
  for (int i = 0; i < arr.length; i++) {
   System.out.println(arr[i]);
  }
 }
}