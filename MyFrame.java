import javax.swing.JFrame;

public class MyFrame extends JFrame{
    public MyFrame(String title){
        super(title);
        setSize(1000, 1000);
        setLocation(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
