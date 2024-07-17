public class NetFlixRunner{
  public static void main(String args[]){
   
   NetFlix netflix = new NetFlix();

		String[] seriesname = {"Dark water","one day","heeramandi"};
		NetFlix netflix1 = new NetFlix(seriesname,120,(short)10,(byte)15,3.5f);
	}
}
