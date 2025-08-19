package CustomComponents;

import javax.swing.*;
import java.awt.*;

public class RoundedTextField extends JTextField {
    
    private int arcWidth = 20;
    private int arcHeight = 20;
    
    public RoundedTextField(int columns) {
        super(columns);
        setOpaque(false);
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Background
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, arcWidth, arcHeight);
        
        // Border
        g2.setColor(new Color(189, 195, 199));
        g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, arcWidth, arcHeight);

        super.paintComponent(g);
        g2.dispose();
    }
}
