package cs310.team.project;

import java.util.ArrayList;
import java.util.regex.*;

public class PlinkoParser {
    
    public String parse(String input) {
                
        String code = input;
        boolean matched = true;
        
        AI3 AppID3 = new AI3();
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        
        if(AppID3.Match(code).startsWith("^3")) {
            System.out.println("Test");
        } else {
            System.out.println("Fail");
        }
        
        /* Loop until input is fully processed, or an unknown code is found */
        
        while ( !code.isEmpty() && matched ) {
            
            matched = false;
            
            /* Run input string against recognized pattern matchers */
            
            for (Pattern p : patterns) {
                
                /* Run next pattern matcher */
                Matcher m = p.matcher(code);
                
                /* Was it a match? */
                if (m.find()) {
                    
                    /* Flip "matched" flag */
                    matched = true;

                    /* Get string offset of the end of the matched code */
                    int end = m.end();

                    /* Print matched code */
                    System.out.println("Found Code: " + m.group());

                    /* Strip matched code from the input string */
                    code = code.substring(end).trim();

                }

            }
            
        }
        
        /* Print original input string */
        
        System.out.println("\nFinished Parsing: " + input);
        
        /* Replace this with a JSON string containing the parsed code data */
        
        return ( "" );
        
    }
        
}