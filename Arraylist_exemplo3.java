package Projetos_LPA.aula15;

import java.util.ArrayList;

public class Arraylist_exemplo3 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(" ");
		
		nums.set(1, 25);
		System.out.println(nums.get(1));
		System.out.println(" ");
		
		nums.remove(0);
		System.out.println(nums.get(0));
		
		System.out.println(nums.size());

	}

}
