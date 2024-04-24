
public class SingletonObject {
	/**
	 * Singlton design pattern is a creational design pattern.
	 * In this design pattern it has to be ensure that against one class single object can only be initiated
	 * Singleton class should creates its own object inside the same class and provide method to access for other classes.
	 */
	private static SingletonObject instance = new SingletonObject();

	
	private SingletonObject() {
		
	}
	
	public static SingletonObject getInstance() {
		
		return instance;
	} 
	
	public void msg() {
		
		System.out.println("Hello singleton world!!");
	}
}
