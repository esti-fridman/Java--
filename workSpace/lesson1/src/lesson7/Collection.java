package lesson7;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection {
	
	static HashMap<Integer,ArrayList<Guest>> hootel= new HashMap<>();
	
 public static void addGuest(Guest g) {
	 
	 if(hootel.get(g.getNumRoom())==null) {
		 ArrayList<Guest>room=new ArrayList<>();
		 room.add(g);
		 hootel.put(g.getNumRoom(),room);
	 }
	 else {
		(hootel.get(g.getNumRoom())).add(g);
	 }
	 
	 
 }
	
 public static void displayGuest() {
	 for(HashMap<Integer,ArrayList<Guest>> G:hootel.values() )
	 {
		 int sum+=g. 
	 }
 }
	public static void Main(String []args) {
	     Guest g1=new Guest(1,"Eti",515);
	     Guest g2=new Guest(2,"chani",515);
	     addGuest(g1);
	     addGuest(g2);
	     
		
	}
}
