package edu.jsu.mcis.plinkoproto;

import java.lang.reflect.Constructor;
import org.json.simple.JSONValue;
import java.util.ArrayList;
import java.util.HashMap;

public class PlinkoMasterParser {
    
    /* TOP-LEVEL PARSE METHOD */
    
    public String parse(String code) {
        
        /* Create empty GS1 data collections */
        
        ArrayList<Object> data = new ArrayList<>();
        HashMap<String, Object> results = null;
        
        
        ArrayList <String> aiNum = new ArrayList<>();
        
        /* Continue parsing until entire GS1 code has been processed */
        while ( !code.isEmpty()) {

            results = null;

            /* Sample first digit in code */

            char d = code.charAt(0);
            System.out.println("Code Digit " + d + " Found");

            /* Is digit valid? */

            if ((d >= '0') && (d <= '9')) {

                try {

                    /* If so, instantiate the corresponding matcher/parser collection */

                    Class c = Class.forName("edu.jsu.mcis.plinkoproto.GS1_" + d + "X");
                    Constructor constructor = c.getConstructor();
                    GS1 p = (GS1)(constructor.newInstance());

                    /* Delegate match/parse to collection; capture results */

                    results = (HashMap)(p.parse(code));

                    aiNum.add((String)results.get("ai"));

                }
                catch (Exception e) {System.err.println("GS1 Class Exception: " + e.toString());}

            }

            if (results != null) {

                /* If valid results were returned, add to array */

                data.add(results);



                /* Strip parsed element string from beginning of code */

                String element = (String)results.get("element");
                code = code.substring(element.length()).trim();

            }

            /* If element string could not be identified, abort the parse */

            else {
                break;
            }

        }

        if(aiNum.contains("22") && !aiNum.contains("01"))
        {
            System.out.println("Manditory Data Relationship Error");

        }
        
        if (aiNum.contains("240") && !aiNum.contains("01") || !aiNum.contains("02") || !aiNum.contains("8006") || !aiNum.contains("8026"))
        {
            System.out.println("Manditory Data Relationship Error");
        }

        if(aiNum.contains("243") && !aiNum.contains("01"))
        {
            System.out.println("Manditory Data Relationship Error");

        }
        /* Return array of parsed GS1 data as a JSON string */
        
        return(JSONValue.toJSONString(data));
        
    }
    
}