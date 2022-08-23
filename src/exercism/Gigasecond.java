package exercism;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Gigasecond {
    LocalDateTime dateTime;
    public Gigasecond(LocalDate moment) {
        this.dateTime = moment.atTime(0,0);
    }

    public Gigasecond(LocalDateTime moment) {
        this.dateTime = moment;
    }

    public LocalDateTime getDateTime() {
        return dateTime.plusSeconds(1_000_000_000);
    }
    public static void main(String[]args){

    }
}
