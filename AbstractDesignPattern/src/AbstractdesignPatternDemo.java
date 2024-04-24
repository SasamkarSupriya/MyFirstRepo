
public class AbstractdesignPatternDemo {

	/**
	 * The Factory pattern deals with creating objects of a single type, 
	 * while the Abstract Factory pattern deals with creating objects of related types.
	 * 
	 * Abstract Factory patterns work around super factory which creates other factory
	 * This factory is also called factory of factory
	 * 
	 * An abstract factory pattern, an interface is responsible to creating for objects for related objects
	 * without explicitly specifying their classes.
	 * 
	 * Each generated factory can give the objects as per the factory pattern.
	 */
	public static void main(String... args) {
		
		AbstractFactory ab = new AbstractFactory();
		
		Shape shape = ab.getShapeType("square");
		shape.getShape();
		Shape shape1 = ab.getShapeType("triangle");
		shape1.getShape();
		Shape shape2 = ab.getShapeType("rectangle");
		shape2.getShape();
		
		Colour colour = ab.getColourType("blue");
		colour.getColour();
		Colour colour1 = ab.getColourType("Red");
		colour1.getColour();
		Colour colour2 = ab.getColourType("green");
		colour2.getColour();
	}

}
