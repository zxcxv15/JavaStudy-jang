package j12_상속_다형성;

import j12_상속.Animal;
import j12_상속.Human;

public class AnimalTest {

	public static void main(String[] args) {
		Human human = new Human();
		Animal animal = human;
		
		animal.move();
		Human human2 = (Human)animal; 
		human2.readBooks();
		
		
		
	}

}
