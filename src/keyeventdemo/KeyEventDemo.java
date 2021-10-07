/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyeventdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.UP;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author chris
 */
public class KeyEventDemo extends Application {
    
    Text texto = new Text(20,20,"A");
    
    @Override
    public void start(Stage primaryStage) {
        texto.setFocusTraversable(true);
        
        texto.setOnKeyPressed(new EventHandler<KeyEvent>() {
            
            @Override
            public void handle(KeyEvent e) {
                switch(e.getCode())
                {
                    case UP:
                        texto.setY(texto.getY()-10);
                        break;
                    case DOWN:
                        texto.setY(texto.getY()+10);
                        break;
                    case LEFT:
                        texto.setX(texto.getX()-10);
                        break;
                    case RIGHT:
                        texto.setX(texto.getX()+10);
                        break;
                    default:
                        texto.setText(e.getText());
                        break;
                }
            }
        });
        
        Pane root = new Pane();
        root.getChildren().add(texto);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Key Event");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
