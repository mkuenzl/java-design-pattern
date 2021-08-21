import java.util.ArrayList;
import java.util.List;

public class ImageEditor
{
	private CompoundGraphic allGraphics;

	public void load()
	{
		allGraphics = new CompoundGraphic();
		allGraphics.add(new Dot(1,2));
		allGraphics.add(new Circle(1,2,3));
		allGraphics.add(new Dot(4,5));
	}

	public void groupSelected(List<Graphic> graphics)
	{
		CompoundGraphic compoundGraphic = new CompoundGraphic();

		for (Graphic graphic : graphics)
		{
			compoundGraphic.add(graphic);
			allGraphics.remove(graphic);
		}
		allGraphics.add(compoundGraphic);
		allGraphics.draw();
	}
}
