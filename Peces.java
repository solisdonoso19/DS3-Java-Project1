import javax.swing.*;

class Peces {
    
    private JFrame ventana;
    
    private JButton btn_boton;
    
    void printBtn(){
        ventana = new JFrame("Crear Botones");
        ventana.setBounds(100,100,500,500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i=0; i<100;i++)
        {
            btn_boton = new JButton();
            btn_boton.setBounds(50+35*(i%10),40+35*(i/10),30,30);
            ventana.add(btn_boton);
        }

        ventana.setVisible(true);
    }
}