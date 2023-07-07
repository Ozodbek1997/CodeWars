public class ConvertNumber {

    public static int[] digitize(long n) {
        String a = n + "";

        int arr[] = new int[a.length()];
        int index = 0;
        while (n > 9) {
            arr[index++] = (int) (n % 10);
            n /= 10;
        }
        arr[index] = (int) n;

        return arr;
    }

}
