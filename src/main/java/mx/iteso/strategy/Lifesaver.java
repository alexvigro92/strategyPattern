package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import mx.iteso.strategy.behaviors.impl.Floating;

public abstract class Lifesaver {

    public DeflateBehavior deflateBehavior;
    public FlotationBehavior flotationBehavior;
    public String type;

    public Lifesaver(){

    }
    public String PerformFloat(){return flotationBehavior.floating();}
    public String performDeflate() {return deflateBehavior.deflate();}
    public String performInflate() {return deflateBehavior.inflate();}
    public String display() {
        return "I'm a " + type;
    }
}
