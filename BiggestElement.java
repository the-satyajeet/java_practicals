public class BiggestElement {
    public static void main(String[] a) {
        int arr[] = {20, 13, 29, 94, 40, 24, 56, 34, 30};
        int max = 0;
        for (int itr : arr) {
            if (itr > max) {
                max = itr;
            }
        }
        System.out.println("The biggest element in the array is : " + max);


    }
}
