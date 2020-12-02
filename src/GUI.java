/*
To DO before demo

-save sorted columns as csv (Chris)
-sort hash map (Chris)
-display treatments (Shaye)

*/


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
    int fowg = 0; // Fear of Weight Gain
    int drivethin = 0; // Drive for Thinness
    int overvalwtshape = 0; // Overvaluation of Weight and Shape
    int fearreject = 0; // Fear of Rejection
    int fearmstkes = 0; // Fear of Making Mistakes
    int highstndrds = 0; // High Standards
    int SAA = 0; // Social Appearance Anxiety
    int worry = 0; // Worry
    int selfcrit = 0; // Self-Criticism
    int fearlosgcntrol = 0; // Fear of Losing Control
    int bodydiss = 0; // Body Dissatisfaction
    int feelineffectve = 0; // Feeling Ineffective
    int cogrestraint = 0; // Cognitive Restraint
    int eatrules = 0; // Eating Rules
    int binge = 0; // Binge Eating
    int excexercse = 0; // Excessive Exercise
    int bodycheck = 0; // Body Checking
    int impulse = 0; // Impulsivity
    int shame = 0; // Shame
    int guilt = 0; // Guilt
    int depression = 0; // Depression
    int avoidemo = 0; // Avoiding Emotions
    int overwhlmemo = 0; // Overwhelming Emotions
    int eatanx = 0; // Eating Anxiety
    int diffrelax = 0; // Difficulty Relaxing
    int interoaware = 0; // Interoceptive Awareness
    int physsenseat = 0; // Physical Sensations of Eating
    int hungeranx = 0; // Hunger Anxiety
    int ptsd = 0; // Post-Traumatic Stress Disorder
    int fearatten = 0; // Fear of Attention
    int gad = 0; // Generalized Anxiety Disorder
    int allornothing = 0; // All or Nothing Perfection
    int iuc = 0; // Intolerance of Uncertainty
    int ruminate = 0; // Rumination
    int postevprocess = 0; // Post-event Processing
    int obsess = 0; // Obsessions
    int repthghtfood = 0; // Repetitive Thoughts about Food
    int mealrum = 0; // Meal Rumination
    int skipmeal = 0; // Skipping Meals
    int diet = 0; // Dieting
    int vomit = 0; // Self-induced Vomiting
    int laxative = 0; // Laxative Use
    int diuretic = 0; // Diuretic Use
    int compuls = 0; // Compulsions
    int sleepdiff = 0; // Sleep Difficulties
    int diffdrinkpublic = 0; // Difficulty Drinking in Public
    int diffeatpublic = 0; // Difficulty Eating in Public
    int foodavoid = 0; // Food Avoidance
    int diffidentemo = 0; // Difficulty Identifying Emotions
    int disgust = 0; // Disgust
    int hrtrace = 0; // Heart Racing
    int ocd = 0; // OCD
    int socialintanx = 0; // Social Interaction Anxiety
    int adhd = 0; // ADHD
    int alcsubuse = 0; // Alcohol and Substance Use
    //int sympwointerv = 0;
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
    //double[] sympwointervList = new double[75];
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
    //double sympwointervMean = 0;
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
                //System.out.println(column_count);

                if (line_number == 1) {
                    for (int i = 0; i < column_count; i++) {
                        if (question[i].contains("I am terrified of gaining weight.")) {
                            fowg = i;
                            //System.out.println("fowg:" + fowg);
                        }
                        if (question[i].contains("I am preoccupied with the desire to be thinner.")) {
                            drivethin = i;
                        }
                        if (question[i].contains("My weight and/or shape influences how I think about (judge) myself as a person.")) {
                            overvalwtshape = i;
                        }
                        if (question[i].contains("I am afraid that others will not approve of me and reject me.")) {
                            fearreject = i;
                        }
                        if (question[i].contains("I am afraid of making mistakes.")) {
                            fearmstkes = i;
                        }
                        if (question[i].contains("I set higher goals for myself than most people.")) {
                            highstndrds = i;
                        }
                        if (question[i].contains("I worry people will judge the way I look negatively.")) {
                            SAA = i;
                        }
                        if (question[i].contains("I am always worrying about something.")) {
                            worry = i;
                        }
                        if (question[i].contains("I'm disapproving and judgmental about my own flaws and inadequacies.")) {
                            selfcrit = i;
                        }
                        if (question[i].contains("I am afraid of losing control.")) {
                            fearlosgcntrol = i;
                        }
                        if (question[i].contains("I do not like how my body looks.")) {
                            bodydiss = i;
                        }
                        if (question[i].contains("I feel ineffective as a person.")) {
                            feelineffectve = i;
                        }
                        if (question[i].contains("I have been deliberately trying to limit the amount of food I eat to influence shape or weight (whether or not I have succeeded).")) {
                            cogrestraint = i;
                        }
                        if (question[i].contains("I have tried to follow definite rules regarding eating in order to influence shape or weight.")) {
                            eatrules = i;
                        }
                        if (question[i].contains("I eat a very large amount of food in a short period of time and feel out of control.")) {
                            binge = i;
                        }
                        if (question[i].contains("I feel compelled to exercise and that I must exercise for a certain amount of time and/or in a strenuous manner.")) {
                            excexercse = i;
                        }
                        if (question[i].contains("I frequently check to see if my body has changed (e.g. by pinching).")) {
                            bodycheck = i;
                        }
                        if (question[i].contains("I have trouble controlling my impulses.")) {
                            impulse = i;
                        }
                        if (question[i].contains("I feel ashamed.")) {
                            shame = i;
                        }
                        if (question[i].contains("I feel guilty.")) {
                            guilt = i;
                        }
                        if (question[i].contains("I feel sad and depressed.")) {
                            depression = i;
                        }
                        if (question[i].contains("I try to avoid my emotions.")) {
                            avoidemo = i;
                        }
                        if (question[i].contains("I experience my emotions as overwhelming and out of control.")) {
                            overwhlmemo = i;
                        }
                        if (question[i].contains("I feel anxious when I eat.")) {
                            eatanx = i;
                        }
                        if (question[i].contains("I find it difficult to relax.")) {
                            diffrelax = i;
                        }
                        if (question[i].contains("I am very sensitive to changes in my internal bodily sensations.")) {
                            interoaware = i;
                        }
                        if (question[i].contains("I don't like the physical sensations I feel when eating.")) {
                            physsenseat = i;
                        }
                        if (question[i].contains("Feeling hungry makes me anxious.")) {
                            hungeranx = i;
                        }
                        if (question[i].contains("I have repeated disturbing memories thoughts or images about a stressful experience from the past.")) {
                            ptsd = i;
                        }
                        if (question[i].contains("I worry I might do something to attract the attention of other people.")) {
                            fearatten = i;
                        }
                        if (question[i].contains("My worries overwhelm me.")) {
                            gad = i;
                        }
                        if (question[i].contains("If I fail partly it is as bad as being a complete failure.")) {
                            allornothing = i;
                        }
                        if (question[i].contains("I cannot stand not knowing what is going to happen in the future.")) {
                            iuc = i;
                        }
                        if (question[i].contains("I have repeated thoughts or images about an event that happened and wishing it had gone better.")) {
                            ruminate = i;
                        }
                        if (question[i].contains("I have thoughts or images about an event that occurred over and over again that resulted in my feelings getting worse and worse.")) {
                            postevprocess = i;
                        }
                        if (question[i].contains("I am upset about unpleasant thoughts that come into my mind against my will.")) {
                            obsess = i;
                        }
                        if (question[i].contains("I have thoughts about food that I cannot stop.")) {
                            repthghtfood = i;
                        }
                        if (question[i].contains(" think about a recent meal time wishing it had gone better.")) {
                            mealrum = i;
                        }
                        if (question[i].contains("I have skipped meals.")) {
                            skipmeal = i;
                        }
                        if (question[i].contains("People would be surprised if they knew how little I eat.")) {
                            diet = i;
                        }
                        if (question[i].contains("I vomit in order to lose weight.")) {
                            vomit = i;
                        }
                        if (question[i].contains("I use laxatives in order to lose weight.")) {
                            laxative = i;
                        }
                        if (question[i].contains("I use diuretics in order to lose weight.")) {
                            diuretic = i;
                        }
                        if (question[i].contains("I feel compelled to act in a certain way to get rid of thoughts I am having even if it is senseless or excessive.")) {
                            compuls = i;
                        }
                        if (question[i].contains("I have sleep difficulties.")) {
                            sleepdiff = i;
                        }
                        if (question[i].contains("I would find it difficult to drink something in front of a group of people.")) {
                            diffdrinkpublic = i;
                        }
                        if (question[i].contains("It would make me feel self-conscious to eat in front of a stranger at a restaurant.")) {
                            diffeatpublic = i;
                        }
                        if (question[i].contains("There are certain foods I avoid because they make me anxious.")) {
                            foodavoid = i;
                        }
                        if (question[i].contains("I have no idea how I am feeling.")) {
                            diffidentemo = i;
                        }
                        if (question[i].contains("When I notice that I feel nauseous I worry about vomiting.")) {
                            disgust = i;
                        }
                        if (question[i].contains("My heart races for no good reason.")) {
                            hrtrace = i;
                        }
                        if (question[i].contains("I frequently get nasty thoughts and feel I must do something in order to get rid of them")) {
                            ocd = i;
                        }
                        if (question[i].contains("When mixing socially I am uncomfortable.")) {
                            socialintanx = i;
                        }
                        if (question[i].contains("I am often forgetful in daily activities (e.g. chores running errands returning calls paying bills keeping appointments).")) {
                            adhd = i;
                        }
                        if (question[i].contains("I have failed to do what was normally expected of me because of drinking and/or substance use.")) {
                            alcsubuse = i;
                        }
                        /*if (question[i].contains("")) {
                            sympwointerv = i;
                        }*/
                    }
                } else {
                    if (!question[fowg].isBlank()) {
                        fowgList[n]= Double.parseDouble(question[fowg]);
                    }
                    if (!question[drivethin].isBlank()) {
                        drivethinList[n]= Double.parseDouble(question[drivethin]);
                    }
                    if (!question[overvalwtshape].isBlank()) {
                        overvalwtshapeList[n]= Double.parseDouble(question[overvalwtshape]);
                    }
                    if (!question[fearreject].isBlank()) {
                        fearrejectList[n]= Double.parseDouble(question[fearreject]);
                    }
                    if (!question[fearmstkes].isBlank()) {
                        fearmstkesList[n]= Double.parseDouble(question[fearmstkes]);
                    }
                    if (!question[highstndrds].isBlank()) {
                        highstndrdsList[n]= Double.parseDouble(question[highstndrds]);
                    }
                    if (!question[SAA].isBlank()) {
                        SAAList[n]= Double.parseDouble(question[SAA]);
                    }
                    if (!question[worry].isBlank()) {
                        worryList[n]= Double.parseDouble(question[worry]);
                    }
                    if (!question[selfcrit].isBlank()) {
                        selfcritList[n]= Double.parseDouble(question[selfcrit]);
                    }
                    if (!question[fearlosgcntrol].isBlank()) {
                        fearlosgcntrolList[n]= Double.parseDouble(question[fearlosgcntrol]);
                    }
                    if (!question[bodydiss].isBlank()) {
                        bodydissList[n]= Double.parseDouble(question[bodydiss]);
                    }
                    if (!question[feelineffectve].isBlank()) {
                        feelineffectveList[n]= Double.parseDouble(question[feelineffectve]);
                    }
                    if (!question[cogrestraint].isBlank()) {
                        cogrestraintList[n]= Double.parseDouble(question[cogrestraint]);
                    }
                    if (!question[eatrules].isBlank()) {
                        eatrulesList[n]= Double.parseDouble(question[eatrules]);
                    }
                    if (!question[binge].isBlank()) {
                        bingeList[n]= Double.parseDouble(question[binge]);
                    }
                    if (!question[excexercse].isBlank()) {
                        excexercseList[n]= Double.parseDouble(question[excexercse]);
                    }
                    if (!question[bodycheck].isBlank()) {
                        bodycheckList[n]= Double.parseDouble(question[bodycheck]);
                    }
                    if (!question[impulse].isBlank()) {
                        impulseList[n]= Double.parseDouble(question[impulse]);
                    }
                    if (!question[shame].isBlank()) {
                        shameList[n]= Double.parseDouble(question[shame]);
                    }
                    if (!question[guilt].isBlank()) {
                        guiltList[n]= Double.parseDouble(question[guilt]);
                    }
                    if (!question[depression].isBlank()) {
                        depressionList[n]= Double.parseDouble(question[depression]);
                    }
                    if (!question[avoidemo].isBlank()) {
                        avoidemoList[n]= Double.parseDouble(question[avoidemo]);
                    }
                    if (!question[overwhlmemo].isBlank()) {
                        overwhlmemoList[n]= Double.parseDouble(question[overwhlmemo]);
                    }
                    if (!question[eatanx].isBlank()) {
                        eatanxList[n]= Double.parseDouble(question[eatanx]);
                    }
                    if (!question[diffrelax].isBlank()) {
                        diffrelaxList[n]= Double.parseDouble(question[diffrelax]);
                    }
                    if (!question[interoaware].isBlank()) {
                        interoawareList[n]= Double.parseDouble(question[interoaware]);
                    }
                    if (!question[physsenseat].isBlank()) {
                        physsenseatList[n]= Double.parseDouble(question[physsenseat]);
                    }
                    if (!question[hungeranx].isBlank()) {
                        hungeranxList[n]= Double.parseDouble(question[hungeranx]);
                    }
                    if (!question[ptsd].isBlank()) {
                        ptsdList[n]= Double.parseDouble(question[ptsd]);
                    }
                    if (!question[fearatten].isBlank()) {
                        fearattenList[n]= Double.parseDouble(question[fearatten]);
                    }
                    if (!question[gad].isBlank()) {
                        gadList[n]= Double.parseDouble(question[gad]);
                    }
                    if (!question[allornothing].isBlank()) {
                        allornothingList[n]= Double.parseDouble(question[allornothing]);
                    }
                    if (!question[iuc].isBlank()) {
                        iucList[n]= Double.parseDouble(question[iuc]);
                    }
                    if (!question[ruminate].isBlank()) {
                        ruminateList[n]= Double.parseDouble(question[ruminate]);
                    }
                    if (!question[postevprocess].isBlank()) {
                        postevprocessList[n]= Double.parseDouble(question[postevprocess]);
                    }
                    if (!question[obsess].isBlank()) {
                        obsessList[n]= Double.parseDouble(question[obsess]);
                    }
                    if (!question[repthghtfood].isBlank()) {
                        repthghtfoodList[n]= Double.parseDouble(question[repthghtfood]);
                    }
                    if (!question[mealrum].isBlank()) {
                        mealrumList[n]= Double.parseDouble(question[mealrum]);
                    }
                    if (!question[skipmeal].isBlank()) {
                        skipmealList[n]= Double.parseDouble(question[skipmeal]);
                    }
                    if (!question[diet].isBlank()) {
                        dietList[n]= Double.parseDouble(question[diet]);
                    }
                    if (!question[vomit].isBlank()) {
                        vomitList[n]= Double.parseDouble(question[vomit]);
                    }
                    if (!question[laxative].isBlank()) {
                        laxativeList[n]= Double.parseDouble(question[laxative]);
                    }
                    if (!question[diuretic].isBlank()) {
                        diureticList[n]= Double.parseDouble(question[diuretic]);
                    }
                    if (!question[compuls].isBlank()) {
                        compulsList[n]= Double.parseDouble(question[compuls]);
                    }
                    if (!question[sleepdiff].isBlank()) {
                        sleepdiffList[n]= Double.parseDouble(question[sleepdiff]);
                    }
                    if (!question[diffdrinkpublic].isBlank()) {
                        diffdrinkpublicList[n]= Double.parseDouble(question[diffdrinkpublic]);
                    }
                    if (!question[diffeatpublic].isBlank()) {
                        diffeatpublicList[n]= Double.parseDouble(question[diffeatpublic]);
                    }
                    if (!question[foodavoid].isBlank()) {
                        foodavoidList[n]= Double.parseDouble(question[foodavoid]);
                    }
                    if (!question[diffidentemo].isBlank()) {
                        diffidentemoList[n]= Double.parseDouble(question[diffidentemo]);
                    }
                    if (!question[disgust].isBlank()) {
                        disgustList[n]= Double.parseDouble(question[disgust]);
                    }
                    if (!question[hrtrace].isBlank()) {
                        hrtraceList[n]= Double.parseDouble(question[hrtrace]);
                    }
                    if (!question[ocd].isBlank()) {
                        ocdList[n]= Double.parseDouble(question[ocd]);
                    }
                    if (!question[socialintanx].isBlank()) {
                        socialintanxList[n]= Double.parseDouble(question[socialintanx]);
                    }
                    if (!question[adhd].isBlank()) {
                        adhdList[n]= Double.parseDouble(question[adhd]);
                    }
                    if (!question[alcsubuse].isBlank()) {
                        alcsubuseList[n]= Double.parseDouble(question[alcsubuse]);
                    }
                    /*if (!question[sympwointerv].isBlank()) {
                        sympwointervList[n]= Double.parseDouble(question[sympwointerv]);
                    }*/
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
        //sympwointervMean = average(sympwointervList);

        System.out.println("drivethin: " + drivethinMean);

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
        //map1.put("sympwointerv", sympwointervMean);
    }
    
    public List<List<String>> readInCentrality(String path) {

    List<List<String>> centrality = new ArrayList<>();
        
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(COMMA_DELIMITER);
            records.add(Arrays.asList(values));
        }
    }

        return centrality;
        
    }

    public void runNetwork(String path) throws IOException, URISyntaxException, ScriptException {
        RenjinScriptEngine engine = new RenjinScriptEngine();
        String scriptContent = RUtils.getScriptContent();
        engine.put("input", path);
        engine.eval(scriptContent);
        String centralityPath = (String) engine.eval("runNetwork(input)");
    }
    
    String getScriptContent() throws IOException, URISyntaxException {
        URI rScriptUri = RUtils.class.getClassLoader().getResource("script.R").toURI();
        Path inputScript = Paths.get(rScriptUri);
        return Files.lines(inputScript).collect(Collectors.joining());
    }
    
    public void displayTreatment() {
        \\last function to do
    }


}
