
import javax.swing.*;
import java.awt.*;

public class menu {
  public menu(){
    JFrame jFrame = new JFrame("Monster Hunter");
    jFrame.setBackground(Color.BLACK);
    
    JPanel jPanel = new JPanel(); 
    jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
    jPanel.setBackground(Color.BLACK);
    
    JLabel title = new JLabel("Monster Hunter");
    title.setForeground(Color.WHITE); // Set text color to white
    title.setFont(new Font("Verdana", Font.BOLD, 80)); 

    jPanel.add(Box.createRigidArea(new Dimension(0, 300))); //Adds line break

    JButton playButton = new JButton("Play");
    playButton.setForeground(Color.WHITE); // Set text color to white
    playButton.setBackground(Color.GRAY); 
    playButton.setBorderPainted(false);
    playButton.setFocusPainted(false);
    playButton.setPreferredSize(new Dimension(200, 50));
    
    JPanel playButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    playButtonPanel.setBackground(Color.BLACK);
    playButtonPanel.add(playButton);

    JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    titlePanel.setBackground(Color.BLACK);
    titlePanel.add(title);

    jPanel.add(titlePanel);

    jPanel.add(Box.createRigidArea(new Dimension(0, 100))); //Adds line break
    
    jPanel.add(playButtonPanel);

    jFrame.setSize(1500,1000);
    jFrame.setLocationRelativeTo(null);
    jFrame.setResizable(true);
    jFrame.add(jPanel);
    jFrame.setVisible(true);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
