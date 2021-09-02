import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork
{
	private List<Profile> profiles;

	public Facebook(List<Profile> cache)
	{
		if (cache != null)
		{
			profiles = cache;
		} else
		{
			profiles = new ArrayList<>();
		}
	}

	@Override
	public ProfileIterator createFriendsIterator(String email)
	{
		return new FacebookIterator(this, email, "friends");
	}

	@Override
	public ProfileIterator createCoworkersIterator(String email)
	{
		return new FacebookIterator(this, email, "coworkers");
	}

	public List<String> requestProfileFriendsFromFacebook(String email, String type)
	{
		simulateNetworkLatency();
		System.out.println("Facebook loading " + type + " list of " + email);

		Profile profile = findProfile(email);
		if (profile != null)
		{
			return profile.getContacts(type);
		}
		return null;
	}

	public Profile requestProfileFromFacebook(String friendEmail)
	{
		simulateNetworkLatency();
		System.out.println("Facebook loading profile connected to mail " + friendEmail);
		return findProfile(friendEmail);
	}

	private Profile findProfile(String friendEmail)
	{
		for (Profile profile : profiles)
		{
			if (profile.getEmail().equals(friendEmail))
			{
				return profile;
			}
		}
		return null;
	}

	private void simulateNetworkLatency()
	{
		try
		{
			Thread.sleep(2500);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
