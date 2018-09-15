import static java.lang.Math.sqrt;

public class Location {
    private  double x;
    private  double y;

    public  Location(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static Location move(Location preLoc, double deltaX, double deltaY){
        double nowX = preLoc.getX() + deltaX;
        double nowY = preLoc.getY() + deltaY;
        Location nowLoc = new Location(nowX, nowY);
        return nowLoc;
    }

    public static Location move(Location preLoc, double[] step){
        double nowX = preLoc.getX() + step[0];
        double nowY = preLoc.getY() + step[1];
        Location nowLoc = new Location(nowX, nowY);
        return nowLoc;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distanceFrom(Location a, Location b){
        double xDist = a.getX() - b.getX();
        double yDist = a.getY() - b.getY();
        return sqrt(xDist*xDist + yDist*yDist);
    }
    public double distanceFromOrigin(){
        double xDist = this.x;
        double yDist = this.y;
        return sqrt(xDist*xDist + yDist*yDist);
    }
}
