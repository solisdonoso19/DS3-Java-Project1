import javax.swing.*;

class Peces {

    private JFrame ventana;

    private JTextField txtIntentos, txtCardumen;

    private JButton btnBoton, btnReiniciar;

    private JLabel norte, sur, este, oeste, noreste, noroeste, sureste, suroeste, pos_xy, esinfo;

    void printBtn() {
        ventana = new JFrame("Juegos de Pesca - DS3 UTP");
        ventana.setBounds(100, 100, 1000, 1000);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 100; i++) {
            btnBoton = new JButton(String.valueOf(i));
            btnBoton.setBounds(115 + 55 * (i % 10), 115 + 55 * (i / 10), 50, 50);
            ventana.add(btnBoton);
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

        esinfo = new JLabel("Numero de intentos: ");
        esinfo.setSize(120, 50);
        esinfo.setLocation(30, 750);
        ventana.add(esinfo);

        txtIntentos = new JTextField();
        txtIntentos.setBounds(180, 20, 30, 20);
        ventana.add(txtIntentos);

        esinfo = new JLabel("Posicion del Cardumen: ");
        esinfo.setSize(180, 50);
        esinfo.setLocation(30, 730);
        ventana.add(esinfo);

        txtCardumen = new JTextField();
        txtCardumen.setBounds(180, 25, 30, 20);
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

        ventana.setVisible(true);

    }
}