public class GuessNumberGame {
    public static void main(String[] args) {
        int targetNumber = 42; // Случайное число от 1 до 100
        int playerGuess = 1; // Начальное значение предположения
        boolean guessed = false;

        while (!guessed) {
            if (playerGuess < targetNumber) {
                System.out.println(playerGuess + " меньше того, что загадал компьютер.");
                playerGuess++;
            } else if (playerGuess > targetNumber) {
                System.out.println(playerGuess + " больше того, что загадал компьютер.");
                playerGuess--;
            } else {
                guessed = true;
                System.out.println("Вы победили!");
            }
        }
    }
}
