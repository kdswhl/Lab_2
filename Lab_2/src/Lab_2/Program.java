package Lab_2;

import mypokemons.*;
import ru.ifmo.se.pokemon.*;

public class Program {
    public static void main(String[] args) {


        Battle b = new Battle();
        Pokemon p1 = new Gallade("Pokem1", 1);
        Pokemon p2 = new Kirlia("Pokem2", 1);
        Pokemon p3 = new Donphan("Pokem3",1);
        Pokemon p4 = new Ralts("Pokem4",1);
        Pokemon p5 = new Phanpy("Phanpy",1);
        Pokemon p6 = new Heatmor("Pokem6",1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
    public static boolean chance(double d){ // для подсчета шанса выполнения
        return d > Math.random();
    }
}
