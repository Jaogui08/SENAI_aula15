package Projetos_LPA.aula15;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_exemplo2 {

	public static void main(String[] args) {
		String[] disciplinas = {"Matemática", "Filosofia", "História", "Física"};
		ArrayList<String> novalista = new ArrayList<String>(Arrays.asList(disciplinas));
		novalista.add("Geografia");
		novalista.add("Lingua Inglesa");
		
		for (String i: novalista) {
			System.out.println("Disciplina: " + i);
		}

	}

}
