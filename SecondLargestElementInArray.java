package arrays;
public class SecondLargestElementInArray {
   public static void main(String[] args){
       int[] arr = {91,24,37,91,45,45,47};
       int largestElement = Integer.MIN_VALUE;
       int secondLargestElement = Integer.MIN_VALUE;
       int thirdLargestElement = Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++){
           if(arr[i] > largestElement){
               thirdLargestElement = secondLargestElement;
               secondLargestElement = largestElement;
               largestElement = arr[i];
           } else if (arr[i] != largestElement) {
               thirdLargestElement = secondLargestElement;
               secondLargestElement = arr[i];
           } else if(arr[i] < secondLargestElement && arr[i] > thirdLargestElement) {
               thirdLargestElement = arr[i];
           }
           }
       System.out.println(secondLargestElement);
   }
}
