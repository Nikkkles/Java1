//ПРИЛОЖЕНИЕ СЧЕТЧИКА. Две кнопки: + и -
package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {

    int count = 0;

    public App() {
        setBounds(300, 300, 300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Counter");
        setResizable(false);

        JLabel counter = new JLabel("0");
        JButton minus = new JButton("Меньше");
        JButton plus = new JButton("Больше");

        Font font = new Font("Arial", Font.BOLD, 32);
        counter.setFont(font);
        counter.setHorizontalAlignment(SwingConstants.CENTER);

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                counter.setText(String.valueOf(count));
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                counter.setText(String.valueOf(count));
            }
        });

        add(minus, BorderLayout.WEST);
        add(plus, BorderLayout.EAST);
        add(counter, BorderLayout.CENTER);

        setVisible(true);


    }

    public static void main(String[] args) {
        new App();
    }
}
