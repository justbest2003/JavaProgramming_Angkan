public class Car {
    /* Attribute */
    public int size;
    public String color;
    public String model;

    /* Main Method */
    public static void main(String[] args) {
        // moveForward();
        // moveBackward();
        // stop();
        // turnOnLight();
        // turnOffLight();
        Car rainbowCar = new Car();
        rainbowCar.size = 999;
        rainbowCar.color = "Rainbow";
        rainbowCar.model ="Unicon";

        Car whiteCar = new Car();
        whiteCar.size = 888;
        whiteCar.color = "White";
        whiteCar.model ="Aboutyou";

        System.out.println("Car size : " + rainbowCar.size);
        System.out.println("Car color : " + rainbowCar.color);
        System.out.println("Car model : " + rainbowCar.model);
        rainbowCar.turnOnLight();

        System.out.println("Car size : " + whiteCar.size);
        System.out.println("Car color : " + whiteCar.color);
        System.out.println("Car model : " + whiteCar.model);
        whiteCar.turnOffLight();
    }

    /* Methods */
    
	public void moveForward(){
		System.out.println(this.color + "moveForward");
    }
    public void moveBackward(){
		System.out.println("moveBackward");
    }
    public void stop(){
		System.out.println("stop");
    }
    public void turnOnLight(){
		System.out.println(this.color + " : turnOnLight");
    }
    public void turnOffLight(){
		System.out.println(this.color + " : turnOffLight");
    }
}