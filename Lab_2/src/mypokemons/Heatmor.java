package mypokemons;

import mymoves.heatmore.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final public class Heatmor extends Pokemon {
    public Heatmor(String name, int level){
        super(name,level);
        super.setType(Type.FIRE);
        super.setStats(85,97,66,105,66,65);

        Body_Slam body_slame = new Body_Slam(85,100);
        Flamethrower flamethrower = new Flamethrower(90,100);
        FireLash fireLash = new FireLash(80,100);
        ShadowClaw shadowClaw = new ShadowClaw(85,100);
        super.setMove(body_slame,flamethrower,fireLash,shadowClaw);

    }
}
