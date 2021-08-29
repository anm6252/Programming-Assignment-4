import java.util.Scanner;
public class Test {

	public static void main(String[] arg) {
			System.out.println("PROGRAMMING FUNDAMENTAL \nALLISON MACDONALD \nPROGRAMMING ASSIGNMENT 4 - SET \n");

		Set newSet = new Set();
		Scanner scan = new Scanner(System.in);
			String string1;


		while (true) {
			
			System.out.print("ENTER COMMAND: ");
				string1 = scan.nextLine();
			
			String[] split = new String[2];
			String command;
			int num;
			
			split = string1.split(" ");
			command = split[0];
			num = Integer.parseInt(split[1]);
			
		try {

			switch (command) {

				case "add":
					newSet.add(num);
					System.out.println(newSet.toString());
					break;

				case "del":
					newSet.del(num);
					System.out.println(newSet.toString());
					break;

				case "exists":
					System.out.println(newSet.exists(num));
					break;

				default:
					System.out.println("Please enter a valid command");
					break;
				}
			} 
			
			catch (Exception e) {
				
				System.out.println("Please enter valid number");

			}
		}
	}
}