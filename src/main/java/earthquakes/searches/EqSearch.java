package earthquakes.searches;

public class EqSearch {
	private int distance;
	private int minmag;

	public EqSearch() {
		distance = 0;
		minmag = 0;
	}

	public int getDistance() {return distance;}
	public int getMinmag() {return minmag;}

	public void setDistance(int d) {distance = d;}
	public void setMinmag(int m) {minmag = m;}
}