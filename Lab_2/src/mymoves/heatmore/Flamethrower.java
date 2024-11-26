package mymoves.heatmore;

import Lab_2.Program;
import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower (double pow, double acc) {
        super(Type.FIRE, pow, acc);

    }

    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Program.chance(0.1)){
            Effect.burn(p);
        }

    }


}
