import javax.swing.JFrame;

public class GameFrame extends JFrame {

    private GamePanel gamePanel; // Declare the instance variable

    GameFrame() {
        gamePanel = new GamePanel(); // Create only one instance of GamePanel
        this.add(gamePanel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new GameFrame();
    }

    // Method to restart the game
    public void restartGame() {
        gamePanel.restartGame();
    }
}
