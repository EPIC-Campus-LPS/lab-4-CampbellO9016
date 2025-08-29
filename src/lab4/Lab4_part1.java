package lab4;
import java.util.Scanner;
public class Lab4_part1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input: ");
		int[] nums = new int[10];
		for (int i = 0; i < 10; i ++) {
			int num = scan.nextInt();
			nums[i] = num;
		}
		scan.close();
		String bythree = "";
		int count = 0;
		int min = nums[0];
		int max = nums[0];
		double sum = 0;
		double ave = 0;
		
		for (int m : nums) {
			if (m % 2 == 0 && m != 0)
			{
				count ++;
			}
			if (m < min) {
				min = m;
			}
			if (m > max) {
				max = m;
			}
			if (m % 3 == 0 && m != 0) {
				bythree +=  m + ", ";
			}
			sum += m;		
		}
		ave = sum / 10;	
		String smax = String.valueOf(max);
		bythree += "are divisable by 3.";
		System.out.println(bythree);
		System.out.println("There are " + count + " even numbers");
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);
		System.out.println("Sum = " + (int)sum);
		System.out.println("Average = " + ave);
		System.out.println("Largest digits: ");
		for (int j = 0; j < smax.length(); j ++) {
			System.out.println(smax.substring(j, j + 1));
		}
		
		
		
		
		
	}
}
