package Abstract;
//show Method class and With abstract Method(Keyword)
public abstract class Shape 
{
	protected float area;
	public static final float PI=3.14F;
	public void show()
	{
		System.out.println("Area of shape is := "+area);
		System.out.println("*************$*************");
	}
	public abstract void calarea();
}
