import javax.swing.*;

public class display {
    public static class JFrameOne extends JFrame{
        public static void main(String[] args) {
            JFrameOne jFrameOne = new JFrameOne();

        }

        public JFrameOne(){
            initialize();
        }
        public void initialize(){
            setTitle("JFrameOne");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(500,400);
            setLocationRelativeTo(null);
            setResizable(false);
            setVisible(true);

        }
    }
}
