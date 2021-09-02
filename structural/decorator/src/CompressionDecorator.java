import java.util.Arrays;

public class CompressionDecorator extends DataSourceDecorator
{
	public CompressionDecorator(DataSource dataSource)
	{
		super(dataSource);
	}

	@Override
	public void writeData(String data)
	{
		String compressedData = " Compressed: " + data;
		dataSource.writeData(compressedData);
	}

	@Override
	public String readData()
	{
		String compressedData = dataSource.readData();
		String[] splitData = compressedData.split("Compressed:");
		return Arrays.toString(splitData);
	}
}
