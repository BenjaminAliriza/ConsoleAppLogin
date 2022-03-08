import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String keyName = "nameless";
        String keyWord = "word";

        Scanner muhTermi = new Scanner(System.in); // Create a Scanner Object
        String newLine = System.getProperty("line.separator"); // new line in the sout

        for (int b = 0; b < 3; b++) {

            System.out.println("Please enter the correct key. \n");

            String userName = muhTermi.nextLine(); // Read user input

            if (userName.equals(keyName)) {
                // System.out.println(newLine + "You are acknowledged as a key holder." + newLine + newLine
                //         + "Now, do you know the key word?. :|" + newLine);
                System.out.println("\n You are acknowledged as a key holder. \n \n Now, do you know the key word?. :| \n");
                
                if (muhTermi.nextLine().equals(keyWord)) {
                    System.out.println(newLine + "It seems you've appeared, key holder..." + newLine);
                    break;
                }
            } else {
                // if (b == 0){
                // System.out.println("Wrong. Two more tries.");
                // } else {
                // if(b==1){
                // System.out.println("You're trying my patience. One more try.");
                // } else {
                // if(b==2){
                // System.out.println("You are no key holder. Begone");
                // }
                // }
                // }

                if (b == 0) {
                    System.out.println("Wrong. Two more tries.");
                } else if (b == 1) {
                    System.out.println("You're trying my patience. One more try.");
                } else if (b == 2) {
                    System.out.println("You are no key holder. Begone");
                } else { } // nothing 
            }
        }
        muhTermi.close();
    }
}
