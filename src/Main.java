public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");

        fan2.setOn(false);
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");

        System.out.println(fan1.toString());
        fan2.toeString();

    }
}