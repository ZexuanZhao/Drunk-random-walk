public class Test {
    public static void main(String[] args) {
        int numOfTests = 1000;
        int numOfSteps = 10;
        String[] names = new String[numOfTests];
        double[] distance = new double[numOfTests];
        for (int i = 0; i<numOfTests; i++){
            names[i] = "Allen" + i;
            double dist = Test.getDist(names[i], numOfSteps);
            distance[i] = dist;
        }
        System.out.println(mean.mean(distance));

    }
    public static double getDist(String name, int times){
        Location[] path = Field.runDrunk(name, times);
        Location finalloc = path[path.length-1];
        return finalloc.distanceFromOrigin();
    }

    public static double test(int numOfTests, int numOfSteps){
        String[] names = new String[numOfTests];
        double[] distance = new double[numOfTests];
        for (int i = 0; i<numOfTests; i++){
            names[i] = "Allen" + i;
            double dist = Test.getDist(names[i], numOfSteps);
            distance[i] = dist;
        }
        return mean.mean(distance);
    }
}
