package mypokemons;

import mymoves.phanpy.Confide;
import mymoves.ralts.DisarmingVoice;
import ru.ifmo.se.pokemon.Type;

final public class Gallade extends Kirlia {
    public Gallade (String name, int level){
        super(name,level);
        super.setType(Type.FIGHTING,Type.PSYCHIC);
        super.setStats(68,125,65,65,115,80);

        Confide confide = new Confide(0,0);
        super.addMove(confide);

    }
}