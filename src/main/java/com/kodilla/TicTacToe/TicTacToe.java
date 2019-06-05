import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    private Image imageback = new Image("resources/image1.gif");
    private Image cross = new Image("resources/cross.png");
    private Image circle = new Image("resources/circle.png");
    private Image empty = new Image("resources/empty.png");
    private FlowPane pieces = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(400, 400, false, false, false, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(0, 0, 0, 0));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView img = new ImageView(cross);
        pieces.getChildren().add(img);

        grid.add(pieces, 0, 0, 3, 3);

        Scene scene = new Scene(grid, 600, 600, Color.BLACK);

        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}