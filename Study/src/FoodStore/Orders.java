package FoodStore;

public class Orders {
	private String menu;
	private int price;

	public Orders () {}
	public Orders(String name, String pNum, String memu, int price) {
		super();
		this.menu = menu;
		this.price = price;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
