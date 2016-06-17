package com.cominvent;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaTimeTester {

    public static void main(String[] args) {
      if (args.length < 2) {
        System.out.println("Usage: java -jar jodaTester.jar \"<format>\" \"<string-to-test>\"");
        System.exit(0);
      }
      DateTimeFormatter formatter = DateTimeFormat.forPattern(args[0]);
      DateTime dt = formatter.parseDateTime(args[1]).toDateTime(DateTimeZone.UTC);
      System.out.println("Parsed to "+dt.toString(DateTimeFormat.forPattern("yyyy-mm-dd'T'HH:MM:ssZ")));
    }
}
