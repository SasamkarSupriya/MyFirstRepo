
public class FactoryPatternDemo {

	public static void main(String[] args) {
		
	// Factory design pattern its a creational design pattern
	// provides one of the beast way to create objects
	// In factory pattern we create the object without exposing the creation logic to the client 
	// and reffer to newly created object using a common inteterface.
		
		ShapeFactory obj = new ShapeFactory();
		
		
		Shape shape = obj.getShape("circle");
		shape.shape();
		
		Shape shape1 = obj.getShape("square");
		shape1.shape();
		
		Shape shape2 = obj.getShape("rectangle");
		shape2.shape();
		
		Shape shape3 = obj.getShape("triangle");
		shape3.shape();

	}

}
