 public class Set {

	 	LinkedNode head;

	void add(int x) {

		if (!exists(x)) {
			LinkedNode newLinkedNode = new LinkedNode(x);
			newLinkedNode.next = head;
			head = newLinkedNode;
			
		}
	}

	void del(int x) {

			LinkedNode current = head;
			LinkedNode last = null;

		if (!exists(x)) {
			return;
			
	}

		if (current.x == x) {
			head = current.next;
			return;
	}

		while (current.x != x) {
			last = current;
			current = current.next;
			
		}

		last.next = current.next;

	}


		boolean exists(int x) {
		
			LinkedNode current = head;

		while (current != null) {
			
			if (current.x == x) {
				
				return true;
			}
			
			current = current.next;
			
		}
		
		return false;
	}


		public String toString() {

				String string = "";
				LinkedNode current = head;
			
			while (current != null) {
				
				string += current.x + " ";
				current = current.next;
			
		}
		
		return string;
		
	}
}