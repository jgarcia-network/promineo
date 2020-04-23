
public class Week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
		boolean isWeekday = true;
		
		double costOfMilk = 5.99;
		double moneyInWallet = 20.00;
		int thirstLevel = 10;
		
		boolean shouldByIcecream = isHotOutside && moneyInWallet > 0;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && moneyInWallet > 0 && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (costOfMilk*2);
		
		System.out.println(shouldByIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
		
	}

}
