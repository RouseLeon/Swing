import javax.swing.*;
import java.awt.*;

class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new PPO();
            new LayoutManager();
            new JPanel();
            new JComponent();
            new z_przyciscki();
            new z_klawiatura();
            new z_mysz();
            new Napisy();
            new Obrazki();
        });
    }
}