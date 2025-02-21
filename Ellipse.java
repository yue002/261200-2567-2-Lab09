public class Ellipse extends Shape{
    private double LSmajor_axis;
    private double LSminor_axis;

    public Ellipse(double LSmajor_axis,double LSminor_axis){
        this.LSmajor_axis = LSmajor_axis;
        this.LSminor_axis = LSminor_axis;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.LSmajor_axis * this.LSminor_axis;
    }
}
