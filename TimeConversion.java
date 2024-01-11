
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    public static String convertToMilitaryTime(String time) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
            Date date = inputFormat.parse(time);
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String inputTime = "01:12:59AM";
        String militaryTime = convertToMilitaryTime(inputTime);

        System.out.println("Input Time: " + inputTime);
        System.out.println("Military Time: " + militaryTime);
    }
}