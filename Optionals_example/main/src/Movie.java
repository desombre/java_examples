import java.util.Date;

public interface Movie {

    void lentMovie(Date date);

    void returnMovie();

    boolean isLent();

}
