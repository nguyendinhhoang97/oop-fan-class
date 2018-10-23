public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void toeString() {
        if (this.getOn()) {
            System.out.println("Fan is on.");
            System.out.println("Fan is speed: " + this.getSpeed());
            System.out.println("Fan is color: " + this.getColor());
            System.out.println("Fan is radius: " + this.getRadius());
        } else {
            System.out.println("Fan is off.");
            System.out.println("Fan is color: " + this.getColor());
            System.out.println("Fan is radius: " + this.getRadius());

        }
    }
}
