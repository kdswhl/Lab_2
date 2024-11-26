package mypokemons;

import mymoves.heatmore.Body_Slam;
import mymoves.heatmore.FireLash;
import mymoves.heatmore.Flamethrower;
import mymoves.ralts.ShadowBall;
import mymoves.ralts.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon {
    public Ralts(String name, int level){
        super(name,level);
        super.setType(Type.FIRE,Type.PSYCHIC);
        super.setStats(28,25,25,45,35,40);

        ShadowBall shadowBall = new ShadowBall(80,100);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        super.setMove(shadowBall,doubleTeam);

    }
}
