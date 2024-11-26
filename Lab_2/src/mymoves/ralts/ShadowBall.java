package mymoves.ralts;

import Lab_2.Program;
import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall (double pow, double acc) {
        super(Type.GHOST, pow, acc);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Program.chance(0.2) && p.getStat(Stat.SPECIAL_DEFENSE)<=5){
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE,-1);
            p.addEffect(e);
        }

    }


}
