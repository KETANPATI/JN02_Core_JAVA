package Abstract;
//Calculate Area of Square with Abstract Method 
public class Square extends Shape{
    private float side;
	public Square() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Square(float side) {
		super();
		this.side = side;
	}
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}
	
   public void calarea()
    {
	// Calculate The Area of Square
    	area = side * side;
    }

}
