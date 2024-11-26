package mymoves.phanpy;


import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class SP extends SpecialMove {
    public SP (double pow, double acc) {
        super(Type.FIRE, pow, acc);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.freeze(p);
    }


}
