package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import static view.MainPage.showMainPage;

public class StartPage {

    public static void showStartPage(Stage stage){
        Button logInBtn = new Button("Войти в аккаунт");
        logInBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        logInBtn.setOnAction(event -> showLogInPage(stage));

        Button registerBtn = new Button("Зарегистрироваться");
        registerBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        registerBtn.setOnAction(event -> showRegisterPage(stage));

        VBox vbox = new VBox(20,logInBtn, registerBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Стартовая страница");
    }

    public static void showLogInPage(Stage stage){
        Label loginLabel = new Label("Логин");
        TextField loginField = new TextField();
        Label passwordLabel = new Label("Пароль");
        TextField passwordField = new TextField();

        Button logInBtn = new Button("Войти");
        logInBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        logInBtn.setOnAction(event -> showMainPage(stage));

        VBox vbox = new VBox(20,
                new HBox(20, new VBox(30, loginLabel, passwordLabel), new VBox(20, loginField, passwordField)),
                logInBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Авторизация");
    }

    public static void showRegisterPage(Stage stage){
        Label loginLabel = new Label("Логин");
        TextField loginField = new TextField();
        Label passwordLabel = new Label("Пароль");
        TextField passwordField = new TextField();
        Label fioLabel = new Label("ФИО");
        TextField fioField = new TextField();
        Label emailLabel = new Label("email");
        TextField emailField = new TextField();
        Label phoneLabel = new Label("Телефон");
        TextField phoneField = new TextField();

        Button registerBtn = new Button("Создать аккаунт");
        registerBtn.setPadding(new Insets(10.0, 20.0, 10.0, 20.0));
        registerBtn.setOnAction(event -> showStartPage(stage));

        VBox labels = new VBox(30, loginLabel, passwordLabel, fioLabel, emailLabel, phoneLabel);
        VBox textFields = new VBox(20, loginField, passwordField, fioField, emailField, phoneField);
        VBox vbox = new VBox(20, new HBox(20, labels, textFields), registerBtn);
        vbox.setAlignment(Pos.CENTER);

        FlowPane pane = new FlowPane(vbox);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Регистрация");
    }
}
