//Генератор данных. Есть кнопка, и текстовое поле  По нажатию кнопки генерируется небольшой пароль
package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DataGenerator extends JFrame {

    // примеры доп методов:
    public void GetPopularPsk() {}; // получение всех популярных паролей
    public void saveToFile(String[] passwords) {}; // сохранение паролей в файл

    public DataGenerator() {

        setBounds(300, 300, 300, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generator");
        setResizable(false);

        JButton jButton = new JButton("Сгенерировать пароль");
        JTextField jTextField = new JTextField();

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                String[] popularPsk = {"hello", "fine", "ok"};
                String result = "";

                result += popularPsk[random.nextInt(3)]; // добавление значения от 0 до 2
                result += random.nextInt(90) + 10; // так всегда будет 2 значное число прибавляться

                jTextField.setText(result);
            }
        });



        add(jButton, BorderLayout.NORTH);
        add(jTextField, BorderLayout.CENTER);

        setVisible(true);

    }
    public static void main(String[] args) {
        new DataGenerator();

    }
}
