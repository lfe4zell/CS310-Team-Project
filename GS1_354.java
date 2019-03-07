package edu.jsu.mcis.plinkoproto;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_354 extends GS1 {

    public GS1_354() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "354", Pattern.compile("^354[0-9](.){6}") );              
        super.matchers.put( "355", Pattern.compile("^355[0-9](.){6}") ); 
        super.matchers.put( "356", Pattern.compile("^356[0-9](.){6}") );              
        super.matchers.put( "357", Pattern.compile("^357[0-9](.){6}") );

        super.matchers.put( "360", Pattern.compile("^360[0-9](.){6}") );              
        super.matchers.put( "361", Pattern.compile("^361[0-9](.){6}") ); 
        super.matchers.put( "362", Pattern.compile("^362[0-9](.){6}") );              
        super.matchers.put( "363", Pattern.compile("^363[0-9](.){6}") );
        super.matchers.put( "364", Pattern.compile("^364[0-9](.){6}") );              
        super.matchers.put( "365", Pattern.compile("^365[0-9](.){6}") ); 
        super.matchers.put( "366", Pattern.compile("^366[0-9](.){6}") );              
        super.matchers.put( "367", Pattern.compile("^367[0-9](.){6}") );
        super.matchers.put( "368", Pattern.compile("^368[0-9](.){6}") );              
        super.matchers.put( "369", Pattern.compile("^369[0-9](.){6}") ); 
       
         
        super.matchers.put( "37", Pattern.compile("^37[0-9]{1,8}[%\\x1D") );  
        super.matchers.put( "37eol", Pattern.compile("^^37[0-9]{1,8}$") ); 

        super.matchers.put( "390", Pattern.compile("^390[0-9]{6}(.)[%\\x1D]") );    
        super.matchers.put( "390eol", Pattern.compile("^390[0-9]{6}(.)$") );  
               
        super.matchers.put( "391", Pattern.compile("^391[0-9]{3}(.){1,15}[%\\x1D]") );  
        super.matchers.put( "391eol", Pattern.compile("^391[0-9]{3}(.){1,15}{1,15}$") );    

        super.matchers.put( "392", Pattern.compile("^392[0-9](.){1,15}[%\\x1D]") );  
        super.matchers.put( "392eol", Pattern.compile("^392[0-9](.){1,15}$") );

        super.matchers.put( "393", Pattern.compile("^393[0-9]{3}(.){1,15}[%\\x1D]") );  
        super.matchers.put( "393eol", Pattern.compile("^393[0-9]{3}(.){1,15}{1,15}$") );

        super.matchers.put( "394", Pattern.compile("^394[0-9](.){4}[%\\x1D]") );  
        super.matchers.put( "394eol", Pattern.compile("^394[0-9](.){4}$") ); 


        
    }
    
    public Object parse354(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA SQUARE FEET");
        output.put("ai", element.substring(0, 4) );
        output.put("squarefeet", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse355(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA SQUARE YARDS");
        output.put("ai", element.substring(0, 4) );
        output.put("squareyards", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse356(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET WEIGHT (t)");
        output.put("ai", element.substring(0, 4) );
        output.put("netweight(t)", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse357(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (oz)");
        output.put("ai", element.substring(0, 4) );
        output.put("netvolume(oz)", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse360(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (qt)");
        output.put("ai", element.substring(0, 4) );
        output.put("netvolume(qt)", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse361(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (g)");
        output.put("ai", element.substring(0, 4) );
        output.put("netvolume(g)", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse362(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (q)");
        output.put("ai", element.substring(0, 4) );
        output.put("netvolume(q)", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse363(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (g),log");
        output.put("ai", element.substring(0, 4) );
        output.put("netvolume(g)log", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse364(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (i^3)");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(i^3)", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse365(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (f^3)");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(f^3)", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;

    }

        public Object parse366(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (y^3)");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(y^3)", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse367(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (i^3),log");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(i^3)log", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse368(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (f^3),log");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(f^3)log", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse369(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (y^3),log");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(y^3)log", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }


      public Object parse37(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "COUNT IN UNIT");
        output.put("ai", element.substring(0, 2) );
        output.put("count", Integer.parseInt( element.substring(2) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse37eol(String element) {
        return ( parse37(element) ); 
    }



     public Object parse390(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AMOUNT");
        output.put("ai", element.substring(0, 4) );
        output.put("amount", Integer.parseInt( element.substring(4) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse390eol(String element) {
        return ( parse390(element) );

    }

        public Object parse391(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AMOUNT");
        output.put("ai", element.substring(0, 4) );
        output.put("ISOccode", Integer.parseInt( element.substring(4, 7) ));
        output.put("amount", Integer.parseInt( element.substring(7) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse391eol(String element) {
        return ( parse391(element) );

    }

        public Object parse392(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PRICE");
        output.put("ai", element.substring(0, 4) );
        output.put("price", Integer.parseInt( element.substring(4) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse392eol(String element) {
        return ( parse392(element) );

    }

        public Object parse393(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PRICE");
        output.put("ai", element.substring(0, 4) );
        output.put("ISOccode", Integer.parseInt( element.substring(4, 7) ));
        output.put("price", Integer.parseInt( element.substring(7) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse393eol(String element) {
        return ( parse393(element) );

    }

        public Object parse394(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PRCNT OFF");
        output.put("ai", element.substring(0, 4) );
        output.put("prcnt off", Integer.parseInt( element.substring(4) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse394eol(String element) {
        return ( parse394(element) );

    }
     
    
}