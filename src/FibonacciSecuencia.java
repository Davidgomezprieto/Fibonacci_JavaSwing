import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FibonacciSecuencia {
    int num1 = 0;
    int num2 = 1;

    public FibonacciSecuencia() {

        JFrame ventana = new JFrame("Siguiente número");
        ventana.setSize(300, 100);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton boton = new JButton("Generar Fibonacci");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int siguienteNum = num1 + num2;
                System.out.println(siguienteNum);
                num1 = num2;
                num2 = siguienteNum;
            }
        });


        ventana.add(boton);


        ventana.setVisible(true);
    }
}
