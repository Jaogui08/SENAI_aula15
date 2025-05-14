package Projetos_LPA.aula15;

import java.util.ArrayList;
import java.util.Random;

public class Arraylist_listaint {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i=1; i<11; i++) {
			int num = random.nextInt(1, 20);
			nums.add(num);
		}
		
		System.out.println(nums);
		
		System.out.println("\nLista modificada:\n");
		
		nums.remove(4);
		
		System.out.println(nums);
	}

}
