package ch17.exam29;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class RootController implements Initializable {

   private Stage primaryStage;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void handleOpenFileChooser(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        //how2
       File file = fileChooser.showOpenDialog(primaryStage);
       System.out.println(file.getPath());
    }

    @FXML
    private void handleSaveFileChooser(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        //File file = fileChooser.showSaveDialog(((Button)event.getSource()).getScene().getWindow());
        Button button = (Button)event.getSource();
        Scene scene = button.getScene();
        Stage stage = (Stage)scene.getWindow();
       File file = fileChooser.showSaveDialog(stage);
       System.out.println(file.getPath());
    }

    @FXML
    private void handleDirectoryChooser(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showSaveDialog(primaryStage);
        System.out.println(file.getPath());
    }

    @FXML
    private void handlePopup(ActionEvent event) throws Exception  {
        //showNotification("알림","메세지가 왔습니다.");
        showNotification("경고","도둑이 침입했습니다.");
        
    }

    @FXML
    private void handleCustom(ActionEvent event) throws IOException {
        //showCustomDialog("help", "확인하셨습니까?");
         showCustomDialog("error", "네트워크 연결이 되지 않습니다.");
    }

    void setPrimaryStage(Stage primaryStage) {
       this.primaryStage = primaryStage;
    }

    private void showNotification(String type, String message) throws Exception{
        Popup popup = new Popup();
        HBox hbox = (HBox) FXMLLoader.load(getClass().getResource("popup.fxml"));
        Label lblMessage = (Label)hbox.lookup("#lblMessage");
        ImageView imgMessage = (ImageView)hbox.lookup("#imgMessage");
        if(type.equals("알림")){
            imgMessage.setImage(new Image(getClass().getResource("icon/dialog-info.png").toString()));
        }else if(type.equals("경고")){
            imgMessage.setImage(new Image(getClass().getResource("icon/dialog-warning.png").toString()));
        }
        lblMessage.setText(message);
        
        popup.getContent().add(hbox);
        popup.setAutoHide(true);
        popup.show(primaryStage);
    }
    private void showCustomDialog(String type, String message) throws IOException{
        Stage dialog = new Stage(StageStyle.UTILITY);
        Parent parent = FXMLLoader.load(getClass().getResource("custom-dialog.fxml"));
        
        ImageView icon = (ImageView)parent.lookup("#icon");
        Label lblMessage = (Label)parent.lookup("#message");
        Button btnOk = (Button)parent.lookup("#btnOk");
        
        if(type.equals("error")){
            icon.setImage(new Image(getClass().getResource("icon/dialog-error.png").toString()));
        }else if(type.equals("help")){
            icon.setImage(new Image(getClass().getResource("icon/dialog-help.png").toString()));
        }else if(type.equals("info")){
            icon.setImage(new Image(getClass().getResource("icon/dialog-info.png").toString()));
        }else if(type.equals("warning")){
            icon.setImage(new Image(getClass().getResource("icon/dialog-warning.png").toString()));
        }
        
        lblMessage.setText(message);
        
        btnOk.setOnAction(e->dialog.hide());
        
        Scene scene = new Scene(parent);
        dialog.setScene(scene);
        dialog.initOwner(primaryStage);
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.show();
    }
}
