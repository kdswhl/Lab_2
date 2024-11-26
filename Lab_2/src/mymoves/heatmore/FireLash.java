package mymoves.heatmore;


import ru.ifmo.se.pokemon.*;

public class FireLash extends PhysicalMove {
    public FireLash(double pow, double acc) {
        super(Type.FIRE, pow, acc);

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        Effect e = new Effect().stat(Stat.DEFENSE,-2);
        p.addEffect(e);

    }


}
