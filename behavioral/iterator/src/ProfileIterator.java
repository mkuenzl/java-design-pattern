public interface ProfileIterator
{
	Profile getNext();

	boolean hasNext();

	void reset();
}
