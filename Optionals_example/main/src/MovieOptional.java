import java.util.Date;
import java.util.Optional;

public class MovieOptional implements Movie{

    private Optional<Date> returnDate;

    public MovieOptional() {
    }

    public Optional<Date> getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = Optional.ofNullable(returnDate);
    }

    @Override
    public void lentMovie(Date date) {
        this.returnDate = Optional.ofNullable(date);
    }

    @Override
    public void returnMovie(){
        this.returnDate = Optional.empty();
    }

    @Override
    public boolean isLent(){
        return returnDate.isPresent();
    }

}
