package de.uniheidelberg.badcode;

public class Circle implements Shape{
    private double radius;
    private double circumference;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double calculateCircumference() {
        return 2 * this.radius * Math.PI;
    }

    public double getRadius() {
        System.out.println("Get radius of" + this);
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String isRadiusValid(){
        if(this.radius < 0){
            return "NO: radius is negative.";
        }else if(radius == 0){
            return "NO: radius is zero.";
        }else{
            return "YES: seems fine to me";
        }
    }

    public void isBiggerThan(Circle circle){
        System.out.println(this.radius >  circle.getRadius());
    }

    public int equals(Circle circle){
        int isEqual = (this.radius == circle.getRadius()) ? 1 : 0;
        return isEqual;
    }

    public static String toString(Circle circle){
        return "The circle has a radius of " + circle.getRadius() + ".";
    }

}
