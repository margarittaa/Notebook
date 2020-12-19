package controller;

import model.diary.Diary;
import service.RosterFunctions;

public class RosterController {

    private RosterFunctions rosterFunctions;

    public void choicePage(){

    }

    public void showPage(){

    }

    public void addPage(){

    }

    public void addPage(Diary diary){
        rosterFunctions.addRoster(diary.toString());
    }

    public void showEntryPage(){

    }
}
