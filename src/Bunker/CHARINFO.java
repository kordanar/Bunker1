package Bunker;

import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.io.PrintWriter;

public class CHARINFO extends javax.swing.JFrame {

    public CHARINFO() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Bunker Character Generator");

        jLabel2.setText("Name");

        jLabel3.setText("Gender");

        jLabel4.setText("Age");

        jLabel5.setText("Mental Character");

        jLabel6.setText("Utility");

        jLabel7.setText("Profession");

        jLabel8.setText("Health");

        jButton3.setText("Random");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Random");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Random");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Random");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Random");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Random");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setText("Randomize All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Randomize Me");

        jLabel10.setText("Randomize Me");

        jLabel11.setText("Randomize Me");

        jLabel12.setText("Randomize Me");

        jLabel13.setText("Randomize Me");

        jLabel14.setText("Randomize Me");

        jLabel15.setText("Randomize Me");

        jButton1.setText("Random");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenu5.setText("Open");
        jMenu1.add(jMenu5);

        jMenu4.setText("Save");
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Stats");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8))
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1)
                                                        .addComponent(jButton3)
                                                        .addComponent(jButton4)
                                                        .addComponent(jButton5)
                                                        .addComponent(jButton6)
                                                        .addComponent(jButton7)
                                                        .addComponent(jButton8)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(80, 80, 80)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel9)
                                        .addComponent(jButton1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jButton3)
                                        .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jButton4)
                                        .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jButton5)
                                        .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jButton6)
                                        .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jButton7)
                                        .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel15)
                                        .addComponent(jButton8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addContainerGap())
        );

        jLabel2.getAccessibleContext().setAccessibleName("lblName");
        jLabel3.getAccessibleContext().setAccessibleName("lblGender");
        jLabel4.getAccessibleContext().setAccessibleName("lblAge");
        jLabel5.getAccessibleContext().setAccessibleName("lblMental");
        jLabel6.getAccessibleContext().setAccessibleName("lblUtility");
        jLabel7.getAccessibleContext().setAccessibleName("lblProfession");
        jLabel8.getAccessibleContext().setAccessibleName("lblHealth");
        jButton3.getAccessibleContext().setAccessibleName("btnrandomGender");
        jButton4.getAccessibleContext().setAccessibleName("btnrandomAge");
        jButton5.getAccessibleContext().setAccessibleName("btnrandomMental");
        jButton6.getAccessibleContext().setAccessibleName("btnrandomUtility");
        jButton7.getAccessibleContext().setAccessibleName("btnrandomProfession");
        jButton8.getAccessibleContext().setAccessibleName("btnrandomHealth");
        jButton2.getAccessibleContext().setAccessibleName("btnradnomAll");

        pack();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        String[] genderarray = new String[3];

        genderarray[0] = "Male";
        genderarray[1] = "Female";
        genderarray[2] = "Agender";


        jLabel10.setText(genderarray[GenderGenerator()]);

    }



    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {


        String[] Namearray = {"Addison","Adrian","Aiden","Ainsley","Alex","Alfie","Amory","Bailey","Bellamy","Bergen","Chris","Clay","Frankie","George","Kerry","Kyle","Loren","Maddox","Madison ","Nolan","Nova","Ocean","Phoenix","Quincy","Quinn","Remy","Rene","Rio","Sydney","Tanner" };
        String[] Mentalarray = new String[9];
        String[] Utilityarray = new String[11];
        String[] Professionarray = new String[7];
        String[] Healtharray = new String[6];
        String[] genderarray = new String[3];



        genderarray[0] = "Male";
        genderarray[1] = "Female";
        genderarray[2] = "Agender";

        Mentalarray[0] = "Shyness";
        Mentalarray[1] = "Negligence";
        Mentalarray[2] = "Procrastination";
        Mentalarray[3] = "Impulsiveness and temper";
        Mentalarray[4] = "Suspiciousness";
        Mentalarray[5] = "Emotionality";
        Mentalarray[6] = "Perfectionism";
        Mentalarray[7] = "Heightened self-esteem";
        Mentalarray[8] = "Paranoia";

        Utilityarray[0] = "Game-Console";
        Utilityarray[1] = "Darts";
        Utilityarray[2] = "Medicament";
        Utilityarray[3] = "Pistol";
        Utilityarray[4] = "TV";
        Utilityarray[5] = "Warm clothes";
        Utilityarray[6] = "MP3";
        Utilityarray[7] = "5000$";
        Utilityarray[8] = "Poison";
        Utilityarray[9] = "Kevlar";
        Utilityarray[10] = "Blacksmith hummer";

        Professionarray[0] = "Blacksmith";
        Professionarray[1] = "Botanist";
        Professionarray[2] = "Mechanic";
        Professionarray[3] = "Hunter";
        Professionarray[4] = "Cooker";
        Professionarray[5] = "Miner";
        Professionarray[6] = "Soldier";

        Healtharray[0] = "Absolutely Healthy";
        Healtharray[1] = "Asthma";
        Healtharray[2] = "Diarrhoea";
        Healtharray[3] = "Cancer";
        Healtharray[4] = "Headache";
        Healtharray[5] = "COVID-19";

        Random rnd = new Random();
        int randomint = rnd.nextInt(100);
        String randomstring = String.valueOf(randomint);


        jLabel10.setText(genderarray[GenderGenerator()]);
        jLabel9.setText(Namearray[NameGenerator()]);
        jLabel12.setText(Mentalarray[MentalGenerator()]);
        jLabel13.setText(Utilityarray[UtilityGenerator()]);
        jLabel14.setText(Professionarray[ProfessionGenerator()]);
        jLabel15.setText(Healtharray[HealthGenerator()]);
        jLabel11.setText(randomstring);

    }


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        Random rnd = new Random();
        int randomint = rnd.nextInt(100);
        String randomstring = String.valueOf(randomint);
        jLabel11.setText(randomstring);

    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

        String[] Mentalarray = new String[9];

        Mentalarray[0] = "Shyness";
        Mentalarray[1] = "Negligence";
        Mentalarray[2] = "Procrastination";
        Mentalarray[3] = "Impulsiveness and temper";
        Mentalarray[4] = "Suspiciousness";
        Mentalarray[5] = "Emotionality";
        Mentalarray[6] = "Perfectionism";
        Mentalarray[7] = "Heightened self-esteem";
        Mentalarray[8] = "Paranoia";


        jLabel12.setText(Mentalarray[MentalGenerator()]);

    }




    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

        String[] Utilityarray = new String[11];

        Utilityarray[0] = "Game-Console";
        Utilityarray[1] = "Darts";
        Utilityarray[2] = "Medicament";
        Utilityarray[3] = "Pistol";
        Utilityarray[4] = "TV";
        Utilityarray[5] = "Warm clothes";
        Utilityarray[6] = "MP3";
        Utilityarray[7] = "5000$";
        Utilityarray[8] = "Poison";
        Utilityarray[9] = "Kevlar";
        Utilityarray[10] = "Blacksmith hummer";


        jLabel13.setText(Utilityarray[UtilityGenerator()]);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        String[] Professionarray = new String[7];

        Professionarray[0] = "Blacksmith";
        Professionarray[1] = "Botanist";
        Professionarray[2] = "Mechanic";
        Professionarray[3] = "Hunter";
        Professionarray[4] = "Cooker";
        Professionarray[5] = "Miner";
        Professionarray[6] = "Soldier";

        jLabel14.setText(Professionarray[ProfessionGenerator()]);
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        String[] Healtharray = new String[6];

        Healtharray[0] = "Absolutely Healthy";
        Healtharray[1] = "Asthma";
        Healtharray[2] = "Diarrhoea";
        Healtharray[3] = "Cancer";
        Healtharray[4] = "Headache";
        Healtharray[5] = "COVID-19";

        jLabel15.setText(Healtharray[HealthGenerator()]);

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String[] Namearray = {"Addison","Adrian","Aiden","Ainsley","Alex","Alfie","Amory","Bailey","Bellamy","Bergen","Chris","Clay","Frankie","George","Kerry","Kyle","Loren","Maddox","Madison ","Nolan","Nova","Ocean","Phoenix","Quincy","Quinn","Remy","Rene","Rio","Sydney","Tanner" };
        jLabel9.setText(Namearray[NameGenerator()]);
    }
    public void main(String args[])
    {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CHARINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CHARINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CHARINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CHARINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new CHARINFO().setVisible(true);
            }
        });
    }

    public int NameGenerator()
    {
        Random rnd = new Random();
        int randomint = rnd.nextInt(30);
        return randomint;
    }

    public int GenderGenerator()
    {
        Random rnd = new Random();
        int randomint = rnd.nextInt(3);
        return randomint;
    }


    public int MentalGenerator()
    {
        Random rnd = new Random();
        int randomint = rnd.nextInt(9);
        return randomint;
    }

    public int UtilityGenerator()
    {
        Random rnd = new Random();
        int randomint = rnd.nextInt(7);
        return randomint;
    }

    public int ProfessionGenerator()
    {
        Random rnd = new Random();
        int randomint = rnd.nextInt(7);
        return randomint;
    }

    public int HealthGenerator()
    {
        Random rnd = new Random();
        int randomint = rnd.nextInt(6);
        return randomint;
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;


}