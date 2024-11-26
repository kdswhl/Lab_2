package mymoves.heatmore;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw(double pow, double acc) {
        super(Type.GHOST, pow, acc);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 1d/8d;
    }


}
