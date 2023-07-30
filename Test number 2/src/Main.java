import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> listOfStrings1 = new ArrayList<String>();
        BufferedReader bf1 = new BufferedReader(new FileReader("task2input1centr.txt"));
        String line1 = bf1.readLine();
        while (line1 != null) {
            listOfStrings1.add(line1);
            line1 = bf1.readLine();
        }
        bf1.close();
        String[] array1 = listOfStrings1.toArray(new String[0]);

        /*
        for (String str : array1) {
            System.out.println(str);
        }

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        */

        String[] sis1 = array1[0].split(" ");
        float radius = Float.parseFloat(array1[1]);
        float[] numbers = new float[array1.length];
        //System.out.println(sis1.length);
        for (int i = 0; i < sis1.length; i++) {
            numbers[i] = Float.parseFloat(sis1[i]);
            //System.out.println(numbers[i]);
        }
        float xCentre = numbers[0];
        float yCentre = numbers[1];

        /*
        System.out.println("coord x circle = " + xCentre);
        System.out.println("coord y circle = " + yCentre);
        System.out.println("radius = " + radius);
        */

        List<String> listOfStrings2 = new ArrayList<String>();
        BufferedReader bf2 = new BufferedReader(new FileReader("task2input2tochki.txt"));
        String line2 = bf2.readLine();
        while (line2 != null) {
            listOfStrings2.add(line2);
            line2 = bf2.readLine();
        }
        bf2.close();
        String[] array2 = listOfStrings2.toArray(new String[0]);

        /*
        for (String str : array) {
            System.out.println(str);
        }
        */

        //System.out.println("Точек задано: " + array2.length);

        int lengthStr2 = 2;
        float[][] coords = new float[array2.length][lengthStr2];

        for (int i = 0; i < array2.length; i++) {
            String[] sis2 = array2[i].split(" ");

            for (int j = 0; j < lengthStr2; j++) {
                coords[i][j] = Float.parseFloat(sis2[j]);
                //System.out.print(coords[i][j] + " ");
            }
            //System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            double rasstDoCentra = Math.sqrt(Math.pow((coords[i][0] - xCentre), 2) + Math.pow((coords[i][1] - yCentre), 2));
            //System.out.println(rasstDoCentra);
            if (rasstDoCentra < radius) {
                System.out.print(0 + " ");
            } else {
                if ((rasstDoCentra == radius)) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(2 + " ");
                }
            }
        }
    }
}