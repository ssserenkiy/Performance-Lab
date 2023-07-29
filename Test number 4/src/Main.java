import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException
    {
        List<String> listOfStrings = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new FileReader("task4input.txt"));
        String line = bf.readLine();
        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }
        bf.close();
        String[] array = listOfStrings.toArray(new String[0]);
        /*
        for (String str : array) {
            System.out.println(str);
        }
        */
        int[] numbers = new int[array.length];
        for (int j = 0; j < array.length; j++) {
            numbers[j] = Integer.parseInt(array[j]);
        }
        var sum = 0.0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
        }
        var average = sum / numbers.length;
        int amountLess = 0;
        int amountMore = 0;
        for (int j = 0; j < numbers.length; j++) {
            if(numbers[j] > average){
                amountMore++;
            } else amountLess++;
        }
    //    System.out.println("Меньших среднего: " + amountLess);
    //    System.out.println("Больших среднего: " + amountMore);

        if (amountLess > amountMore){
            average = Math.floor(average);
        } else average = Math.ceil(average);
    //    System.out.println("Среднее массива: " + average);
        int amountOperation = 0;

        for (int j = 0; j < numbers.length; j++) {
            amountOperation += Math.abs(numbers[j] - average);
        }
    //    System.out.println(Arrays.toString(numbers));
        System.out.println(/*"Количество операций: " + */amountOperation);

    }
}