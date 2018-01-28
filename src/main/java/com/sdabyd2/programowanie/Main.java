package com.sdabyd2.programowanie;

import com.sdabyd2.programowanie.Controller.GiantController;
import com.sdabyd2.programowanie.Model.Fatigue;
import com.sdabyd2.programowanie.Model.GiantModel;
import com.sdabyd2.programowanie.Model.Health;
import com.sdabyd2.programowanie.Model.Nourishment;
import com.sdabyd2.programowanie.View.GiantView;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GiantModel giant1 = new GiantModel(Health.HEALTHY, Fatigue.YES, Nourishment.HUNGRY);
        GiantModel giant2 = new GiantModel(Health.SICK, Fatigue.SLEEPING, Nourishment.FULL);
        GiantModel giant3 = new GiantModel(Health.DEAD, Fatigue.NO, Nourishment.EATING);

        List<GiantModel> listOfGiants = new ArrayList<GiantModel>();

        listOfGiants.add(giant1);
        listOfGiants.add(giant2);
        listOfGiants.add(giant3);

        GiantView view = new GiantView();
        GiantController controller = new GiantController(listOfGiants, view);

        controller.updateView();

        controller.setFatigue(Fatigue.YES,0);
        controller.setNourishment();

        controller.updateView().Nourishment.
    }
}
