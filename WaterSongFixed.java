public class WaterSongFixed{
	public static void main(String[] args){
		int waterNum = 9;
		String word = "bottles";
		while (waterNum >= 0)
		{
			if (waterNum == 1)
			{
				word = "bottle";
			}
			if(waterNum > 0)
			{
				System.out.println(waterNum + " " + word + " Of water on the wall");
				System.out.println(waterNum + " " + word + " Of wall");
				System.out.println("Take one down.");
				System.out.println("Pass it around.");
			}
			else
			{
				System.out.println("No more bottles of water on the wall");
			}
			waterNum = waterNum - 1;
		}
	}
}