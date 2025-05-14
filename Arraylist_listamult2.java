package Projetos_LPA.aula15;

import java.util.ArrayList;
import java.util.Random;

public class Arraylist_listamult2 {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> nums = new ArrayList<Integer>();

		for (int i = 1; i < 11; i++) {
			int num = random.nextInt(1, 5);
			nums.add(num);
		}

		System.out.println("Lista original:");
		for (int nums2: nums) {
			System.out.println(nums2);
		}

		System.out.println("\nLista multiplicada:");
		for (int nums3: nums) {
			System.out.println(nums3 * 2);
		}

	}

}
