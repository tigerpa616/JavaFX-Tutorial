import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application //extending Application allows us to get all the core functionality of javafx and be able to use it to our disposal. Basically we are inheriting Application so we can use all of its abilities
{
    Button buttonTest; //Makes a button, jeez catch up

    public static void main(String[] args){
        launch(args);//sets up our application as a javafx application, then it will call the method start
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //all code written in this method is what will become our javafx application
        primaryStage.setTitle("Title_of_the_Window"); //sets the title of the window, duh

        buttonTest = new Button(); //Makes a new Button
        buttonTest.setText("Don't Push"); //If you can't figure out what this is...

        StackPane layoutTest = new StackPane(); //Places the buttonTest in the middle of the stage(window)
        layoutTest.getChildren().add(buttonTest);

        Scene sceneTest = new Scene(layoutTest, 800, 600); //Sets the resolution of the scene as well as takes the layout made in layoutTest and applies it to the scene
        primaryStage.setScene(sceneTest); //Sets the Scene in the Stage, essentially loading it into the scene to be viewed as previously defined
        primaryStage.show(); //Just shows the stage, basically it 'shows' it to the user
    }
}
