package taskPackage;

import java.time.LocalDateTime;

public class Animal {
	
	private final String breed;
	private final String name;
	private final Integer age;
	private final LocalDateTime creationDate;
	
	public Animal(String breed, String name, Integer age, LocalDateTime creationDate) {
		if (breed == null || name == null || 
				age == null || creationDate == null ) {
			throw new IllegalArgumentException();
		}
		this.breed = breed;
		this.name = name;
		this.age = age;
		this.creationDate = creationDate;
	}

	public final String getBreed() {
		return breed;
	}

	public final String getName() {
		return name;
	}

	public final Integer getAge() {
		return age;
	}

	public final LocalDateTime getCreationDate() {
		return creationDate;
	}

	@Override
	public String toString() {
		return "Animal [breed=" + breed + ", name=" + name + ", "
				+ "age=" + age + ", creationDate=" + creationDate + "]";
	}

	
	
	
	

}
