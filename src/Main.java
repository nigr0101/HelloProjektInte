import sun.jvm.hotspot.HelloWorld;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{


    public Main(){

        add(new JLabel("HEj allihopa!"));

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }


    public static void main(String[] args) {
        System.out.println("Skall satsa på en master inom Abstrakta maskiner och formella språk!");
        System.out.println("självfallet eller master i trollkonst");
        System.out.println("master i TrolldrycksElixir på Hogwarts universitet");
        System.out.println("Hello from Erik");
        System.out.println("Eriks-branch");


        
    }

    private class Lyssnare implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){

        }
    }


}
