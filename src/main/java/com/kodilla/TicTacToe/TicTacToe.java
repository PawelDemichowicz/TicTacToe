import com.kodilla.TicTacToe.Empty;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_BLUEPeer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javax.swing.text.Position;

public class TicTacToe extends Application {

    private Image imageback = new Image("file:resources/image1.gif");
    private Image cross = new Image("file:resources/cross.png", 200, 200, false, false);
    private Image circle = new Image("file:resources/circle.png", 200, 200, false, false);
    private Image empty = new Image("file:resources/empty.png", 200, 200, false, false);
    private FlowPane pieces1 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pieces2 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pieces3 = new FlowPane(Orientation.HORIZONTAL);

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(600, 600, false, false, false, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(0, 0, 0, 0));
        grid.setHgap(50);
        grid.setVgap(50);
        grid.setBackground(background);

        ImageView img0 = new ImageView(cross);
        ImageView img1 = new ImageView(cross);
        ImageView img2 = new ImageView(cross);
        ImageView img3 = new ImageView(cross);
        ImageView img4 = new ImageView(cross);
        ImageView img5 = new ImageView(cross);
        ImageView img6 = new ImageView(cross);
        ImageView img7 = new ImageView(cross);
        ImageView img8 = new ImageView(cross);
        pieces1.getChildren().add(img0);
        pieces1.getChildren().add(img1);
        pieces1.getChildren().add(img2);
        pieces2.getChildren().add(img3);
        pieces2.getChildren().add(img4);
        pieces2.getChildren().add(img5);
        pieces3.getChildren().add(img6);
        pieces3.getChildren().add(img7);
        pieces3.getChildren().add(img8);

        //pieces.setOnMouseClicked();

        grid.add(pieces1, 0, 0, 3, 1);
        grid.add(pieces2, 0, 1, 3, 1);
        grid.add(pieces3, 0, 2, 3, 1);


        Scene scene = new Scene(grid, 700, 700, Color.BLACK);

        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}