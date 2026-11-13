public class Skater {
    private Score score;
    private String name;

    public Skater(String skaterName, Score score) {
        this.name = skaterName;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public Score getScore() {
        return score;
    }
    void showScore() {

        System.out.println(name + ": " + score.getTotal() + " points");
    }
}
