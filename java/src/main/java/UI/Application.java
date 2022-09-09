package UI;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Application extends javafx.application.Application {

    private final Label display = new Label("0");
    private final Button[] numberButton = new Button[4];
    private final Button plusButton = new Button("+");
    private final Button minusButton = new Button("-");
    private final Button multiplyButton = new Button("*");
    private final Button divideButton = new Button("/");
    private final Button clearButton = new Button("C");
    private final Button computeButton = new Button("=");
    private final Button squareButton = new Button ("^");
    private final Button squareRootButton = new Button("sqrt");

    @Override
    public void init() throws Exception {
        super.init();
        for (int i=0; i<4; i++) {
            numberButton[i] = new Button(String.valueOf(i));
        }
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(makeScene());
        primaryStage.show();
    }
    private Scene makeScene() {
        VBox vBox = new VBox();
        Parent dataEntryArea = createDataEntryControl();
        vBox.getChildren().addAll(display, dataEntryArea);
        return new Scene(vBox);
    }
    private Parent createDataEntryControl() {
        final Button[][] layout = {
                new Button[]{
                        numberButton[0], numberButton[1], plusButton, squareButton
                },
                new Button[] {
                        numberButton[2], numberButton[3], minusButton, squareRootButton
                },
                new Button[] {
                        computeButton,divideButton, multiplyButton, clearButton
                }
        };
        GridPane gridPane = new GridPane();
        for (int j=0; j<4; j++) {
            for (int i=0; i<3; i++) {
                Button button = layout[i][j];
                gridPane.add(button,j,i);
            }
        }
        return gridPane;
    }
}
