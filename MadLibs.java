import java.util.Scanner; 

//Bhavya
//Initialized scanner and main variables for the MadLib
public class MadLibs {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a first name. ");
        String input1 = scanner.nextLine();

        System.out.print("Enter a different first name. ");
        String input2 = scanner.nextLine();

        System.out.print("Enter a last name. ");
        String input3 = scanner.nextLine();

        System.out.print("Enter an adjective. ");
        String input5 = scanner.nextLine();

        System.out.print("Enter a time in the format 00:00 ");
        String input6 = scanner.nextLine();

        System.out.print("Enter the name of a place. ");
        String input7 = scanner.nextLine();

        System.out.print("Enter a first name. ");
        String input8 = scanner.nextLine();

        System.out.print("Enter a location. ");
        String input9 = scanner.nextLine();

        System.out.print("Enter a food item. ");
        String input11 = scanner.nextLine();

        System.out.print("Enter an animal. ");
        String input12 = scanner.nextLine();

        System.out.print("Enter a mixed number (decimal). ");
        double input13 = scanner.nextDouble();

        System.out.print("Enter a number. ");
        int input10 = scanner.nextInt();

        scanner.close();

        //Arnesh
        // Wrote the first section of the Mad Lib, using inputs from Bhavya's parts and outputting them for the initial section of the MadLib
        System.out.println("*trumpets*");
        System.out.println("Hear ye, hear ye, for I have a public declaration from Lord " + input1 + "!");
        String crime = "We are searching for the most ";
        crime += input5 + " ";
        crime += input2 + " ";
        crime += input3 + " ";
        crime += "the IV for committing the abhorrent crime of stealing the last cookie from the cookie jar.";
        System.out.println(crime);
        
        //Dylan
        // Wrote the second and the third sections using inputs from Bhavya's scanners
        System.out.print("The horrendous crime was commited at " + input6 + " in " + input7 + ".");
        System.out.print(" This crime led to the horrendous death of a whopping TWO, wait no, TWO AND A HALF, wait no, " + input13 + " people, including King " + input8 + " Timmy, and landed " + input10 + " people in the " + input9 +". ");
        System.out.print("We are seeking any and all information on the accused's " + input5 + " " + input2 + " " + input3 + " whereabouts. ");
        System.out.print("We will pay highly for all informations, and we can pay handsomely, such as " + input10 + " ounces of " + input11 + " or a singular cookie. ");

        //Aarav
        //Wrote the fourth part using scanner and concatenated the strings
        System.out.println("Until" + " " +  input5 + " " + input2 + " "+ input3 + " " + "is caught, Lord" + " " + input1 + " "  + "will not stop at hunting down this traitorous vermin. ");
        System.out.println("And to keep everyone safe and out of the" + " " + input9 + ", the entire cult has decreed that all ");
        System.out.println("citizens must stay inside of their humble abodes until the suspect has been captured. ");

        //Anya
        //Wrote the final section using Bhavya's scanner
        System.out.println("Therefore, Lord " + input1 + " has decreed that the punishment for the guilty will be one of the following:");
        System.out.println("    1. Trampled to death by " + input12);
        System.out.println("    2. Crushed by sacks of " + input11);
        System.out.println("    3. Defenestrated out the top floor of " + input9);
        System.out.println("    4. Turned into shredded beef and fed to the " + input12);
        System.out.println("    5. Smited down by the one and only Lord " + input1);
        
    }
}
