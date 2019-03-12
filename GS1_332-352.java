package edu.jsu.mcis.plinkoproto;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_332 extends GS1 {

    public GS1_332() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "332", Pattern.compile("^332[0-9](.){6}") );              
        super.matchers.put( "333", Pattern.compile("^333[0-9](.){6}") ); 
        super.matchers.put( "334", Pattern.compile("^334[0-9](.){6}") );              
        super.matchers.put( "335", Pattern.compile("^335[0-9](.){6}") );
        super.matchers.put( "336", Pattern.compile("^336[0-9](.){6}") ); 
        super.matchers.put( "337", Pattern.compile("^337[0-9](.){6}") );
        super.matchers.put( "340", Pattern.compile("^340[0-9](.){6}") ); 
        super.matchers.put( "341", Pattern.compile("^341[0-9](.){6}") );              
        super.matchers.put( "342", Pattern.compile("^342[0-9](.){6}") );
        super.matchers.put( "343", Pattern.compile("^343[0-9](.){6}") );              
        super.matchers.put( "344", Pattern.compile("^344-9](.){6}") ); 
        super.matchers.put( "345", Pattern.compile("^345[0-9](.){6}") );              
        super.matchers.put( "346", Pattern.compile("^346[0-9](.){6}") );
        super.matchers.put( "347", Pattern.compile("^347[0-9](.){6}") );              
        super.matchers.put( "348", Pattern.compile("^348[0-9](.){6}") ); 
        super.matchers.put( "349", Pattern.compile("^349[0-9](.){6}") ); 
        super.matchers.put( "350", Pattern.compile("^350[0-9](.){6}") );
        super.matchers.put( "351", Pattern.compile("^351[0-9](.){6}") );
        super.matchers.put( "352", Pattern.compile("^352[0-9](.){6}") );
        
    }
    
    public Object parse332(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (m), log");
        output.put("ai", element.substring(0, 4) );
        output.put("metres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse333(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (m), log");
        output.put("ai", element.substring(0, 4) );
        output.put("metres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse334(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA (m^2), log");
        output.put("ai", element.substring(0, 4) );
        output.put("square metres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse335(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (l), log");
        output.put("ai", element.substring(0, 4) );
        output.put("litres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse336(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME m^3, log");
        output.put("ai", element.substring(0, 4) );
        output.put("cubic metres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

    public Object parse336(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "KG PER m^2");
        output.put("ai", element.substring(0, 4) );
        output.put("cubic metres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse340(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GROSS WEIGHT (lb)");
        output.put("ai", element.substring(0, 4) );
        output.put("pounds", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse341(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (i), log");
        output.put("ai", element.substring(0, 4) );
        output.put("inches", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse342(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (f), log");
        output.put("ai", element.substring(0, 4) );
        output.put("feet", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse343(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (y), log");
        output.put("ai", element.substring(0, 4) );
        output.put("yards", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse344(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (i), log");
        output.put("ai", element.substring(0, 4) );
        output.put("inches", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;

    }

        public Object parse345(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (f), log");
        output.put("ai", element.substring(0, 4) );
        output.put("feet", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse346(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (y), log");
        output.put("ai", element.substring(0, 4) );
        output.put("yards", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse347(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (i), log");
        output.put("ai", element.substring(0, 4) );
        output.put("inches", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse348(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (f), log");
        output.put("ai", element.substring(0, 4) );
        output.put("feet", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }


      public Object parse349(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (y), log");
        output.put("ai", element.substring(0, 2) );
        output.put("yards", Integer.parseInt( element.substring(2) ));
        output.put("element", element);
        
        return output;
        
    }


     public Object parse350(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA (i^2)");
        output.put("ai", element.substring(0, 4) );
        output.put("square inches", Integer.parseInt( element.substring(4) ));
        output.put("element", element);
        
        return output;
        
    }    

        public Object parse351(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA (f^2)");
        output.put("ai", element.substring(0, 4) );
        output.put("ISOccode", Integer.parseInt( element.substring(4, 7) ));
        output.put("square feet", Integer.parseInt( element.substring(7) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse352(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA (y^2)");
        output.put("ai", element.substring(0, 4) );
        output.put("square yards", Integer.parseInt( element.substring(4) ));
        output.put("element", element);
        
        return output;
        
    }
    
}