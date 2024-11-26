package mypokemons;

import mymoves.heatmore.*;
import mymoves.phanpy.Confide;
import mymoves.phanpy.DefenseCurl;
import mymoves.phanpy.SP;
import mymoves.phanpy.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Phanpy extends Pokemon {
    public Phanpy(String name, int level){
        super(name,level);
        super.setType(Type.GROUND);
        super.setStats(90,60,60,40,40,40);

        Confide confide = new Confide(0,100);
        DefenseCurl defenseCurl = new DefenseCurl(0,100);
        Swagger swagger = new Swagger(0,85);
        SP sp = new SP(10,10);
        super.setMove(confide,defenseCurl,swagger,sp);

    }
}