import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * Tictactoe
 */

public class TicTacToeGame extends MyJFrame {
    private static final Font BOLDFont = null;
    JPanel jPanel;
    ArrayList<JButton> buttons = new ArrayList<JButton>();;
    int Rows = 3, COLUMNS = 3;
    String currentPlayer = "x";
    Font font;

    public TicTacToeGame(){
        super("Tic Tac Toe Game");

        jPanel = new JPanel();
        // jPanel.setLayout(new BorderLayout());

        // jPanel.add(new JButton("OK"));
        // jPanel.add(new JButton("CANCLE"));

        jPanel.setLayout(new GridLayout(Rows, COLUMNS));
        font = new Font(Font.SERIF,Font.BOLD,100);


        jPanel.setLayout(new GridLayout(3,3));
        for (int i = 0; i < Rows * COLUMNS; i++){
            JButton btn = new JButton();
            btn.addActionListener(event -> ButtonClinked(event));
            btn.setFont(font);
            buttons.add(btn);
            jPanel.add(btn);
        }

        setContentPane(jPanel);
        setVisible(true);
    }

        public void ButtonClinked(ActionEvent event) {
            JButton btnClinked = ((JButton)event.getSource());
            btnClinked.setText(currentPlayer);
            btnClinked.setEnabled(false);


            if (currentPlayer == "x"){
                btnClinked.setBackground(Color.RED);
                currentPlayer = "0";

            }
            else{
                btnClinked.setBackground(Color.GREEN);
                currentPlayer = "x";


            }
        }

        public boolean CheckWinner(){
            //column1
            if (buttons.get(0).getText().equals(currentPlayer) && buttons.get(3).getText().equals(currentPlayer) && 
            buttons.get(6).getText().equals(currentPlayer)){
                return true;
            }

            //column2
            if (buttons.get(1).getText().equals(currentPlayer) && buttons.get(4).getText().equals(currentPlayer) && 
            buttons.get(7).getText().equals(currentPlayer)){
                return true;}

            //column3
            if (buttons.get(2).getText().equals(currentPlayer) && buttons.get(5).getText().equals(currentPlayer) && 
            buttons.get(8).getText().equals(currentPlayer)){
                return true;
            }
            return false;
        }

    }
    

