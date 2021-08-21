import java.util.ArrayList;
import java.util.List;

public class CompositeMain
{
	public static void main(String[] args)
	{
		ImageEditor imageEditor = new ImageEditor();
		imageEditor.load();
		List<Graphic> graphics = new ArrayList<>();

		imageEditor.groupSelected(graphics);
	}
}
