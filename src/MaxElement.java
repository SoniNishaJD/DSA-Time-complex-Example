public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1, 9};
        int max = findMax(arr);
        System.out.println("Maximum element is: " + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
