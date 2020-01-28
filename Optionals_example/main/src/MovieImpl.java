import java.util.Date;

public class MovieImpl implements Movie{

    private Date returnDate;


    public MovieImpl() {
        this.returnDate = null;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public void lentMovie(Date date){
        this.returnDate = date;
    }

    @Override
    public void returnMovie(){
        this.returnDate = null;
    }

    @Override
    public boolean isLent(){
        return returnDate == null;
    }
}
