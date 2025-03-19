package question.loop;

import java.util.Scanner;

 public class exception {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String n = sc.nextLine();
//         sc.close();

//         char[] s = n.toCharArray(); 
//         char[] rev = new char[s.length];

//         // Reverse the input string
//         for (int i = s.length - 1; i >= 0; i--) {
//             rev[i] = s[i];
//         }

//         // Convert the reversed char array to a string
//         String j = new String(rev);

//         // Compare the original string with the reversed string
//         if (n.equals(j)) {
//             System.out.println("palindrome");
//         } else {
//             System.out.println("not palindrome");
//         }
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String n = sc.nextLine().trim();  // Trim any leading or trailing spaces
//     sc.close();

//     // Convert the string to a char array
//     char[] s = n.toCharArray(); 
//     char[] rev = new char[s.length];

//     // Reverse the input string
//     for (int i = s.length - 1; i >= 0; i--) {
//         rev[s.length - 1 - i] = s[i];  // Correct the index for reversed array
//     }

//     // Convert the reversed char array back to a string
//     String reversedString = new String(rev);

//     // Compare the original string with the reversed string
//     if (n.equals(reversedString)) {
//         System.out.println("palindrome");
//     } else {
//         System.out.println("not palindrome");
//     }
// }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }
    }
}

