import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Задание 4.1
        System.out.println("Введите строку:");
        String str = scanner.nextLine();

        System.out.println("Введите подстроку:");
        String subStr = scanner.nextLine();

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        System.out.println("Подстрока '" + subStr + "' встречается " + count + " раз(а)");

        // Задание 4.2
        System.out.println("Введите строку:");
        String str1 = scanner.nextLine();

        String censoredStr = str1.replaceAll("\\b(кака|бяка)\\b", "вырезано цензурой");

        System.out.println(censoredStr);

        // Задание 4.3
        System.out.println("Введите дату в формате 'дд.мм.гггг':");
        String dateStr = scanner.nextLine();

        String[] parts = dateStr.split("\\.");
        String formattedDate = parts[2] + "-" + parts[1] + "-" + parts[0];

        System.out.println(formattedDate);

        // Задание 4.4
        System.out.println("Введите дату в формате 'дд.мм.гггг':");
        String dateStr1 = scanner.nextLine();

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = inputFormat.parse(dateStr1);
            String formattedDate1 = outputFormat.format(date);
            System.out.println(formattedDate1);
        } catch (Exception e) {
            System.out.println("Неверный формат даты.");
        }
    }
}
