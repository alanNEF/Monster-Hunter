import javax.swing.*;
import java.awt.*;

public class menu {
  public menu(){
    JFrame jFrame = new JFrame("Monster Hunter");
    JPanel jPanel = new JPanel(); 
    jFrame.setSize(1500,1000);
    jFrame.setLocationRelativeTo(null);
    jFrame.setResizable(false);
    jFrame.setVisible(true);
    jFrame.setBackground(Color.BLACK);
    jFrame.add(jPanel);
    jPanel.setBackground(Color.BLACK);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
