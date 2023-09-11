import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {

        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(1);
        numbersList.add(10);
        numbersList.add(100);
        numbersList.add(22);
        numbersList.add(60);
        numbersList.add(5);
        numbersList.add(20);
        numbersList.add(5000);
        numbersList.add(12);
        numbersList.add(3);

        int total = 0;
        for (int integer : numbersList){
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
