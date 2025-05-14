package Projetos_LPA.aula15;

import java.util.ArrayList;
import java.util.Random;

public class Arraylist_listamult {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> mult = new ArrayList<Integer>();

		for (int i = 1; i < 11; i++) {
			int num = random.nextInt(1, 5);
			nums.add(num);
			mult.add(num*2);
		}

		System.out.println("Lista original:");
		System.out.println(nums);

		System.out.println("\nLista multiplicada:");
		System.out.println(mult);

	}

}
