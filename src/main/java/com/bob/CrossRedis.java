package com.bob;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CrossRedis extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(new Scene(root, 300, 275));
		primaryStage.show();

//		// 主面板
//		BorderPane root = new BorderPane();
//
//		// 导航栏
//		final Menu helpMenu = new Menu("Help");
//
//		MenuBar menuBar = new MenuBar();
//		menuBar.getMenus().addAll(helpMenu);
//		menuBar.setUseSystemMenuBar(true);
//
//		root.setTop(menuBar);
//
//		// 左侧边栏-数据库
//		VBox dbCol = new VBox();
//		JFXButton button = new JFXButton("TEST");
//		Button button1 = new Button("TEST2");
//
//		dbCol.getChildren().addAll(button, button1);
//		root.setLeft(dbCol);
//
//		Scene scene = new Scene(root, 800, 600);
//
//		Image icon = new Image("image/icons/icon.jpeg");
//		primaryStage.getIcons().add(icon);
//
//		primaryStage.setMinWidth(600);
//		primaryStage.setMinHeight(400);
//		primaryStage.setTitle("crossRedis");
//		primaryStage.setScene(scene);
//
//		primaryStage.show();
	}

}
