package controller;

import model.diary.Diary;
import service.ListFunctions;

public class ListNotesController {

    private ListFunctions listFunctions;

    public void choicePage(){

    }

    public void showPage(){

    }

    public void addPage(){

    }

    public void addPage(Diary diary){

        listFunctions.addRosterItem(diary.toString());

    }

    public void showEntryPage(){

    }

}
