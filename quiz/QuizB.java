
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class QuizB extends Application{
    double a = 0;
    double b = 0;
    double c = 0;
    double answer =0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane base = new BorderPane();
        HBox numberPane = new HBox();
        numberPane.setSpacing(10);
        numberPane.setAlignment(Pos.CENTER);

        Label sidea = new Label("side a ");
        TextField tfsidea = new TextField();

        Label sideb = new Label("side b ");
        TextField tfsideb = new TextField();
        
        Label sidec = new Label("side c ");
        TextField tfsidec = new TextField();
        TextField tfresults = new TextField();
        
        numberPane.getChildren().addAll(
                sidea, tfsidea,
                sideb, tfsideb,
                sidec, tfsidec ,tfresults);

        Button btArea = new Button("area");
        btArea.setOnAction(e -> {  
            double s = (Double.parseDouble(tfsidea.getText()) + Double.parseDouble(tfsideb.getText())
                    +Double.parseDouble(tfsidec.getText()))/2;
            
            double area = s*((s-Double.parseDouble(tfsidea.getText()))*(s-Double.parseDouble(tfsideb.getText()))
                    *(s-Double.parseDouble(tfsidec.getText())));
            answer = Math.pow(area, 0.5);
            
            tfresults.setText("area = "+answer + " ");
        });

        Button btperimeter = new Button("perimeter");
        btperimeter.setOnAction(e -> {
            
            answer = (Double.parseDouble(tfsidea.getText()) + Double.parseDouble(tfsideb.getText())
                    +Double.parseDouble(tfsidec.getText()));
            tfresults.setText("perimeter = "+answer + "");
        });
      

        HBox operatorsPane = new HBox();
        operatorsPane.setSpacing(10);
        operatorsPane.setAlignment(Pos.CENTER);
        operatorsPane.getChildren().addAll(btArea, btperimeter);

        BorderPane borderPane = new BorderPane(numberPane);
        BorderPane.setMargin(numberPane, new Insets(10, 10, 10, 10));

        borderPane.setBottom(operatorsPane);
        BorderPane.setMargin(operatorsPane, new Insets(10, 10, 10, 10));
        primaryStage.setScene(new Scene(borderPane, borderPane.getPrefWidth(),borderPane.getPrefWidth()));
        primaryStage.setTitle("quiz b ");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}


