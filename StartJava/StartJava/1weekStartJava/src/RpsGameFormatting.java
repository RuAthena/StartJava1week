public class RpsGameFormatting {
    public static void main(String[] args) {
        String playerMove = "✊"; // Пример хода игрока
        String computerMove = "✌"; // Пример хода компьютера
        String result = determineWinner(playerMove, computerMove);

        System.out.println("Ваш ход: " + formatMove(playerMove));
        System.out.println("Ход компьютера: " + formatMove(computerMove));
        System.out.println(result);
    }

    public static String formatMove(String move) {
        switch (move) {
            case "✊":
                return "R";
            case "✌":
                return "S";
            case "✋":
                return "P";
            default:
                return "неизвестный вариант";
        }
    }

    public static String determineWinner(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Ничья!";
        } else if ((playerMove.equals("✊") && computerMove.equals("✌")) ||
                (playerMove.equals("✌") && computerMove.equals("✋")) ||
                (playerMove.equals("✋") && computerMove.equals("✊"))) {
            return "Вы победили!";
        } else {
            return "Компьютер выиграл!";
        }
    }
}
