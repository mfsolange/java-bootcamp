package Check;
import java.text.DecimalFormat;


public class AmountReader {
	private final String[] singleValues = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private final String[] tensValues = {"", "Ten ", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
	
	public String read(double amount) {
		int floor = (int) amount;

		String accumulator = "";
		if((int)(floor/1000000) > 0){
			accumulator += readThousands((int)(floor/1000000)) + " million ";
		}
		accumulator += readThousands(floor - ((int)(floor/1000000))*1000000) + " dollars";
		
		if((amount - (double)floor)>0)
			accumulator += " with " + readCents((amount - (double)floor)) + " cents";
		return accumulator;
	}
	
	private String readCents(double amount) {
		String centsString = new DecimalFormat("#.##").format(amount);
		int cents = Integer.parseInt(centsString.substring(2));
		return String.format("%02d", cents) + "/100";
	}

	public String readThousands(int amount){
		String accumulator = "";
		if((int)(amount/1000) > 0){
			accumulator += readThreeDigits((int)(amount/1000)) + " thousand ";
		}
		accumulator += readThreeDigits(amount - ((int)(amount/1000))*1000);
		return accumulator;
	}
	
	public String readThreeDigits(int amount){
		String accumulator = "";
		if((int)(amount/100)>0){
			accumulator += singleValues[(int)(amount/100)] + " hundred ";
			amount -= (int)(amount/100)*100; 
		}
		if(amount < 20)
			accumulator += singleValues[amount];
		else{
			
			accumulator += tensValues[(int)(amount/10)] + singleValues[amount - (int)(amount/10)*10];
		}
		return accumulator;

	}
	
}
