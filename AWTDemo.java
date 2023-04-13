package Java_Practice;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTDemo extends Frame {
	AWTDemo() {
		Frame f = new Frame();
		TextField t = new TextField();
		t.setBounds(50, 150, 200, 30);
		TextArea area = new TextArea();
		area.setBounds(50, 250, 500, 300);
		Button b = new Button("Send");
		b.setBounds(280, 150, 50, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chat = t.getText();
				area.append("You: " + chat + " \n");
				t.setText("");
			}
		});
		f.add(t);
		f.add(area);
		f.add(b);
		f.setSize(600, 600);
		f.setTitle("TextU");
		f.setLayout(null);
		f.setVisible(true);
		f.setBackground(Color.gray);

	}

	public static void main(String args[]) {
		Neeraj n = new Neeraj();
	}
}
