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
        
        /* Create precompiled pattern matchers (for AIs 01, 17, and 10) */
        
        Pattern p00 = Pattern.compile("^00[0-9]{18}");         // AI #00
        Pattern p01 = Pattern.compile("^01[0-9]{14}");         // AI #01
        Pattern p02 = Pattern.compile("^02[0-9]{14}");         // AI #02
        Pattern p17 = Pattern.compile("^17[0-9]{6}");          // AI #17        
        Pattern p10 = Pattern.compile("^10(.){1,20}[%\\x1D]"); // AI #10
        Pattern p10eol = Pattern.compile("^10(.){1,20}$");     // AI #10 (eol)
        Pattern p11 = Pattern.compile("^11[0-9]{6}");         // AI #11
        Pattern p12 = Pattern.compile("^12[0-9]{6}");         // AI #12
        Pattern p13 = Pattern.compile("^13[0-9]{6}");         // AI #13
        Pattern p15 = Pattern.compile("^15[0-9]{6}");         // AI #15
        Pattern p16 = Pattern.compile("^16[0-9]{6}");         // AI #16
        Pattern p20 = Pattern.compile("^20[0-9]{2}");         // AI #20
        
        Pattern p21 = Pattern.compile("^21(.){1,20}[%\\x1D]"); // AI #21
        Pattern p21eol = Pattern.compile("^21(.){1,20}$");     // AI #21 (eol)
        
        Pattern p22 = Pattern.compile("^22(.){1,20}[%\\x1D]"); // AI #22
        Pattern p22eol = Pattern.compile("^22(.){1,20}$");     // AI #22 (eol)

        Pattern p240 = Pattern.compile("^240(.){1,30}[%\\x1D]"); // AI #240
        Pattern p240eol = Pattern.compile("^240(.){1,30}$");     // AI #240 (eol)

        Pattern p241 = Pattern.compile("^241(.){1,30}[%\\x1D]"); // AI #241
        Pattern p241eol = Pattern.compile("^241(.){1,30}$");     // AI #241 (eol)

        Pattern p242 = Pattern.compile("^242(.){1,6}[%\\x1D]"); // AI #242
        Pattern p242eol = Pattern.compile("^242(.){1,6}$");     // AI #242 (eol)

        Pattern p243 = Pattern.compile("^243(.){1,20}[%\\x1D]"); // AI #243
        Pattern p243eol = Pattern.compile("^243(.){1,20}$");     // AI #243 (eol)

        Pattern p250 = Pattern.compile("^250(.){1,30}[%\\x1D]"); // AI #250
        Pattern p250eol = Pattern.compile("^250(.){1,30}$");     // AI #250 (eol)

        Pattern p251 = Pattern.compile("^251(.){1,30}[%\\x1D]"); // AI #251
        Pattern p251eol = Pattern.compile("^251(.){1,30}$");     // AI #251 (eol)

        Pattern p253 = Pattern.compile("^253(.){1,13}[%\\x1D]"); // AI #253
        Pattern p253eol = Pattern.compile("^253(.){1,13}$");     // AI #253 (eol)

        Pattern p254 = Pattern.compile("^254(.){1,20}[%\\x1D]"); // AI #254
        Pattern p254eol = Pattern.compile("^254(.){1,20}$");     // AI #254 (eol)

        Pattern p255 = Pattern.compile("^255(.){1,13}[%\\x1D]"); // AI #255
        Pattern p255eol = Pattern.compile("^255(.){1,13}$");     // AI #255 (eol)
        
        //AI 30-331n
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
        
        /* Add pattern matchers to iterable collection */
        
        //AI 0-2
        patterns.add(p00);
        patterns.add(p01);
        patterns.add(p02);
        patterns.add(p10);
        patterns.add(p10eol);
        patterns.add(p11);
        patterns.add(p12);
        patterns.add(p13);
        patterns.add(p15);
        patterns.add(p16);
        patterns.add(p17);
        patterns.add(p20);
        patterns.add(p21);
        patterns.add(p21eol);
        patterns.add(p22);
        patterns.add(p22eol);
        patterns.add(p240);
        patterns.add(p240eol);
        patterns.add(p241);
        patterns.add(p241eol);
        patterns.add(p242);
        patterns.add(p242eol);
        patterns.add(p243);
        patterns.add(p243eol);
        patterns.add(p250);
        patterns.add(p250eol);
        patterns.add(p251);
        patterns.add(p251eol);
        patterns.add(p253);
        patterns.add(p253eol);
        patterns.add(p254);
        patterns.add(p254eol);
        patterns.add(p255);
        patterns.add(p255eol);
        
        //AI 30-331N
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