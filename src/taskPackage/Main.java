package taskPackage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		taskStarter();
	}
	
	private static void taskStarter() {
		List<Animal> animalList = new ArrayList<>();
		animalList.add(new Cat("awww", 5, LocalDateTime.now()));
		animalList.add(new Cat("bwww", 15, LocalDateTime.now()));
		animalList.add(new Cat("cwww", 7, LocalDateTime.now()));
		listPrinter(animalList);
		System.out.println();
		listSort(animalList);
		listPrinter(animalList);
		
	}
	
	private static void listPrinter(List<Animal> list) {
		for (Animal element : list) {
			System.out.println(element);
		}
	}
	
	private static void listSort(List<Animal> list) {
		Collections.sort(list, new Comparator<Animal>() {
			@Override
			public int compare(Animal o1, Animal o2) {
				return o1.getAge().compareTo(o2.getAge());
			}
		});
	}

}
