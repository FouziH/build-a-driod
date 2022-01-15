public class Droid {

    String name;
    int batteryLevel;
     public Droid(String droidName) {

         name = droidName;
         batteryLevel = 100;

    }
    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public static void main(String[] args) {

        Droid cody = new Droid("Cody");
        System.out.println(cody);

    }
}