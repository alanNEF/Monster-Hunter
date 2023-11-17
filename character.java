
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
public class character {
  JPanel character;
  int y =0, x = 0;
  public character(){
    character = new JPanel();
    character.setBackground(Color.GREEN);
    character.setBounds(x,y,50,50);
  }

  public void moveCharacterInput(KeyEvent event){
    int keyCode = event.getKeyCode();
    if(keyCode == KeyEvent.VK_W){
      y+=4;
    }
    if(keyCode == KeyEvent.VK_A){
      x-=4;
    }
    if(keyCode == KeyEvent.VK_S){
      x+=4;
    }
    if(keyCode == KeyEvent.VK_D){
      y-=4;
    }
  }

  public JPanel getCharacter() {
    return character;
  }
}
