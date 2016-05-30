package GUI;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import logic.Calculator;

public class FXMLController implements Initializable{

    @FXML
    private TextField cwworth;

    @FXML
    private Button screwed;

    @FXML
    private Text twooneresult;

    @FXML
    private Text firstresult;

    @FXML
    private Text twotwo;

    @FXML
    private Text pass;

    @FXML
    private Text twotworesult;

    @FXML
    private Text twoone;

    @FXML
    private TextField cwpercent;

    @FXML
    private Text first;

    @FXML
    private Text passresult;

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void screwed(javafx.scene.input.MouseEvent event) {
        String scww  = cwworth.getText();
        String scwp = cwpercent.getText();
        Double cww = Double.parseDouble(scww);
        Double cwp = Double.parseDouble(scwp);
        
        String answerfirst = Calculator.getMin(70, cwp, cww);
        first.setText("First (70%)");
        firstresult.setText(answerfirst);
        
        String answertwoone = Calculator.getMin(60, cwp, cww);
        twoone.setText("2.1 (60%)");
        twooneresult.setText(answertwoone);
        
        String answertwotwo = Calculator.getMin(50, cwp, cww);
        twotwo.setText("2.2 (50%)");
        twotworesult.setText(answertwotwo);
        
        String answerpass = Calculator.getMin(40, cwp, cww);
        pass.setText("Pass (40%)");
        passresult.setText(answerpass); 
        
    }

}
