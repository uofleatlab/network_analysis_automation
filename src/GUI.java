import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Arrays;


public class GUI implements ActionListener {

    private JLabel label;
    private JLabel label2;
    private JFrame frame;
    private JPanel panel;
    private JFileChooser fileChooser = new JFileChooser();
    private File file_upload;
    int line_number = 0;
    //define column numbers for variables
    int fearwghtgain = 0;
    int drivethin = 0;
    int overvaluewghtshp = 0;
    int fearreject = 0;
    int concernmistakes = 0;
    int socappearanx = 0;
    int selcritic = 0;
    int fearlosecontrol = 0;
    int bodydissatis = 0;
    int inaffective = 0;
    int repthoughtfood = 0;
    int cogrestraint = 0;
    int eatrule = 0;
    int impulsive = 0;
    int shame = 0;
    //define arrays for each column
    double[] fearwghtgainList = new double[75];
    double[] drivethinList = new double[75];
    double[] overvaluewghtshpList = new double[75];
    double[] fearrejectList = new double[75];
    double[] concernmistakesList = new double[75];
    double[] socappearanxList = new double[75];
    double[] selcriticList = new double[75];
    double[] fearlosecontrolList = new double[75];
    double[] bodydissatisList = new double[75];
    double[] inaffectiveList = new double[75];
    double[] repthoughtfoodList = new double[75];
    double[] cogrestraintList = new double[75];
    double[] eatruleList = new double[75];
    double[] impulsiveList = new double[75];
    double[] shameList = new double[75];
    //define average doubles
    double fearwghtgainMean = 0;
    double drivethinMean = 0;
    double overvaluewghtshpMean = 0;
    double fearrejectMean = 0;
    double concernmistakesMean = 0;
    double socappearanxMean = 0;
    double selcriticMean = 0;
    double fearlosecontrolMean = 0;
    double bodydissatisMean = 0;
    double inaffectiveMean = 0;
    double repthoughtfoodMean = 0;
    double cogrestraintMean = 0;
    double eatruleMean = 0;
    double impulsiveMean = 0;
    double shameMean = 0;

    public GUI() {

        frame = new JFrame();

        label = new JLabel("Choose file to upload:", SwingConstants.CENTER);

        JButton button = new JButton("Upload File");
        button.addActionListener(this);

        label2 = new JLabel("No file selected.", SwingConstants.CENTER);
        label2.setPreferredSize(new Dimension(500,100));

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(150,250,150,250));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(button);
        panel.add(label2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("File Upload");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int upload = fileChooser.showOpenDialog(null);
        if (upload == JFileChooser.APPROVE_OPTION) {
            file_upload = fileChooser.getSelectedFile();
            label2.setText(file_upload.getAbsolutePath());
            arrayCreation();
            fearwghtgainMean = average(fearwghtgainList);
            drivethinMean = average(drivethinList);
            overvaluewghtshpMean = average(overvaluewghtshpList);
            fearrejectMean = average(fearrejectList);
            concernmistakesMean = average(concernmistakesList);
            socappearanxMean = average(socappearanxList);
            selcriticMean = average(selcriticList);
            fearlosecontrolMean = average(fearlosecontrolList);
            bodydissatisMean = average(bodydissatisList);
            inaffectiveMean = average(inaffectiveList);
            repthoughtfoodMean = average(repthoughtfoodList);
            cogrestraintMean = average(cogrestraintList);
            eatruleMean = average(eatruleList);
            impulsiveMean = average(impulsiveList);
            shameMean = average(shameList);

            System.out.println("fearwghtgain: " + fearwghtgainMean);
            System.out.println("drivethin: " + drivethinMean);
            System.out.println("overvaluewghtshp: " + overvaluewghtshpMean);
            System.out.println("fearreject: " + fearrejectMean);
            System.out.println("concernmistakes: " + concernmistakesMean);
            System.out.println("socappearanx: " + socappearanxMean);
            System.out.println("selcritic: " + selcriticMean);
            System.out.println("fearlosecontrol: " + fearlosecontrolMean);
            System.out.println("bodydissatis: " + bodydissatisMean);
            System.out.println("inaffective: " + inaffectiveMean);
            System.out.println("repthoughtfood: " + repthoughtfoodMean);
            System.out.println("cogrestraint: " + cogrestraintMean);
            System.out.println("eatrule: " + eatruleMean);
            System.out.println("impulsive: " + impulsiveMean);
            System.out.println("shame: " + shameMean);
        }
        else {
            label2.setText("File Upload Cancelled");
        }
    }

