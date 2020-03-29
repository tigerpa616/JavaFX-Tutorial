import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>
//extending Application allows us to get all the core functionality of javafx and be able to use it to our disposal. Basically we are inheriting Application so we can use all of its abilities
//implementing the EventHandler, which basically means when the button is clicked (ActionEvent) something will happen
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
        buttonTest.setOnAction(this);//whenever button is clicked the code that does stuff is 'this'

        StackPane layoutTest = new StackPane(); //Places the buttonTest in the middle of the stage(window)
        layoutTest.getChildren().add(buttonTest);

        Scene sceneTest = new Scene(layoutTest, 800, 600); //Sets the resolution of the scene as well as takes the layout made in layoutTest and applies it to the scene
        primaryStage.setScene(sceneTest); //Sets the Scene in the Stage, essentially loading it into the scene to be viewed as previously defined
        primaryStage.show(); //Just shows the stage, basically it 'shows' it to the user
    }

    @Override
    public void handle(ActionEvent event) {
        //Method that will be called whenever the button is clicked. Whenever the button is clicked it will be known as an event
        if(event.getSource() == buttonTest) { //if the button being pressed is buttonTest then if statement is true
            System.out.println("I told you not to push the button!");
        }
    }
}
