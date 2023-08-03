package Abstract;

public class AbstractDemo {
	public static void main(String[] args) {
		// Object of Shape class
        Shape s;
        
        //call the Square with s Object
        s=new Square(4.5f);
        s.calarea();
        s.show();
        
      //call the Rectangle with s object
        s=new Rectangle(11.4f,12.5f);
        s.calarea();
        s.show();
        
      //call the Circle with s Object
        s=new Circle(5.5f);
        s.calarea();
        s.show();
        
	}

}
