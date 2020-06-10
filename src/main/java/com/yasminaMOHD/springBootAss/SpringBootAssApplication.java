package com.yasminaMOHD.springBootAss;

import com.sun.org.apache.bcel.internal.generic.LUSHR;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAssApplication extends Application{

	public static void main(String[] args) {
            launch(args);
//		SpringApplication.run(SpringBootAssApplication.class, args);
	}

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader load =new FXMLLoader(getClass().getResource("/fxmlFiles/jpa.fxml"));
        load.setControllerFactory(SpringApplication.run(SpringBootAssApplication.class)::getBean);
        Pane pane=load.load();
        Scene s=new Scene(pane);
        primaryStage.setTitle("jpa with spring boot");
        primaryStage.setScene(s);
        primaryStage.show();
    }

}
