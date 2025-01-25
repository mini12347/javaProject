package ENTITIES;

import java.sql.Time;
import java.time.LocalDate;

public class ExamenCode extends Examen<Integer>{
    public ExamenCode(LocalDate date, Time time, Candidat candidat, Integer resultat) {
        super(date, time, candidat, resultat);
    }
}
