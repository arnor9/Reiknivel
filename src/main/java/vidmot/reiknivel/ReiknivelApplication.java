package vidmot.reiknivel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ReiknivelApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ReiknivelApplication.class.getResource("reiknivel-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 350);
        stage.setTitle("Reiknivél");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
