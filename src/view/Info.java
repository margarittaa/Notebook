package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Date;

import static view.MainPage.showMainPage;

public class Info {

    public static  void showInfoPage(Stage stage){
        Label loginLabel = new Label("Логин");
        TextField loginField = new TextField();
        Label passwordLabel = new Label("Пароль");
        TextField passwordField = new TextField();
        Label fioLabel = new Label("ФИО");
        TextField fioField = new TextField("фио");
        Label emailLabel = new Label("email");
        TextField emailField = new TextField("mail@gmail.com");
        Label phoneLabel = new Label("Телефон");
        TextField phoneField = new TextField("+3753331231234");

        Button editBtn = new Button("Редактировать");
        editBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));

        Label labels[] = {loginLabel, passwordLabel, fioLabel, emailLabel, phoneLabel};
        TextField textFields[] = {loginField, passwordField, fioField, emailField, phoneField};

        VBox labelsBox = new VBox(30);
        VBox textFieldsBox = new VBox(20);

        for(Label label : labels ){
            labelsBox.getChildren().add(label);
        }

        for(TextField field : textFields ){
            field.setEditable(false);
            textFieldsBox.getChildren().add(field);
        }

        VBox vbox = new VBox(20, new HBox(20, labelsBox, textFieldsBox), editBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Личная информация");

        editBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event1) {
                for(TextField field : textFields ){
                    field.setEditable(true);
                }
                editBtn.setText("Сохранить");
                stage.setTitle("Редактирование личной информации");
                editBtn.setOnAction(event -> showMainPage(stage));
            }
        });
    }
}
