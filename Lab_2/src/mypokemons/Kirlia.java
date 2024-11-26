package mypokemons;

import mymoves.heatmore.ShadowClaw;
import mymoves.ralts.DisarmingVoice;
import ru.ifmo.se.pokemon.Type;

public class Kirlia extends Ralts {
    public Kirlia (String name, int level){
        super(name,level);
        super.setType(Type.FAIRY,Type.PSYCHIC);
        super.setStats(38,35,35,65,55,50);

        DisarmingVoice disarmingVoice = new DisarmingVoice(40,10000);
        super.addMove(disarmingVoice);

    }
}