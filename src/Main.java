import java.io.Console;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        Wallet wallet = new Wallet("Плотная милионная буба",0, user);

        System.out.println("Выбранный кошелёк: " + wallet.getName());

        System.out.println(TextMessage.WELCOME_MESSAGE);

        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while (true) {
            System.out.print("Введите число от 1 до 3: ");
            String userInput = scanner.nextLine();

            try {
                input = Integer.parseInt(userInput);
                if (input >= 1 && input <= 3) {
                    break; // Выход из цикла, если ввод корректный
                } else {
                    System.out.println("Введенное число не находится в диапазоне от 1 до 3. Пожалуйста, повторите попытку.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введенное значение не является числом. Пожалуйста, повторите попытку.");
            }
        }
        //System.out.println("Корректный ввод: " + input);

        switch (input) {
            case 1 -> System.out.println(String.valueOf(wallet.getBalance()));
            case 2 -> {
                System.out.print("Введите сумму, которую хотите снять:");
                String userWithdrawInput = scanner.nextLine();
                double withdrawInput;

                try {
                    withdrawInput = Double.parseDouble (userWithdrawInput);
                    if (withdrawInput > 0) {
                        break; // Выход из цикла, если ввод корректный
                    } else {
                        System.out.println("Введенное число некорректно, повторите попытку.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введенное значение не является числом. Пожалуйста, повторите попытку.");
                }
            }
            case 3 -> {
                System.out.print("Введите сумму, которую хотите положить:");
                String userPutInput = scanner.nextLine();
                double putInput;

                try {
                    putInput = Double.parseDouble (userPutInput);
                    if (putInput > 0) {
                        break; // Выход из цикла, если ввод корректный
                    } else {
                        System.out.println("Введенное число некорректно, повторите попытку.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введенное значение не является числом. Пожалуйста, повторите попытку.");
                }
            }
        }
    }
}