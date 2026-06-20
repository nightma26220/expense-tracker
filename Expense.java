public class Expense {
    int id;
    String title;
    double amount;
    String category;

    public Expense(int id,String title,double amount,String category) {
        this.id=id;
        this.title=title;
        this.amount=amount;
        this.category=category;
    }
    @Override
    public String toString() {
        return "ID:" + id +
                "\n Title: " + title +
                "\n Amount: " + amount +
                "\n Category: " + category;
    }

}