package taskPackage;

import java.time.LocalDateTime;

public class Dog extends Animal {
	
	private static final String BREED = "Dog";

	public Dog(String name, Integer age, LocalDateTime creationDate) {
		super(BREED, name, age, creationDate);
	}

}
