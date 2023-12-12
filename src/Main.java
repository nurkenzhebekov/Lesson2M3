import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите имя");
            String name = scanner.next();
            try {
                user.setName(name);
                System.out.println("Успешно. Ваше имя: " + user.getName());
            } catch (IllegalNameException ie) {
                System.out.println(ie.getMessage());
            }

            System.out.println("Введите возраст");
            int age = scanner.nextInt();

            try {
                user.setAge(age);
                System.out.println("Успешно. Ваш возраст " + user.getAge());
            } catch (IllegalAgeException ie) {
                System.out.println(ie.getMessage());
            }
        }

    }
}