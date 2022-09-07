package sample.musicui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.musicui.model.DataSource;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Parent root = loader.load();
        HelloController controller = loader.getController();
        controller.listArtists();

        stage.setTitle("Music Database");
        stage.setScene(new Scene(root, 800, 600));
        stage.show();

//        HelloController controller = fxmlLoader.getController();
//        controller.listArtists();
//
//        stage.setTitle("Music Database");
//        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
//        stage.setScene(scene);
//        stage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        if(!DataSource.getInstance().open()){
            System.out.println("FATAL ERROR: Couldn't connect to database");
            Platform.exit();
        }
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        DataSource.getInstance().close();
    }

    public static void main(String[] args) {
        launch();
    }
}

//S19: Section 19 completed!