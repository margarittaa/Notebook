package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static view.DayPlan.showDayPlans;
import static view.Diary.showDiary;
import static view.Info.showInfoPage;
import static view.Notes.showNotes;
import static view.Roster.showRosters;
import static view.StartPage.showStartPage;

public class MainPage {
    public static void showMainPage(Stage stage){
        Button infoBtn = new Button("Личная информация");
        infoBtn.setOnAction(event -> showInfoPage(stage));
        Button rosterBtn = new Button("Списки");
        rosterBtn.setOnAction(event -> showRosters(stage));
        Button diaryBtn = new Button("Дневник");
        diaryBtn.setOnAction(event -> showDiary(stage));
        Button notesBtn = new Button("Заметки");
        notesBtn.setOnAction(event -> showNotes(stage));
        Button dayPlanBtn = new Button("Планы дней");
        dayPlanBtn.setOnAction(event -> showDayPlans(stage));
        Button exitBtn = new Button("Выйти из аккаунта");
        exitBtn.setOnAction(event -> showStartPage(stage));

        Button buttons[] = {infoBtn, rosterBtn, diaryBtn, notesBtn, dayPlanBtn, exitBtn};

        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);

        for(Button button : buttons){
            button.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
            vbox.getChildren().add(button);
        }

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Главная");
    }
}
