public class SmallEnough {
    public static void main(String[] args) {
        smallEnough()
    }
    public static boolean smallEnough(int[] a, int limit)
    {
        for (int num: a){
            if (num > limit){
                return false;
            }
        }
        return true;
    }

}