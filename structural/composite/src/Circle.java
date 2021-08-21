public class Circle extends Dot
{
	int radius;

	public Circle(int x, int y, int radius)
	{
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw()
	{
		System.out.println("Draw circle with x:" + x + " y:" + y + " r:" + radius);
	}
}
