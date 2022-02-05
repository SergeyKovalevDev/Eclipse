package taskPackage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
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
		collectionPrinter(animalList);
		
	}
	
	private static void collectionPrinter(Collection<Animal> collection) {
		for (Animal element : collection) {
			System.out.println(element);
		}
	}

}
