class Engine {
    boolean isOn;
//Program 1 
    void turnOn() {
        // initialize variable with value true
        isOn = true;
        System.out.println("Engine on? " + isOn);

    }

    void turnOff() {
        // initialize variable with value false
        isOn = false;
        System.out.println("Engine on? " + isOn);
    }
}


class Main {
    public static void main(String[] args) {
  
        // create objects l1 and l2
        Engine l1 = new Engine();
        Engine l2 = new Engine();
  
        // call methods turnOn() and turnOff()
        l1.turnOn();
        l2.turnOff();
    }
}

/* OUTPUT
Engine on? true                                                                                                                               
Engine on? false
*/
