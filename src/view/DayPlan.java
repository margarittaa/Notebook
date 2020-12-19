package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

import static view.MainPage.showMainPage;


public class DayPlan {

    public static  void showDayPlans(Stage stage){

        Button addDayPlanBtn = new Button("Добавить план дня");
        addDayPlanBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        addDayPlanBtn.setOnAction(event -> addDayPlan(stage));

        ObservableList<String> plans = FXCollections.observableArrayList("12.12.2020", "15.15.2020", "16.12.2020", "17.12.2020");
        ListView<String> listView = new ListView<String>(plans);
        listView.setPrefWidth(700);

        VBox vbox = new VBox(20, listView, addDayPlanBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Планы дней");

    }

    public static  void addDayPlan(Stage stage){
        Label dateLabel = new Label("Дата");
        TextField dateField = new TextField();
        Button addBtn = new Button("Добавить");
        addBtn.setOnAction(event -> showDayPlan(stage));
        addBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));

        HBox hbox = new HBox(20, dateLabel, dateField);
        VBox vbox = new VBox(50, hbox, addBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Планы дней");

    }

    public static  void showDayPlan(Stage stage){
        Button deleteBtn = new Button("Удалить");
        Button editBtn = new Button("Редактировать");
        deleteBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        editBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        editBtn.setOnAction(event -> editDayPlan(stage));

        ObservableList<String> plans = FXCollections.observableArrayList("Покушать", "Купить сырки", "Сдать лабу", "Выспаться");
        ListView<String> listView = new ListView<String>(plans);
        listView.setPrefWidth(700);

        HBox hbox = new HBox(100, deleteBtn, editBtn);
        VBox vbox = new VBox(20, listView, hbox);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("План дня");

    }

    public static  void editDayPlan(Stage stage){
        Button saveBtn = new Button("Сохранить");
        saveBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        saveBtn.setOnAction(event -> showMainPage(stage));

        ObservableList<String> plans = FXCollections.observableArrayList("Покушать", "Купить сырки", "Сдать лабу", "Выспаться");
        ListView<String> listView = new ListView<String>(plans);
        listView.setPrefWidth(700);
        listView.setEditable(true);

        VBox vbox = new VBox(20, listView, saveBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Редактировать план дня");
    }

}
