import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1 print a name entered from keyboard
        System.out.println("Enter your name from keyboard and press \"Enter\" button");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.printf("Hello, %s!", name);
        System.out.println();
        // Task 2 print args of cli in revers order
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
        // Task 3 generate a random int array
        System.out.println("Enter a number of random digital");
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        // add random digital to an Array
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        // print an Array elements in line
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // print an Array elements from new line
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // Task 4 enter a password and compare it with the sample string
        final String PASSWORD = "qwerty";
        System.out.println("Enter a password");
        String password = scanner.next();
        System.out.println(PASSWORD.equals(password));
        // Task 5 enter a digitals as CLI arguments and calculate a sum or multiplication
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < args.length; i++) {
            if (isInt(args[i])) {
                sum += Integer.parseInt(args[i]);
                mult *= Integer.parseInt(args[i]);
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Multiplication = " + mult);
        // Task 6 display a developer last name, date and time of getting task and date and time of finishing task
        System.out.println("Enter a developer last name");
        String lastName = scanner.next();
        System.out.println("Developer last name " + lastName);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime dateGettingTask = LocalDateTime.of(2022, 11, 11, 18, 15);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Date and time of getting task " + dateTimeFormatter.format(dateGettingTask));
        System.out.println("Date and time of passing task " + dateTimeFormatter.format(now));


    }

    // Method checks ability to convert string to int
    private static boolean isInt(String s) {
        Scanner in = new Scanner(s);
        return in.hasNextInt();
    }
}
