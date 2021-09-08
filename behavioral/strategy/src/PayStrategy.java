public interface PayStrategy
{
	boolean pay(int payAmount);

	void collectPaymentDetails();
}
