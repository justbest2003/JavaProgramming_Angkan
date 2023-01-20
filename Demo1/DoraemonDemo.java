import javax.swing.JOptionPane;

public class DoraemonDemo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, who are you?", "Doraemon", JOptionPane.QUESTION_MESSAGE);

        String me = JOptionPane.showInputDialog(null, "Hello my name is", "Me", JOptionPane.DEFAULT_OPTION);
        JOptionPane.showMessageDialog(null, "Oh! hi, " + me, "Doraemon", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "What can I do for you?", "Doraemon", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "I want to go to the future.", "Me", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Of course, what is the present year?", "Doraemon", JOptionPane.QUESTION_MESSAGE);

        String nowyear = JOptionPane.showInputDialog(null, "It is:", "Me", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "OK. How many years do you want to travel?", "Doraemon", JOptionPane.QUESTION_MESSAGE);

        String futureyear = JOptionPane.showInputDialog(null, "I want to go for:", "Me", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "OK. Lets goooooooooo!", "Doraemon",
                JOptionPane.INFORMATION_MESSAGE);

        int allfuture = Integer.parseInt(nowyear) + Integer.parseInt(futureyear);
        JOptionPane.showMessageDialog(null, "Hello welcome to " + allfuture, "Doraemon",JOptionPane.INFORMATION_MESSAGE);
    }
}
