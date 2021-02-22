
public class PointSet {

  PointNode [][] table;	// Hash table - collisions resolved through chaining.
  int numelements;	// Number of elements actually stored in the structure.
  int size;					// Allocated memory (size of the hash table).

   /* Constructur: initilaizes numelements, size and initial table size.
   */
  public PointSet() {
    numelements = 0;
    size = 100;
    table = new PointNode[size][size];
  }

   /* inserts a new key into the set. Inserts it at the head of the linked list given by its hash value.
   */
  public void insert(double x, double y) {

    /*if (numelements == size) {
      //TODO: need to expand the hash table and rehash its contents. 
        Entry[] oldTable = table;
    int oldCapacity = oldTable.length;
    if (oldCapacity == MAXIMUM_CAPACITY) {
      threshold = Integer.MAX_VALUE;
      return;
    }
    }*/
	
    //Code for actual insert.
	int row = hash(x);
	int col = hash(y);
	table[row][col] = new PointNode(x,y, table[row][col]);
	
  }

   /* finds if a String key is present in the data structure. Returns true if found, else false.
   */
  public boolean find(double x, double y) {
	  
	  int row = hash(x);
	  int col = hash(y);
	
	for (PointNode curr = table[row][col]; curr != null; curr = curr.getNext())
		if (curr.getX() == x &&curr.getY() == y  ) return true;
	return false;
   
	
  }

   /* Prints the contents of the hash table.
   */
  public void print() {
    //not needed
  }

  /*
   * The hash function that returns the index into the hash table for a string k.
   */
  public int hash(double z) {
	  
    int h = 0;
	
	
	h = (int)(z*100);

	
	
	
    return h;
  }

}
