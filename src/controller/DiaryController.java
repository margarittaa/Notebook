package controller;

import model.diary.Diary;
import service.DiaryFunctions;

public class DiaryController {

    private DiaryFunctions diaryFunctions;

    public void choicePage(){

    }

    public void showPage(){

    }

    public void addPage(){

    }

    public void addPage(Diary diary){
        diaryFunctions.addEntry(diary.toString());
    }

    public void showEntryPage(){

    }
}
