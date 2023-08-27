import java.util.Scanner;

public class ChoiceCalc extends MachineCalc {


    void choice(){
        Scanner scanner = new Scanner(System.in);
        boolean program = true;
        do {
            printInfo();
            char choice = scanner.next().charAt(0);
            if (choice == '1'){
                break;
            }
            System.out.println("Podaj pierwszą liczbę: ");
            int x = scanner.nextInt();
            System.out.println("Podaj drugą liczbę: ");
            int y = scanner.nextInt();
            switch (choice) {
                case '+' -> plus(x, y);
                case '-' -> minus(x, y);
                case '*' -> multiplication(x, y);
                case '/' -> division(x, y);
                case '%' -> modulo(x, y);
                default -> System.out.println("Nieprawidłowy wybór");
            }
        }while (program);


    }


}
