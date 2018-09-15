import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;

public class Walk {

    public  Step move (Drunk guy){
        Step step1 = new Step(1,0);
        Step step2 = new Step(-1,0);
        Step step3 = new Step(0,1);
        Step step4 = new Step(0,-1);
        Step[] steps ={step1, step2, step3, step4};
        return steps[(int)(Math.random()*steps.length)];
    }

    public Step move (MasochistDrunk guy){
        Step step1 = new Step(1,0);
        Step step2 = new Step(-1,0);
        Step step3 = new Step(0,0.9);
        Step step4 = new Step(0,-0.9);
        Step[] steps ={step1, step2, step3, step4};
        return steps[(int)(Math.random()*4)];
    }

}
