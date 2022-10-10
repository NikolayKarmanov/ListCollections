import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = new LinkedList<>();

        while (true) {
            System.out.println("Выберите операцию: [ 1. Добавить | 2. Показать | 3. Удалить ]");
            String input = scanner.nextLine();
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1 -> {
                    System.out.println("Какую покупку хотите добавить?");
                    String item = scanner.nextLine();
                    items.add(item);
                    System.out.println("Итого в списке покупок: " + items.size());
                }
                case 2 -> {
                    System.out.println("Список покупок:");
                    showList(items);
                }
                case 3 -> {
                    System.out.println("Список покупок:");
                    showList(items);
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String name = scanner.nextLine();
                    try {
                        int number = Integer.parseInt(name);
                        String tempName = items.get(number - 1);
                        items.remove(number - 1);
                        System.out.println("Покупка \"" + tempName + "\" удалена, список покупок:");
                    } catch (NumberFormatException e) {
                        items.remove(name);
                        System.out.println("Покупка \"" + name + "\" удалена, список покупок:");
                    }
                    showList(items);
                }
            }
            System.out.println(); // просто пустая строка для визуального разделения
        }
    }

    public static void showList(List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + " . " + items.get(i));
        }
    }
}
