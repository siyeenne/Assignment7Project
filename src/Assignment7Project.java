import java.util.Scanner;
public class Assignment7Project {
    static void findWinner(Skater skater1, Skater skater2) {
        if (skater1.getScore().getTotal() > skater2.getScore().getTotal()) {
            System.out.println("Winner: " + skater1.getName());
        } else if (skater2.getScore().getTotal() > skater1.getScore().getTotal()) {
            System.out.println("Winner: " + skater2.getName());
        }
    }

    static String competitionName = "Figure Skating Competition";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Enter the competitor's name: ");
        String name1 = input.nextLine();

        System.out.println("Enter the competitor's score on the short program: ");
        double shortProgram1 = input.nextDouble();

        System.out.println("Enter the competitor's score on the free skate program: ");
        double freeProgram1 = input.nextDouble();
        input.nextLine();

        Score skaterScore1 = new Score(shortProgram1, freeProgram1);
        Skater skater1 = new Skater(name1, skaterScore1);


        System.out.println("Enter the second competitor's name: ");
        String name2 = input.nextLine();

        System.out.println("Enter the second competitor's score on the short program: ");
        double shortProgram2 = input.nextDouble();

        System.out.println("Enter the second competitor's score on the free skate program: ");
        double freeProgram2 = input.nextDouble();
        input.nextLine();

        Score skaterScore2 = new Score(shortProgram2, freeProgram2);
        Skater skater2 = new Skater(name2, skaterScore2);

        System.out.println(competitionName);

        skater1.showScore();
        skater2.showScore();

        findWinner(skater1, skater2);
    }
}
