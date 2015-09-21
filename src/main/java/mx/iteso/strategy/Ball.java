package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.CrashBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;

public abstract class Ball {

    public BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public CrashBehavior crashBehavior;
    public String type;

    public Ball() {
    }

    public void setBounceBehavior(BounceBehavior bounceBehavior){this.bounceBehavior = bounceBehavior;}

    public String getbounceBehavior(){return this.bounceBehavior.bounce();}

    public String roll() {
        return type + " is rolling!";
    }

  //  public String performBounce() {
     //   return bounceBehavior.bounce();
    //}

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {return deflateBehavior.inflate();}

    public String PerformCrash() {
        return crashBehavior.crash();
    }

}
