

	package atividades;
	import java.util.Collections;
	import java.util.List;
	import java.util.ArrayList;

	public class Main {

		public static void main(String[] args) {
			List<String> names = new ArrayList<>();
			
			names.add("Vinicius");
			names.add("Gabriel");
			names.add("Silva");
			names.add("Santos");
			names.add("João");
			names.add("Maria");
			names.add("José");
			
			Collections.sort(names);
			
			System.out.println("Nomes em ordem alfabética:");
			for(String name: names) {
				System.out.println(name);
			}

		}

	}
