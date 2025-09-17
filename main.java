import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {

    static double grade = 0.0;
    static String[][] student = new String[100][3];// surname,student number,grade
    static int x = 0;// table column , each one represents one student

    public static void main(String[] args) {

        Frame ocd = new Frame("ocd");
        ocd.setSize(400, 400);
        ocd.setVisible(true);
        ocd.setLayout(null);
        ocd.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Label bcc = new Label(" Grades!");
        bcc.setBounds(50, 40, 55, 25);
        ocd.add(bcc);

        Button syn = new Button(" +0.5 ");
        syn.setBounds(80, 225, 30, 15);
        ocd.add(syn);

        Button mion = new Button(" -0.125 ");
        mion.setBounds(180, 225, 40, 15);
        ocd.add(mion);

        Label ap = new Label(" Result:");
        ap.setBounds(50, 275, 55, 25);
        ocd.add(ap);

        TextField text = new TextField(" ");
        text.setBounds(110, 280, 40, 15);
        ocd.add(text);

        syn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                grade += 0.5;
                String result = String.format("%f", grade);
                text.setText(result);
            }
        });

        mion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                grade -= 0.125;
                if (grade < 0)
                    grade = 0;
                String result = String.format("%f", grade);
                text.setText(result);
            }
        });

        Label surname = new Label(" Surname:");
        surname.setBounds(50, 100, 55, 25);
        ocd.add(surname);

        TextField stext = new TextField(" ");
        stext.setBounds(110, 105, 40, 15);
        ocd.add(stext);

        Label studentNumber = new Label(" Student Number:");
        studentNumber.setBounds(50, 170, 55, 25);
        ocd.add(studentNumber);

        TextField ntext = new TextField(" ");
        ntext.setBounds(110, 175, 40, 15);
        ocd.add(ntext);

        Button submit = new Button(" Submit");
        submit.setBounds(150, 320, 70, 15);
        ocd.add(submit);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (x != 0) {
                    x++;
                }

                student[x][0] = stext.getText();
                student[x][1] = ntext.getText();
                student[x][2] = String.format("%f", grade);
                stext.setText("");
                ntext.setText("");
                text.setText("");
                grade = 0.0;
            }

        });

    }
}