import java.util.Arrays;

public class EncryptionDecorator extends DataSourceDecorator
{
	public EncryptionDecorator(DataSource dataSource)
	{
		super(dataSource);
	}

	@Override
	public void writeData(String data)
	{
		String encryptedData = " Encrypted: " + data;
		dataSource.writeData(encryptedData);
	}

	@Override
	public String readData()
	{
		String encryptedData = dataSource.readData();
		String[] splitData = encryptedData.split("Encrypted:");
		return Arrays.toString(splitData);
	}
}
