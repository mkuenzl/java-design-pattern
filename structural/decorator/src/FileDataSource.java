public class FileDataSource implements DataSource
{
	private String fileName;
	private String fileData = "";

	public FileDataSource(String fileName)
	{
		this.fileName = fileName;
	}

	@Override
	public String readData()
	{
		return fileData;
	}

	@Override
	public void writeData(String data)
	{
		this.fileData = this.fileData.concat(data);
	}
}
