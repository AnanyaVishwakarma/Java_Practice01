/*You are given a date. You just need to write the method, "getDay", which returns the day on that date. 
To simplify your task, we have provided a portion of the code in the editor.
Example
month=8
day=14
year=2017
The method should return "MONDAY" as the day on that date.*/ 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Result {

    public static String findDay(int month, int day, int year) {
        String[] daysOfTheWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Calendar cal = Calendar.getInstance();
        
        cal.set(year, month-1, day);
       int p = cal.get(Calendar.DAY_OF_WEEK);
       
       return daysOfTheWeek[p-1];
    }

}
public class DateTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
