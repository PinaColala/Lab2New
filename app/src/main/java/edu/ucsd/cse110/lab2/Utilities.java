package edu.ucsd.cse110.lab2;public class Utilities {
    public static String trimDisplayStr(String displayStr1) {
        // If the string does not contain a decimal point, don't do anything.
        if (!displayStr1.contains(".")) {
            return displayStr1;
        }
        // Trim off any extra "0s" at the end.
        var cleanedStr = displayStr1;
        while (cleanedStr.endsWith("0")) {
            cleanedStr = cleanedStr.substring(0, cleanedStr.length() - 1);
        }
        // And now if it ends with a ".", trim that too.
        if (cleanedStr.endsWith(".")) {
            cleanedStr = cleanedStr.substring(0, cleanedStr.length() - 1);
        }
        return cleanedStr;
    }
}
