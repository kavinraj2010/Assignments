package week3.day1.methodOverloading;

public class Sports {
	public void acheiver(String  name,int medalCount) {
		System.out.println("Name is: "+name);
		System.out.println("Medal Count:"+medalCount);
	}
	public void acheiver(String country ,String sportName, int rank) {
		System.out.println("Country name: "+country);
		System.out.println("Game name is:"+sportName);
		System.out.println("Rank:"+rank);
	}
	public void acheiver(float weight, int height, long contactNo) {
		System.out.println("Weight:"+weight);
		System.out.println("Height:"+height);
		System.out.println("ContactNo:"+contactNo);
	}
	public void acheiver(String tournamentName, long prizeMoney) {
		System.out.println("Tournament Name:"+tournamentName);
		System.out.println("Prize Money:"+prizeMoney);
	}
	public static void main(String[] args) {
		Sports get=new Sports();
		get.acheiver("Kavinraj S", 7);
		get.acheiver("India", "Track Events", 2);
		get.acheiver(58, 176, 9080829503l);
		get.acheiver("National 2022 Trackevents", 150000);
	}

}
