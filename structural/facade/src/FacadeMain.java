import java.io.File;

public class FacadeMain
{
	public static void main(String[] args)
	{
		VideoConverter videoConverter = new VideoConverter();
		File mp4 = videoConverter.convert("facade-patter-video.ogg", "mp4");
		if (mp4 != null)
		{
			System.out.println("Mp4 created.");
		}
	}
}
