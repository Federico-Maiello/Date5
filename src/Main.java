import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        String firstDateString = "2023-03-01T13:00:00Z";
        String secondDateString = "2024-03-01T13:00:00Z";

        OffsetDateTime firstDateTime = OffsetDateTime.parse(firstDateString);
        OffsetDateTime secondDateTime = OffsetDateTime.parse(secondDateString);

        boolean isFirstBeforeSecond = firstDateTime.isBefore(secondDateTime);

        boolean isSecondAfterFirst = secondDateTime.isAfter(firstDateTime);

        boolean areDatesEqualNow = firstDateTime.isEqual(OffsetDateTime.now()) && secondDateTime.isEqual(OffsetDateTime.now());

        System.out.println("La prima data è precedente alla seconda: " + isFirstBeforeSecond);
        System.out.println("La seconda data è successiva alla prima: " + isSecondAfterFirst);
        System.out.println("Le due date sono uguali ad ora: " + areDatesEqualNow);
    }
}
