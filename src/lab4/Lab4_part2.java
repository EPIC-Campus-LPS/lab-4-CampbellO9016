package lab4;
import java.util.Scanner;
public class Lab4_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input: ");
		String sent = scan.nextLine();
		scan.close();
		int the = 0;
		boolean and = false;
		boolean apple = false;
		boolean cherry = false;
		boolean banana = false;
		String sent2 = sent.toLowerCase();
		for(int i = 0; i < sent.length() - 2; i ++) {
			if(sent2.substring(i,i+3).equals("the")){
				the ++;				
			}
			if(sent2.substring(i,i+3).equals("and")){
				and = true;
			}
			
		if(sent2.contains("apple")) {
			apple = true;
		}
		if(sent2.contains("cherry")) {
			cherry = true;
		}
		if(sent2.contains("banana")) {
			banana = true;
		}
		}
		if(apple && cherry && banana ) {
			System.out.println("Found: apple, cherry, banana");
		}
		else if(apple && cherry) {
			System.out.println("Found: apple, cherry");
		}
		else if(apple && banana ) {
			System.out.println("Found: apple, banana");
		}
		else if(cherry && banana ) {
			System.out.println("Found: cherry, banana");
		}
		else if(apple) {
			System.out.println("Found: apple");
		}
		else if(cherry) {
			System.out.println("Found: cherry");
		}
		else if(banana) {
			System.out.println("Found: banana");
		}
		if(the == 1)
			System.out.println("The: \"The\" appears "+ the + " time.");
		else if(the > 1)
			System.out.println("The: \"The\" appears "+ the + " times.");
		if(and)
			System.out.println("And: \"And\" appears.");
		else
			System.out.println("And: \"And\" does not appear.");
		for(int i = sent.length() - 1; i >= 0; i --) {
			System.out.print(sent.substring(i,i + 1));
		}
		
	}

}
