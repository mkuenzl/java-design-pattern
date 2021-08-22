import subsystem.*;

import java.io.File;

public class VideoConverter
{
	private Codec destinationCodec;

	public File convert(String fileName, String format)
	{
		VideoFile videoFile = new VideoFile(fileName);
		Codec sourceCodec = new CodecFactory().extract(videoFile);

		if (format == "mp4")
		{
			destinationCodec = new MPEG4CompressionCodec();
		} else {
			destinationCodec = new OggCompressionCodec();
		}

		String buffer = BitrateReader.read(fileName, sourceCodec);
		String result = BitrateReader.convert(buffer, destinationCodec);

		return new File(result);
	}
}
