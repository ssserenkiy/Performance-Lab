import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        ArrayList<Integer> path = new ArrayList<>();

        int current = 1; // начальный элемент первого интервала
        path.add(current);

        for (int i = 0; i < n; i++) {
            current = (current + m - 1) % n ; // вычисляем следующий элемент по формуле
            if (current == 0) {
                current = n;
            }
            if (current == 1) {
                break;
            }
            path.add(current);
        }
        /*System.out.println(path);*/
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i));
        }
    }
}