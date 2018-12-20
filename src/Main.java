import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
//    Сделать массив int. Из него получить IntStream. Для него
//1. Найти среднее значение элементов массива
//2. Найти минимальный элемент, значение и индекс
//3. Посчитать количество элементов равных нулю
//4. Посчитать количество элементов больше нуля
//5. Помножить элементы массива на число

    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i=0; i<= arr.length -1; i++) {
            arr[i] = (int) Math.floor(Math.random() * 10);
        }
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + "\t");
            }
            System.out.println();

 

        IntStream arr1 = Arrays.stream(arr);
        OptionalDouble arrAvarage = arr1.average();
        System.out.println("AVG:"+arrAvarage);

        OptionalInt min = Arrays.stream(arr).min();
        System.out.println("MIN: "+min);

        long countZero = Arrays.stream(arr).filter(x -> x == 0).count();
        System.out.println("Zeros: "+countZero);

        long count = Arrays.stream(arr).filter(x -> x > 0).count();
        System.out.println("More than zero: "+count);

        int mult[] = Arrays.stream(arr).map(x -> x * 2).toArray();
        for (int i : mult) {
            System.out.print(i + " ");
        }

    }
}
