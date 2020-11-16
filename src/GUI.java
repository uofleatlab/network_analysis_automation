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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class GUI implements ActionListener {

    private JLabel label;
    private JLabel label2;
    private JFrame frame;
    private JPanel panel;
    private JFileChooser fileChooser = new JFileChooser();
    private File file_upload;
    int line_number = 0;
    //define column numbers for variables
    int fowg = 0;
    int drivethin = 0;
    int overvalwtshape = 0;
    int fearreject = 0;
    int fearmstkes = 0;
    int highstndrds = 0;
    int SAA = 0;
    int worry = 0;
    int selfcrit = 0;
    int fearlosgcntrol = 0;
    int bodydiss = 0;
    int feelineffectve = 0;
    int cogrestraint = 0;
    int eatrules = 0;
    int binge = 0;
    int excexercse = 0;
    int bodycheck = 0;
    int impulse = 0;
    int shame = 0;
    int guilt = 0;
    int depression = 0;
    int avoidemo = 0;
    int overwhlmemo = 0;
    int eatanx = 0;
    int diffrelax = 0;
    int interoaware = 0;
    int physsenseat = 0;
    int hungeranx = 0;
    int ptsd = 0;
    int fearatten = 0;
    int gad = 0;
    int allornothing = 0;
    int iuc = 0;
    int ruminate = 0;
    int postevprocess = 0;
    int obsess = 0;
    int repthghtfood = 0;
    int mealrum = 0;
    int skipmeal = 0;
    int diet = 0;
    int vomit = 0;
    int laxative = 0;
    int diuretic = 0;
    int compuls = 0;
    int sleepdiff = 0;
    int diffdrinkpublic = 0;
    int diffeatpublic = 0;
    int foodavoid = 0;
    int diffidentemo = 0;
    int disgust = 0;
    int hrtrace = 0;
    int ocd = 0;
    int socialintanx = 0;
    int adhd = 0;
    int alcsubuse = 0;
    int sympwointerv = 0;
    //define arrays for each column
    double[] fowgList = new double[75];
    double[] drivethinList = new double[75];
    double[] overvalwtshapeList = new double[75];
    double[] fearrejectList = new double[75];
    double[] fearmstkesList = new double[75];
    double[] highstndrdsList = new double[75];
    double[] SAAList = new double[75];
    double[] worryList = new double[75];
    double[] selfcritList = new double[75];
    double[] fearlosgcntrolList = new double[75];
    double[] bodydissList = new double[75];
    double[] feelineffectveList = new double[75];
    double[] cogrestraintList = new double[75];
    double[] eatrulesList = new double[75];
    double[] bingeList = new double[75];
    double[] excexercseList = new double[75];
    double[] bodycheckList = new double[75];
    double[] impulseList = new double[75];
    double[] shameList = new double[75];
    double[] guiltList = new double[75];
    double[] depressionList = new double[75];
    double[] avoidemoList = new double[75];
    double[] overwhlmemoList = new double[75];
    double[] eatanxList = new double[75];
    double[] diffrelaxList = new double[75];
    double[] interoawareList = new double[75];
    double[] physsenseatList = new double[75];
    double[] hungeranxList = new double[75];
    double[] ptsdList = new double[75];
    double[] fearattenList = new double[75];
    double[] gadList = new double[75];
    double[] allornothingList = new double[75];
    double[] iucList = new double[75];
    double[] ruminateList = new double[75];
    double[] postevprocessList = new double[75];
    double[] obsessList = new double[75];
    double[] repthghtfoodList = new double[75];
    double[] mealrumList = new double[75];
    double[] skipmealList = new double[75];
    double[] dietList = new double[75];
    double[] vomitList = new double[75];
    double[] laxativeList = new double[75];
    double[] diureticList = new double[75];
    double[] compulsList = new double[75];
    double[] sleepdiffList = new double[75];
    double[] diffdrinkpublicList = new double[75];
    double[] diffeatpublicList = new double[75];
    double[] foodavoidList = new double[75];
    double[] diffidentemoList = new double[75];
    double[] disgustList = new double[75];
    double[] hrtraceList = new double[75];
    double[] ocdList = new double[75];
    double[] socialintanxList = new double[75];
    double[] adhdList = new double[75];
    double[] alcsubuseList = new double[75];
    double[] sympwointervList = new double[75];
    //define average doubles
    double fowgMean = 0;
    double drivethinMean = 0;
    double overvalwtshapeMean = 0;
    double fearrejectMean = 0;
    double fearmstkesMean = 0;
    double highstndrdsMean = 0;
    double SAAMean = 0;
    double worryMean = 0;
    double selfcritMean = 0;
    double fearlosgcntrolMean = 0;
    double bodydissMean = 0;
    double feelineffectveMean = 0;
    double cogrestraintMean = 0;
    double eatrulesMean = 0;
    double bingeMean = 0;
    double excexercseMean = 0;
    double bodycheckMean = 0;
    double impulseMean = 0;
    double shameMean = 0;
    double guiltMean = 0;
    double depressionMean = 0;
    double avoidemoMean = 0;
    double overwhlmemoMean = 0;
    double eatanxMean = 0;
    double diffrelaxMean = 0;
    double interoawareMean = 0;
    double physsenseatMean = 0;
    double hungeranxMean = 0;
    double ptsdMean = 0;
    double fearattenMean = 0;
    double gadMean = 0;
    double allornothingMean = 0;
    double iucMean = 0;
    double ruminateMean = 0;
    double postevprocessMean = 0;
    double obsessMean = 0;
    double repthghtfoodMean = 0;
    double mealrumMean = 0;
    double skipmealMean = 0;
    double dietMean = 0;
    double vomitMean = 0;
    double laxativeMean = 0;
    double diureticMean = 0;
    double compulsMean = 0;
    double sleepdiffMean = 0;
    double diffdrinkpublicMean = 0;
    double diffeatpublicMean = 0;
    double foodavoidMean = 0;
    double diffidentemoMean = 0;
    double disgustMean = 0;
    double hrtraceMean = 0;
    double ocdMean = 0;
    double socialintanxMean = 0;
    double adhdMean = 0;
    double alcsubuseMean = 0;
    double sympwointervMean = 0;
    //define Hashmaps
    HashMap<String,Double> map1 = new HashMap<String,Double>();

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
            averageCalculation();
            createMap();

            /*List<Double> sorted = new ArrayList<>(map1.values());
            Collections.sort(sorted, Collections.reverseOrder());
            System.out.println(sorted);*/
        }
        else {
            label2.setText("File Upload Cancelled");
        }
    }

    //define functions

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
                        if (question[i].startsWith("[2_VAS]")) {
                            fowg = i;
                            //System.out.println("fowg:" + fowg);
                        }
                        if (question[i].startsWith("[3_VAS]")) {
                            drivethin = i;
                        }
                        if (question[i].startsWith("[4_VAS]")) {
                            overvalwtshape = i;
                        }
                        if (question[i].startsWith("[5_VAS]")) {
                            fearreject = i;
                        }
                        if (question[i].startsWith("[6_VAS]")) {
                            fearmstkes = i;
                        }
                        if (question[i].startsWith("[8_VAS]")) {
                            highstndrds = i;
                        }
                        if (question[i].startsWith("[10_VAS]")) { //?
                            SAA = i;
                        }
                        if (question[i].startsWith("[11_VAS]")) {
                            worry = i;
                        }
                        if (question[i].startsWith("[14_VAS]")) {
                            selfcrit = i;
                        }
                        if (question[i].startsWith("[16_VAS]")) {
                            fearlosgcntrol = i;
                        }
                        if (question[i].startsWith("[17_VAS]")) {
                            bodydiss = i;
                        }
                        if (question[i].startsWith("[18_VAS]")) {
                            feelineffectve = i;
                        }
                        if (question[i].startsWith("[2_VAS]")) { //
                            cogrestraint = i;
                        }
                        if (question[i].startsWith("[24_VAS]")) {
                            eatrules = i;
                        }
                        if (question[i].startsWith("[28_VAS]")) {
                            binge = i;
                        }
                        if (question[i].startsWith("[29_VAS]")) {
                            excexercse = i;
                        }
                        if (question[i].startsWith("[30_VAS]")) {
                            bodycheck = i;
                        }
                        if (question[i].startsWith("[35_VAS]")) {
                            impulse = i;
                        }
                        if (question[i].startsWith("[38_VAS]")) {
                            shame = i;
                        }
                        if (question[i].startsWith("[37_VAS]")) {
                            guilt = i;
                        }
                        if (question[i].startsWith("[39_VAS]")) {
                            depression = i;
                        }
                        if (question[i].startsWith("[40_VAS]")) {
                            avoidemo = i;
                        }
                        if (question[i].startsWith("[41_VAS]")) {
                            overwhlmemo = i;
                        }
                        if (question[i].startsWith("[43_VAS]")) {
                            eatanx = i;
                        }
                        if (question[i].startsWith("[45_VAS]")) {
                            diffrelax = i;
                        }
                        if (question[i].startsWith("[47_VAS]")) { //?
                            interoaware = i;
                        }
                        if (question[i].startsWith("[48_VAS]")) {
                            physsenseat = i;
                        }
                        if (question[i].startsWith("[49_VAS]")) {
                            hungeranx = i;
                        }
                        if (question[i].startsWith("[50_VAS]")) { //?
                            ptsd = i;
                        }
                        if (question[i].startsWith("[53_VAS]")) {
                            fearatten = i;
                        }
                        if (question[i].startsWith("[2_VAS]")) { //
                            gad = i;
                        }
                        if (question[i].startsWith("[7_VAS]")) { //?
                            allornothing = i;
                        }
                        if (question[i].startsWith("[9_VAS]")) {
                            iuc = i;
                        }
                        if (question[i].startsWith("[12_VAS]")) {
                            ruminate = i;
                        }
                        if (question[i].startsWith("[13_VAS]")) { //?
                            postevprocess = i;
                        }
                        if (question[i].startsWith("[2_VAS]")) { //
                            obsess = i;
                        }
                        if (question[i].startsWith("[19_VAS]")) {
                            repthghtfood = i;
                        }
                        if (question[i].startsWith("[20_VAS]")) {
                            mealrum = i;
                        }
                        if (question[i].startsWith("[21_VAS]")) {
                            skipmeal = i;
                        }
                        if (question[i].startsWith("[22_VAS]")) {
                            diet = i;
                        }
                        if (question[i].startsWith("[25_VAS]")) {
                            vomit = i;
                        }
                        if (question[i].startsWith("[26_VAS]")) {
                            laxative = i;
                        }
                        if (question[i].startsWith("[27_VAS]")) {
                            diuretic = i;
                        }
                        if (question[i].startsWith("[31_VAS]")) { //?
                            compuls = i;
                        }
                        if (question[i].startsWith("[32_VAS]")) {
                            sleepdiff = i;
                        }
                        if (question[i].startsWith("[33_VAS]")) {
                            diffdrinkpublic = i;
                        }
                        if (question[i].startsWith("[34_VAS]")) {
                            diffeatpublic = i;
                        }
                        if (question[i].startsWith("[36_VAS]")) {
                            foodavoid = i;
                        }
                        if (question[i].startsWith("[42_VAS]")) {
                            diffidentemo = i;
                        }
                        if (question[i].startsWith("[51_VAS]")) {
                            disgust = i;
                        }
                        if (question[i].startsWith("[46_VAS]")) {
                            hrtrace = i;
                        }
                        if (question[i].startsWith("[2_VAS]")) { //
                            ocd = i;
                        }
                        if (question[i].startsWith("[52_VAS]")) {
                            socialintanx = i;
                        }
                        if (question[i].startsWith("[2_VAS]")) { //
                            adhd = i;
                        }
                        if (question[i].startsWith("[56_VAS]")) {
                            alcsubuse = i;
                        }
                        if (question[i].startsWith("[2_VAS]")) { //
                            sympwointerv = i;
                        }
                    }
                } else {
                    if (!question[fowg].isEmpty()) {
                        fowgList[n]= Double.parseDouble(question[fowg]);
                    }
                    if (!question[drivethin].isEmpty()) {
                        drivethinList[n]= Double.parseDouble(question[drivethin]);
                    }
                    if (!question[overvalwtshape].isEmpty()) {
                        overvalwtshapeList[n]= Double.parseDouble(question[overvalwtshape]);
                    }
                    if (!question[fearreject].isEmpty()) {
                        fearrejectList[n]= Double.parseDouble(question[fearreject]);
                    }
                    if (!question[fearmstkes].isEmpty()) {
                        fearmstkesList[n]= Double.parseDouble(question[fearmstkes]);
                    }
                    if (!question[highstndrds].isEmpty()) {
                        highstndrdsList[n]= Double.parseDouble(question[highstndrds]);
                    }
                    if (!question[SAA].isEmpty()) {
                        SAAList[n]= Double.parseDouble(question[SAA]);
                    }
                    if (!question[worry].isEmpty()) {
                        worryList[n]= Double.parseDouble(question[worry]);
                    }
                    if (!question[selfcrit].isEmpty()) {
                        selfcritList[n]= Double.parseDouble(question[selfcrit]);
                    }
                    if (!question[fearlosgcntrol].isEmpty()) {
                        fearlosgcntrolList[n]= Double.parseDouble(question[fearlosgcntrol]);
                    }
                    if (!question[bodydiss].isEmpty()) {
                        bodydissList[n]= Double.parseDouble(question[bodydiss]);
                    }
                    if (!question[feelineffectve].isEmpty()) {
                        feelineffectveList[n]= Double.parseDouble(question[feelineffectve]);
                    }
                    if (!question[cogrestraint].isEmpty()) {
                        cogrestraintList[n]= Double.parseDouble(question[cogrestraint]);
                    }
                    if (!question[eatrules].isEmpty()) {
                        eatrulesList[n]= Double.parseDouble(question[eatrules]);
                    }
                    if (!question[binge].isEmpty()) {
                        bingeList[n]= Double.parseDouble(question[binge]);
                    }
                    if (!question[excexercse].isEmpty()) {
                        excexercseList[n]= Double.parseDouble(question[excexercse]);
                    }
                    if (!question[bodycheck].isEmpty()) {
                        bodycheckList[n]= Double.parseDouble(question[bodycheck]);
                    }
                    if (!question[impulse].isEmpty()) {
                        impulseList[n]= Double.parseDouble(question[impulse]);
                    }
                    if (!question[shame].isEmpty()) {
                        shameList[n]= Double.parseDouble(question[shame]);
                    }
                    if (!question[guilt].isEmpty()) {
                        guiltList[n]= Double.parseDouble(question[guilt]);
                    }
                    if (!question[depression].isEmpty()) {
                        depressionList[n]= Double.parseDouble(question[depression]);
                    }
                    if (!question[avoidemo].isEmpty()) {
                        avoidemoList[n]= Double.parseDouble(question[avoidemo]);
                    }
                    if (!question[overwhlmemo].isEmpty()) {
                        overwhlmemoList[n]= Double.parseDouble(question[overwhlmemo]);
                    }
                    if (!question[eatanx].isEmpty()) {
                        eatanxList[n]= Double.parseDouble(question[eatanx]);
                    }
                    if (!question[diffrelax].isEmpty()) {
                        diffrelaxList[n]= Double.parseDouble(question[diffrelax]);
                    }
                    if (!question[interoaware].isEmpty()) {
                        interoawareList[n]= Double.parseDouble(question[interoaware]);
                    }
                    if (!question[physsenseat].isEmpty()) {
                        physsenseatList[n]= Double.parseDouble(question[physsenseat]);
                    }
                    if (!question[hungeranx].isEmpty()) {
                        hungeranxList[n]= Double.parseDouble(question[hungeranx]);
                    }
                    if (!question[ptsd].isEmpty()) {
                        ptsdList[n]= Double.parseDouble(question[ptsd]);
                    }
                    if (!question[fearatten].isEmpty()) {
                        fearattenList[n]= Double.parseDouble(question[fearatten]);
                    }
                    if (!question[gad].isEmpty()) {
                        gadList[n]= Double.parseDouble(question[gad]);
                    }
                    if (!question[allornothing].isEmpty()) {
                        allornothingList[n]= Double.parseDouble(question[allornothing]);
                    }
                    if (!question[iuc].isEmpty()) {
                        iucList[n]= Double.parseDouble(question[iuc]);
                    }
                    if (!question[ruminate].isEmpty()) {
                        ruminateList[n]= Double.parseDouble(question[ruminate]);
                    }
                    if (!question[postevprocess].isEmpty()) {
                        postevprocessList[n]= Double.parseDouble(question[postevprocess]);
                    }
                    if (!question[obsess].isEmpty()) {
                        obsessList[n]= Double.parseDouble(question[obsess]);
                    }
                    if (!question[repthghtfood].isEmpty()) {
                        repthghtfoodList[n]= Double.parseDouble(question[repthghtfood]);
                    }
                    if (!question[mealrum].isEmpty()) {
                        mealrumList[n]= Double.parseDouble(question[mealrum]);
                    }
                    if (!question[skipmeal].isEmpty()) {
                        skipmealList[n]= Double.parseDouble(question[skipmeal]);
                    }
                    if (!question[diet].isEmpty()) {
                        dietList[n]= Double.parseDouble(question[diet]);
                    }
                    if (!question[vomit].isEmpty()) {
                        vomitList[n]= Double.parseDouble(question[vomit]);
                    }
                    if (!question[laxative].isEmpty()) {
                        laxativeList[n]= Double.parseDouble(question[laxative]);
                    }
                    if (!question[diuretic].isEmpty()) {
                        diureticList[n]= Double.parseDouble(question[diuretic]);
                    }
                    if (!question[compuls].isEmpty()) {
                        compulsList[n]= Double.parseDouble(question[compuls]);
                    }
                    if (!question[sleepdiff].isEmpty()) {
                        sleepdiffList[n]= Double.parseDouble(question[sleepdiff]);
                    }
                    if (!question[diffdrinkpublic].isEmpty()) {
                        diffdrinkpublicList[n]= Double.parseDouble(question[diffdrinkpublic]);
                    }
                    if (!question[diffeatpublic].isEmpty()) {
                        diffeatpublicList[n]= Double.parseDouble(question[diffeatpublic]);
                    }
                    if (!question[foodavoid].isEmpty()) {
                        foodavoidList[n]= Double.parseDouble(question[foodavoid]);
                    }
                    if (!question[diffidentemo].isEmpty()) {
                        diffidentemoList[n]= Double.parseDouble(question[diffidentemo]);
                    }
                    if (!question[disgust].isEmpty()) {
                        disgustList[n]= Double.parseDouble(question[disgust]);
                    }
                    if (!question[hrtrace].isEmpty()) {
                        hrtraceList[n]= Double.parseDouble(question[hrtrace]);
                    }
                    if (!question[ocd].isEmpty()) {
                        ocdList[n]= Double.parseDouble(question[ocd]);
                    }
                    if (!question[socialintanx].isEmpty()) {
                        socialintanxList[n]= Double.parseDouble(question[socialintanx]);
                    }
                    if (!question[adhd].isEmpty()) {
                        adhdList[n]= Double.parseDouble(question[adhd]);
                    }
                    if (!question[alcsubuse].isEmpty()) {
                        alcsubuseList[n]= Double.parseDouble(question[alcsubuse]);
                    }
                    if (!question[sympwointerv].isEmpty()) {
                        sympwointervList[n]= Double.parseDouble(question[sympwointerv]);
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

    public void averageCalculation() {
        //calculate mean for each column
        fowgMean = average(fowgList);
        drivethinMean = average(drivethinList);
        overvalwtshapeMean = average(overvalwtshapeList);
        fearrejectMean = average(fearrejectList);
        fearmstkesMean = average(fearmstkesList);
        highstndrdsMean = average(highstndrdsList);
        SAAMean = average(SAAList);
        worryMean = average(worryList);
        selfcritMean = average(selfcritList);
        fearlosgcntrolMean = average(fearlosgcntrolList);
        bodydissMean = average(bodydissList);
        feelineffectveMean = average(feelineffectveList);
        cogrestraintMean = average(cogrestraintList);
        eatrulesMean = average(eatrulesList);
        bingeMean = average(bingeList);
        excexercseMean = average(excexercseList);
        bodycheckMean = average(bodycheckList);
        impulseMean = average(impulseList);
        shameMean = average(shameList);
        guiltMean = average(guiltList);
        depressionMean = average(depressionList);
        avoidemoMean = average(avoidemoList);
        overwhlmemoMean = average(overwhlmemoList);
        eatanxMean = average(eatanxList);
        diffrelaxMean = average(diffrelaxList);
        interoawareMean = average(interoawareList);
        physsenseatMean = average(physsenseatList);
        hungeranxMean = average(hungeranxList);
        ptsdMean = average(ptsdList);
        fearattenMean = average(fearattenList);
        gadMean = average(gadList);
        allornothingMean = average(allornothingList);
        iucMean = average(iucList);
        ruminateMean = average(ruminateList);
        postevprocessMean = average(postevprocessList);
        obsessMean = average(obsessList);
        repthghtfoodMean = average(repthghtfoodList);
        mealrumMean = average(mealrumList);
        skipmealMean = average(skipmealList);
        dietMean = average(dietList);
        vomitMean = average(vomitList);
        laxativeMean = average(laxativeList);
        diureticMean = average(diureticList);
        compulsMean = average(compulsList);
        sleepdiffMean = average(sleepdiffList);
        diffdrinkpublicMean = average(diffdrinkpublicList);
        diffeatpublicMean = average(diffeatpublicList);
        foodavoidMean = average(foodavoidList);
        diffidentemoMean = average(diffidentemoList);
        disgustMean = average(disgustList);
        hrtraceMean = average(hrtraceList);
        ocdMean = average(ocdList);
        socialintanxMean = average(socialintanxList);
        adhdMean = average(adhdList);
        alcsubuseMean = average(alcsubuseList);
        sympwointervMean = average(sympwointervList);

            /*System.out.println("fearwghtgain: " + fearwghtgainMean);
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
            System.out.println("shame: " + shameMean);*/
    }

    public void createMap() {
        map1.put("fowg", fowgMean);
        map1.put("drivethin", drivethinMean);
        map1.put("overvalwtshape", overvalwtshapeMean);
        map1.put("fearreject", fearrejectMean);
        map1.put("fearmstkes", fearmstkesMean);
        map1.put("highstndrds", highstndrdsMean);
        map1.put("SAA", SAAMean);
        map1.put("worry", worryMean);
        map1.put("selfcrit", selfcritMean);
        map1.put("fearlosgcntrol", fearlosgcntrolMean);
        map1.put("bodydiss", bodydissMean);
        map1.put("feelineffectve", feelineffectveMean);
        map1.put("cogrestraint", cogrestraintMean);
        map1.put("eatrules", eatrulesMean);
        map1.put("binge", bingeMean);
        map1.put("excexercse", excexercseMean);
        map1.put("bodycheck", bodycheckMean);
        map1.put("impulse", impulseMean);
        map1.put("shame", shameMean);
        map1.put("guilt", guiltMean);
        map1.put("depression", depressionMean);
        map1.put("avoidemo", avoidemoMean);
        map1.put("overwhlmemo", overwhlmemoMean);
        map1.put("eatanx", eatanxMean);
        map1.put("diffrelax", diffrelaxMean);
        map1.put("interoaware", interoawareMean);
        map1.put("physsenseat", physsenseatMean);
        map1.put("hungeranx", hungeranxMean);
        map1.put("ptsd", ptsdMean);
        map1.put("fearatten", fearattenMean);
        map1.put("gad", gadMean);
        map1.put("allornothing", allornothingMean);
        map1.put("iuc", iucMean);
        map1.put("ruminate", ruminateMean);
        map1.put("postevprocess", postevprocessMean);
        map1.put("obsess", obsessMean);
        map1.put("repthghtfood", repthghtfoodMean);
        map1.put("mealrum", mealrumMean);
        map1.put("skipmeal", skipmealMean);
        map1.put("diet", dietMean);
        map1.put("vomit", vomitMean);
        map1.put("laxative", laxativeMean);
        map1.put("diuretic", diureticMean);
        map1.put("compuls", compulsMean);
        map1.put("sleepdiff", sleepdiffMean);
        map1.put("diffdrinkpublic", diffdrinkpublicMean);
        map1.put("diffeatpublic", diffeatpublicMean);
        map1.put("foodavoid", foodavoidMean);
        map1.put("diffidentemo", diffidentemoMean);
        map1.put("disgust", disgustMean);
        map1.put("hrtrace", hrtraceMean);
        map1.put("ocd", ocdMean);
        map1.put("socialintanx", socialintanxMean);
        map1.put("adhd", adhdMean);
        map1.put("alcsubuse", alcsubuseMean);
        map1.put("sympwointerv", sympwointervMean);
    }


}