package ru.bmstu.hadoop.lab2;

public class ParserReplace {
    private static String QUOTATION = "\"";
    private static String EMPTY_STR = "";

    public ParserReplace() {

    }

     public String removeQuotation(String str) {
        return str.replace(QUOTATION, EMPTY_STR);
    }
}
