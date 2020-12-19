package service;

import model.dayPlan.Case;
import model.dayPlan.DayPlan;

import java.util.Date;


public interface DayPlanFunctions {

    void addDayPlan(Date date);

    void editDate(Date newDate);

    void addCase(String content);

    void editCase(String newContent);

    void deleteCase(Case cas);

    void deleteDayPlan(DayPlan dayPlan);

    void save();
}
