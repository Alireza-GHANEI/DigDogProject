package ir.ac.kntu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class JavaFxApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        root.setStyle("-fx-border-width: 0 0 5 0;");
        Scene scene = new Scene(root, 800, 600, Color.rgb(198,100,15));

        for(int i=0;i<800;i+=50) {
            Line line = new Line(0, i, 800, i);
            root.getChildren().add(line);
        }
        for (double i=0;i<800;i+=66.6) {
            Line line1 = new Line(i, 0, i, 600);
            root.getChildren().add(line1);
        }
        stage.setScene(scene);
        stage.setTitle("DigDig");
        stage.initStyle(StageStyle.UTILITY);
        stage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }

}
