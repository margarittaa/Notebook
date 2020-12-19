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

import static view.MainPage.showMainPage;

public class Roster {
    public static  void showRosters(Stage stage){

        Button addDayPlanBtn = new Button("Добавить список");
        addDayPlanBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        addDayPlanBtn.setOnAction(event -> addRoster(stage));

        ObservableList<String> plans = FXCollections.observableArrayList("Продукты");
        ListView<String> listView = new ListView<String>(plans);
        listView.setPrefWidth(700);

        VBox vbox = new VBox(20, listView, addDayPlanBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Списки");

    }

    public static  void addRoster(Stage stage){
        Label nameLabel = new Label("Название");
        TextField nameField = new TextField();
        Button addBtn = new Button("Добавить");
        addBtn.setOnAction(event -> showRoster(stage));
        addBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));

        HBox hbox = new HBox(20, nameLabel, nameField);
        VBox vbox = new VBox(50, hbox, addBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Добавить список");

    }

    public static  void showRoster(Stage stage){
        Button deleteBtn = new Button("Удалить");
        Button editBtn = new Button("Редактировать");
        deleteBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        editBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        editBtn.setOnAction(event -> editRoster(stage));

        ObservableList<String> plans = FXCollections.observableArrayList("сырки", "шоколадка", "хлеб", "сырки");
        ListView<String> listView = new ListView<String>(plans);
        listView.setPrefWidth(700);

        HBox hbox = new HBox(100, deleteBtn, editBtn);
        VBox vbox = new VBox(20, listView, hbox);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Список");

    }

    public static  void editRoster(Stage stage){
        Button saveBtn = new Button("Сохранить");
        saveBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        saveBtn.setOnAction(event -> showMainPage(stage));

        ObservableList<String> plans = FXCollections.observableArrayList("сырки", "шоколадка", "хлеб", "сырки");
        ListView<String> listView = new ListView<String>(plans);
        listView.setPrefWidth(700);
        listView.setEditable(true);

        VBox vbox = new VBox(20, listView, saveBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Редактировать список");
    }
}
