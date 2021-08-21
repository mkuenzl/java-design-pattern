public class RemoteControl
{
	protected Device device;

	public RemoteControl(Device device)
	{
		this.device = device;
	}

	public void togglePower()
	{
		if (device.isEnabled())
		{
			device.disable();
		} else
		{
			device.enable();
		}
	}

	public void volumeDown()
	{
		double volume = device.getVolume();
		device.setVolume(volume - 0.5);
	}

	public void volumeUp()
	{
		double volume = device.getVolume();
		device.setVolume(volume + 0.5);
	}

	public void channelDown()
	{
		int channel = device.getChannel();
		device.setChannel(channel - 1);
	}

	public void channelUp()
	{
		int channel = device.getChannel();
		device.setChannel(channel + 1);
	}
}
