package jframe;
import javax.swing.*; // import
import java.awt.*; //importa as cores
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tela extends JFrame implements ActionListener {
    private JButton button;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField text;
    private JTextField text2;
    private JTextField text3;
    public Tela() {

        setButton();
        setButton2();
        setButton3();
        setButton4();
        setLabel();
        setLabel1();
        setLabel2();
        setLabel3();
        setText3();
        setText1();
        setText2();
        configurarTela();
        }

        public void configurarTela(){
            setSize(800,500); // Define o tamanho da tela
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fecha ao clicar no botão fechar da janela
            setResizable(false);  // boolean impede o usuário de aumentar e diminuir a janela
            setLocationRelativeTo(null); // centraliza a página
            getContentPane().setBackground(new Color(0xBDE303)); //altera a cor de fundo do programa
            setTitle("CALCULADORA"); // coloca um título na página
            setLayout(null); //
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Aluno\\IdeaProjects\\calculadora\\src\\img\\calculator-v0-1chpxxqp1i6a1.png")); //altera o ícone do título
            setVisible(true); // boolean Torna a página vísivel
        }
        public void setButton(){
            this.button =  new JButton();
            this.button.setText("+"); // adiciona um texto ao botão (button)
            this.button.setBounds(150, 200, 150, 50 ); //adicionamos layout ao botão
            this.button.setBackground(new Color (0xD9D9D9)); //cor de fundo do botão
            this.button.setForeground(new Color (0x000000)); //cor do texto do botão
            this.button.setFont(new Font("Arial", Font.BOLD, 12));
            this.button.addActionListener(this::actionPerformed);// tipo da fonte do botão
            add(this.button); // adiciona o botão na tela
        }
        public void setButton2(){
            this.button2 = new JButton();
            this.button2.setText("-"); // adiciona um texto ao botão (button)
            this.button2.setBounds(150,300,150,50);
            this.button2.setBackground(new Color (0xD9D9D9)); //cor de fundo do botão
            this.button2.setForeground(new Color (0x000000)); //cor do texto do botão
            this.button2.setFont(new Font("Arial", Font.BOLD, 12));
            this.button2.addActionListener(this::actionPerformed2);// tipo da fonte do botão
            add(this.button2); // adiciona o botão na tela
        }
        public void setButton3(){
            this.button3 = new JButton();
            this.button3.setText("*"); // adiciona um texto ao botão (button)
            this.button3.setBounds(400,200,150,50);
            this.button3.setBackground(new Color (0xD9D9D9)); //cor de fundo do botão
            this.button3.setForeground(new Color (0x000000)); //cor do texto do botão
            this.button3.setFont(new Font("Arial", Font.BOLD, 12));
            this.button3.addActionListener(this::actionPerformed3);// tipo da fonte do botão
            add(this.button3); // adiciona o botão na tela
    }
        public void setButton4(){
            this.button4 = new JButton();
            this.button4.setText("/"); // adiciona um texto ao botão (button)
            this.button4.setBounds(400,300,150,50);
            this.button4.setBackground(new Color (0xD9D9D9)); //cor de fundo do botão
            this.button4.setForeground(new Color (0x000000)); //cor do texto do botão
            this.button4.setFont(new Font("Arial", Font.BOLD, 12));
            this.button4.addActionListener(this::actionPerformed4);// tipo da fonte do botão
            add(this.button4); // adiciona o botão na tela
        }

        public void setLabel(){
            this.label = new JLabel();
            this.label.setText("CALCULADORA"); // adiciona um texto ao label
            this.label.setForeground(new Color(0x002D85)); //cor do texto do label
            this.label.setFont(new Font("Arial", Font.BOLD, 30)); //tipo da fonte do label
            this.label.setBounds(300, 0, 350, 50 ); //adicionamos layout ao label
            add(this.label);  // adiciona o botão no label
        }
        public void setLabel1(){
            this.label1 = new JLabel();
            this.label1.setText("NÚMERO 1:"); // adiciona um texto ao label
            this.label1.setForeground(new Color(0x002D85)); //cor do texto do label
            this.label1.setFont(new Font("Arial", Font.BOLD, 20)); //tipo da fonte do label
            this.label1.setBounds(100, 50, 350, 50 ); //adicionamos layout ao label
            add(this.label1);  // adiciona o botão no label
        }
        public void setLabel2(){
            this.label2 = new JLabel();
            this.label2.setText("NÚMERO 2:"); // adiciona um texto ao label
            this.label2.setForeground(new Color(0x002D85)); //cor do texto do label
            this.label2.setFont(new Font("Arial", Font.BOLD, 20)); //tipo da fonte do label
            this.label2.setBounds(250, 50, 350, 50 ); //adicionamos layout ao label
            add(this.label2);  // adiciona o botão no label

    }
        public void setLabel3() {
        this.label3 = new JLabel();
        this.label3.setForeground(new Color(0x002D85));
        this.label3.setText("RESULTADO:"); // adiciona um texto ao label//cor do texto do label
        this.label3.setFont(new Font("Arial", Font.BOLD, 20)); //tipo da fonte do label
        this.label3.setBounds(400, 50, 350, 50); //adicionamos layout ao label
        add(this.label3);  // adiciona o botão no label
    }

        public void setText1(){
            this.text = new JTextField();
            this.text.setBounds(100, 100, 100,50);
            this.text.setForeground(new Color(0x000000));
            this.text.setBackground(new Color(0xffffff));
            this.text.setFont(new Font("Arial", Font.BOLD, 20));
            add(this.text);
    }
        public void setText2(){
            this.text2 = new JTextField();
            this.text2.setBounds(250, 100, 100,50);
            this.text2.setForeground(new Color(0x000000));
            this.text2.setBackground(new Color(0xffffff));
            this.text2.setFont(new Font("Arial", Font.BOLD, 20));
            add(this.text2);
    }
        public void setText3(){
            this.text3 = new JTextField();
            this.text3.setBounds(400, 100, 250,50);
            this.text3.setForeground(new Color(0x000000));
            this.text3.setBackground(new Color(0xffffff));
            this.text3.setFont(new Font("Arial", Font.BOLD, 20));
            add(this.text3);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==button){
                int X = Integer.parseInt(text.getText());
                int Y = Integer.parseInt(text2.getText());
                X = X + Y;
                this.text3.setText("A SOMA É: " + X);
        }

        }
        public void actionPerformed2(ActionEvent e) {
            if (e.getSource() == button2) {
                int X = Integer.parseInt(text.getText());
                int Y = Integer.parseInt(text2.getText());
                X = X - Y;
                this.text3.setText("A SUBTRAÇÃO É:" + X);
            }
        }
        public void actionPerformed3(ActionEvent e) {
            if (e.getSource() == button3) {
                int X = Integer.parseInt(text.getText());
                int Y = Integer.parseInt(text2.getText());
                X = X * Y;
                this.text3.setText("A MULTIPLICAÇÃO É:" + X);
            }
        }
        public void actionPerformed4(ActionEvent e) {
            if (e.getSource() == button4) {
                int X = Integer.parseInt(text.getText());
                int Y = Integer.parseInt(text2.getText());
                X = X / Y; 
                this.text3.setText("A DIVISÃO É:" + X);
            }
        }
}

