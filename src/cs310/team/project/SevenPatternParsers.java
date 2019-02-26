/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs310.team.project;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lemmo
 */
public class SevenPatternParsers {
    
 
    public String parse(String input) {
        
        String code = input;
        boolean matched = true;
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        
        /* Echo input string */
        
        System.out.println("Parsing: " + input + "\n");
        
        /* Create precompiled pattern matchers (for AIs 01, 17, and 10) */
        


        Pattern p7001 = Pattern.compile("^7001[0-9]{13}[%\\x1D]");
        Pattern p7001eol = Pattern.compile("^7001[0-9]{13}$");
        Pattern p7002 = Pattern.compile("^7002(.){1,30}[%\\x1D]");
        Pattern p7002eol = Pattern.compile("^7002(.){1,30}$");
        Pattern p7003 = Pattern.compile("^7003[0-9]{10}[%\\x1D]");
        Pattern p7003eol = Pattern.compile("^7003[0-9]{10}$");
        Pattern p7004 = Pattern.compile("^7004[0-9]{1,4}[%\\x1D]");
        Pattern p7004eol = Pattern.compile("^7004[0-9]{1,4}$");
        Pattern p7005 = Pattern.compile("^7005(.){1,12}[%\\x1D]");
        Pattern p7005eol = Pattern.compile("^7005(.){1,12}$");
        Pattern p7006 = Pattern.compile("^7006[0-9]{6}[%\\x1D]");
        Pattern p7006eol = Pattern.compile("^7006[0-9]{6}$");
        Pattern p7007 = Pattern.compile("^7007[0-9]{6,12}[%\\x1D]");
        Pattern p7007eol = Pattern.compile("^7007[0-9]{6,12}$");
        Pattern p7008 = Pattern.compile("^7008(.){1,3}[%\\x1D]");
        Pattern p7008eol = Pattern.compile("^7008(.){1,3}$");
        Pattern p7009 = Pattern.compile("^7009(.){1,10}[%\\x1D]");
        Pattern p7009eol = Pattern.compile("^7009(.){1,10}$");
        Pattern p7010 = Pattern.compile("^7010(.){1,2}[%\\x1D]");
        Pattern p7010eol = Pattern.compile("^7010(.){1,2}$");
        Pattern p7020 = Pattern.compile("^7020(.){1,20}[%\\x1D]");
        Pattern p7020eol = Pattern.compile("^7020(.){1,20}$");
        Pattern p7021 = Pattern.compile("^7021(.){1,20}[%\\x1D]");
        Pattern p7021eol = Pattern.compile("^7021(.){1,20}$");
        Pattern p7022 = Pattern.compile("^7022(.){1,20}[%\\x1D]");
        Pattern p7022eol = Pattern.compile("^7022(.){1,20}$");
        Pattern p7023 = Pattern.compile("^7023(.){1,20}[%\\x1D]");
        Pattern p7023eol = Pattern.compile("^7023(.){1,20}$");
        Pattern p703s = Pattern.compile("^703s(.){2}(.){1,27}[%\\x1D]");
        Pattern p703seol = Pattern.compile("^703s(.){2}(.){1,27}$");
        Pattern p710 = Pattern.compile("^710(.){1,20}[%\\x1D]");
        Pattern p710eol = Pattern.compile("^710(.){1,20}$");
        Pattern p711 = Pattern.compile("^711(.){1,20}[%\\x1D]");
        Pattern p711eol = Pattern.compile("^711(.){1,20}$");
        Pattern p712 = Pattern.compile("^712(.){1,20}[%\\x1D]");
        Pattern p712eol = Pattern.compile("^712(.){1,20}$");
        Pattern p713 = Pattern.compile("^713(.){1,20}[%\\x1D]");
        Pattern p713eol = Pattern.compile("^713(.){1,20}$");
        Pattern p714 = Pattern.compile("^714(.){1,20}[%\\x1D]");
        Pattern p714eol = Pattern.compile("^714(.){1,20}$");
        Pattern p723s = Pattern.compile("^723s(.){2}(.){1,28}[%\\x1D]");
        Pattern p723seol = Pattern.compile("^723s(.){2}(.){1,28}$");

        /* Add pattern matchers to iterable collection */
        
        patterns.add(p7001);
        patterns.add(p7001eol);
        patterns.add(p7002);
        patterns.add(p7002eol);
        patterns.add(p7003);
        patterns.add(p7003eol);
        patterns.add(p7004);
        patterns.add(p7004eol);
        patterns.add(p7005);
        patterns.add(p7005eol);
        patterns.add(p7006);
        patterns.add(p7006eol);
        patterns.add(p7007);
        patterns.add(p7007eol);
        patterns.add(p7008);
        patterns.add(p7008eol);
        patterns.add(p7009);
        patterns.add(p7009eol);
        patterns.add(p7010);
        patterns.add(p7010eol);
        patterns.add(p7020);
        patterns.add(p7020eol);
        patterns.add(p7021);
        patterns.add(p7021eol);
        patterns.add(p7022);
        patterns.add(p7022eol);
        patterns.add(p7023);
        patterns.add(p7023eol);
        patterns.add(p703s);
        patterns.add(p703seol);
        patterns.add(p710);
        patterns.add(p710eol);
        patterns.add(p711);
        patterns.add(p711eol);
        patterns.add(p712);
        patterns.add(p712eol);
        patterns.add(p713);
        patterns.add(p713eol);
        patterns.add(p714);
        patterns.add(p714eol);
        patterns.add(p723s);
        patterns.add(p723seol);
        
        
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
