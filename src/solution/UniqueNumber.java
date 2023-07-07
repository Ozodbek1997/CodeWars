import java.util.HashMap;
import java.util.Map;

public class UniqueNumber {
    public static double findUniq(double arr[]) {

        Map<Double,Integer> numberCount = new HashMap<>();

        for (double num: arr){

            if (numberCount.containsKey(num)){
                numberCount.put(num,numberCount.get(num) + 1);
            }else {
                numberCount.put(num,1);
            }
        }
        for (double num: numberCount.keySet()){
            if (numberCount.get(num) ==1){
                return num;
            }
        }

        return -1;
    }
}
