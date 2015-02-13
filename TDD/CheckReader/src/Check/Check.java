package Check;

public class Check {

	private final double amount;
	private final AmountReader reader;
	
	public Check(double amount) {
		reader = new AmountReader();
		this.amount = amount;
	}
	public String read() {
		return reader.read(amount);
	}

}
