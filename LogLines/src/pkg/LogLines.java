package pkg;


public class LogLines {
    public static void main(String[] args) {
        LogLevels lv = new LogLevels();
        
        System.out.println(lv.message("[ERROR]: Invalid operation"));
        System.out.println(lv.logLevel("[ERROR]: Invalid operation"));
        System.out.println(lv.reformat("[ERROR]: Invalid operation"));
    } 
}