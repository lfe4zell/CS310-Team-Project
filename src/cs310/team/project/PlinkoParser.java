package cs310.team.project;

import java.util.ArrayList;
import java.util.regex.*;

public class PlinkoParser {
    
    public String parse(String input) {
        
        String code = input;
        boolean matched = true;
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        
        /* Echo input string */
        
        System.out.println("Parsing: " + input + "\n");
           
        //Pattern p10eol = Pattern.compile("^10(.){1,20}$");     // AI #10 (eol)

// <editor-fold desc="AI Patterns">
        Pattern p30   = Pattern.compile("^30(.){1,20}[%\\x1D]"); //AI #30
        Pattern p310n = Pattern.compile("^310n[0-9]{6}");   //AI #310N
        Pattern p311n = Pattern.compile("^311n[0-9]{6}");   //AI #311N
        Pattern p312n = Pattern.compile("^312n[0-9]{6}");   //AI #312N
        Pattern p313n = Pattern.compile("^313n[0-9]{6}");   //AI #313N
        Pattern p314n = Pattern.compile("^314n[0-9]{6}");   //AI #314N
        Pattern p315n = Pattern.compile("^315n[0-9]{6}");   //AI #315N
        Pattern p316n = Pattern.compile("^316n[0-9]{6}");   //AI #316N
        Pattern p320n = Pattern.compile("^320n[0-9]{6}");   //AI #320N
        Pattern p321n = Pattern.compile("^321n[0-9]{6}");   //AI #321N
        Pattern p322n = Pattern.compile("^322n[0-9]{6}");   //AI #322N
        Pattern p323n = Pattern.compile("^323n[0-9]{6}");   //AI #323N
        Pattern p324n = Pattern.compile("^324n[0-9]{6}");   //AI #324N
        Pattern p325n = Pattern.compile("^325n[0-9]{6}");   //AI #325N
        Pattern p326n = Pattern.compile("^326n[0-9]{6}");   //AI #326N
        Pattern p327n = Pattern.compile("^327n[0-9]{6}");   //AI #327N
        Pattern p328n = Pattern.compile("^328n[0-9]{6}");   //AI #328N
        Pattern p329n = Pattern.compile("^329n[0-9]{6}");   //AI #329N
        Pattern p330n = Pattern.compile("^330n[0-9]{6}");   //AI #330N
        Pattern p331n = Pattern.compile("^331n[0-9]{6}");   //AI #331N
        
// </editor-fold>
  
// <editor-fold desc="Add patterns to iterable structure">
        patterns.add(p30);
        patterns.add(p310n);
        patterns.add(p311n);
        patterns.add(p312n);
        patterns.add(p313n);
        patterns.add(p314n);
        patterns.add(p315n);
        patterns.add(p316n);
        patterns.add(p320n);
        patterns.add(p321n);
        patterns.add(p322n);
        patterns.add(p323n);
        patterns.add(p324n);
        patterns.add(p325n);
        patterns.add(p326n);
        patterns.add(p327n);
        patterns.add(p328n);
        patterns.add(p329n);
        patterns.add(p330n);
        patterns.add(p331n);

        //patterns.add(p10eol);
// </editor-fold>

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