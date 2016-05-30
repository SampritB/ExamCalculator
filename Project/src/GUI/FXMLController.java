package GUI;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

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

    @FXML
    void screwed(MouseEvent event) {
        String scww  = cwworth.getText();
        String scwp = cwpercent.getText();
        int cww = Integer.parseInt(scww);
        int cwp = Integer.parseInt(scwp);
        
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
