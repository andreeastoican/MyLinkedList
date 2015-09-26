/**
 * Class that define an item from list.
 * @author andreea
 *
 */
public class Item {
	private Item next;
	private String data;
	
	public Item(String data) {
		this.next = null;
		this.data = data;
	}
	
	public Item(Item next, String data) {
		this.next = next;
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public Item getNext() {
		return next;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public void setNext(Item next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return data;
	}
}
