package cs310.team.project;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AI3 {
    public String Match(String input) {
        String code = input;
        boolean matched = true;
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        
        Pattern p30   = Pattern.compile("^30(.){1,20}[%\\x1D]"); //AI #30
        Pattern p30eol = Pattern.compile("^30(.){1,20}$");  //AI #30EOL
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
        
        //AI 332n-352n
        Pattern p332n = Pattern.compile("^332n[0-9]{6}");
        Pattern p333n = Pattern.compile("^333n[0-9]{6}");
        Pattern p334n = Pattern.compile("^334n[0-9]{6}");
        Pattern p335n = Pattern.compile("^335n[0-9]{6}");
        Pattern p336n = Pattern.compile("^336n[0-9]{6}");
        Pattern p337n = Pattern.compile("^337n[0-9]{6}");
        Pattern p340n = Pattern.compile("^340n[0-9]{6}");
        Pattern p341n = Pattern.compile("^341n[0-9]{6}");
        Pattern p342n = Pattern.compile("^342n[0-9]{6}");
        Pattern p343n = Pattern.compile("^343n[0-9]{6}");
        Pattern p344n = Pattern.compile("^344n[0-9]{6}");
        Pattern p345n = Pattern.compile("^345n[0-9]{6}");
        Pattern p346n = Pattern.compile("^346n[0-9]{6}");
        Pattern p347n = Pattern.compile("^347n[0-9]{6}");
        Pattern p348n = Pattern.compile("^348n[0-9]{6}");
        Pattern p349n = Pattern.compile("^349n[0-9]{6}");
        Pattern p350n = Pattern.compile("^350n[0-9]{6}");
        Pattern p351n = Pattern.compile("^351n[0-9]{6}");
        Pattern p352n = Pattern.compile("^352n[0-9]{6}");
        
        //Add pattern matchers to array
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
        
        return input;

    }
}
