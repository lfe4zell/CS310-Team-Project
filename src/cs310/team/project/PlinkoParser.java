package cs310.team.project;

import java.util.ArrayList;
import java.util.regex.*;

public class PlinkoParser {
    
    public String parse(String input) {
                
        String code = input;
        boolean matched = true;
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        
        
// <editor-fold desc="Application Identifier Pattern Matchers">
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
        
        //AI 7001-723s
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
        
//</editor-fold>
        
        
// <editor-fold desc="Adding Pattern Matchers to Array">
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
        
        //AI 332n-352n
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
        
        //AI 7001-723s
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

//</editor-fold>
        
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