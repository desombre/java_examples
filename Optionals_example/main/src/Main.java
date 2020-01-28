import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MovieImpl m1 = new MovieImpl();
        MovieOptional m2 = new MovieOptional();

        Date d1 = new Date(System.currentTimeMillis());

        System.out.println(d1);

        //Lent movie
        m1.lentMovie(d1);
        m2.lentMovie(d1);

        Date d2 = null;

        System.out.println(d2);

        //Lent movie with Date = null
        m1.lentMovie(d2);
        m2.lentMovie(d2);

        //check dates
        m2.getReturnDate().ifPresent(date -> {
            if (date.before(d1)) {
                System.out.println("m2: OK");
            }else {
                System.out.println("m2: Not OK");
            }
        });

        //NullPointerException
        if (m1.getReturnDate().before(d1)) {
            System.out.println("m1: OK");
        }else {
            System.out.println("m1: Not OK");
        }



    }
}
