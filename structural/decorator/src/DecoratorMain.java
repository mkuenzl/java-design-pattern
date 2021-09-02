public class DecoratorMain
{
	public static void main(String[] args)
	{
		FileDataSource dataSource = new FileDataSource("salaries.txt");
		dataSource.writeData("Hans 6000€");
		System.out.println(dataSource.readData());

		DataSource encryptionDecorator = new EncryptionDecorator(dataSource);
		encryptionDecorator.writeData("Julie 50.000€");
		System.out.println(encryptionDecorator.readData());

		DataSource compressionDecorator = new CompressionDecorator(encryptionDecorator);
		compressionDecorator.writeData("Pete 300€");
		System.out.println(compressionDecorator.readData());
	}
}
