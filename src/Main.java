import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(10, 100));
        }
        System.out.println("Рандомные числа");
        System.out.println(arrayList);

        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                arrayList1.add(integer);
            }
        }
        System.out.println("\nЧетные числа:");
        System.out.println(arrayList1);

        for (Integer integer : arrayList) {
            if (integer % 2 != 0) {
                arrayList2.add(integer);
            }
        }
        System.out.println("\nНечетные числа:");
        System.out.println(arrayList2);


    }
}