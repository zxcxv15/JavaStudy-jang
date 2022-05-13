package j12_상속;

public class AnimalTest {

	public static void main(String[] args) {
		Human h = new Human();
		Tiger t = new Tiger();
		
		h.move();
		t.move();
		
		h.readBooks();
		t.huntting();
		
		Animal a = new Animal();
		a.move();
		
		/////////////////////////////////
		
		Animal[] animals = new Animal[4];
		
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Tiger();
		animals[3] = new Animal();
		
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
			animals[i].move();
			if(animals[i] instanceof Human) {
				Human h1 = (Human)animals[i];
				h1.readBooks();
				//((Human)animals[i]).readBooks();
			}else if(animals[i] instanceof Tiger) {
				((Tiger)animals[i]).huntting();
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
			
		}
	}
	

}
