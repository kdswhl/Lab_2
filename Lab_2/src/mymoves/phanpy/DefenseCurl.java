package mymoves.phanpy;

import ru.ifmo.se.pokemon.*;

public class DefenseCurl extends StatusMove {
    public DefenseCurl(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if (p.getStat(Stat.DEFENSE)<=5) {
            super.applySelfEffects(p);
            Effect e = new Effect().stat(Stat.DEFENSE, 1);
            p.addEffect(e);
        }
    }


}