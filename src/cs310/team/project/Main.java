package cs310.team.project;

public class Main {

    public static void main(String[] args) {
        
        PlinkoParser p = new PlinkoParser();
        
        // This sample code was scanned from Figure 2.6.14-3 (on Page 129)
        
        System.out.println(p.parse("10095011015300031715011910AB-123"));
        
    }
    
}