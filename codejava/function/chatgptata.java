import java.util.Scanner;

public class chatgptata {
    // chatgpt any base to  any base
    public static int binaryToDecimal(int n) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            rv += dig * p;
            p = p * 2;
        }
        return rv;
    }

    // Function to convert octal to decimal
    public static int octalToDecimal(int n) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            rv += dig * p;
            p = p * 8;
        }
        return rv;
    }

    // Function to convert decimal to any base (binary or octal)
    public static int decimalToAnyBase(int q, int base) {
        int rv = 0;
        int p = 1;
        while (q > 0) {
            int dig = q % base;
            q = q / base;
            rv += dig * p;
            p = p * 10;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Choose any one option:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Binary to Octal");
        System.out.println("3. Octal to Binary");
        System.out.println("4. Octal to Decimal");
        System.out.println("5. Decimal to Octal");
        System.out.println("6. Decimal to Binary");

        int choice = sc.nextInt();
        sc.close();

        int result = 0;

        // Using switch instead of if-else
        switch (choice) {
            case 1:
                result = binaryToDecimal(n);
                System.out.println("Decimal: " + result);
                break;

            case 2:
                // First convert binary to decimal, then decimal to octal
                int decimalFromBinary = binaryToDecimal(n);
                result = decimalToAnyBase(decimalFromBinary, 8);
                System.out.println("Octal: " + result);
                break;

            case 3:
                // First convert octal to decimal, then decimal to binary
                int decimalFromOctal = octalToDecimal(n);
                result = decimalToAnyBase(decimalFromOctal, 2);
                System.out.println("Binary: " + result);
                break;

            case 4:
                result = octalToDecimal(n);
                System.out.println("Decimal: " + result);
                break;

            case 5:
                result = decimalToAnyBase(n, 8);
                System.out.println("Octal: " + result);
                break;

            case 6:
                result = decimalToAnyBase(n, 2);
                System.out.println("Binary: " + result);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
