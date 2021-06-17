package pl.abramczyk;

import java.time.LocalDate;
import java.time.Period;

public class AgeVerifier {
    public static void main(String[] args) {
        String peselToVerify = "02242404689";
        checkIfOver18Yrs(peselToVerify);
    }

    private static void checkIfOver18Yrs(String peselToVerify) {
        int year = Integer.parseInt(peselToVerify.substring(0, 2));
        int month = Integer.parseInt(peselToVerify.substring(2, 4));
        int day = Integer.parseInt(peselToVerify.substring(4, 6));

        //Poniższy warunek sprawdza czy osoba urodziła się przed czy po 2000r - różni się sposób generowania peselu
        if (month > 12) {
            year += 2000;
            month -= 20;
        } else {
            year += 1900;
        }
        LocalDate start = LocalDate.of(year, month, day);
        Period period = Period.between(start, LocalDate.now());
        if (period.getYears() >= 18) {
            System.out.println("Gratulacje jesteś pełnoletni, twój wiek: " + period.getYears());
        } else {
            System.out.println("Nie jesteś jeszcze pełnoletni, twój wiek: " + period.getYears());
        }

    }
}
