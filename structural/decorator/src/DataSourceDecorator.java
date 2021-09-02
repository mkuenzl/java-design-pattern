import java.util.List;

public class DataSourceDecorator implements DataSource
{
	DataSource dataSource;

	public DataSourceDecorator(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	@Override
	public String readData()
	{
		return dataSource.readData();
	}

	@Override
	public void writeData(String data)
	{
		dataSource.writeData(data);
	}
}
