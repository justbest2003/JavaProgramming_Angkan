import javax.swing.JOptionPane;

public class DoraemonDemo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, who are you?", "Doraemon", JOptionPane.QUESTION_MESSAGE);

        String me = JOptionPane.showInputDialog(null, "Hello my name is", "Me", JOptionPane.DEFAULT_OPTION);
        JOptionPane.showMessageDialog(null, "Oh! hi, " + me, "Doraemon", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "What can I do for you?", "Doraemon", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "I want to go to the future.", "Me", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Of course, what is the present year?", "Doraemon", JOptionPane.QUESTION_MESSAGE);
    }
}
