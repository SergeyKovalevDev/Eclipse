package taskPackage;

import java.time.LocalDateTime;

public class Cat extends Animal {
	
	private static final String BREED = "Cat";

	public Cat(String name, Integer age, LocalDateTime creationDate) {
		super(BREED, name, age, creationDate);
	}

}
