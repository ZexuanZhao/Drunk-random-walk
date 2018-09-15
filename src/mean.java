public class mean {
    public static double mean(double[] numbers){
        double length = numbers.length;
        double sum = 0;
        for (int i=0; i<length; i++){
            sum = sum + numbers[i];
        }
        return sum/length;
    }
}
