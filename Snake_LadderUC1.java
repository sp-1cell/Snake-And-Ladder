package Snake_Ladder;

public class Snake_LadderUC1 {
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Player is at Position " + position);

        int randomDiceNumber = (int) Math.floor(Math.random() * 100) % 6 + 1;

        System.out.println("Dice number is " + randomDiceNumber);
    }
}


