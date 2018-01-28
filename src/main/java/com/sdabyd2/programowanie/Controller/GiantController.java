package com.sdabyd2.programowanie.Controller;

import com.sdabyd2.programowanie.Model.Fatigue;
import com.sdabyd2.programowanie.Model.GiantModel;
import com.sdabyd2.programowanie.Model.Health;
import com.sdabyd2.programowanie.Model.Nourishment;
import com.sdabyd2.programowanie.View.GiantView;

import java.util.List;

public class GiantController {

    private List<GiantModel> giantModelList;
    private GiantView giantView;

    public  GiantController(List<GiantModel> giantModels,
                            GiantView giantView){

        this.giantModelList = giantModels;
        this.giantView = giantView;
    }

    public Health getHealth(int i){
        return giantModelList.get(i).getHealth();
    }

    public void setHealth(Health health, int i){
        this.giantModelList.get(i).setHealth(health);

    }

    public Fatigue getFatigue(int i){
        return  giantModelList.get(i).getFatigue();
    }

    public void setFatigue(Fatigue fatigue, int i){
        this.giantModelList.get(i).setFatigue(fatigue);
    }

    public Nourishment getNourishment(int i){
        return giantModelList.get(i).getNourishment();
    }

    public void setNourishment(Nourishment nourishment, int i){
        this.giantModelList.get(i).setNourishment(nourishment);
    }

    public void updateView (){

        this.giantView.displayGiant(giantModelList);
    }

}
