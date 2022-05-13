package j16_스태틱;

public class SingletonTest {

	public static void main(String[] args) {
		KIA factory1 = KIA.getInstance(); 
		KIA factory2 = KIA.getInstance();
		KIA factory3 = KIA.getInstance();
		KIA factory4 = KIA.getInstance();
		
		System.out.println(factory1);
		System.out.println(factory2);
		System.out.println(factory3);
		System.out.println(factory4);
		
		
		
		SingletonTest2 singletonTest2 = new SingletonTest2();
		singletonTest2.temp();
		
		System.out.println(factory1.createCar("k5").toString());
		System.out.println(factory2.createCar("스포티지").toString());
		System.out.println(factory3.createCar("쏘렌토").toString());
		System.out.println(factory4.createCar("k9").toString());
	
	
		
		

	}

}
