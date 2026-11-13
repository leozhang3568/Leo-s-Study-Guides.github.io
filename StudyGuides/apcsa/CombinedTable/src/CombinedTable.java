public class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;
    private int seats;
    private double desirability;
    public CombinedTable(SingleTable table1, SingleTable table2) {
        this.table1 = table1;
        this.table2 = table2;
        seats = this.table1.getNumSeats() + this.table2.getNumSeats() - 2;
        desirability =  (double) (this.table1.getViewQuality() + this.table2.getViewQuality()) / 2;   
        if (this.table1.getHeight() != this.table2.getHeight()) {
            desirability -= 10;
        }
    }
    public boolean canSeat(int n) {
        return (seats >= n);
    }
    public double getDesirability () {
        return desirability;
    }
}
