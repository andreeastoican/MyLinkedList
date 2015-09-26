/**
 * Test class.
 * @author andreea
 *
 */
public class Main {
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();

		myList.addItem("item1");
		myList.addItem("item2");
		myList.addItem("item3");
		
		myList.addItemToPosition("item2.2", 1);

		System.out.println(myList);
		System.out.println();
		System.out.println(myList.removeItem(1) + " removed");
		System.out.println();
		System.out.println(myList);
		
		myList.removeAllItems();
		System.out.println(myList);
	}
}
