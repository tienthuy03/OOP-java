//****************************************
public class a {

	public static void main(String[] args) {
		
		// abstract =  	abstract(truu tuong) classes cannot be instantiated(taophienban,khoitao), but they can have a subclass
		//				abstract methods are declared without an implementation(gian tiep,trien khai)
        //  tao lop bao ve cho code
		
		//Vehicle vehicle = new Vehicle(); cant instant when the astract class declare
		Car car = new Car();
		
		car.go();
	}
}
//****************************************
abstract class Vehicle {
	
	abstract void go();// cause abstract methods are declared without an implementation(gian tiep,trien khai) (body is unnecessary)
}
//****************************************
class Car extends Vehicle{

	@Override
	void go() {
		System.out.println("The driver is driving the car");
		
	}
}
//****************************************