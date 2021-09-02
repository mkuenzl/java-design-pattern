public interface SocialNetwork
{
	ProfileIterator createFriendsIterator(String email);

	ProfileIterator createCoworkersIterator(String email);
}
