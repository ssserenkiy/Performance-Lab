import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> stringNum1 = Files.readAllLines(Paths.get(args[0]));
        List<String> stringNum2 = Files.readAllLines(Paths.get(args[1]));

        /*
        for (String str1 : stringNum1) {
            System.out.println(str1);
        }
        for (String str2 : stringNum2) {
            System.out.println(str2);
        }
        */

        String[] sis1 = stringNum1.get(0).split(" ");
        float radius = Float.parseFloat(stringNum1.get(1));
        float[] numbers = new float[stringNum1.size()];
        for (int i = 0; i < sis1.length; i++) {
            numbers[i] = Float.parseFloat(sis1[i]);
        }
        float xCentre = numbers[0];
        float yCentre = numbers[1];

        /*
        System.out.println("coord x circle = " + xCentre);
        System.out.println("coord y circle = " + yCentre);
        System.out.println("radius = " + radius);
        */

        //System.out.println("Points are given: " + stringNum2.size());

        int lengthStr2 = 2;
        float[][] coords = new float[stringNum2.size()][lengthStr2];

        for (int i = 0; i < stringNum2.size(); i++) {
            String[] sis2 = stringNum2.get(i).split(" ");

            for (int j = 0; j < lengthStr2; j++) {
                coords[i][j] = Float.parseFloat(sis2[j]);
                //System.out.print(coords[i][j] + " ");
            }
            //System.out.println();
        }


        for (int i = 0; i < stringNum2.size(); i++) {
            double rasstDoCentra = Math.sqrt(Math.pow((coords[i][0] - xCentre), 2) + Math.pow((coords[i][1] - yCentre), 2));
            //System.out.println(rasstDoCentra);
            if (rasstDoCentra == radius) {
                System.out.print(0 + "\n");
            } else if (rasstDoCentra < radius) {
                System.out.print(1 + "\n");
            } else {
                System.out.print(2 + "\n");
            }
        }
    }
}