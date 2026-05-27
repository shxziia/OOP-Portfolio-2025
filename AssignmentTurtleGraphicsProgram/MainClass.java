import java.awt.*;
import javax.swing.JFrame;
import uk.ac.leedsbeckett.oop.LBUGraphics;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class MainClass extends LBUGraphics {
    private List<String> commandHistory;
    private BufferedImage backgroundImage = null;
    private JTextArea commandDisplay;
    private boolean isModified = false;
    private List<TurtleData> turtles = new ArrayList<>();
    private int currentPenWidth = 1;


    public static void main(String[] args) {
        new MainClass();
    }


    public MainClass() {
        JFrame MainFrame = new JFrame("Shazia Begum - Turtle Graphics");
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setLayout(new FlowLayout());
        MainFrame.add(this);
        MainFrame.pack();
        MainFrame.setVisible(true);

        commandHistory = new ArrayList<>();
        commandDisplay = new JTextArea(20, 40);
        commandDisplay.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(commandDisplay);
        MainFrame.add(scrollPane);
        about();

    }


    private void triangleEquilateral(int length) {
        for (int i = 0; i < 3; i++) {
            move(length);
            left(120);
        }
    }

    private void triangles(int side1, int side2, int side3) {

        double angleA = Math.acos((Math.pow(side2, 2) + Math.pow(side3, 2) - Math.pow(side1, 2)) / (2 * side2 * side3));
        double angleB = Math.acos((Math.pow(side1, 2) + Math.pow(side3, 2) - Math.pow(side2, 2)) / (2 * side1 * side3));
        double angleC = Math.acos((Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2)) / (2 * side1 * side2));

        angleA = Math.toDegrees(angleA);
        angleB = Math.toDegrees(angleB);
        angleC = Math.toDegrees(angleC);

        move(side1);
        left((int) (180 - angleA));

        move(side2);
        left((int) (180 - angleB));

        move(side3);
        left((int) (180 - angleC));
    }

    private class TurtleData {
        int x, y;
        double angle;

        TurtleData(int x, int y, double angle) {
            this.x = x;
            this.y = y;
            this.angle = angle;
        }
        public void setColor(Color blue) {
        }

        public void fillRectangle(int width, int height) {
        }

        public void moveTo(int i, int i1) {
        }

        public void move(int width) {
        }

        public void setPenWidth(int thickness) {
        }
    }


    @Override
    public void processCommand(String command) {
        commandHistory.add(command);
        commandDisplay.append(command + "\n");
        commandDisplay.setCaretPosition(commandDisplay.getDocument().getLength());
        String[] parts = command.split(" ");

        try {
            switch (parts[0].toLowerCase()) {
                case "about":
                    about();
                    break;
                case "penup":
                    drawOff();
                    displayMessage("Pen is now up");
                    break;
                case "pendown":
                    drawOn();
                    displayMessage("Pen is now down.");
                    break;
                case "move":
                    if (parts.length == 2) {
                        int distance = parsePositiveInteger(parts[1]);
                        if (distance != -1) {
                            move(distance);
                            isModified = true;
                        }
                    } else {
                        showError("Missing parameter: please specify a distance to move.");
                    }
                    break;
                case "reverse":
                    forward(-parsePositiveInteger(parts[1]));
                    break;
                case "left":
                    if (parts.length == 2) {
                        int degrees = Integer.parseInt(parts[1]);
                        left(degrees);
                    } else {
                        showError("Missing degrees parameter for left.");
                    }
                    break;
                case "right":
                    if (parts.length == 2) {
                        int degrees = Integer.parseInt(parts[1]);
                        right(degrees);
                    } else {
                        showError("Missing degrees parameter for right.");
                    }
                    break;
                case "blue":
                    blue();
                    break;
                case "green":
                    green();
                    break;
                case "red":
                    red();
                    break;
                case "white":
                    white();
                    break;
                case "reset":
                    if (confirmSaveIfModified()) {
                        reset();
                    }
                    break;
                case "clear":
                    if (confirmSaveIfModified()) {
                        clear();
                    }
                    break;
                case "square":
                    if (parts.length == 2) {
                        int length = Integer.parseInt(parts[1]);
                        square(length);
                    } else {
                        showError("Missing length parameter for square.");
                    }
                    break;
                case "triangle":
                    if (parts.length == 2) {
                        int size = Integer.parseInt(parts[1]);
                        triangle(size);
                    } else if (parts.length == 4) {
                        int side1 = Integer.parseInt(parts[1]);
                        int side2 = Integer.parseInt(parts[2]);
                        int side3 = Integer.parseInt(parts[3]);

                        if (isValidTriangle(side1, side2, side3)) {
                            triangles(side1, side2, side3);
                        } else {
                            showError("Invalid triangle sides. The sum of any two sides must be greater than the third.");
                        }
                    }

                    break;
                case "pencolour":
                    if (parts.length == 4) {
                        int r = Integer.parseInt(parts[1]);
                        int g = Integer.parseInt(parts[2]);
                        int b = Integer.parseInt(parts[3]);
                        pencolour(r, g, b);
                    } else {
                        showError("Invalid RGB values for pencolour.");
                    }
                    break;
                case "pen":
                    if (parts.length == 4) {
                        int r = parseRGB(parts[1]);
                        int g = parseRGB(parts[2]);
                        int b = parseRGB(parts[3]);

                        if (r != -1 && g != -1 && b != -1) {
                            pencolour(r, g, b);
                        } else {
                            showError("Invalid RGB parameters. RGB values must be between 0 and 255.");
                        }
                    } else {
                        showError("Invalid number of parameters for pen. Please provide three values for red, green, and blue.");
                    }
                    break;
                case "penwidth":
                    int width = parsePositiveInteger(parts, 1);
                    setStroke(width);
                    break;
                case "save":
                    saveCommands();
                    saveImage();
                    break;
                case "load":
                    loadCommands();
                    break;
                case "loadimage":
                    loadImage();
                    isModified = true;
                    break;
                default:
                    showError("Invalid command.");
            }
        } catch (NumberFormatException e) {
            showError("Invalid number format in command.");
        }
    }

    private int parsePositiveInteger(String[] parts, int i) {
        return Integer.parseInt(parts[i]);
    }



    private double getAngle() {
        return getDirection();
    }
    private int getYPosition() {
        return getyPos();
    }
    private int getXPosition() {
        return getxPos();
    }
    private int parseWidth(String value) {
        try {
            int width = Integer.parseInt(value);
            return (width > 0) ? width : -1;
        } catch (NumberFormatException e) {
            return -1;
        }

    }

    private int parsePositiveInteger(String part){
        try {
            int value = Integer.parseInt(part);
            if (value <= 0) {
                showError("Distance must be a positive integer.");
                return -1;
            }
            if (value > 1000) {
                showError("Distance too large. Please enter a smaller value (max 1000).");
                return -1;
            }
            return value;
        } catch (NumberFormatException e) {
            showError("Invalid number format for distance.");
            return -1;
        }
    }




    private void saveImage() {
        try {
            BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
            paint(image.getGraphics());

            File file = new File("drawing.png");
            ImageIO.write(image, "png", file);
            displayMessage("Drawing saved as drawing.png.");
        } catch (IOException e) {
            showError("Error saving the image.");
        }
    }
    private void loadImage() {
        try {
            backgroundImage = ImageIO.read(new File("drawing.png"));
            repaint();
        } catch (IOException e) {
            showError("Failed to load image.");
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(currentPenWidth));

        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, null);
        }
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, null);
        }


    }
    private boolean move(int distance) {
        double angleRadians = Math.toRadians(getDirection());
        int newX = getxPos() + (int)(distance * Math.cos(angleRadians));
        int newY = getyPos() - (int)(distance * Math.sin(angleRadians));

        if (isWithinBounds(newX, newY)) {
            Graphics2D g2d = (Graphics2D) getGraphics();
            g2d.setStroke(new BasicStroke(currentPenWidth));
            g2d.drawLine(getXPosition(), getYPosition(), newX, newY);
            forward(distance);
            return true;
        } else {
            showError("Move would take the turtle off-screen. Command ignored.");
            return false;
        }
    }
    private boolean isWithinBounds(int x, int y) {
        return x >= 0 && x <= getWidth() && y >= 0 && y <= getHeight();
    }


    private void reverse(int distance) {
        double angleRadians = Math.toRadians(getDirection() + 180);


    }


    private void turnLeft(int degrees) {
    }


    private void turnRight(int degrees) {
    }


    private void white() {
        setPenColour(Color.white);
    }

    private void red() {
        setPenColour(Color.red);
    }

    private void green() {
        setPenColour(Color.green);
    }

    private void penDown() {
    }

    private void penUp() {
    }

    private void blue() {
        setPenColour(Color.blue);
    }

    private void square(int length) {
        for (int i = 0; i < 4; i++) {
            move(length);
            left(90);
        }
    }
    private void triangle(int length) {
        for (int i = 0; i < 3; i++) {
            move(length);
            left(120);
        }
    }
    private boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }


    public void saveCommands() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("commands.txt"))) {
            for (String command : commandHistory) {
                writer.write(command);
                writer.newLine();
            }
            System.out.println("Commands saved successfully.");
        } catch (IOException e) {
            showError("Error saving commands.");
        }
    }
    public void loadCommands() {
        try (BufferedReader reader = new BufferedReader(new FileReader("commands.txt"))) {
            String command;
            while ((command = reader.readLine()) != null) {
                processCommand(command);
            }
        } catch (IOException e) {
            showError("Error loading commands.");
        }
    }
    private void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void setPenWidth(int width) {
        if (width > 0) {
            currentPenWidth = width;
            repaint();
        } else {
            showError("Invalid pen width. It must be greater than zero.");
        }
    }

    private void setStrokeWidth(BasicStroke width) {
        setStrokeWidth(new BasicStroke());
        repaint();
    }

    private final int SCREEN_WIDTH = 800;
    private final int SCREEN_HEIGHT = 600;

    private boolean confirmSaveIfModified() {
        if (isModified) {
            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "You have unsaved changes. Do you want to save before proceeding?",
                    "Unsaved Changes",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE

            );

            if (choice == JOptionPane.CANCEL_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                displayMessage("Action canceled. Drawing was not cleared.");
                return false;
            } else if (choice == JOptionPane.YES_OPTION) {
                saveCommands();
                saveImage();
                isModified = false;
            } else if (choice == JOptionPane.NO_OPTION) {
                isModified = false;
            }
        }
        return true;
    }

    private int parseRGB(String value) {
        try {
            int colorValue = Integer.parseInt(value);
            if (colorValue >= 0 && colorValue <= 255) {
                return colorValue;
            } else {
                showError("RGB values must be between 0 and 255.");
                return -1;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void pencolour(int r, int g, int b) {
        Color color = new Color(r, g, b);
        setPenColour(color);
    }


    @Override
    public void about() {
        super.about();
        System.out.println("This graphic tool was created by Shazia Begum.");

    }
    @Override
    public void clear() {
        super.clear();
        backgroundImage = null;
        repaint();
        isModified = false;
    }
    @Override
    public void reset() {
        clear();
        resetTurtle();
        commandHistory.clear();
        commandDisplay.setText("");
        isModified = false;
    }

    private void resetTurtle() {
    }


}