    public void arrayCreation() {
        String csvFile = file_upload.getAbsolutePath();
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            int n = 0;
            while ((line = br.readLine()) != null) {
                line_number++;
                // use comma as separator
                String[] question = line.split(csvSplitBy);
                int column_count = question.length;

                if (line_number == 1) {
                    for (int i = 0; i < column_count; i++) {
                        if (question[i].equals("fearwghtgain")) {
                            fearwghtgain = i;
                            //System.out.println("fearwghtgain:" + fearwghtgain);
                        }
                        if (question[i].equals("drivethin")) {
                            drivethin = i;
                            //System.out.println("drivethin:" + drivethin);
                        }
                        if (question[i].equals("overvaluewghtshp")) {
                            overvaluewghtshp = i;
                            //System.out.println("overvaluewghtshp:" + overvaluewghtshp);
                        }
                        if (question[i].equals("fearreject")) {
                            fearreject = i;
                            //System.out.println("fearreject:" + fearreject);
                        }
                        if (question[i].equals("concernmistakes")) {
                            concernmistakes = i;
                            //System.out.println("concernmistakes:" + concernmistakes);
                        }
                        if (question[i].equals("socappearanx")) {
                            socappearanx = i;
                            //System.out.println("socappearanx:" + socappearanx);
                        }
                        if (question[i].equals("selcritic")) {
                            selcritic = i;
                            //System.out.println("selcritic:" + selcritic);
                        }
                        if (question[i].equals("fearlosecontrol")) {
                            fearlosecontrol = i;
                            //System.out.println("fearlosecontrol:" + fearlosecontrol);
                        }
                        if (question[i].equals("bodydissatis")) {
                            bodydissatis = i;
                            //System.out.println("bodydissatis:" + bodydissatis);
                        }
                        if (question[i].equals("inaffective")) {
                            inaffective = i;
                            //System.out.println("inaffective:" + inaffective);
                        }
                        if (question[i].equals("repthoughtfood")) {
                            repthoughtfood = i;
                            //System.out.println("repthoughtfood:" + repthoughtfood);
                        }
                        if (question[i].equals("cogrestraint")) {
                            cogrestraint = i;
                            //System.out.println("cogrestraint:" + cogrestraint);
                        }
                        if (question[i].equals("eatrule")) {
                            eatrule = i;
                            //System.out.println("eatrule:" + eatrule);
                        }
                        if (question[i].equals("impulsive")) {
                            impulsive = i;
                            //System.out.println("impulsive:" + impulsive);
                        }
                        if (question[i].equals("shame")) {
                            shame = i;
                            //System.out.println("shame:" + shame);
                        }
                    }
                } else {
                    if (!question[fearwghtgain].equals("NA")) {
                        fearwghtgainList[n]= Double.parseDouble(question[fearwghtgain]);
                    }
                    if (!question[drivethin].equals("NA")) {
                        drivethinList[n]= Double.parseDouble(question[drivethin]);
                    }
                    if (!question[overvaluewghtshp].equals("NA")) {
                        overvaluewghtshpList[n]= Double.parseDouble(question[overvaluewghtshp]);
                    }
                    if (!question[fearreject].equals("NA")) {
                        fearrejectList[n]= Double.parseDouble(question[fearreject]);
                    }
                    if (!question[concernmistakes].equals("NA")) {
                        concernmistakesList[n]= Double.parseDouble(question[concernmistakes]);
                    }
                    if (!question[socappearanx].equals("NA")) {
                        socappearanxList[n]= Double.parseDouble(question[socappearanx]);
                    }
                    if (!question[selcritic].equals("NA")) {
                        selcriticList[n]= Double.parseDouble(question[selcritic]);
                    }
                    if (!question[fearlosecontrol].equals("NA")) {
                        fearlosecontrolList[n]= Double.parseDouble(question[fearlosecontrol]);
                    }
                    if (!question[bodydissatis].equals("NA")) {
                        bodydissatisList[n]= Double.parseDouble(question[bodydissatis]);
                    }
                    if (!question[inaffective].equals("NA")) {
                        inaffectiveList[n]= Double.parseDouble(question[inaffective]);
                    }
                    if (!question[repthoughtfood].equals("NA")) {
                        repthoughtfoodList[n]= Double.parseDouble(question[repthoughtfood]);
                    }
                    if (!question[cogrestraint].equals("NA")) {
                        cogrestraintList[n]= Double.parseDouble(question[cogrestraint]);
                    }
                    if (!question[eatrule].equals("NA")) {
                        eatruleList[n]= Double.parseDouble(question[eatrule]);
                    }
                    if (!question[impulsive].equals("NA")) {
                        impulsiveList[n]= Double.parseDouble(question[impulsive]);
                    }
                    if (!question[shame].equals("NA")) {
                        shameList[n]= Double.parseDouble(question[shame]);
                    }
                    n++;
                }
            }

            //print column arrays
            /*System.out.println(Arrays.toString(fearwghtgainList));
            System.out.println(Arrays.toString(drivethinList));
            System.out.println(Arrays.toString(overvaluewghtshpList));
            System.out.println(Arrays.toString(fearrejectList));
            System.out.println(Arrays.toString(concernmistakesList));
            System.out.println(Arrays.toString(socappearanxList));
            System.out.println(Arrays.toString(selcriticList));
            System.out.println(Arrays.toString(fearlosecontrolList));
            System.out.println(Arrays.toString(bodydissatisList));
            System.out.println(Arrays.toString(inaffectiveList));
            System.out.println(Arrays.toString(repthoughtfoodList));
            System.out.println(Arrays.toString(cogrestraintList));
            System.out.println(Arrays.toString(eatruleList));
            System.out.println(Arrays.toString(impulsiveList));
            System.out.println(Arrays.toString(shameList));*/

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public double average(double[] array) {
        double total = 0;
        for(int i=0; i<array.length; i++){
            total = total + array[i];
        }
        double average = total / array.length;
        return average;
    }
}