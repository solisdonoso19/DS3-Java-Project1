import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class Peces implements ActionListener {
    private Integer Y = 0;
    private Integer X = 0;
    private JFrame ventana, mDialog;

    private JTextField txtIntentos, txtCardumen;

    private JButton btnBoton, btnReiniciar, btnTemporal;

    private JLabel norte, sur, este, oeste, noreste, noroeste, sureste, suroeste, pos_xy, esinfo;

    private Random cardumenInit;

    void printBtn() {

        ventana = new JFrame("Juegos de Pesca - DS3 UTP");
        ventana.setBounds(100, 100, 1000, 1000);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 100; i++) {
            btnBoton = new JButton(String.format("%02d", i));

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
        btnReiniciar.setBounds(280, 740, 150, 50);
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

        esinfo = new JLabel("Universidad Tecnologica de Panama");
        esinfo.setSize(250, 50);
        esinfo.setLocation(750, 50);
        ventana.add(esinfo);

        esinfo = new JLabel("Facultad de Sistemas Computacionales");
        esinfo.setSize(250, 50);
        esinfo.setLocation(750, 100);
        ventana.add(esinfo);

        esinfo = new JLabel("Licenciatura en Desarrollo de Software");
        esinfo.setSize(250, 50);
        esinfo.setLocation(750, 150);
        ventana.add(esinfo);

        esinfo = new JLabel("Desarrollo de Software III");
        esinfo.setSize(250, 50);
        esinfo.setLocation(750, 200);
        ventana.add(esinfo);

        esinfo = new JLabel("Carlos Solis");
        esinfo.setSize(100, 50);
        esinfo.setLocation(750, 250);
        ventana.add(esinfo);

        esinfo = new JLabel("6-723-1380");
        esinfo.setSize(100, 50);
        esinfo.setLocation(750, 300);
        ventana.add(esinfo);

        esinfo = new JLabel("Proyecto #1");
        esinfo.setSize(100, 50);
        esinfo.setLocation(750, 350);
        ventana.add(esinfo);

        cardumenInit = new Random();

        ventana.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        btnTemporal = (JButton) e.getSource();

        if (e.getSource() == btnReiniciar) {
            Y = cardumenInit.nextInt(10);
            X = cardumenInit.nextInt(10);
            String YY = String.valueOf(Y);
            String XX = String.valueOf(X);

            btnReiniciar.setText(String.valueOf("Reiniciar"));
            txtCardumen.setText(String.valueOf(YY + XX));
            txtIntentos.setText(String.valueOf("0"));

        }

        if (e.getSource() == btnTemporal) {
            String tmpesc = String.valueOf(Y) + String.valueOf(X);
            Integer esc = Integer.valueOf(tmpesc);
            String tmpescv = btnTemporal.getText();
            Integer escv = Integer.valueOf(tmpescv);

            String n = btnTemporal.getText();
            String[] num = n.split("(?<=.)");

            Integer YB = Integer.parseInt(num[0]);
            Integer XB = Integer.parseInt(num[1]);

            // NORTE
            if (X == XB && Y < YB) {
                mDialog = new JFrame();
                JOptionPane.showMessageDialog(mDialog, "El Cardumen esta mas al NORTE");

            }

            // SUR
            if (X == XB && Y > YB) {
                mDialog = new JFrame();
                JOptionPane.showMessageDialog(mDialog, "El Cardumen esta mas al SUR");

            }

            // OESTE
            if (Y == YB && X < XB) {
                mDialog = new JFrame();
                JOptionPane.showMessageDialog(mDialog, "El Cardumen esta mas al OESTE");

            }

            // ESTE
            if (Y == YB && X > XB) {
                mDialog = new JFrame();
                JOptionPane.showMessageDialog(mDialog, "El Cardumen esta mas al ESTE");

            }

            // NOROESTE
            if (X < XB && Y < YB) {
                mDialog = new JFrame();
                JOptionPane.showMessageDialog(mDialog, "El Cardumen esta mas al NOROESTE");

            }

            // NORESTE
            if (X > XB && Y < YB) {
                mDialog = new JFrame();
                JOptionPane.showMessageDialog(mDialog, "El Cardumen esta mas al NORESTE");

            }
            // SUROESTE
            if (Y > YB && X < XB) {
                mDialog = new JFrame();
                JOptionPane.showMessageDialog(mDialog, "El Cardumen esta mas al SUROESTE");

            }

            // SURESTE
            if (Y > YB && X > XB) {
                mDialog = new JFrame();
                JOptionPane.showMessageDialog(mDialog, "El Cardumen esta mas al SURESTE");

            }

            // WIN
            if (Y == YB && XB == X) {
                mDialog = new JFrame();
                JOptionPane.showMessageDialog(mDialog, "HAS GANADO!!! CAPTURASTE EL CARDUNMEN");
                Y = 0;
                X = 0;

                btnReiniciar.setText(String.valueOf("Reiniciar"));
                txtCardumen.setText(String.valueOf(Y + X));
                txtIntentos.setText(String.valueOf("0"));

            }

            if (((esc + 1) == escv) || ((esc + 9) == escv) || ((esc + 10) == escv) || ((esc + 11) == escv)
                    || ((esc - 1) == escv) || ((esc - 9) == escv) || ((esc - 10) == escv) || ((esc - 11) == escv)) {

                mDialog = new JFrame();
                JOptionPane.showMessageDialog(mDialog, "El Cardumen se ah movido de lugar, ESTUVISTE CERCA!");
                Y = cardumenInit.nextInt(10);
                X = cardumenInit.nextInt(10);
                String YY = String.valueOf(Y);
                String XX = String.valueOf(X);

                txtCardumen.setText(String.valueOf(YY + XX));
                txtIntentos.setText(String.valueOf("0"));

            }

            txtIntentos.setText(String.valueOf(Integer.parseInt(txtIntentos.getText()) + 1));
        }
    }
}