public class Step {
    private double x;
    private double y;
    public Step(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double[] getXY(){
        double[] point = new double[]{x,y};
        return point;
    }
}
