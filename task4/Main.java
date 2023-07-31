import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



public class Main {

    public static void main(String[] args) throws IOException
    {

        List<String> stringNum = Files.readAllLines(Paths.get(args[0]));

        /*
        for (String str1 : stringNum) {
            System.out.println(str1);
        }
        System.out.println(stringNum);
        */

        int[] numbers = new int[stringNum.size()];
        for (int i = 0; i < stringNum.size(); i++) {
            numbers[i] = Integer.parseInt(stringNum.get(i));
            //System.out.println(numbers[i]);
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

        /*
        System.out.println("Amount less then average: " + amountLess);
        System.out.println("Amount more then average: " + amountMore);
        */

        if (amountLess > amountMore){
            average = Math.floor(average);
        } else average = Math.ceil(average);
        //System.out.println("Average of array: " + average);
        int amountOperation = 0;

        for (int j = 0; j < numbers.length; j++) {
            amountOperation += Math.abs(numbers[j] - average);
        }

        System.out.print(amountOperation);
    }
}