package sample;

//import org.codehaus.plexus.util.StringUtils;

import com.sun.deploy.util.StringUtils;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.xml.soap.Text;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
//import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main implements ActionListener {

    private JLabel label;
    private JLabel label2;
    private JLabel output1;
    private JLabel output2;
    private JLabel output3;
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
    int socappearanx = 0; // Social Appearance Anxiety
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
    double[] socappearanxList = new double[75];
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
    double socappearanxMean = 0;
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

    HashMap<String,String> map2 = new HashMap<String,String>();
    //define top symptom variables
    String symp1 = "";
    String symp2 = "";
    String symp3 = "";

    SortedSet<String> keys;
    List<Map<String, String>> maps;

    public static void main(String[] args) {

        new Main();
    }

    public Main() {

        frame = new JFrame();

        label = new JLabel("Choose file to upload:", SwingConstants.CENTER);

        JButton button = new JButton("Upload File");
        button.addActionListener(this);

        label2 = new JLabel("No file selected.", SwingConstants.CENTER);
        label2.setPreferredSize(new Dimension(500,100));

        output1 = new JLabel("", SwingConstants.CENTER);
        output1.setPreferredSize(new Dimension(500,200));

        output2 = new JLabel("", SwingConstants.CENTER);
        output2.setPreferredSize(new Dimension(500,200));

        output3 = new JLabel("", SwingConstants.CENTER);
        output3.setPreferredSize(new Dimension(500,200));

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(150,250,150,250));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(button);
        panel.add(label2);
        panel.add(output1);
        panel.add(output2);
        panel.add(output3);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("File Upload");
        frame.pack();
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        int upload = fileChooser.showOpenDialog(null);

        if (upload == JFileChooser.APPROVE_OPTION) {

            file_upload = fileChooser.getSelectedFile();
            label2.setText(file_upload.getAbsolutePath());
            System.out.println("file uploaded");

            arrayCreation();
            System.out.println("Array created");
            averageCalculation();
            System.out.println("average calculated");
            createMap();
            System.out.println("Map created");

            Map<String, Double> top = map1.keySet().stream().sorted().limit(10).collect(Collectors.toMap(Function.identity(), map1::get));
            MapConverter mc = new MapConverter();
            Map<String, String>  topStr = mc.convert(top);

            System.out.println("Top 5 entries computed:");

            List<Map<String, String>> maps = new ArrayList<>();
            maps.add(topStr);

            // extract all headers
            SortedSet<String> keys = new TreeSet<>(topStr.keySet());
            for(Map<String, String> map : maps){
                keys.addAll(map.keySet());
            }

            setKeys(keys);
            setMaps(maps);
            sample.TextFileManager textFileManager = new TextFileManager();
            String testingFilePath = "C:\\Users\\Chris Trombley\\Downloads\\centrality.csv"; //TO DO - change this
            textFileManager.writeTextFile(this, testingFilePath);
            NetworkAnalysis networkAnalysis = new NetworkAnalysis();
            networkAnalysis.runNetwork();
            List<String> treatmentSuggestionsToDisplay = textFileManager.readTextFile(testingFilePath);
            createMap2();
            displayTreatment(treatmentSuggestionsToDisplay);

        }
        else {
            label2.setText("File Upload Cancelled");
        }

    }

    public void setMaps(List<Map<String, String>> maps) {

        this.maps = maps;

    }

    public List<Map<String, String>> getMaps() {
        return maps;
    }

    public void setKeys(SortedSet<String> keys) {

        this.keys = keys;

    }

    public SortedSet<String> getKeys() {

        return keys;

    }


    public class MapConverter {
        public Map<String, String> convert(Map<String, Double> oldMap) {
            Map<String, String> ret = new HashMap<String, String>();
            for (String key : oldMap.keySet()) {
                ret.put(key, oldMap.get(key).toString());
            }
            return ret;
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
                            socappearanx = i;
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
                    if (!question[socappearanx].isEmpty()) {
                        socappearanxList[n]= Double.parseDouble(question[socappearanx]);
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
                    /*if (!question[sympwointerv].isEmpty()) {
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
        socappearanxMean = average(socappearanxList);
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
        map1.put("socappearanx", socappearanxMean);
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





    public void createMap2() {
        map2.put("fowg", "Fear of Weight Gain: See page 2 of the interventions database.\nConduct imaginal exposure for fear of weight gain. In session one, provide psychoeducation about imaginal exposure therapy, create an imaginal exposure script, and assign listening to the imaginal exposure script recording for homework. In session two, review safety behaviors, conduct the imaginal exposure, and assign recordings for homework. In sessions three, conduct the imaginal exposure and assign recordings for homework.");
        map2.put("drivethin", "Drive for Thinness: See page 31 of the interventions database.\nIn the first session, introduce thinking errors and automatic thoughts and assign thought logging for homework. In session two, challenge automatic thoughts, identify core beliefs, and assign Historical Test of Beliefs Worksheet for homework. In session three, design behavioral experiments to challenge the core belief related to drive for thinness and have them complete a behavioral experiment for homework.");
        map2.put("overvalwtshape", "<html>Overvaluation of Weight and Shape: See page 52 of the interventions database.\nIn the first session, introduce thinking errors and automatic thoughts and assign thought logging for homework. In the second session, challenge automatic thoughts and assign homework to challenge more thoughts over the week. <br> Over the next two sessions, conduct the Value Card Sort Activity to assess their priorities, create a pie chart to plot the relative importance of different areas of participants’ lives and weight/shape, and help them set SMART goals for themselves.</html>");
        map2.put("fearreject", "Fear of Rejection: See page 72 of the interventions database.\nIn session one, explain exposure therapy to the participant, create a hierarchy of situations that the participant avoids because of the fear of rejection, and assign exposures for homework. In session two and three, conduct an in-session exposure and assign exposures for homework.");
        map2.put("fearmstkes", "Fear of Making Mistakes: See page 87 of the interventions database.\nExplore the relationship between fear of making mistakes and ED symptoms, and create a hierarchy of situations that the participant avoids because of the fear of making mistakes, and assign exposures for homework. In session two and three, conduct an in-session exposure and assign exposures for homework.");
        map2.put("highstndrds", "High Standards: See page 93 of the interventions database.\nProvide psychoeducation about perfectionism and how it involves high standards and concern over mistakes and discuss how perfectionism manifests in participants’ life. Discuss how perfectionism rules and assumptions guide behavior and explore high standards participants sets for themselves. Discuss the helpful and unhelpful aspects of pursuing and loosening high standards and create personalized plan with specific goals toward reducing perfectionistic behavior.");
        map2.put("SAA", "Social Appearance Anxiety: See page 158 of the interventions database.\nIn the first session, introduce thinking errors and automatic thoughts and assign thought logging for homework. In the second session, challenge automatic thoughts and assign homework to challenge more thoughts over the week. In the third session, explain exposure therapy to the participant, create a hierarchy of situations that the participant avoids because of the fear of judgement, and assign exposures for homework. In session four, conduct in-session exposures and assign exposures for homework.");
        map2.put("worry", "Worry: See page 188 of the interventions database.\nIn session one, discuss worry and assign the Worry Outcome Journal as homework. During session two, practice progressive muscle relaxation and breathing meditation. In the third session, practice an acceptance-based meditation in session and assign tracking their meditation practice for homework.");
        map2.put("selfcrit", "Self-Criticism: See page 206 of the interventions database.\nIn session one, discuss self-criticism and contrast it with self-compassion. Conduct Loving-Kindness Meditation and ask the participant questions to help them process it. In session two, complete a self-compassion break, the How Would You Treat a Friend Worksheet, and assign thought logging as homework. During the third session, conduct another self-compassion break and explore self-compassion through writing.");
        map2.put("fearlosgcntrol", "Fear of Losing Control: See page 224 of the interventions database.\nDuring the first session, explore their fear of losing control, explain the cycle of avoidance and control, and assign the Examining What Works handout. In the second session, explore acceptance and willingness and review the What Willingness Is worksheet during session three.");
        map2.put("bodydiss", "Body Dissatisfaction: See page 240 of the interventions database.\nDuring session one, discuss the costs related to pursuing the appearance ideal, conduct a mirror exposure, and as homework, ask the participant to write a letter to an adolescent girl struggling with her body image. During session two, practice self-affirmation exercises and assign behavioral challenges and writing a letter to their younger self as homework. In session three, roleplay to resist the pursuit of the appearance ideal.");
        map2.put("feelineffectve", "Feeling Ineffective: See page 248 of the interventions database.\nIntroduce thinking errors and assign thought logging for homework in the first session. In session two, challenge automatic thoughts, identify core beliefs, and assign Historical Test of Beliefs Worksheet for homework. In session three, design behavioral experiments to challenge the core belief of being ineffective and have them complete a behavioral experiment for homework.");
        map2.put("cogrestraint", "Cognitive Restraint: See page 269 of the interventions database.\nIn the first session, introduce self-monitoring and food logging and instruct the participant to download Recovery Road. In session two, use the Planning and Tracking Regular Eating Worksheet to plan out times when participant will eat their meals and snacks and identify potential hurdles that may hinder eating during those times. In session three, identify any gaps in eating, brainstorm solutions, and adjust the Planning and Tracking Regular Eating Worksheet accordingly.");
        map2.put("eatrules", "Eating Rules: See page 277 of the interventions database.\nIdentify the participant’s current eating rules during the first session and review the Adjusting Rules and Assumptions handout in session two. In the third session, introduce the Eating Rule-Break Behavioral Experiment and discuss the rule that causes them the most distress.");
        map2.put("binge", "Objective Binge Eating: See page 287 of the interventions database.\nIn the first session, introduce self-monitoring and food logging and instruct the participant to download Recovery Road. During session two, use the Planning and Tracking Regular Eating Worksheet to plan out times when participant will eat their meals and snacks and identify potential hurdles that may hinder eating during those times. In session three, identify any gaps in eating, brainstorm solutions, and adjust the Planning and Tracking Regular Eating Worksheet accordingly.");
        map2.put("excexercse", "Excessive Exercise: See page 295 of the interventions database.\nIn session one, discuss the role of exercise in the life of the participant and have them monitor their exercise as homework. In session two, discuss thinking errors and automatic thoughts and have the participant challenge exercise-related thoughts for homework. In session three, help the participant make a plan for exercise that is healthy and sustainable and assign the new exercise plan and self-monitoring for homework.");
        map2.put("bodycheck", "Body Checking: See page 326 of the interventions database.\nDuring the first session, introduce body checking and discuss beginning to delay/prevent body checking and other appearance rituals with the participant. In the second, pick two body checking rituals that the participant would want to erase. Have the participant fill out the Restricting Your Ritual Worksheet for homework. Review the homework in session three and fill out the My Plan for Erasing It worksheet for each body checking ritual.");
        map2.put("impulse", "Impulsivity: See page 352 of the interventions database.\nIn session one, discuss impulsivity and introduce the STOP skill to restrict it. Ask participants to practice the STOP skill as homework. During session two, discuss pros and cons of acting or not acting on the participant’s impulses and assign the Pros and Cons of Acting on Crisis Urges: Distress Tolerance Worksheet 3 as homework. In session three, introduce TIP skills and practice paired muscle relaxation with the participant.");
        map2.put("shame", "Shame: See page 357 of the interventions database.\nIn the first session, explore shame and ask them to track these feelings as homework. In the second session, introduce justified and unjustified shame guilt and go over the steps of checking the facts. In session three, introduce the concept of opposite action and encourage the participant to practice pride the opposite emotion for shame.");
        map2.put("guilt", "Guilt: See page 357 of the interventions database.\nIn the first session, explore guilt and ask them to track these feelings as homework. In the second session, introduce justified and unjustified guilt and go over the steps of checking the facts. In session three, introduce the concept of opposite action and encourage the participant to practice pride, the opposite emotion for guilt.");
        map2.put("depression", "Depression: See page 375 of the interventions database.\nIn the first session, conduct psychoeducation on depression/sadness, behavioral activation, and daily monitoring. In session two, make a list of pleasurable activities that meet SMART goals and as homework, ask participants to add/change one activity each day to add more enjoyment/achievement and to monitor their daily activities. In the third session, discuss the participant’s value domains and encourage them to continue adding/changing activities to add enjoyment/achievement.");
        map2.put("avoidemo", "Emotional Avoidance: See page 395 of the interventions database.\nIn session one, provide psychoeducation on emotional exposures, create an Emotional Avoidance Hierarchy, and assign emotional exposures for homework. In session two and three, conduct an emotional exposure in session and assign exposures for homework.");
        map2.put("overwhlmemo", "Emotions as Overwhelming: See page 404 of the interventions database.\nIn session one, go over the functions of emotions, myths about them, and have participants track their emotions as homework. In session two, introduce naming emotions they commonly feel and have them track their emotions as homework. During session three, go over all of the steps of checking the facts and practice opposite action.");
        map2.put("eatanx", "Eating Anxiety: See page 438 of the interventions database.\nIdentify the participant’s most feared foods and choose one for a food exposure in session one. During sessions two and three, conduct the food exposure and then debrief after, checking in on safety behaviors used during the meal.");
        map2.put("diffrelax", "Difficulty Relaxing: See page 453 of the interventions database.\nIn the first session, introduce identification of automatic anxious thoughts and practice progressive muscle relaxation. Assign the Monitoring My Anxiety worksheet and PMR practice as homework. During the second session, introduce thought challenging and assign the Thinking Errors Log and continued PMR practice. Do a breathing and a guided imagery meditation during session three and assign them as homework.");
        map2.put("interoaware", "Interoceptive Awareness: See page 458 of the interventions database.\nIn session one, explain exposure therapy, create a hierarchy of interoceptive awareness with the participant, and assign exposures for homework. During session two and three, conduct in-session exposures and assign exposures for homework.");
        map2.put("physsenseat", "Physical Sensations of Eating: See page 473 of the interventions database.\nIn session one, explain exposure therapy, create a hierarchy of physical sensations of eating with the participant, and assign exposures for homework. During session two and three, conduct in-session exposures and assign exposures for homework.");
        map2.put("hungeranx", "Hunger Anxiety: See page 489 of the interventions database.\nIn the first session, introduce mindful eating by using the Principles of Mindful Eating and Inner Wisdom/Outer Wisdom Handouts and then do the raisin exercise. Assign mindful eating as homework. In session two, explain physical hunger awareness, stomach fullness, and body satiety. In session three, discuss overeating using the Automatic Pilot and Cycles of Overeating Handout and create a behavior chain.");
        map2.put("ptsd", "Post-Traumatic Stress Disorder: See page 510 of the interventions database.\nConduct a Trauma Interview and construct an in vivo hierarchy in session one. Instruct the participant to begin in vivo assignments as homework. In session two, conduct and then process an imaginal exposure. Again, in session three, conduct and process imaginal exposure and discuss in vivo exposure. In session four and five, conduct imaginal exposure and introduce the hot spots procedure. Finally, in session six, conduct imaginal exposure, review progress and make suggestions for continued practice.");
        map2.put("fearatten", "Fear of Attracting Attention: See page 566 of the interventions database.\nIn session one, explain exposure therapy, create a hierarchy of situations the participant avoids because of fear of attracting attention, and assign exposures for homework. During session two and three, conduct in-session exposures and assign exposures for homework.");
        map2.put("gad", "Generalized Anxiety Disorder: See page 585 of the interventions database.\nDuring the first session, introduce the Worry Outcome Journal and assign filling it out as homework. In the second session, practice progressive muscle relaxation and breathing meditation. Practice an acceptance-based meditation during the third session and assign practicing it as homework.");
        map2.put("allornothing", "All or nothing perfection: An intervention has yet to be developed.");
        map2.put("iuc", "Intolerance of Uncertainty: See page 135 of the interventions database.\nProvide psychoeducation about intolerance of uncertainty and how it manifests. Explain exposure therapy to the participant and create a hierarchy of situations the participant avoids because of intolerance of uncertainty. Conduct in-session exposures and assign homework of completing two exposures twice.");
        map2.put("ruminate", "Rumination: An intervention has yet to be developed.");
        map2.put("postevprocess", "Post-event processing: An intervention has yet to be developed.");
        map2.put("obsess", "Obsessions: An intervention has yet to be developed.");
        map2.put("repthghtfood", "Repetitive thoughts about food: An intervention has yet to be developed.");
        map2.put("mealrum", "Meal rumination: An intervention has yet to be developed.");
        map2.put("skipmeal", "Skipping meals: An intervention has yet to be developed.");
        map2.put("diet", "Dieting: An intervention has yet to be developed.");
        map2.put("vomit", "Self-induced vomiting: An intervention has yet to be developed.");
        map2.put("laxative", "Laxative use: An intervention has yet to be developed.");
        map2.put("diuretic", "Diuretic use: An intervention has yet to be developed.");
        map2.put("compuls", "Compulsions: An intervention has yet to be developed.");
        map2.put("sleepdiff", "Sleep difficulties: An intervention has yet to be developed.");
        map2.put("diffdrinkpublic", "Difficulty drinking in public: An intervention has yet to be developed.");
        map2.put("diffeatpublic", "Difficulty eating in public: See page 336 of the interventions database.\nIn the first session, explain exposure therapy to the participant, create a hierarchy of situations that the participant avoids because of fears of eating in public, and assign exposures for homework. In session two and three, conduct in-session exposures and assign exposures for homework.");
        map2.put("foodavoid", "Food avoidance: An intervention has yet to be developed.");
        map2.put("diffidentemo", "Difficulty identifying emotions: An intervention has yet to be developed.");
        map2.put("disgust", "Disgust: An intervention has yet to be developed.");
        map2.put("hrtrace", "Heart racing: An intervention has yet to be developed.");
        map2.put("ocd", "OCD: An intervention has yet to be developed.");
        map2.put("socialintanx", "Social Interaction Anxiety: See page 535 of the interventions database.\nIn the first session, introduce thinking errors and automatic thoughts and assign thought logging for homework. In the second session, challenge automatic thoughts and assign homework to challenge more thoughts over the week. In the third session, explain exposure therapy to the participant, create a hierarchy of situations that the participant avoids because of social interaction anxiety, and assign exposures for homework. In session four, conduct in-session exposures and assign exposures for homework.");
        map2.put("adhd", "ADHD: An intervention has yet to be developed.");
        map2.put("alcsubuse", "Alcohol and substance use: An intervention has yet to be developed.");
    }

    public void displayTreatment(List<String> sympList) {
        //define symptom variables from array

        symp1 = sympList.get(0);
        symp2 = sympList.get(1);
        symp3 = sympList.get(2);

        System.out.println(symp1);
        System.out.println(symp2);
        System.out.println(symp3);


        if (symp1 == "fowg") {
            output1.setText(map2.get("fowg"));
        } if (symp2 == "fowg") {
            output2.setText(map2.get("fowg"));
        } if (symp3 == "fowg") {
            output3.setText(map2.get("fowg"));
        }
        if (symp1 == "drivethin") {
            output1.setText(map2.get("drivethin"));
        } if (symp2 == "drivethin") {
            output2.setText(map2.get("drivethin"));
        } if (symp3 == "drivethin") {
            output3.setText(map2.get("drivethin"));
        }
        if (symp1.equals("overvaluewghtshp")) {
            output1.setText(map2.get("overvalwtshape"));
        } if (symp2.equals("overvaluewghtshp")) {
            output2.setText(map2.get("overvalwtshape"));
        } if (symp3.equals("overvaluewghtshp")) {
            output3.setText(map2.get("overvalwtshape"));
        }
        if (symp1 == "fearreject") {
            output1.setText(map2.get("fearreject"));
        } if (symp2 == "fearreject") {
            output2.setText(map2.get("fearreject"));
        } if (symp3 == "fearreject") {
            output3.setText(map2.get("fearreject"));
        }
        if (symp1 == "fearmstkes") {
            output1.setText(map2.get("fearmstkes"));
        } if (symp2 == "fearmstkes") {
            output2.setText(map2.get("fearmstkes"));
        } if (symp3 == "fearmstkes") {
            output3.setText(map2.get("fearmstkes"));
        }
        if (symp1 == "highstndrds") {
            output1.setText(map2.get("highstndrds"));
        } if (symp2 == "highstndrds") {
            output2.setText(map2.get("highstndrds"));
        } if (symp3 == "highstndrds") {
            output3.setText(map2.get("highstndrds"));
        }
        if (symp1 == "SAA") {
            output1.setText(map2.get("SAA"));
        } if (symp2 == "SAA") {
            output2.setText(map2.get("SAA"));
        } if (symp3 == "SAA") {
            output3.setText(map2.get("SAA"));
        }
        if (symp1 == "worry") {
            output1.setText(map2.get("worry"));
        } if (symp2 == "worry") {
            output2.setText(map2.get("worry"));
        } if (symp3 == "worry") {
            output3.setText(map2.get("worry"));
        }
        if (symp1 == "selfcrit") {
            output1.setText(map2.get("selfcrit"));
        } if (symp2 == "selfcrit") {
            output2.setText(map2.get("selfcrit"));
        } if (symp3 == "selfcrit") {
            output3.setText(map2.get("selfcrit"));
        }
        if (symp1.equals("fearlosecontrol")) {
            output1.setText(map2.get("fearlosgcntrol"));
        } if (symp2.equals("fearlosecontrol")) {
            output2.setText(map2.get("fearlosgcntrol"));
        } if (symp3.equals("fearlosecontrol")) {
            output3.setText(map2.get("fearlosgcntrol"));
        }
        if (symp1 == "bodydiss") {
            output1.setText(map2.get("bodydiss"));
        } if (symp2 == "bodydiss") {
            output2.setText(map2.get("bodydiss"));
        } if (symp3 == "bodydiss") {
            output3.setText(map2.get("bodydiss"));
        }
        if (symp1 == "feelineffectve") {
            output1.setText(map2.get("feelineffectve"));
        } if (symp2 == "feelineffectve") {
            output2.setText(map2.get("feelineffectve"));
        } if (symp3 == "feelineffectve") {
            output3.setText(map2.get("feelineffectve"));
        }
        if (symp1 == "cogrestraint") {
            output1.setText(map2.get("cogrestraint"));
        } if (symp2 == "cogrestraint") {
            output2.setText(map2.get("cogrestraint"));
        } if (symp3 == "cogrestraint") {
            output3.setText(map2.get("cogrestraint"));
        }
        if (symp1 == "eatrules") {
            output1.setText(map2.get("eatrules"));
        } if (symp2 == "eatrules") {
            output2.setText(map2.get("eatrules"));
        } if (symp3 == "eatrules") {
            output3.setText(map2.get("eatrules"));
        }
        if (symp1 == "binge") {
            output1.setText(map2.get("binge"));
        } if (symp2 == "binge") {
            output2.setText(map2.get("binge"));
        } if (symp3 == "binge") {
            output3.setText(map2.get("binge"));
        }
        if (symp1 == "excexercse") {
            output1.setText(map2.get("excexercse"));
        } if (symp2 == "excexercse") {
            output2.setText(map2.get("excexercse"));
        } if (symp3 == "excexercse") {
            output3.setText(map2.get("excexercse"));
        }
        if (symp1 == "bodycheck") {
            output1.setText(map2.get("bodycheck"));
        } if (symp2 == "bodycheck") {
            output2.setText(map2.get("bodycheck"));
        } if (symp3 == "bodycheck") {
            output3.setText(map2.get("bodycheck"));
        }
        if (symp1 == "impulse") {
            output1.setText(map2.get("impulse"));
        } if (symp2 == "impulse") {
            output2.setText(map2.get("impulse"));
        } if (symp3 == "impulse") {
            output3.setText(map2.get("impulse"));
        }
        if (symp1 == "shame") {
            output1.setText(map2.get("shame"));
        } if (symp2 == "shame") {
            output2.setText(map2.get("shame"));
        } if (symp3 == "shame") {
            output3.setText(map2.get("shame"));
        }
        if (symp1 == "guilt") {
            output1.setText(map2.get("guilt"));
        } if (symp2 == "guilt") {
            output2.setText(map2.get("guilt"));
        } if (symp3 == "guilt") {
            output3.setText(map2.get("guilt"));
        }
        if (symp1 == "depression") {
            output1.setText(map2.get("depression"));
        } if (symp2 == "depression") {
            output2.setText(map2.get("depression"));
        } if (symp3 == "depression") {
            output3.setText(map2.get("depression"));
        }
        if (symp1 == "avoidemo") {
            output1.setText(map2.get("avoidemo"));
        } if (symp2 == "avoidemo") {
            output2.setText(map2.get("avoidemo"));
        } if (symp3 == "avoidemo") {
            output3.setText(map2.get("avoidemo"));
        }
        if (symp1 == "overwhlmemo") {
            output1.setText(map2.get("overwhlmemo"));
        } if (symp2 == "overwhlmemo") {
            output2.setText(map2.get("overwhlmemo"));
        } if (symp3 == "overwhlmemo") {
            output3.setText(map2.get("overwhlmemo"));
        }
        if (symp1 == "eatanx") {
            output1.setText(map2.get("eatanx"));
        } if (symp2 == "eatanx") {
            output2.setText(map2.get("eatanx"));
        } if (symp3 == "eatanx") {
            output3.setText(map2.get("eatanx"));
        }
        if (symp1 == "diffrelax") {
            output1.setText(map2.get("diffrelax"));
        } if (symp2 == "diffrelax") {
            output2.setText(map2.get("diffrelax"));
        } if (symp3 == "diffrelax") {
            output3.setText(map2.get("diffrelax"));
        }
        if (symp1 == "interoaware") {
            output1.setText(map2.get("interoaware"));
        } if (symp2 == "interoaware") {
            output2.setText(map2.get("interoaware"));
        } if (symp3 == "interoaware") {
            output3.setText(map2.get("interoaware"));
        }
        if (symp1 == "physsenseat") {
            output1.setText(map2.get("physsenseat"));
        } if (symp2 == "physsenseat") {
            output2.setText(map2.get("physsenseat"));
        } if (symp3 == "physsenseat") {
            output3.setText(map2.get("physsenseat"));
        }
        if (symp1 == "hungeranx") {
            output1.setText(map2.get("hungeranx"));
        } if (symp2 == "hungeranx") {
            output2.setText(map2.get("hungeranx"));
        } if (symp3 == "hungeranx") {
            output3.setText(map2.get("hungeranx"));
        }
        if (symp1 == "ptsd") {
            output1.setText(map2.get("ptsd"));
        } if (symp2 == "ptsd") {
            output2.setText(map2.get("ptsd"));
        } if (symp3 == "ptsd") {
            output3.setText(map2.get("ptsd"));
        }
        if (symp1 == "fearatten") {
            output1.setText(map2.get("fearatten"));
        } if (symp2 == "fearatten") {
            output2.setText(map2.get("fearatten"));
        } if (symp3 == "fearatten") {
            output3.setText(map2.get("fearatten"));
        }
        if (symp1 == "gad") {
            output1.setText(map2.get("gad"));
        } if (symp2 == "gad") {
            output2.setText(map2.get("gad"));
        } if (symp3 == "gad") {
            output3.setText(map2.get("gad"));
        }
        if (symp1 == "allornothing") {
            output1.setText(map2.get("allornothing"));
        } if (symp2 == "allornothing") {
            output2.setText(map2.get("allornothing"));
        } if (symp3 == "allornothing") {
            output3.setText(map2.get("allornothing"));
        }
        if (symp1 == "iuc") {
            output1.setText(map2.get("iuc"));
        } if (symp2 == "iuc") {
            output2.setText(map2.get("iuc"));
        } if (symp3 == "iuc") {
            output3.setText(map2.get("iuc"));
        }
        if (symp1 == "ruminate") {
            output1.setText(map2.get("ruminate"));
        } if (symp2 == "ruminate") {
            output2.setText(map2.get("ruminate"));
        } if (symp3 == "ruminate") {
            output3.setText(map2.get("ruminate"));
        }
        if (symp1 == "postevprocess") {
            output1.setText(map2.get("postevprocess"));
        } if (symp2 == "postevprocess") {
            output2.setText(map2.get("postevprocess"));
        } if (symp3 == "postevprocess") {
            output3.setText(map2.get("postevprocess"));
        }
        if (symp1 == "obsess") {
            output1.setText(map2.get("obsess"));
        } if (symp2 == "obsess") {
            output2.setText(map2.get("obsess"));
        } if (symp3 == "obsess") {
            output3.setText(map2.get("obsess"));
        }
        if (symp1 == "repthghtfood") {
            output1.setText(map2.get("repthghtfood"));
        } if (symp2 == "repthghtfood") {
            output2.setText(map2.get("repthghtfood"));
        } if (symp3 == "repthghtfood") {
            output3.setText(map2.get("repthghtfood"));
        }
        if (symp1 == "mealrum") {
            output1.setText(map2.get("mealrum"));
        } if (symp2 == "mealrum") {
            output2.setText(map2.get("mealrum"));
        } if (symp3 == "mealrum") {
            output3.setText(map2.get("mealrum"));
        }
        if (symp1 == "skipmeal") {
            output1.setText(map2.get("skipmeal"));
        } if (symp2 == "skipmeal") {
            output2.setText(map2.get("skipmeal"));
        } if (symp3 == "skipmeal") {
            output3.setText(map2.get("skipmeal"));
        }
        if (symp1 == "diet") {
            output1.setText(map2.get("diet"));
        } if (symp2 == "diet") {
            output2.setText(map2.get("diet"));
        } if (symp3 == "diet") {
            output3.setText(map2.get("diet"));
        }
        if (symp1 == "vomit") {
            output1.setText(map2.get("vomit"));
        } if (symp2 == "vomit") {
            output2.setText(map2.get("vomit"));
        } if (symp3 == "vomit") {
            output3.setText(map2.get("vomit"));
        }
        if (symp1 == "laxative") {
            output1.setText(map2.get("laxative"));
        } if (symp2 == "laxative") {
            output2.setText(map2.get("laxative"));
        } if (symp3 == "laxative") {
            output3.setText(map2.get("laxative"));
        }
        if (symp1 == "diuretic") {
            output1.setText(map2.get("diuretic"));
        } if (symp2 == "diuretic") {
            output2.setText(map2.get("diuretic"));
        } if (symp3 == "diuretic") {
            output3.setText(map2.get("diuretic"));
        }
        if (symp1 == "compuls") {
            output1.setText(map2.get("compuls"));
        } if (symp2 == "compuls") {
            output2.setText(map2.get("compuls"));
        } if (symp3 == "compuls") {
            output3.setText(map2.get("compuls"));
        }
        if (symp1 == "sleepdiff") {
            output1.setText(map2.get("sleepdiff"));
        } if (symp2 == "sleepdiff") {
            output2.setText(map2.get("sleepdiff"));
        } if (symp3 == "sleepdiff") {
            output3.setText(map2.get("sleepdiff"));
        }
        if (symp1 == "diffdrinkpublic") {
            output1.setText(map2.get("diffdrinkpublic"));
        } if (symp2 == "diffdrinkpublic") {
            output2.setText(map2.get("diffdrinkpublic"));
        } if (symp3 == "diffdrinkpublic") {
            output3.setText(map2.get("diffdrinkpublic"));
        }
        if (symp1 == "diffeatpublic") {
            output1.setText(map2.get("diffeatpublic"));
        } if (symp2 == "diffeatpublic") {
            output2.setText(map2.get("diffeatpublic"));
        } if (symp3 == "diffeatpublic") {
            output3.setText(map2.get("diffeatpublic"));
        }
        if (symp1 == "foodavoid") {
            output1.setText(map2.get("foodavoid"));
        } if (symp2 == "foodavoid") {
            output2.setText(map2.get("foodavoid"));
        } if (symp3 == "foodavoid") {
            output3.setText(map2.get("foodavoid"));
        }
        if (symp1 == "diffidentemo") {
            output1.setText(map2.get("diffidentemo"));
        } if (symp2 == "diffidentemo") {
            output2.setText(map2.get("diffidentemo"));
        } if (symp3 == "diffidentemo") {
            output3.setText(map2.get("diffidentemo"));
        }
        if (symp1 == "disgust") {
            output1.setText(map2.get("disgust"));
        } if (symp2 == "disgust") {
            output2.setText(map2.get("disgust"));
        } if (symp3 == "disgust") {
            output3.setText(map2.get("disgust"));
        }
        if (symp1 == "hrtrace") {
            output1.setText(map2.get("hrtrace"));
        } if (symp2 == "hrtrace") {
            output2.setText(map2.get("hrtrace"));
        } if (symp3 == "hrtrace") {
            output3.setText(map2.get("hrtrace"));
        }
        if (symp1 == "ocd") {
            output1.setText(map2.get("ocd"));
        } if (symp2 == "ocd") {
            output2.setText(map2.get("ocd"));
        } if (symp3 == "ocd") {
            output3.setText(map2.get("ocd"));
        }
        if (symp1 == "socialintanx ") {
            output1.setText(map2.get("socialintanx"));
        } if (symp2 == "socialintanx ") {
            output2.setText(map2.get("socialintanx"));
        } if (symp3 == "socialintanx ") {
            output3.setText(map2.get("socialintanx"));
        }
        if (symp1 == "adhd") {
            output1.setText(map2.get("adhd"));
        } if (symp2 == "adhd") {
            output2.setText(map2.get("adhd"));
        } if (symp3 == "adhd") {
            output3.setText(map2.get("adhd"));
        }
        if (symp1 == "alcsubuse") {
            output1.setText(map2.get("alcsubuse"));
        } if (symp2 == "alcsubuse") {
            output2.setText(map2.get("alcsubuse"));
        } if (symp3 == "alcsubuse") {
            output3.setText(map2.get("alcsubuse"));
        }
    }


}
