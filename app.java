//maybe by elijah gonzalez, created september 21st 2024.

//we import all the things that we will need for circle creation, as well as mouse detection. for what the code does, read the next comment.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

//this is the class that we use to draw a circle, and when the mouse is pressed, the circle will turn black. when the mouse is released, the circle will be white.
public class app extends Application {

    @Override
    public void start(Stage primaryStage) {
        //we use a pane to hold the circle inside of, which is a window
        Pane pane = new Pane();

        //we create a circle at the coordinates of 125 125, with a radius of 75px. 
        Circle circle = new Circle(125, 125, 75);

        //we fill the circle and make it white, this is the color of the starting circle. we could make it blue, if we wanted. 
        //once the mouse is pressed, we'd never see the circle to be blue again however. that's because...
        circle.setFill(Color.WHITE);
        
        //whenever the mouse is pressed down, an event occurs. which is the color of the circle being filled to black, so whenever the mouse is pressed, and is being held down, the circle
        //shows up
        circle.setOnMousePressed(event -> {
            circle.setFill(Color.BLACK);
        });

        //and once the mouse button is released, the circle changes back to white. making it look like it dissapeared, but that's because its a white object on a white background.
        circle.setOnMouseReleased(even -> {
            circle.setFill(Color.WHITE);
        });

        //we add the circle to the pane so the viewer will be able to see it.
        pane.getChildren().add(circle);

        //we create our scene, and set our window size.
        Scene scene = new Scene(pane, 250, 250);

        //set the title, scene, then show the viewer. i titled it this because it was like a magic circle appearing once the button was clicked.
        primaryStage.setTitle("Click and be amazed");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //and this runs everything!
    public static void main(String[] args) {
        launch(args);
    }
}
