package Projetos_LPA.aula15;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_numpositivo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i=1; i<7; i++) {
			System.out.print("Informe o " + i + "° número: ");
			int nums2 = scanner.nextInt();
			nums.add(nums2);
		}
		
		System.out.println("\nNúmeros positivos:\n");
		
		for (int numeros: nums) {
			if (numeros > 0) {
				System.out.println(numeros);
			}
		}
		scanner.close();

	}

}
