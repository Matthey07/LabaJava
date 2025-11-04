import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("info.txt");

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("Имя: Иван");
            writer.println("Возраст: 20");
            writer.println("Город: Минск");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        System.out.println("=== Информация о файле ===");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());

        System.out.println("\n=== Содержимое файла: ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
