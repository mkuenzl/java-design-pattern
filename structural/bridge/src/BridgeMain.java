public class BridgeMain
{
	public static void main(String[] args)
	{
		TV tv = new TV();
		RemoteControl remoteControl = new RemoteControl(tv);
		remoteControl.togglePower();

		Radio radio = new Radio();
		AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);
		advancedRemoteControl.mute();
		advancedRemoteControl.channelDown();
	}
}
