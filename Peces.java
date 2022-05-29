import javax.swing.*;

class Peces {
    
    private JFrame ventana;
    
    private JButton btn_boton;

    private JLabel norte, sur, este, oeste, noreste, noroeste, sureste, suroeste;
    
    void printBtn(){
        ventana = new JFrame("Juegos de Pesca - DS3 UTP");
        ventana.setBounds(100,100,600,600);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i=0; i<100;i++)
        {
            btn_boton = new JButton(String.valueOf(i));
            btn_boton.setBounds(115+35*(i%10),115+35*(i/10),30,30);
            ventana.add(btn_boton);
        }

        norte = new JLabel("Norte");
        norte.setSize(50,50);
        norte.setLocation(280, 50);
        ventana.add(norte);

        sur = new JLabel("Sur");
        sur.setSize(50,50);
        sur.setLocation(280, 480);
        ventana.add(sur);

        este = new JLabel("Este");
        este.setSize(50,50);
        este.setLocation(480, 250);
        ventana.add(este);

        oeste = new JLabel("Oeste");
        oeste.setSize(50,50);
        oeste.setLocation(30, 250);
        ventana.add(oeste);

        noreste = new JLabel("Noreste");
        noreste.setSize(50,50);
        noreste.setLocation(480, 50);
        ventana.add(noreste);

        noroeste = new JLabel("Noroeste");
        noroeste.setSize(70,50);
        noroeste.setLocation(30, 50);
        ventana.add(noroeste);

        sureste = new JLabel("Sureste");
        sureste.setSize(50,50);
        sureste.setLocation(480, 480);
        ventana.add(sureste);

        suroeste = new JLabel("Suroeste");
        suroeste.setSize(70,50);
        suroeste.setLocation(30, 480);
        ventana.add(suroeste);


        ventana.setVisible(true);
    }
}