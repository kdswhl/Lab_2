package mymoves.phanpy;


import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    private int C= 0;
    public Confide(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (p.getStat(Stat.SPECIAL_ATTACK)>=-5) {
            super.applyOppEffects(p);
            Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
            p.addEffect(e);
        }

    }


}
