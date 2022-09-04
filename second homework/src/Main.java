import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        String user= scanner.nextLine();
        System.out.println("Hello "+user);
  }
}