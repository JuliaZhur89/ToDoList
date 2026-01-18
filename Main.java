import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();


        while (true) {

            System.out.println("Выберите операцию:");
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить дело");
            System.out.println("2. Показать дела");
            System.out.println("3. Удалить дело по номеру");
            System.out.println("4. Удалить дело по названию");
            System.out.println("5. Удалить все дела по ключевому слову");
            String input = scanner.nextLine();

            int number = Integer.parseInt(input);
            if (number == 0) {
                break;
            }
            if (number != 0 && number != 1 && number != 2 && number != 3 && number != 4 && number != 5) {
                System.out.println("Такой операции не существует");
                System.out.println();
            }

            switch (number) {
                case 1:
                    System.out.print("Введите название задачи:");
                    list.add(scanner.nextLine());
                    System.out.println("Добавлено!");
                    System.out.println("Ваш список дел:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Ваш список дел:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Введите номер для удаления:");
                    String num = scanner.nextLine();
                    int count = Integer.parseInt(num) - 1;
                    if (count <= list.size()) {
                        list.remove(count);
                        System.out.println("Удалено!");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i + 1) + ". " + list.get(i));
                        }
                    } else {
                        System.out.println("Дела под таким номером не существует!");
                    }
                    System.out.println("Ваш список дел:");
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Введите задачу для удаления:");
                    String nameTask = scanner.nextLine();
                    if (list.contains(nameTask)) {
                        list.remove(nameTask);
                        System.out.println("Удалено!");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i + 1) + ". " + list.get(i));
                        }
                    } else {
                        System.out.println("Такого дела в списке не существует!");
                        System.out.println("Ваш список дел:");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Введите слово для удаления задач:");
                    String word = scanner.nextLine();
                    if (list.contains(word)) {
                        list.removeIf(e -> e.contains(word));
                        System.out.println("Удалено!");
                    } else {
                        System.out.println("В списке дел отсутсвуют дела, содержащие указанное слово!");
                    }
                    System.out.println("Ваш список дел:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    break;

            }

        }

    }
}
