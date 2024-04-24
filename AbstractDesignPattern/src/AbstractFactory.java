
public class AbstractFactory {
	
	public Shape getShapeType(String shapeType) {
		
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		if(shapeType.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
        return null;
		
	}
	
	public Colour getColourType(String colourType) {
		
		if(colourType.equalsIgnoreCase("Red")) {
			return new Red();
		}
		if(colourType.equalsIgnoreCase("Green")) {
			return new Green();
		}
		if(colourType.equalsIgnoreCase("Blue")) {
			return new Blue();
		}
		
		return null;
	}

}
