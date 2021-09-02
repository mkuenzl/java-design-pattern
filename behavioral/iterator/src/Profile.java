import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile
{
	private String name;
	private String email;
	private Map<String, List<String>> contacts = new HashMap<>();

	public Profile(String mail, String name, String... contacts)
	{
		this.name = name;
		this.email = mail;

		for (String contact : contacts)
		{
			String[] parts = contact.split(":");
			String contactType = "friend";
			String contactEmail;

			if (parts.length == 1)
			{
				contactEmail = parts[0];
			} else
			{
				contactType = parts[0];
				contactEmail = parts[1];
			}
			if (!this.contacts.containsKey(contactType))
			{
				this.contacts.put(contactType, new ArrayList<>());
			}
			this.contacts.get(contactType).add(contactEmail);
		}
	}

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public List<String> getContacts(String type)
	{
		if (!this.contacts.containsKey(type))
		{
			this.contacts.put(type, new ArrayList<>());
		}
		return this.contacts.get(type);
	}
}
