package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class PlinkoParser {
    
    public String parse(String input) {
        
        String code = input;
        boolean matched = true;
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        
        /* Echo input string */
        
        System.out.println("Parsing: " + input + "\n");
        
        /* Create precompiled pattern matchers (for AIs 01, 17, and 10) */
        
        Pattern p332n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p333n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p334n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p335n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p336n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p337n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p340n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p341n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p342n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p343n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p344n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p345n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p346n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p347n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p348n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p349n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p350n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p351n = Pattern.compile("^332n[0 - 9]{6}");
        Pattern p352n = Pattern.compile("^332n[0 - 9]{6}");
        
        /* Add pattern matchers to iterable collection */
        
        patterns.add(p332n);
        patterns.add(p333n);
        patterns.add(p334n);
        patterns.add(p335n);
        patterns.add(p336n);
        patterns.add(p337n);
        patterns.add(p340n);
        patterns.add(p341n);
        patterns.add(p342n);
        patterns.add(p343n);
        patterns.add(p344n);
        patterns.add(p345n);
        patterns.add(p346n);
        patterns.add(p347n);
        patterns.add(p348n);
        patterns.add(p349n);
        patterns.add(p350n);
        patterns.add(p351n);
        patterns.add(p352n);
        
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