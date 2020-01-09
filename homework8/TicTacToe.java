package geekbrains.homework1.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    class TicTacToe extends JFrame {

        final String TITLE_OF_PROGRAM = "Tic Tac Toe";
        final int WINDOW_SIZE = 330;
        final int WINDOW_DX = 7;
        final int WINDOW_DY = 55;
        final int FIELD_SIZE = 3;
        final int CELL_SIZE = WINDOW_SIZE / FIELD_SIZE;
        final String BTN_INIT = "New game";
        final String BTN_EXIT = "Exit";

        Panel panel = new Panel();
        Field field = new Field(FIELD_SIZE, CELL_SIZE);
        Human human = new Human(field.getHumanDot());
        AI ai = new AI(field.getAIDot());

        public static void main(String args[]) {
            new TicTacToe();
        }

        TicTacToe() {
            setTitle(TITLE_OF_PROGRAM);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(WINDOW_SIZE + WINDOW_DX, WINDOW_SIZE + WINDOW_DY);
            setLocationRelativeTo(null); // to the center
            setResizable(false);

            panel.setBackground(Color.white);
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    super.mouseReleased(e);
                    human.turn(e.getX()/CELL_SIZE, e.getY()/CELL_SIZE, field, ai);
                    panel.repaint();
                    if (field.isGameOver())
                        JOptionPane.showMessageDialog(
                                TicTacToe.this, field.getGameOverMsg());
                }
            });
            JButton init = new JButton(BTN_INIT);
            init.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.init();
                    panel.repaint();
                }
            });
            JButton exit = new JButton(BTN_EXIT);
            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            JPanel panelBtn = new JPanel();
            panelBtn.setLayout(new GridLayout()); // for panel of buttons
            panelBtn.add(init);
            panelBtn.add(exit);

            setLayout(new BorderLayout()); // for main window
            add(panelBtn, BorderLayout.SOUTH);
            add(panel, BorderLayout.CENTER);
            setVisible(true);
        }

        class Panel extends JPanel { // for painting
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                field.paint(g);
            }
        }
}
