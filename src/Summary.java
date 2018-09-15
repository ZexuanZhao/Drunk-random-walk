public class Summary {
    public static void main(String[] args) {
        int[] seqStep = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
        Summary summmary = new Summary();
        double[] distance = summmary.run(seqStep);
        for (int i = 0; i< distance.length; i++){
            System.out.println("#Steps="+seqStep[i]+" MeanDistance="+distance[i]);
        }
    }
    public double[] run(int[] seqStep){
        int numOfTests = 1000;
        double[] distance = new double[seqStep.length];
        for (int i=0; i<seqStep.length; i++){
            distance[i] = Test.test(numOfTests,seqStep[i]);
        }
        return distance;
    }

}
