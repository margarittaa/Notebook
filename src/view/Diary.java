package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Date;

import static view.MainPage.showMainPage;

public class Diary {

    public static  void showDiary(Stage stage){

        Button addNoteBtn = new Button("Добавить запись");
        addNoteBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        addNoteBtn.setOnAction(event -> addNote(stage));

        ObservableList<String> plans = FXCollections.observableArrayList("");
        ListView<String> listView = new ListView<String>(plans);
        listView.setPrefWidth(700);

        VBox vbox = new VBox(20, listView, addNoteBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Заметки");
    }

    public static void addNote(Stage stage) {
        Label dateLabel = new Label((new Date()).toString());
        TextField textField = new TextField();
        textField.setPrefWidth(700);
        textField.setPrefHeight(400);
        Button addBtn = new Button("Добавить запись");
        addBtn.setOnAction(event -> showNote(stage));
        addBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));

        VBox vbox = new VBox(50, dateLabel, textField, addBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Добавить запись");
    }

    public static void showNote(Stage stage) {
        Label dateLabel = new Label((new Date()).toString());
        Button deleteBtn = new Button("Удалить");
        Button editBtn = new Button("Редактировать");
        deleteBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        editBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        editBtn.setOnAction(event -> editNote(stage));

        TextField textField = new TextField();
        textField.setPrefWidth(600);
        textField.setPrefHeight(350);
        textField.setEditable(false);

        HBox hbox = new HBox(100, deleteBtn, editBtn);
        VBox vbox = new VBox(20, dateLabel, textField, hbox);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Просмотр записи");
    }

    public static void editNote(Stage stage) {
        Label dateLabel = new Label((new Date()).toString());
        Button saveBtn = new Button("Сохранить");
        saveBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        saveBtn.setOnAction(event -> showMainPage(stage));

        TextField textField = new TextField();
        textField.setPrefWidth(600);
        textField.setPrefHeight(350);
        textField.setEditable(true);

        VBox vbox = new VBox(20,dateLabel, textField, saveBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Редактировать запись");
    }
}
