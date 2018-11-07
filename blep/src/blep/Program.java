package blep;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program extends JFrame {
    // Skapa statiska variabler
    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;
    private static final String TITLE = "Luffarschack";

    private static final int BOARD_COLS = 3;
    private static final int BOARD_ROWS = 3;

    // Skapa global variabel för fönstret
    private JFrame window;

    /*
        Skapa variabel för nuvarande spelare
        Spelare 1 = X
        Spelare 2 = O
        Spelare 1 startar alltid;
    */
    private int CurrentPlayer = 1;

    private String[] players = new String[]{ "X", "O" };

    private List<String> board = new ArrayList<>(Arrays.asList(
            "", "", "",
            "", "", "",
            "", "", ""
    ));

    private List<JButton> buttons;

    public Program(){
        initUi();
    }

    private void initUi(){
        window = new JFrame();
        window.setSize(WIDTH, HEIGHT);
        window.setTitle(TITLE);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttons = new ArrayList<>();

        JPanel container = new JPanel();
        container.setLayout(new GridLayout(3,3));

        Font font = new Font("Arial", Font.BOLD, 50);

        for(int i=0; i < (BOARD_COLS*BOARD_ROWS); i++){
            JButton button = new JButton(board.get(i));
            button.setFont(font);
            button.setName(((Integer)i).toString());
            button.addActionListener(this::actionPreformed);
            container.add(button);

            buttons.add(button);
        }

        window.add(container);
        window.setLayout(new GridLayout(1, 0));
        window.setVisible(true);
    }

    public void actionPreformed(ActionEvent e){
        JButton button = (JButton) e.getSource();
        String name = button.getName();

        handleClick(CurrentPlayer, Integer.parseInt(name));
    }

    private void handleClick(int player, int tile){
        if(tile <= 9 && tile >= 0){
            if(player == 1 && buttons.get(tile).getText() != "O"){
                board.set(tile, "X");
                buttons.get(tile).setText("X");
            }else if (player == 2 && buttons.get(tile).getText() != "X"){
                board.set(tile, "O");
                buttons.get(tile).setText("O");
            }
        }

        checkBoard();

        if (CurrentPlayer == 1){
            CurrentPlayer = 2;
        }else if(CurrentPlayer == 2){
            CurrentPlayer = 1;
        }

        System.out.println(board);
    }

    private void checkBoard(){
        boolean isFull = true;

        for(int i=0; i<board.size(); i++){
            if(board.get(i) == ""){
                isFull = false;
                break;
            }
        }

        if(isFull){
            gameOver(0);
        }else{
            for(int i = 0; i < BOARD_ROWS; i++) {
                if(board.get(i) == players[CurrentPlayer - 1] && board.get(i + BOARD_COLS) == players[CurrentPlayer - 1] && board.get(i + (BOARD_COLS * 2)) == players[CurrentPlayer - 1]) {
                    gameOver(CurrentPlayer);
                }

                if(board.get(i * 3) == players[CurrentPlayer - 1] && board.get(i * 3 + 1) == players[CurrentPlayer - 1] && board.get(i * 3 + 2) == players[CurrentPlayer - 1]) {
                    gameOver(CurrentPlayer);
                }

                if(i == 0) {
                    if (board.get(i) == players[CurrentPlayer - 1] && board.get(i + 4) == players[CurrentPlayer - 1] && board.get(i + 4 * 2) == players[CurrentPlayer - 1]) {
                        gameOver(CurrentPlayer);
                    }
                }

                if(i == 2) {
                    if (board.get(i) == players[CurrentPlayer - 1] && board.get(i + 2) == players[CurrentPlayer - 1] && board.get(i + 2 * 2) == players[CurrentPlayer - 1]) {
                        gameOver(CurrentPlayer);
                    }
                }
            }
        }
    }

    private void gameOver(int winner){
        System.out.println(winner);
        char winnerChar;
        final int optionPane;

        String[] options = new String[2];
        options[0] = new String("Starta om");
        options[1] = new String("Stäng");

        if(winner == 0){
            optionPane = JOptionPane.showOptionDialog(
                    window.getContentPane(),
                    "Game over!",
                    "Game over!",
                    0,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    null
            );
        }else {
            optionPane = JOptionPane.showOptionDialog(
                    window.getContentPane(),
                    "Grattis spelare " + ((Integer)winner).toString() + "!",
                    "Game over!",
                    0,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    null
            );
        }

        if(optionPane == JOptionPane.YES_OPTION){ // Starta om
            restartGame();
        }else if(optionPane == JOptionPane.NO_OPTION){ // Stäng av
            System.exit(0);
        }else if(optionPane == JOptionPane.CLOSED_OPTION){ //Starta om
            restartGame();
        }
    }

    private void restartGame(){
        for(int i=0; i<board.size(); i++){
            board.set(i, "");
        }

        for(int i=0; i<buttons.size(); i++){
            buttons.get(i).setText("");
        }
    }

    public static void main(String[] args){
        Program program = new Program();
    }
}
