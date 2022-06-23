package com.cj.white.screen;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        createframe();
        try {
            Robot robot = new Robot();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int width = (int) screenSize.getWidth();
            int height = (int) screenSize.getHeight();

            while (true) {
                int randomX = ThreadLocalRandom.current().nextInt(0, width);
                int randomY = ThreadLocalRandom.current().nextInt(0, height);
                robot.keyPress(27);
                robot.mouseMove(randomX, randomY);
            }

        } catch (AWTException ignored) {
        }
    }

    public static void createframe(){
        GraphicsEnvironment localGraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        int monitorCount = localGraphicsEnvironment.getScreenDevices().length;
        for(int i = 0; i <= monitorCount - 1; i++) {
            String sdnw = "haha Funny";
            JFrame kys = new JFrame();
            kys.setUndecorated(true);
            kys.setSize(2000, 1090);
            kys.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            kys.setAlwaysOnTop(true);
            JLabel label = new JLabel();
            label.setText(sdnw);
            label.setHorizontalAlignment(JLabel.CENTER);
            kys.add(label);
            kys.setVisible(true);
            localGraphicsEnvironment.getScreenDevices()[i].setFullScreenWindow(kys);
        }
    }
}