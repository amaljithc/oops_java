class Room
{
int roomno;
double roomarea;
String roomtype;
Room()
{
	roomno=0;
	roomarea=0.0;
	roomtype="not assigned";
}
Room(int r,double area,String type)
{
	roomno=r;
	roomarea=area;
	roomtype=type;
}
void display()
{
	System.out.println("room no:"+roomno+" room area :"+roomarea+"sqft"+" room type :"+roomtype);
}
}
class Mainroom
{
	public static void main(String[] args)
	{
		Room ob1=new Room();
		Room ob2=new Room(12,1500,"double");
		ob1.display();
		ob2.display();
	}
}
