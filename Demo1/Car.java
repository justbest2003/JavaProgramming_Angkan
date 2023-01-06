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
        rainbowCar.color = "rainbow";
        rainbowCar.model ="Unicon";

        System.out.println("Car size : " + rainbowCar.size);
        System.out.println("Car color : " + rainbowCar.color);
        System.out.println("Car model : " + rainbowCar.model);
    }

    /* Methods */
    
	public static void moveForward(){
		System.out.println("moveForward");
    }
    public static void moveBackward(){
		System.out.println("moveBackward");
    }
    public static void stop(){
		System.out.println("stop");
    }
    public static void turnOnLight(){
		System.out.println("turnOnLight");
    }
    public static void turnOffLight(){
		System.out.println("turnOffLight");
    }
}