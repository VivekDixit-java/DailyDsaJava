package arrays;

public class ReverseStringUsingArray {
    public static void  main(String[] args) {
        String str = "I'm Vivek";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(new String(arr));
    }
}
