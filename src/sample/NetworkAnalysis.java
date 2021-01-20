package sample;

//import org.renjin.script.RenjinScriptEngine;
//import org.renjin.sexp.DoubleArrayVector;

import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NetworkAnalysis {

    public void runNetwork() {

        try {
            Runtime.getRuntime().exec("Rscript network_analysis.R");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
