package org.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.File;

public class SearchUI extends Application {

    private Label messageLabel;
    private TextField titleTextField;
    private Button searchButton;
    private BookManager bookManager;
    private Button readButton;


    public void createLayout(Stage primaryStage) {
        VBox layout = new VBox(10);
        BookManager manager = new BookManager();
        messageLabel = new Label("Enter a book title:");
        titleTextField = new TextField();
        searchButton = new Button("Search");
        searchButton.setOnAction(e -> BookInfo(primaryStage));
        // book manager contains stored books
        bookManager = manager;
        // window title
        primaryStage.setTitle("Search Books");
        layout.getChildren().addAll(messageLabel, titleTextField, searchButton);
        Scene scene = new Scene(layout, 500, 350);
        primaryStage.setScene(scene);
        // show stage
        primaryStage.show();
    }

    public void BookInfo(Stage primaryStage) {
        VBox layout = new VBox(10);
        String title = titleTextField.getText();
        Book book = bookManager.searchBooks(title);
        Label info = new Label("Book found:\nTitle: " + book.getBookTitle() +
                "\nPages: " + book.getNumberOfPages() + "\nDescription: " + book.getDescription() +
                "\nBook Type: " + book.isEbook());
        readButton = new Button("Read");
        // readButton.setOnAction(e-> openBook(title));
        layout.getChildren().addAll(info, readButton);
        primaryStage.setTitle(title);
        Scene scene = new Scene(layout,500, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /*
    public void openBook(String title) {
        Book book = bookManager.searchBooks(title);
        File file = FileChooser.

    }
    */


    @Override
    public void start(Stage stage) throws Exception {
        createLayout(stage);
    }

    public static void main(String[] args) {
        launch();
    }

}
