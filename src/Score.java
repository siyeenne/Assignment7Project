public class Score {
    private double shortprogramScore;
    private double freeskateScore;
    private double total = shortprogramScore + freeskateScore;

    public Score(double shortprogramScore, double freeskateScore) {
        this.shortprogramScore = shortprogramScore;
        this.freeskateScore = freeskateScore;
        this.total = shortprogramScore + freeskateScore; }

    public double getTotal () {
        return total;
    }
    public void setTotal ( double total){
        this.total = total; }

    public void checkRecord () {
        if (total > 335.30) {
            System.out.println("Wow! That's a higher score than the record set by Nathan Chen at the 2019–2020 Grand Prix Final!");
        }
    }
}
