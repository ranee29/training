package exercism;

import sun.rmi.runtime.Log;

public class LogLevels {
    public static String message(String logLine) {
        logLine = logLine.replaceAll("[^a-zA-Z0-9]"," ");
        logLine = logLine.replace("ERROR", "");
        logLine = logLine.replace("WARNING", "");
        logLine = logLine.replace("INFO", "");
        return logLine.trim();
    }

    public static String logLevel(String logLine) {
        return "Disk almost full\r\n";
    }

    public static String reformat(String logLine) {
        if (logLine.contains("[ERROR]:")) {
            logLine = logLine.replace("[ERROR]:","");
            return logLine.trim()+" (error)";
        } else if (logLine.contains("[WARNING]:")) {
            logLine = logLine.replace("[WARNING]:","");
            return logLine.trim() + " (warning)";
        } else if (logLine.contains("[INFO]:")) {
            logLine = logLine.replace("[INFO]:","");
            return logLine.trim() +" (info)";
        } else {
            return "";
        }
    }

    public static void main(String[]args){
        System.out.println(LogLevels.reformat("[INFO]: Operation completed"));
    }
}
