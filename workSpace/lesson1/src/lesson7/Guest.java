package lesson7;

public class Guest {
 private int id;
 private String name;
 private int numRoom;

public Guest(int id, String name, int numRoom) {
	super();
	this.id = id;
	this.name = name;
	this.numRoom = numRoom;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumRoom() {
	return numRoom;
}
public void setNumRoom(int numRoom) {
	this.numRoom = numRoom;
}
 
 

}
