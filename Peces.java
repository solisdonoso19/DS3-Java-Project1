import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class Peces implements ActionListener {

    private JFrame ventana;

    private JTextField txtIntentos, txtCardumen, prueba;

    private JButton btnBoton, btnReiniciar, btnTemporal;

    private JLabel norte, sur, este, oeste, noreste, noroeste, sureste, suroeste, pos_xy, esinfo;

    private  Random cardumenInit;

    void printBtn() {

        ventana = new JFrame("Juegos de Pesca - DS3 UTP");
        ventana.setBounds(100, 100, 1000, 1000);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 100; i++) {
            btnBoton = new JButton(String.valueOf(i));
            btnBoton.setBounds(115 + 55 * (i % 10), 115 + 55 * (i / 10), 50, 50);
            ventana.add(btnBoton);
            btnBoton.addActionListener(this);
        }

        for (int i = 1; i < 11; i++) {
            pos_xy = new JLabel(String.valueOf(i));
            pos_xy.setSize(50, 50);
            pos_xy.setLocation(95, 670 - 55 * i);
            ventana.add(pos_xy);
        }

        for (int i = 1; i < 11; i++) {
            pos_xy = new JLabel(String.valueOf(i));
            pos_xy.setSize(50, 50);
            pos_xy.setLocation(65 + 55 * i, 650);
            ventana.add(pos_xy);
        }

        btnReiniciar = new JButton(String.valueOf("Iniciar"));
        btnReiniciar.setBounds(250, 740, 150, 50);
        ventana.add(btnReiniciar);
        btnReiniciar.addActionListener(this);

        esinfo = new JLabel("Numero de intentos: ");
        esinfo.setSize(150, 50);
        esinfo.setLocation(30, 755);
        ventana.add(esinfo);

        txtIntentos = new JTextField("0");
        txtIntentos.setBounds(180, 770, 70, 20);
        ventana.add(txtIntentos);

        esinfo = new JLabel("Posicion del Cardumen: ");
        esinfo.setSize(180, 50);
        esinfo.setLocation(30, 730);
        ventana.add(esinfo);

        txtCardumen = new JTextField("");
        txtCardumen.setBounds(180, 745, 70, 20);
        ventana.add(txtCardumen);

        norte = new JLabel("Norte");
        norte.setSize(50, 50);
        norte.setLocation(370, 50);
        ventana.add(norte);

        sur = new JLabel("Sur");
        sur.setSize(50, 50);
        sur.setLocation(370, 680);
        ventana.add(sur);

        este = new JLabel("Este");
        este.setSize(50, 50);
        este.setLocation(680, 390);
        ventana.add(este);

        oeste = new JLabel("Oeste");
        oeste.setSize(50, 50);
        oeste.setLocation(30, 390);
        ventana.add(oeste);

        noreste = new JLabel("Noreste");
        noreste.setSize(50, 50);
        noreste.setLocation(680, 50);
        ventana.add(noreste);

        noroeste = new JLabel("Noroeste");
        noroeste.setSize(70, 50);
        noroeste.setLocation(30, 50);
        ventana.add(noroeste);

        sureste = new JLabel("Sureste");
        sureste.setSize(50, 50);
        sureste.setLocation(680, 680);
        ventana.add(sureste);

        suroeste = new JLabel("Suroeste");
        suroeste.setSize(70, 50);
        suroeste.setLocation(30, 680);
        ventana.add(suroeste);

        esinfo = new JLabel("Carlos Solis");
        esinfo.setSize(100, 50);
        esinfo.setLocation(750, 50);
        ventana.add(esinfo);

        esinfo = new JLabel("holas");
        esinfo.setSize(100, 50);
        esinfo.setLocation(750, 100);
        ventana.add(esinfo);

        prueba = new JTextField();
        prueba.setBounds(180, 790, 70, 20);
        ventana.add(prueba);

        cardumenInit = new Random();

        ventana.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == btnReiniciar){
        btnReiniciar.setText(String.valueOf("Reiniciar"));
        txtCardumen.setText(String.valueOf(cardumenInit.nextInt(10) + " " + cardumenInit.nextInt(10)));
        txtIntentos.setText(String.valueOf("0"));
    }

    btnTemporal = (JButton)e.getSource();
    String n = btnTemporal.getText();
    prueba.setText(String.valueOf(n));

    if(e.getSource() == btnBoton){
        
        char[] num = n.toCharArray();
        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        txtIntentos.setText(String.valueOf(Integer.parseInt(txtIntentos.getText())+1));
       }
    }
}