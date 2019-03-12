package cs310.team.project;


import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GS1 {
    
    /* GS1 Matcher/Parser Collection Superclass */
    
    HashMap<String, Pattern> matchers;
    
    public Object parse(String code) {
        
        Object output = null;
        
        for (Map.Entry<String, Pattern> entry : matchers.entrySet()) {
            
            /* Identify entity string by Application Identifier */

            String key = entry.getKey();
            Matcher matcher = entry.getValue().matcher(code);

            if (matcher.find()) {
                
                /* If a match is found, invoke the corresponding parse method (in child class) */
                
                try {
                    Method method = this.getClass().getDeclaredMethod(("parse" + key), String.class);
                    output = method.invoke( this, matcher.group() );
                }
                catch (Exception e) {
                    System.err.println("Parser Method Exception: " + e.toString() );
                }
                
                /* If a match was found, break main loop (since there is no need to try the remaining matchers) */
                
                break;
                
            }

        }
        
        /* Return parsed results as an associative collection */
        
        return output;
        
    }
    
}