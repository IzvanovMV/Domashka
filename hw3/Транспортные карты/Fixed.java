import java.time.LocalDate;

public class Fix extends Card{
    int cardType; // Студенческая - 0, Школьная 1, Социальная - 2
    LocalDate date;
    double FixPayment;

    public Fix(int id, int cardType)
    {
        super(id);
        this.cardType = cardType;
        this.date = LocalDate.of(2000, 1, 1);

        switch (this.cardType) 
        {
            case 0 -> this.FixPayment = 300;
            case 1 -> this.FixPayment = 250;
            case 2 -> this.FixPayment = 280;
        }
    }

}
