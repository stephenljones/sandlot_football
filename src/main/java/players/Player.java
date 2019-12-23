package players;

public class Player {
	
	private String name;
	private int rating;
	
	public Player(String name, int rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", rating=" + rating + "]";
	}	

}
