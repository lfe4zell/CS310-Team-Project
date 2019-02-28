package src.cs310.team.project;

import java.util.ArrayList;
import java.util.regex.*;

public class CS310TeamProject {
    
    public String parse(String input) {
        
        String code = input;
        boolean matched = true;
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        
        /* Echo input string */
        
        System.out.println("Parsing: " + input + "\n");
        
        /* Create precompiled pattern matchers (for AIs 01, 17, and 10) */
        
        Pattern p01 = Pattern.compile("^01[0-9]{14}");         // AI #01
        Pattern p17 = Pattern.compile("^17[0-9]{6}");          // AI #17        
        Pattern p10 = Pattern.compile("^10(.){1,20}[%\\x1D]"); // AI #10
        Pattern p10eol = Pattern.compile("^10(.){1,20}$");     // AI #10 (eol)
        
        
        // My Patterns:
        
        Pattern p400 = Pattern.compile("^400(.){1,30}[%\\x1D]");
        Pattern p400eol = Pattern.compile("^400(.){1,30}$");
        Pattern p401 = Pattern.compile("^401(.){1,30}[%\\x1D]");
        Pattern p401eol = Pattern.compile("^401(.){1,30}$");
        Pattern p402 = Pattern.compile("^402[0-9]{17}[%\\x1D]");
        Pattern p402eol = Pattern.compile("^402[0-9]{17}$");
        Pattern p403 = Pattern.compile("^403(.){1,30}[%\\x1D]");
        Pattern p403eol = Pattern.compile("^403(.){1,30}$");
        Pattern p410 = Pattern.compile("^410[0-9]{13}");
        Pattern p411 = Pattern.compile("^411[0-9]{13}");
        Pattern p412 = Pattern.compile("^412[0-9]{13}");
        Pattern p413 = Pattern.compile("^413[0-9]{13}");
        Pattern p414 = Pattern.compile("^414[0-9]{13}");
        Pattern p415 = Pattern.compile("^415[0-9]{13}");
        Pattern p416 = Pattern.compile("^416[0-9]{13}");

        // Double Check Pattern 420 - 427
       
        Pattern p420 = Pattern.compile("^420(.){1,20}[%\\x1D]");
        Pattern p420eol = Pattern.compile("^420(.){1,20}$");
        Pattern p421 = Pattern.compile("^421[0-9]{3}(.){1,9}[%\\x1D]");
        Pattern p421eol = Pattern.compile("^421[0,9]{3}(.){1,9}$");
        Pattern p422 = Pattern.compile("^422[0-9]{3}[%\\x1D]");
        Pattern p422eol = Pattern.compile("^421[0,9]{3}$");
        Pattern p423 = Pattern.compile("^423[0-9]{3}[0-9]{1,12}[%\\x1D]");
        Pattern p423eol = Pattern.compile("^423[0-9]{3}[0-9]{1,12}$");
        Pattern p424 = Pattern.compile("^424[0-9]{3}[%\\x1D]");
        Pattern p424eol = Pattern.compile("^424[0-9]{3}$");
        Pattern p425 = Pattern.compile("^425[0-9]{3}[0-9]{1,12}[%\\x1D]");
        Pattern p425eol = Pattern.compile("^425[0-9]{3}[0-9]{1,12}$");
        Pattern p426 = Pattern.compile("^426[0-9]{3}[%\\x1D]");
        Pattern p426eol = Pattern.compile("^426[0-9]{3}$");
        Pattern p427 = Pattern.compile("^427(.){1,3}[%\\1xD]");
        Pattern p427eol = Pattern.compile("^427(.){1,3}$");
        
        
        Pattern p90 = Pattern.compile("^90(.){1,30}[%\\x1D]");
        Pattern p90eol = Pattern.compile("^90(.){1,30}$");
        Pattern p91 = Pattern.compile("^91(.){1,90}[%\\x1D]");
        Pattern p91eol = Pattern.compile("^91(.){1,90}$");
        Pattern p92 = Pattern.compile("^92(.){1,90}[%\\x1D]");
        Pattern p92eol = Pattern.compile("^92(.){1,90}$");
        Pattern p93 = Pattern.compile("^93(.){1,90}[%\\x1D]");
        Pattern p93eol = Pattern.compile("^93(.){1,90}$");
        Pattern p94 = Pattern.compile("^94(.){1,90}[%\\x1D]");
        Pattern p94eol = Pattern.compile("^94(.){1,90}$");
        Pattern p95 = Pattern.compile("^95(.){1,90}[%\\x1D]");
        Pattern p95eol = Pattern.compile("^95(.){1,90}$");
        Pattern p96 = Pattern.compile("^96(.){1,90}[%\\x1D]");
        Pattern p96eol = Pattern.compile("^96(.){1,90}$");
        Pattern p97 = Pattern.compile("^97(.){1,90}[%\\x1D]");
        Pattern p97eol = Pattern.compile("^97(.){1,90}$");
        Pattern p98 = Pattern.compile("^98(.){1,90}[%\\x1D]");
        Pattern p98eol = Pattern.compile("^98(.){1,90}$");
        Pattern p99 = Pattern.compile("^99(.){1,90}[%\\x1D]");
        Pattern p99eol = Pattern.compile("^99(.){1,90}$");
        
        
        /* Add pattern matchers to iterable collection */
        
        patterns.add(p01);
        patterns.add(p17);
        patterns.add(p10);
        patterns.add(p10eol);
        
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