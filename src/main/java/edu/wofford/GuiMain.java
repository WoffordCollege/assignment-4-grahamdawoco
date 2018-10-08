package edu.wofford;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GuiMain extends JFrame implements ActionListener {

	JPanel p = new JPanel();
	JButton buttons[] = new JButton[9];
	JLabel label0 = new JLabel("",JLabel.LEFT);
	JLabel result = new JLabel("result",JLabel.CENTER);
	JLabel label2 = new JLabel("",JLabel.RIGHT);
	TicTacToeModel game = new TicTacToeModel();
	
    public void actionPerformed(ActionEvent event) {
		Object src = event.getSource();
		if (src == buttons[0] && game.getMarkAt(0,0) == TicTacToeModel.Mark.EMPTY&& game.getResult() == TicTacToeModel.Result.NONE){			
			if (game.XTurn){
				buttons[0].setText("X");
			}
			else {
				buttons[0].setText("O");
			}
			game.setMarkAt(0,0);
		}
		if (src == buttons[1]&& game.getMarkAt(0,1) == TicTacToeModel.Mark.EMPTY&& game.getResult() == TicTacToeModel.Result.NONE){			
			if (game.XTurn){
				buttons[1].setText("X");
			}
			else {
				buttons[1].setText("O");
			}
			game.setMarkAt(0,1);
		}
		if (src == buttons[2]&& game.getMarkAt(0,2) == TicTacToeModel.Mark.EMPTY&& game.getResult() == TicTacToeModel.Result.NONE){			
			if (game.XTurn){
				buttons[2].setText("X");
			}
			else {
				buttons[2].setText("O");
			}
			game.setMarkAt(0,2);
		}
		if (src == buttons[3]&& game.getMarkAt(1,0) == TicTacToeModel.Mark.EMPTY&& game.getResult() == TicTacToeModel.Result.NONE){			
			if (game.XTurn){
				buttons[3].setText("X");
			}
			else {
				buttons[3].setText("O");
			}
			game.setMarkAt(1,0);
		}
		if (src == buttons[4]&& game.getMarkAt(1,1) == TicTacToeModel.Mark.EMPTY&& game.getResult() == TicTacToeModel.Result.NONE){			
			if (game.XTurn){
				buttons[4].setText("X");
			}
			else {
				buttons[4].setText("O");
			}
			game.setMarkAt(1,1);
		}
		if (src == buttons[5]&& game.getMarkAt(1,2) == TicTacToeModel.Mark.EMPTY&& game.getResult() == TicTacToeModel.Result.NONE){			
			if (game.XTurn){
				buttons[5].setText("X");
			}
			else {
				buttons[5].setText("O");
			}
			game.setMarkAt(1,2);
		}
		if (src == buttons[6]&& game.getMarkAt(2,0) == TicTacToeModel.Mark.EMPTY&& game.getResult() == TicTacToeModel.Result.NONE){			
			if (game.XTurn){
				buttons[6].setText("X");
			}
			else {
				buttons[6].setText("O");
			}
			game.setMarkAt(2,0);
		}
		if (src == buttons[7]&& game.getMarkAt(2,1) == TicTacToeModel.Mark.EMPTY&& game.getResult() == TicTacToeModel.Result.NONE){			
			if (game.XTurn){
				buttons[7].setText("X");
			}
			else {
				buttons[7].setText("O");
			}
			game.setMarkAt(2,1);
		}
		if (src == buttons[8]&& game.getMarkAt(2,2) == TicTacToeModel.Mark.EMPTY&& game.getResult() == TicTacToeModel.Result.NONE){			
			if (game.XTurn){
				buttons[8].setText("X");
			}
			else {
				buttons[8].setText("O");
			}
			game.setMarkAt(2,2);
		}
		if(game.getResult() == TicTacToeModel.Result.XWIN){
			result.setText("X wins");}
		else if(game.getResult() == TicTacToeModel.Result.OWIN){
			result.setText("O wins");}
		else if(game.getResult() == TicTacToeModel.Result.TIE){
			result.setText("Tie");}
			
    }
    
    public GuiMain() {
        setTitle("Tic Tac Toe");
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE );
		p.setLayout(new GridLayout(4,3));
		
		

		buttons[0] = new JButton();
		buttons[0].setName("location00");
		buttons[0].addActionListener(this);
		p.add(buttons[0]);
		
		
		buttons[1] = new JButton();
		buttons[1].setName("location01");
		buttons[1].addActionListener(this);
		p.add(buttons[1]);
		
		buttons[2] = new JButton();
		buttons[2].setName("location02");
		buttons[2].addActionListener(this);
		p.add(buttons[2]);
		
		buttons[3] = new JButton();
		buttons[3].setName("location10");
		buttons[3].addActionListener(this);
		p.add(buttons[3]);
		
		buttons[4] = new JButton();
		buttons[4].setName("location11");
		buttons[4].addActionListener(this);
		p.add(buttons[4]);
		
		buttons[5] = new JButton();
		buttons[5].setName("location12");
		buttons[5].addActionListener(this);
		p.add(buttons[5]);
		
		buttons[6] = new JButton();
		buttons[6].setName("location20");
		buttons[6].addActionListener(this);
		p.add(buttons[6]);
		
		buttons[7] = new JButton();
		buttons[7].setName("location21");
		buttons[7].addActionListener(this);
		p.add(buttons[7]);
		
		buttons[8] = new JButton();
		buttons[8].setName("location22");
		buttons[8].addActionListener(this);
		p.add(buttons[8]);
		p.add(label0);p.add(result);p.add(label2);
		add(p);
    }

    
	public static void main(String[] args) {
	    GuiMain window = new GuiMain();
        window.setVisible(true);
	}
	
}