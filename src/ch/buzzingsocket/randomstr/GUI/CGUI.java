package ch.buzzingsocket.randomstr.GUI;

import ch.buzzingsocket.randomstr.Service.CRandomizer;

import javax.swing.*;
import java.awt.*;

public class CGUI extends JFrame {

    private static String OS = System.getProperty("os.name").toLowerCase();

    private CRandomizer randomizer;

    private CPassword cpw;



    public CGUI() {
        intiGUI();
        initComponents();

        setVisible(true);
    }


    private void intiGUI() {


        setMinimumSize(new Dimension(650, 300));
        setSize(new Dimension(750, 400));
        setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


    }

    private void initComponents() {

        CPassword cpw = new CPassword();

        JTabbedPane tabs = new JTabbedPane();


        tabs.addTab("Password", cpw);

    }


}
