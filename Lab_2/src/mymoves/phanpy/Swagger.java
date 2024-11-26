package mymoves.phanpy;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.confuse(p);
        if (p.getStat(Stat.ATTACK)<=5) {
            Effect e = new Effect().stat(Stat.ATTACK, 2);
            p.addEffect(e);
        }

    }


}