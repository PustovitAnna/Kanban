import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        while(true) {
            printMenu();
            int userInput = scanner.nextInt();
            if(userInput == 1){             // добавление задачи
                //manager.createNewTask( some task-object );
                manager.addTestObjects();
            } else if (userInput == 2) {    // вывести список задач в консоль
                manager.getTaskList();
            } else if (userInput == 3) {    // удаление всех задач
                manager.deleteAllTasks();
            } else if(userInput == 4){      // получение задачи по id
                System.out.println("Введите индентификационный номер задачи: ");
                int numberOfTask = scanner.nextInt();
                manager.getTaskById(numberOfTask);
            } else if(userInput == 5){      // удаление задачи по id
                System.out.println("Введите индентификационный номер задачи: ");
                int numberOfTask = scanner.nextInt();
                manager.deleteTaskById(numberOfTask);
            } else if (userInput == 6) {    // обновление (замещение) задачи
                manager.updatedTestObjects();
            }else if (userInput == 0) {
                System.out.println("Программа завершена.");
                break;
            } else{
                System.out.println("Такой команды нет!");
            }
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("1. Создание.");
        System.out.println("2. Получение списка всех задач.");
        System.out.println("3. Удаление всех задач.");
        System.out.println("4. Получение по идентификатору.");
        System.out.println("5. Удаление по идентификатору.");
        System.out.println("6. Обновление.");
        System.out.println("0. Завершить программу");
    }
}