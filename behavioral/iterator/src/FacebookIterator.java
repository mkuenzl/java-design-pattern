import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator
{
	private Facebook facebook;
	private String email;
	private String type;
	private int currentPosition = 0;
	private List<Profile> profiles = new ArrayList<>();
	private List<String> emails = new ArrayList<>();

	public FacebookIterator(Facebook facebook, String email, String type)
	{
		this.facebook = facebook;
		this.email = email;
		this.type = type;
	}

	private void lazyLoad()
	{
		if (emails.size() == 0)
		{
			List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
			for (String profile : profiles)
			{
				this.emails.add(profile);
				this.profiles.add(null);
			}
		}
	}

	@Override
	public Profile getNext()
	{
		if (!hasNext())
		{
			return null;
		}

		String friendEmail = emails.get(currentPosition);
		Profile friendProfile = profiles.get(currentPosition);
		if (friendProfile == null)
		{
			friendProfile = facebook.requestProfileFromFacebook(friendEmail);
			profiles.set(currentPosition, friendProfile);
		}
		currentPosition++;
		return friendProfile;
	}

	@Override
	public boolean hasNext()
	{
		lazyLoad();
		return currentPosition < emails.size();
	}

	@Override
	public void reset()
	{
		currentPosition = 0;
	}
}
