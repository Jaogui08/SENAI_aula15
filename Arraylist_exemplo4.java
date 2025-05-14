package Projetos_LPA.aula15;

import java.util.ArrayList;
import java.util.Random;

public class Arraylist_exemplo4 {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i=0; i<5; i++) {
			int randomnum = random.nextInt(1, 50);
			nums.add(randomnum);
		}
		
		for (int numeros: nums) {
			System.out.println(numeros);
		}

	}

}
