import java.util.Scanner;

// Main class
class specialChar {

	public static void main(String[] args)
	{

		int count = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string");
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {

            	if (!Character.isDigit(str.charAt(i))
            		&& !Character.isLetter(str.charAt(i))
            		&& !Character.isWhitespace(str.charAt(i))) {
            		count++;
            	}
            }
        } 
        if (count == 0)

			System.out.println(
				"No Special Characters found.");
		else
			System.out.println(
				"String has Special Characters\n" + count + " "
				+ "Special Characters found.");
	}
}
