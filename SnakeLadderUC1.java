package Snake_Ladder;

public class SnakeLadderUC1 {
    public static void main(String[] args) {


        System.out.println("Welcome to Snake Ladder program :");
        int position = 0;
        // System.out.println("Player is at Position " + position);


        //  System.out.println("Choice number " + choice);
        for (position = 0; position <= 100; position++) {

            int randomDiceNumber = (int) Math.floor(Math.random() * 100) % 6 + 1;
            int option = (int) Math.floor(Math.random() * 10) % 3;

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
        }
        System.out.print("final Position " + position + " ");
    }
}



