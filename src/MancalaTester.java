import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.swing.*;

public class MancalaTester {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mancala");
		frame.setSize(400, 400);
		frame.setLayout(new BorderLayout());

		JLabel playerB = new JLabel("<-- Player B");
		JLabel playerA = new JLabel("Player A -->");
		JButton undo = new JButton("Undo");

		JLabel m1 = new JLabel("<html>M<br>A</br><br>N</br><br>C</br><br>A</br><br>L</br><br>A<br><br> B</br></html>");
		JLabel m2 = new JLabel("<html>M<br>A</br><br>N</br><br>C</br><br>A</br><br>L</br><br>A<br><br> A</br></html>");

		JPanel north = new JPanel();
		north.add(playerB);
		north.add(undo);
		frame.add(north, BorderLayout.NORTH); // playerB and undo button

		JPanel south = new JPanel();
		south.add(playerA);
		frame.add(south, BorderLayout.SOUTH); // player A

		JLabel b = new JLabel("      B6          B5          B4          B3          B2         B1");
		JButton b6 = new JButton();
		b6.setPreferredSize(new Dimension(50, 50));
		JButton b5 = new JButton();
		b5.setPreferredSize(new Dimension(50, 50));
		JButton b4 = new JButton();
		b4.setPreferredSize(new Dimension(50, 50));
		JButton b3 = new JButton();
		b3.setPreferredSize(new Dimension(50, 50));
		JButton b2 = new JButton();
		b2.setPreferredSize(new Dimension(50, 50));
		JButton b1 = new JButton();
		b1.setPreferredSize(new Dimension(50, 50));

		JPanel centerTop1 = new JPanel();
		centerTop1.setLayout(new BorderLayout());
		centerTop1.add(b, BorderLayout.NORTH);

		JPanel centerTop2 = new JPanel();
		centerTop2.add(b6);
		centerTop2.add(b5);
		centerTop2.add(b4);
		centerTop2.add(b3);
		centerTop2.add(b2);
		centerTop2.add(b1);

		centerTop1.add(centerTop2, BorderLayout.SOUTH);

		JLabel a = new JLabel("      A1         A2          A3         A4          A5         A6");
		JButton a6 = new JButton();
		a6.setPreferredSize(new Dimension(50, 50));
		JButton a5 = new JButton();
		a5.setPreferredSize(new Dimension(50, 50));
		JButton a4 = new JButton();
		a4.setPreferredSize(new Dimension(50, 50));
		JButton a3 = new JButton();
		a3.setPreferredSize(new Dimension(50, 50));
		JButton a2 = new JButton();
		a2.setPreferredSize(new Dimension(50, 50));
		JButton a1 = new JButton();
		a1.setPreferredSize(new Dimension(50, 50));

		JPanel centerBottom1 = new JPanel();
		centerBottom1.setLayout(new BorderLayout());
		centerBottom1.add(a, BorderLayout.SOUTH);

		JPanel centerBottom2 = new JPanel();
		centerBottom2.add(a6);
		centerBottom2.add(a5);
		centerBottom2.add(a4);
		centerBottom2.add(a3);
		centerBottom2.add(a2);
		centerBottom2.add(a1);

		centerBottom1.add(centerBottom2, BorderLayout.NORTH);

		JPanel center = new JPanel();
		center.setLayout(new BorderLayout());
		center.add(centerTop1, BorderLayout.NORTH); // B6,B5,B4,B3,B3,B1 and corresponding square button
		center.add(centerBottom1, BorderLayout.SOUTH); // A1,A2,A3,A4,A5,A6 and corresponding square button

		JButton mB = new JButton(); // mancala B button
		JButton mA = new JButton(); // mancala A button
		mB.setPreferredSize(new Dimension(50, 100));
		mA.setPreferredSize(new Dimension(50, 100));

		JPanel board = new JPanel(); // mancala board
		board.setLayout(new BorderLayout());
		board.add(center, BorderLayout.CENTER);
		board.add(mB, BorderLayout.WEST);
		board.add(mA, BorderLayout.EAST);
		board.setBorder(new LineBorder(Color.RED, 1, true));

		JPanel centerAll = new JPanel(); // mancala board and labels
		centerAll.setLayout(new BorderLayout());
		centerAll.add(board, BorderLayout.CENTER);
		centerAll.add(m1, BorderLayout.WEST);
		centerAll.add(m2, BorderLayout.EAST);

		frame.add(centerAll, BorderLayout.CENTER);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}