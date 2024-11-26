package mypokemons;

import mymoves.heatmore.ShadowClaw;
import mymoves.phanpy.ThunderFang;
import ru.ifmo.se.pokemon.Type;
final public class Donphan extends Phanpy {
    public Donphan (String name, int level){
        super(name,level);
        super.setType(Type.GROUND);
        super.setStats(90,120,120,60,60,50);

        ThunderFang thunderFang= new ThunderFang(85,100);
        super.addMove(thunderFang);

    }
}
