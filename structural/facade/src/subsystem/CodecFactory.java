package subsystem;

public class CodecFactory
{
	public Codec extract(VideoFile videoFile)
	{
		OggCompressionCodec oggCompressionCodec = new OggCompressionCodec();
		return oggCompressionCodec;
	}
}
