package controller;

import model.dayPlan.DayPlan;
import service.DayPlanFunctions;

import java.util.Date;

public class DayPlanController {

    private DayPlanFunctions dayPlanFunctions;

    public void choicePage(){

    }

    public void showDayPlanPage(){

    }

    public void addDayPlanPage(){
        dayPlanFunctions.addDayPlan(new Date());
    }

    public void addDayPlanPage(DayPlan dayPlan){
        dayPlanFunctions.addCase(dayPlan.toString());
    }
}
