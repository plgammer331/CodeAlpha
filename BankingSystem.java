import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Balance: ");
        double Balance;
        while (true) {
            if (scanner.hasNextDouble()) {
                Balance = scanner.nextDouble();

                if (Balance >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid input. Should Be in Numbers");

            }

        }

        System.out.println("What would you like to do: ");
        while (true) {
            System.out.println("1: Withdraw");
            System.out.println("2: Deposit");
            System.out.println("3: Check Balance");
            System.out.println("4: Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("How much would you like to withdraw");
                    double withdraw = (int) scanner.nextDouble();
                    if (Balance < withdraw) {
                        System.out.println("Inssufficient Funds");

                    } else {
                        Balance = Balance - withdraw;
                        System.out.println("You withdraw " + withdraw + "\n Your current Balance is: " + Balance);
                    }
                    break;
                case 2:
                    System.out.println("How much would you like to Deposit");
                    double deposit = scanner.nextDouble();
                    Balance = Balance + deposit;
                    System.out.println("You deposit " + deposit + "\n Your current Balance is: " + Balance);
                    break;
                case 3:
                    System.out.println("Your current Balance is " + Balance);
                    break;
                case 4:
                    System.out.println("Thanks for using our service \n Goodbye!");
                    return;
                default:
                    break;

            }
        }

    }

}
