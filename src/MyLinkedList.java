/**
 * My custom linked list.
 * @author andreea
 *
 */
public class MyLinkedList {
	private Item head;
	private int count;

	public MyLinkedList() {
		this.head = new Item(null);
		this.count = 0;
	}

	/**
	 * Add item to the end of the list.
	 * 
	 * @param data
	 */
	public void addItem(String data) {
		Item addedItem = new Item(data);
		Item currentItem = head;
		while (currentItem.getNext() != null) {
			currentItem = currentItem.getNext();
		}
		currentItem.setNext(addedItem);
		count++;
	}

	/**
	 * Add item to a specific position.
	 * 
	 * @param data
	 * @param position
	 */
	public void addItemToPosition(String data, int position) {
		Item addedItem = new Item(data);
		Item currentItem = head;
		int i = 0;
		while (currentItem.getNext() != null && i < position) {
			currentItem = currentItem.getNext();
			i++;
		}
		addedItem.setNext(currentItem.getNext());
		currentItem.setNext(addedItem);
		count++;
	}

	/**
	 * Get data from a specific position.
	 * 
	 * @param position
	 * @return the data from specified position
	 */
	public String getData(int position) {
		Item item = head;
		for (int i = 0; i < count; i++) {
			item = item.getNext();
			if (i == position)
				break;
		}
		return item.getData();
	}

	/**
	 * Remove item form specified position.
	 * @param position
	 * @return the removed item
	 */
	public Item removeItem(int position) {
		Item item = head;
		
		if (position < 0 || position >= count) {
			return null;
		}
		
		for (int i = 0; i < position; i++) {
			if (item.getNext() == null) {
				return null;
			}
			item = item.getNext();
		}
		
		Item previousItem = item.getNext();
		item.setNext(item.getNext().getNext());
		count--;
		return previousItem;
	}
	
	/**
	 * Remove all items from list.
	 */
	public void removeAllItems() {
		head.setNext(null);
		count = 0;
	}
	
	public int size() {
		return count;
	}

	@Override
	public String toString() {
		Item item = head.getNext();
		String show = "[";
		for (int i = 0; i < count; i++) {
			show += item + ", ";
			item = item.getNext();
		}
		show+="]";
		
		show = show.replace(", ]", "]");
		
		return show;
	}
}
