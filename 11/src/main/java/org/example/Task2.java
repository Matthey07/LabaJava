import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("temps.txt");


        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            System.out.println("Введите 15 температур:");
            for (int i = 0; i < 5; i++) {
                pw.println(sc.nextDouble());
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            double sum = 0;
            int count = 0;

            while ((line = br.readLine()) != null) {
                sum += Double.parseDouble(line);
                count++;
            }

            if (count > 0) {
                System.out.println("Средняя температура = " + (sum / count));
            } else {
                System.out.println("Файл пуст! Среднее невозможно вычислить!");
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
