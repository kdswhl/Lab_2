package mymoves.ralts;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if (p.getStat(Stat.EVASION)<=5) {
            super.applyOppEffects(p);
            Effect e = new Effect().stat(Stat.EVASION, 1);
            p.addEffect(e);
        }
    }


}
