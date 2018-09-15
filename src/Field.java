public class Field {
    public Location[] loc ;
    int count = 0;
    public Field(int times){
        loc = new Location[times+1];
    }

    public void addlocation(Location newloc){
        loc[count] = newloc;
        count++;
    }

    public Location[] getpoints(){
        return loc;
    }

    public static Location[] runDrunk(String name, int times){
        Drunk guy = new Drunk(name);
        Walk walk = new Walk();
        Field field = new Field(times);

        Location origin = new Location(0,0);
        field.addlocation(origin);
        //System.out.println(name+" is set.");
        for (int i = 0; i<times; i++){
            Step step = walk.move(guy);
            Location newloc = Location.move(field.loc[i],step.getXY());
            field.addlocation(newloc);
            //System.out.println("x="+ newloc.getX()+" y="+ newloc.getY());
        }
        return field.loc;
    }
}
