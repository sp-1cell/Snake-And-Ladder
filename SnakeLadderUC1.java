package Snake_Ladder;

public class SnakeLadderUC1 {
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Player is at Position " + position);

        int randomDiceNumber = (int) Math.floor(Math.random() * 100) % 6 + 1;
        int option = (int) Math.floor(Math.random() * 10) % 3;
        // System.out.println(" Option " + option);

        switch (option) {
            case 1:
                // snake
                position = position - randomDiceNumber;
                if (position < 0) {
                    position = 0;
                }
                break;
            case 2:
                // ladder
                position = position + randomDiceNumber;
            default:
                // no play
                position = position;
                break;
        }

        System.out.println("final Position " + position);
    }
}



