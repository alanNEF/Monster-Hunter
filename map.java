

import javax.swing.*;
import java.awt.*;

public class map {
  JFrame mapFrame;

  public map(){
    mapFrame = new JFrame("Monster Hunter");
    mapFrame.setBackground(Color.BLACK);
    mapFrame.setLayout(null);
    mapFrame.setSize(1500,1000);
    mapFrame.setLocationRelativeTo(null);
    mapFrame.setResizable(true);
    mapFrame.setVisible(true);
    mapFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void addItem(character x){
    mapFrame.add(x.getCharacter());
  }
}
