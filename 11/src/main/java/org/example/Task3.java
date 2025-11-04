import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        File list = new File("filenames.txt");


        try (PrintWriter writer = new PrintWriter(list)) {
            writer.println("info.txt");
            writer.println("temps.txt");
            writer.println("nofile.txt");
        } catch (IOException e) {
            System.out.println("Ошибка создания списка: " + e.getMessage());
        }

        System.out.println("=== Проверка существования файлов ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(list))) {
            String filename;
            while ((filename = reader.readLine()) != null) {
                File f = new File(filename);
                if (f.exists()) {
                    System.out.println(filename + "  файл найден");
                } else {
                    System.out.println(filename + "  файл НЕ найден");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения списка: " + e.getMessage());
        }
    }
}
