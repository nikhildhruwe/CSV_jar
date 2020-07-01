package com.bridgelabz.csvjar;

public class CSVBuilderFactory {
    public static ICSVBuilder craeteCSVBuilder() {
       return new OpenCSVBuilder();
    }
}
