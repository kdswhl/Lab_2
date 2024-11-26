package mymoves.heatmore;

import Lab_2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Body_Slam extends PhysicalMove {
    public Body_Slam(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Program.chance(0.3)){
            Effect.paralyze(p);
        }

    }


}
