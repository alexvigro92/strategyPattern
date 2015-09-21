package mx.iteso;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.lifesavers.*;

public class JamaiconSportsLifesaversMain {
        public static void main (String[] args) {
            Lifesaver swimRing = new SwimRing();
            Lifesaver swimSeat = new SwimSeat();
            Lifesaver armBands = new ArmBands();
            Lifesaver foamFloats = new FoamFloats();
            Lifesaver lifesaversCandies = new LifesaversCandies();
            Lifesaver lifeVest = new LifeVest();
            Lifesaver swimBelts = new SwimBelts();
            Lifesaver waterTubes = new WaterTubes();

            System.out.println(swimRing.display());
            System.out.println(swimRing.performDeflate());
            System.out.println(swimRing.performInflate());
            System.out.println(swimRing.PerformFloat());

            System.out.println();

            System.out.println(waterTubes.display());
            System.out.println(waterTubes.performDeflate());
            System.out.println(waterTubes.performInflate());
            System.out.println(waterTubes.PerformFloat());

            System.out.println();

            System.out.println(swimBelts.display());
            System.out.println(swimBelts.performDeflate());
            System.out.println(swimBelts.performInflate());
            System.out.println(swimBelts.PerformFloat());

            System.out.println();

            System.out.println(lifeVest.display());
            System.out.println(lifeVest.performDeflate());
            System.out.println(lifeVest.performInflate());
            System.out.println(lifeVest.PerformFloat());


            System.out.println();

            System.out.println(lifesaversCandies.display());
            System.out.println(lifesaversCandies.performDeflate());
            System.out.println(lifesaversCandies.performInflate());
            System.out.println(lifesaversCandies.PerformFloat());

            System.out.println();

            System.out.println(swimSeat.display());
            System.out.println(swimSeat.performDeflate());
            System.out.println(swimSeat.performInflate());
            System.out.println(swimSeat.PerformFloat());

            System.out.println();

            System.out.println(armBands.display());
            System.out.println(armBands.performDeflate());
            System.out.println(armBands.performInflate());
            System.out.println(armBands.PerformFloat());

            System.out.println();

            System.out.println(foamFloats.display());
            System.out.println(foamFloats.performDeflate());
            System.out.println(foamFloats.performInflate());
            System.out.println(foamFloats.PerformFloat());
        }
}
