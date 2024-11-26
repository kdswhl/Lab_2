package mymoves.ralts;


import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DisarmingVoice extends SpecialMove {
    public DisarmingVoice (double pow, double acc) {
        super(Type.FIRE, pow, acc);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }



}
