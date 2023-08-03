package Abstract;
//  Calculate Area of Circle with Abstract Method 
public class Circle extends Shape
{
	private float redius;
	public Circle()
	{
		super();
	}
	public Circle(float redius)
	{
		super();
		this.redius = redius;
	}
	@Override
	public void calarea() {
		// Calculate The Area of Circle
		area=PI*redius*redius;
	}
	
	
}
