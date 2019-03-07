package edu.jsu.mcis.plinkoproto;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_3X extends GS1 {

    public GS1_3X() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "30", Pattern.compile("^30[0-9]{1,8}[%//x1D]") );   // AI #30        
        super.matchers.put( "30eol", Pattern.compile("^30[0-9]{1,8}$") );       // AI #30 (eol)
        super.matchers.put( "310n", Pattern.compile("^310[0-9]{1}[0-9]{6}");    // AI #310n
        super.matchers.put( "311n", Pattern.compile("^311[0-9]{1}[0-9]{6}");    // AI #311n
        super.matchers.put( "312n", Pattern.compile("^312[0-9]{1}[0-9]{6}");    // AI #312n
        super.matchers.put( "313n", Pattern.compile("^313[0-9]{1}[0-9]{6}");    // AI #313n
        super.matchers.put( "314n", Pattern.compile("^314[0-9]{1}[0-9]{6}");    // AI #314n
        super.matchers.put( "315n", Pattern.compile("^315[0-9]{1}[0-9]{6}");    // AI #315n
        super.matchers.put( "316n", Pattern.compile("^316[0-9]{1}[0-9]{6}");    // AI #316n
        super.matchers.put( "320n", Pattern.compile("^320[0-9]{1}[0-9]{6}");    // AI #320n
        super.matchers.put( "321n", Pattern.compile("^321[0-9]{1}[0-9]{6}");    // AI #321n
        super.matchers.put( "322n", Pattern.compile("^322[0-9]{1}[0-9]{6}");    // AI #322n
        super.matchers.put( "323n", Pattern.compile("^323[0-9]{1}[0-9]{6}");    // AI #323n
        super.matchers.put( "324n", Pattern.compile("^324[0-9]{1}[0-9]{6}");    // AI #324n
        super.matchers.put( "325n", Pattern.compile("^325[0-9]{1}[0-9]{6}");    // AI #325n
        super.matchers.put( "326n", Pattern.compile("^326[0-9]{1}[0-9]{6}");    // AI #326n
        super.matchers.put( "327n", Pattern.compile("^327[0-9]{1}[0-9]{6}");    // AI #327n
        super.matchers.put( "328n", Pattern.compile("^328[0-9]{1}[0-9]{6}");    // AI #328n
        super.matchers.put( "329n", Pattern.compile("^329[0-9]{1}[0-9]{6}");    // AI #329n
        super.matchers.put( "330n", Pattern.compile("^330n[0-9]{1}[0-9]{6}");   // AI #330n
        super.matchers.put( "331n", Pattern.compile("^331n[0-9]{1}[0-9]{6}");   // AI #331n
        
    }
    
    public Object parse30(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VAR. COUNT");
        output.put("ai", element.substring(0, 2) );
        output.put("variable count", Integer.parseInt( element.substring(2, 8) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse30eol(String element) {
        
        return (parse30(element));
        
    }
    
    public Object parse310n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET WEIGHT (kg)");
        output.put("ai", element.substring(0, 4) );
        output.put("weight (kg)", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }

    public Object parse311n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (m)");
        output.put("ai", element.substring(0, 4) );
        output.put("weight", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse312n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (m)");
        output.put("ai", element.substring(0, 4) );
        output.put("width", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse313n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (m)");
        output.put("ai", element.substring(0, 4) );
        output.put("height", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse314n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA (m2)");
        output.put("ai", element.substring(0, 4) );
        output.put("area", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse315n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (l)");
        output.put("ai", element.substring(0, 4) );
        output.put("net volume", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse316n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (m2)");
        output.put("ai", element.substring(0, 4) );
        output.put("net volume", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse320n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET WEIGHT (lb)");
        output.put("ai", element.substring(0, 4) );
        output.put("weight (lb)", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse321n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (i)");
        output.put("ai", element.substring(0, 4) );
        output.put("length", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse322n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (f)");
        output.put("ai", element.substring(0, 4) );
        output.put("length", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse323n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (y)");
        output.put("ai", element.substring(0, 4) );
        output.put("length", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse324n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (i)");
        output.put("ai", element.substring(0, 4) );
        output.put("width", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse325n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (f)");
        output.put("ai", element.substring(0, 4) );
        output.put("width", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse326n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (y)");
        output.put("ai", element.substring(0, 4) );
        output.put("width", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse327n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (i)");
        output.put("ai", element.substring(0, 4) );
        output.put("height", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse328n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (f)");
        output.put("ai", element.substring(0, 4) );
        output.put("height", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse329n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (y)");
        output.put("ai", element.substring(0, 4) );
        output.put("height", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse330n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GROSS WEIGHT (kg)");
        output.put("ai", element.substring(0, 4) );
        output.put("gross weight", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse331n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (m), log");
        output.put("ai", element.substring(0, 4) );
        output.put("length", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }