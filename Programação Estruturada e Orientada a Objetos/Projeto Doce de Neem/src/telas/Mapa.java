package telas;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import classes.Cliente;
import classes.Lugar;
import classes.Novato;
import javax.swing.ImageIcon;

/**
 *
 * @author Isabelle
 */
public class Mapa extends javax.swing.JFrame {

    public void zerar() {
        if (estoque < 0) {
            estoque = 0;
        }
        if (vidas < 0) {
            vidas = 0;
        }
        if (movimento < 0) {
            movimento = 0;
        }
        if (chances < 0) {
            chances = 0;
        }
        if (pontos < 0) {
            pontos = 0;
        }
    }

    private void defineQuant(char ind) {
        switch (lugaratual) {
            case 'a':
                switch (ind) {
                    case 'a':
                        alunA--;
                        break;
                    case 's':
                        servA--;
                        break;
                }
                break;
            case 'b':
                switch (ind) {
                    case 'a':
                        alunB--;
                        break;
                    case 's':
                        servB--;
                        break;
                }

                break;
            case 'c':
                switch (ind) {
                    case 'a':
                        alunC--;
                        break;
                    case 's':
                        servC--;
                        break;
                }
                break;
            case 'd':
                switch (ind) {
                    case 'a':
                        alunD--;
                        break;
                    case 's':
                        servD--;
                        break;
                }
                break;
            case 'm':
                switch (ind) {
                    case 'a':
                        alunAdm--;
                        break;
                    case 's':
                        servAdm--;
                        break;
                }
                break;
            case 'g':
                switch (ind) {
                    case 'a':
                        alunG--;
                        break;
                    case 's':
                        servG--;
                        break;
                }
                break;
            case 'r':
                switch (ind) {
                    case 'a':
                        alunR--;
                        break;
                    case 's':
                        servR--;
                        break;
                }
                break;
            case 'p':
                switch (ind) {
                    case 'a':
                        alunP--;
                        break;
                    case 's':
                        servP--;
                        break;
                }
                break;
            case 'i':
                switch (ind) {
                    case 'a':
                        alunBibli--;
                        break;
                    case 's':
                        servBibli--;
                        break;
                }
                break;

        }
    }

    public void atualizarCampos() {
        //usa essa funcao em td canto q tem a atualizar as informações, no lugar de ficar colocando cada linha
        txtEstoque.setText("" + estoque);
        txtMovimento.setText("" + movimento);
        txtPontos.setText("R$" + pontos);
        txtVidas.setText("" + vidas);
        if (chances > 100) {
            chances = 100;
        }
        zerar();
    }

    public void ativarBotoes() {
        btnUsaCharm.setEnabled(true);
        btnEmpatia.setEnabled(true);
        btnAmizade.setEnabled(true);
        btnAjuda.setEnabled(true);
        btnInsistencia.setEnabled(true);
        bntOferecer.setEnabled(true);
        atualizarCampos();
    }

    public void bloquearBotoesAcoes() {
        btnUsaCharm.setEnabled(false);
        btnEmpatia.setEnabled(false);
        btnAmizade.setEnabled(false);
        btnAjuda.setEnabled(false);
        btnInsistencia.setEnabled(false);
        bntOferecer.setEnabled(false);
        atualizarCampos();
    }

    public void ativarbotoes() {
        administracao1.setEnabled(true);
        recepcao.setEnabled(true);
        patio.setEnabled(true);
        a1.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        biblioteca.setEnabled(true);
        ginasio.setEnabled(true);
        atualizarCampos();
    }

    public void movimentacao() {

        if (gameOver(movimento, vidas, estoque) == true) {
            dispose();
            TelaGameOver tela = new TelaGameOver(usuario.getCurso(), pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        }
        switch (lugaratual) {
            case 'a':
                txtlugaranterior.setText("a");
                switch (lugaranterior) {
                    case 'b':
                        movimento -= 1;
                        break;
                    case 'c':
                        movimento -= 6;
                        break;
                    case 'd':
                        movimento -= 1;
                        break;
                    case 'g':
                        movimento -= 13;
                        break;
                    case 'i':
                        movimento -= 7;
                        break;
                    case 'p':
                        movimento -= 2;
                        break;
                    case 'm':
                        movimento -= 2;
                        break;
                    case 'r':
                        movimento -= 5;
                        break;
                }
                lugaranterior = 'a';
                break;
            case 'b':
                txtlugaranterior.setText("b");

                switch (lugaranterior) {
                    case 'a':
                        movimento -= 1;
                        break;
                    case 'c':
                        movimento -= 5;
                        break;
                    case 'd':
                        movimento -= 1;
                        break;
                    case 'g':
                        movimento -= 13;
                        break;
                    case 'i':
                        movimento -= 6;
                        break;
                    case 'p':
                        movimento -= 2;
                        break;
                    case 'm':
                        movimento -= 5;
                        break;
                    case 'r':
                        movimento -= 5;
                        break;
                }
                lugaranterior = 'b';
                break;
            case 'c':
                txtlugaranterior.setText("c");

                switch (lugaranterior) {
                    case 'a':
                        movimento -= 6;
                        break;
                    case 'b':
                        movimento -= 3;
                        break;
                    case 'd':
                        movimento -= 2;
                        break;
                    case 'g':
                        movimento -= 16;
                        break;
                    case 'i':
                        movimento -= 1;
                        break;
                    case 'p':
                        movimento -= 4;
                        break;
                    case 'm':
                        movimento -= 7;
                        break;
                    case 'r':
                        movimento -= 7;
                        break;
                }
                lugaranterior = 'c';
                break;
            case 'd':
                txtlugaranterior.setText("d");

                switch (lugaranterior) {
                    case 'a':
                        movimento -= 1;
                        break;
                    case 'b':
                        movimento -= 1;
                        break;
                    case 'c':
                        movimento -= 2;
                        break;
                    case 'g':
                        movimento -= 16;
                        break;
                    case 'i':
                        movimento -= 8;
                        break;
                    case 'p':
                        movimento -= 6;
                        break;
                    case 'm':
                        movimento -= 6;
                        break;
                    case 'r':
                        movimento -= 7;
                        break;
                }
                lugaranterior = 'd';
                break;
            case 'g':
                txtlugaranterior.setText("g");

                switch (lugaranterior) {
                    case 'a':
                        movimento -= 13;
                        break;
                    case 'b':
                        movimento -= 13;
                        break;
                    case 'c':
                        movimento -= 14;
                        break;
                    case 'd':
                        movimento -= 16;
                        break;
                    case 'i':
                        movimento -= 11;
                        break;
                    case 'p':
                        movimento -= 9;
                        break;
                    case 'm':
                        movimento -= 8;
                        break;
                    case 'r':
                        movimento -= 6;
                        break;
                }
                lugaranterior = 'g';

                break;
            case 'i':
                txtlugaranterior.setText("i");

                switch (lugaranterior) {
                    case 'a':
                        movimento -= 6;
                        break;
                    case 'b':
                        movimento -= 6;
                        break;
                    case 'c':
                        movimento -= 1;
                        break;
                    case 'd':
                        movimento -= 7;
                        break;
                    case 'g':
                        movimento -= 13;
                        break;
                    case 'p':
                        movimento -= 1;
                        break;
                    case 'm':
                        movimento -= 4;
                        break;
                    case 'r':
                        movimento -= 4;
                        break;
                }
                lugaranterior = 'i';

                break;
            case 'p':
                txtlugaranterior.setText("p");

                switch (lugaranterior) {
                    case 'a':
                        movimento -= 2;
                        break;
                    case 'b':
                        movimento -= 2;
                        break;
                    case 'c':
                        movimento -= 3;
                        break;
                    case 'd':
                        movimento -= 5;
                        break;
                    case 'g':
                        movimento -= 9;
                        break;
                    case 'i':
                        movimento -= 2;
                        break;
                    case 'm':
                        movimento -= 1;
                        break;
                    case 'r':
                        movimento -= 1;
                        break;
                }
                lugaranterior = 'p';
                break;
            case 'r':
                txtlugaranterior.setText("r");

                switch (lugaranterior) {
                    case 'a':
                        movimento -= 5;
                        break;
                    case 'b':
                        movimento -= 5;
                        break;
                    case 'c':
                        movimento -= 6;
                        break;
                    case 'd':
                        movimento -= 8;
                        break;
                    case 'g':
                        movimento -= 6;
                        break;
                    case 'i':
                        movimento -= 2;
                        break;
                    case 'p':
                        movimento -= 1;
                        break;
                    case 'm':
                        movimento -= 1;
                        break;
                    default:
                        break;
                }
                lugaranterior = 'r';

                break;
            case 'm':
                txtlugaranterior.setText("m");

                switch (lugaranterior) {
                    case 'a':
                        movimento -= 2;
                        break;
                    case 'b':
                        movimento -= 5;
                        break;
                    case 'c':
                        movimento -= 7;
                        break;
                    case 'd':
                        movimento -= 6;
                        break;
                    case 'g':
                        movimento -= 9;
                        break;
                    case 'i':
                        movimento -= 5;
                        break;
                    case 'p':
                        movimento -= 1;
                        break;
                    case 'r':
                        movimento -= 1;
                        break;
                }
                lugaranterior = 'm';
                break;

        }

        atualizarCampos();
    }

    public static boolean vitoria(int est) {
        if (est == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean gameOver(int mov, int vidas, int est) {
        if (mov <= 0 || vidas <= 0) {
            return true;
        } else {
            return false;
        }
    }

//O.B.S:
    // A CADA VEZ QUE CLICA NUM LUGAR DIFERENTE O CLIENTE TAMBÉM MUDA, LOGO TEM QUE SER NULL
    public Mapa(Novato user) {//PARA PODER PEGAR O QUE FOI DIGITADO ANTES
        initComponents();
        switch (user.getNivel()) {
            case 'f':
                estoque = 30;
                vidas = 15;
                movimento = 45 + (user.getNivAgilidade() * 7);
                break;
            case 'm':
                estoque = 65;
                vidas = 10;
                movimento = 50 + (user.getNivAgilidade() * 8);
                break;
            case 'd':
                estoque = 100;
                vidas = 10;
                movimento = 60 + (user.getNivAgilidade() * 8);
                break;
            default:
                break;
        }
        atacar.setEnabled(false);
        procurar.setEnabled(false);
        user.setVidas(vidas);

        txtEstoque.setText("" + estoque);
        txtMovimento.setText("" + movimento);
        //CARACTERÍSTICAS DO AVATAR:(DEPENDE DO CURSO ESCOLHIDO; NA CLASSE NOVATO TEM-SE UMA IDEIA
        txtCharme.setText("" + user.getNivCharme());
        txtAgilidade.setText("" + user.getNivAgilidade());
        txtPopulari.setText("" + user.getNivPop());
        txtMoral.setText("" + user.getNivMoral());
        txtVidas.setText("" + user.getVidas());
        txtPontos.setText("" + user.getPontos());
        usuario = user;
        usuario.setNivCharme(user.getNivCharme());
        txtNome.setText(user.getNome());
        try {
            Font novaFonte = Font.createFont(Font.TRUETYPE_FONT, new File("Arctic.otf")).deriveFont(18f);
            Font novaFonteTit = Font.createFont(Font.TRUETYPE_FONT, new File("Arctic.otf")).deriveFont(36f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Arctic.otf")));
            jLabel6.setFont(novaFonteTit);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }
        //SE ENTRAR NA BIBLIOTECA COM COMIDA JÁ PERDE UMA VIDA
        lugarEscolhido = new Lugar(0, 0, 0);

        //depois de certo tempo fecha a tela
        new Thread() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(50);
                    TelaMensagem dialog = new TelaMensagem(new javax.swing.JFrame(), true);
                    dialog.setVisible(true);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        ;
    }

    .start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        primPanel = new javax.swing.JPanel();
        jpLugares = new javax.swing.JPanel();
        txtQuantAlunos = new javax.swing.JTextField();
        txtQuantServidores = new javax.swing.JTextField();
        txtDificuldades = new javax.swing.JTextField();
        lblTeste = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        recepcao = new javax.swing.JButton();
        administracao1 = new javax.swing.JButton();
        patio = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        b = new javax.swing.JButton();
        c = new javax.swing.JButton();
        d = new javax.swing.JButton();
        biblioteca = new javax.swing.JButton();
        ginasio = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtMensagem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        procurar = new javax.swing.JButton();
        atacar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtMensagem1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCursoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAnoCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtChance = new javax.swing.JTextField();
        pActions = new javax.swing.JPanel();
        VOLTAR = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnUsaCharm = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        btnAmizade = new javax.swing.JButton();
        btnEmpatia = new javax.swing.JButton();
        bntOferecer = new javax.swing.JButton();
        btnInsistencia = new javax.swing.JButton();
        txtQtaconte1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCursoCliente1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAnoCliente1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtChance1 = new javax.swing.JTextField();
        lblFundos = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtEstoque = new javax.swing.JTextField();
        txtMovimento = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCharme = new javax.swing.JTextField();
        txtAgilidade = new javax.swing.JTextField();
        txtPopulari = new javax.swing.JTextField();
        txtMoral = new javax.swing.JTextField();
        txtVidas = new javax.swing.JTextField();
        txtPontos = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtlugaranterior = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1323, 640));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        mainPanel.setBackground(new java.awt.Color(255, 0, 51));
        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.CardLayout());

        primPanel.setBackground(new java.awt.Color(255, 204, 0));
        primPanel.setOpaque(false);

        jpLugares.setBackground(new java.awt.Color(51, 255, 204));
        jpLugares.setOpaque(false);

        txtQuantAlunos.setEditable(false);
        txtQuantAlunos.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantAlunos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtQuantServidores.setEditable(false);
        txtQuantServidores.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantServidores.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDificuldades.setEditable(false);
        txtDificuldades.setBackground(new java.awt.Color(255, 255, 255));
        txtDificuldades.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/mapinahzxinha.png"))); // NOI18N
        jPanel5.add(jLabel9);
        jLabel9.setBounds(0, -10, 450, 590);

        recepcao.setBackground(new java.awt.Color(255, 255, 255));
        recepcao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        recepcao.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        recepcao.setBorderPainted(false);
        recepcao.setContentAreaFilled(false);
        recepcao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recepcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recepcaoActionPerformed(evt);
            }
        });
        jPanel5.add(recepcao);
        recepcao.setBounds(210, 420, 110, 50);

        administracao1.setBackground(new java.awt.Color(255, 255, 255));
        administracao1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        administracao1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        administracao1.setContentAreaFilled(false);
        administracao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administracao1ActionPerformed(evt);
            }
        });
        jPanel5.add(administracao1);
        administracao1.setBounds(350, 380, 50, 90);

        patio.setBackground(new java.awt.Color(255, 255, 255));
        patio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        patio.setContentAreaFilled(false);
        patio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patioActionPerformed(evt);
            }
        });
        jPanel5.add(patio);
        patio.setBounds(210, 280, 130, 120);

        a1.setBackground(new java.awt.Color(255, 255, 255));
        a1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        a1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        a1.setContentAreaFilled(false);
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jPanel5.add(a1);
        a1.setBounds(290, 150, 80, 110);

        b.setBackground(new java.awt.Color(255, 255, 255));
        b.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        b.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        b.setContentAreaFilled(false);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        jPanel5.add(b);
        b.setBounds(190, 150, 70, 110);

        c.setBackground(new java.awt.Color(255, 255, 255));
        c.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        c.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        c.setContentAreaFilled(false);
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel5.add(c);
        c.setBounds(90, 60, 70, 180);

        d.setBackground(new java.awt.Color(255, 255, 255));
        d.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        d.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        d.setContentAreaFilled(false);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        jPanel5.add(d);
        d.setBounds(210, 50, 130, 70);

        biblioteca.setBackground(new java.awt.Color(255, 255, 255));
        biblioteca.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        biblioteca.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        biblioteca.setContentAreaFilled(false);
        biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bibliotecaActionPerformed(evt);
            }
        });
        jPanel5.add(biblioteca);
        biblioteca.setBounds(80, 260, 80, 60);

        ginasio.setBackground(new java.awt.Color(255, 255, 255));
        ginasio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ginasio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        ginasio.setContentAreaFilled(false);
        ginasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ginasioActionPerformed(evt);
            }
        });
        jPanel5.add(ginasio);
        ginasio.setBounds(70, 380, 120, 160);

        jLabel10.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Q. de Alunos:");

        jLabel11.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Q. de Servidores:");

        jLabel12.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Dificuldade:");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        txtMensagem.setEditable(false);
        txtMensagem.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        txtMensagem.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMensagem.setBorder(null);
        txtMensagem.setEnabled(false);
        txtMensagem.setOpaque(false);
        txtMensagem.setSelectionColor(new java.awt.Color(51, 51, 51));
        jPanel9.add(txtMensagem);
        txtMensagem.setBounds(10, 0, 500, 60);

        jLabel6.setFont(new java.awt.Font("Arctic", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Flor de Neem, dia 26.06.18");

        procurar.setBackground(new java.awt.Color(255, 255, 255));
        procurar.setFont(new java.awt.Font("Arctic", 0, 18)); // NOI18N
        procurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/botaoIR.jpg"))); // NOI18N
        procurar.setBorder(null);
        procurar.setBorderPainted(false);
        procurar.setContentAreaFilled(false);
        procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarActionPerformed(evt);
            }
        });

        atacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/botaoatacar.jpg"))); // NOI18N
        atacar.setBorder(null);
        atacar.setBorderPainted(false);
        atacar.setContentAreaFilled(false);
        atacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atacarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtMensagem1.setEditable(false);
        txtMensagem1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        txtMensagem1.setForeground(new java.awt.Color(51, 51, 51));
        txtMensagem1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMensagem1.setBorder(null);
        txtMensagem1.setEnabled(false);
        txtMensagem1.setOpaque(false);
        txtMensagem1.setSelectionColor(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMensagem1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 16)); // NOI18N
        jLabel2.setText("Informações do cliente:");

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel3.setText("Curso");

        txtCursoCliente.setEditable(false);
        txtCursoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCursoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCursoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel4.setText("Ano");

        txtAnoCliente.setEditable(false);
        txtAnoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtAnoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAnoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel5.setText("Chance");

        txtChance.setEditable(false);
        txtChance.setBackground(new java.awt.Color(255, 255, 255));
        txtChance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtChance.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCursoCliente)
                            .addComponent(txtAnoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addComponent(txtChance, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCursoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtChance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAnoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpLugaresLayout = new javax.swing.GroupLayout(jpLugares);
        jpLugares.setLayout(jpLugaresLayout);
        jpLugaresLayout.setHorizontalGroup(
            jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLugaresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLugaresLayout.createSequentialGroup()
                        .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpLugaresLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDificuldades, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantServidores, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(97, 97, 97))
                            .addGroup(jpLugaresLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lblTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1187, 1187, 1187))
                    .addGroup(jpLugaresLayout.createSequentialGroup()
                        .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpLugaresLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpLugaresLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(procurar)
                                        .addGap(42, 42, 42)
                                        .addComponent(atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpLugaresLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpLugaresLayout.setVerticalGroup(
            jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLugaresLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpLugaresLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtQuantAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtQuantServidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtDificuldades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(procurar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(jpLugaresLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout primPanelLayout = new javax.swing.GroupLayout(primPanel);
        primPanel.setLayout(primPanelLayout);
        primPanelLayout.setHorizontalGroup(
            primPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primPanelLayout.createSequentialGroup()
                .addComponent(jpLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );
        primPanelLayout.setVerticalGroup(
            primPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpLugares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(primPanel, "Extra");

        pActions.setBackground(new java.awt.Color(255, 255, 255));
        pActions.setLayout(null);

        VOLTAR.setBackground(new java.awt.Color(255, 255, 255));
        VOLTAR.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        VOLTAR.setText("Voltar");
        VOLTAR.setBorder(null);
        VOLTAR.setBorderPainted(false);
        VOLTAR.setContentAreaFilled(false);
        VOLTAR.setOpaque(true);
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });
        pActions.add(VOLTAR);
        VOLTAR.setBounds(900, 20, 130, 30);

        jPanel4.setBackground(new java.awt.Color(251, 247, 243));

        btnUsaCharm.setBackground(new java.awt.Color(81, 91, 117));
        btnUsaCharm.setFont(new java.awt.Font("Arctic", 0, 18)); // NOI18N
        btnUsaCharm.setForeground(new java.awt.Color(255, 255, 255));
        btnUsaCharm.setText("Charme");
        btnUsaCharm.setMaximumSize(new java.awt.Dimension(181, 27));
        btnUsaCharm.setMinimumSize(new java.awt.Dimension(181, 27));
        btnUsaCharm.setPreferredSize(new java.awt.Dimension(181, 27));
        btnUsaCharm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsaCharmActionPerformed(evt);
            }
        });

        btnAjuda.setBackground(new java.awt.Color(81, 91, 117));
        btnAjuda.setFont(new java.awt.Font("Arctic", 0, 18)); // NOI18N
        btnAjuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAjuda.setText("Ajuda Acadêmica");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });

        btnAmizade.setBackground(new java.awt.Color(81, 91, 117));
        btnAmizade.setFont(new java.awt.Font("Arctic", 0, 18)); // NOI18N
        btnAmizade.setForeground(new java.awt.Color(255, 255, 255));
        btnAmizade.setText("Amizade");
        btnAmizade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmizadeActionPerformed(evt);
            }
        });

        btnEmpatia.setBackground(new java.awt.Color(81, 91, 117));
        btnEmpatia.setFont(new java.awt.Font("Arctic", 0, 18)); // NOI18N
        btnEmpatia.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpatia.setText("Empatia");
        btnEmpatia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpatiaActionPerformed(evt);
            }
        });

        bntOferecer.setBackground(new java.awt.Color(157, 162, 177));
        bntOferecer.setFont(new java.awt.Font("Arctic", 0, 18)); // NOI18N
        bntOferecer.setText("Oferecer Produto");
        bntOferecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOferecerActionPerformed(evt);
            }
        });

        btnInsistencia.setBackground(new java.awt.Color(81, 91, 117));
        btnInsistencia.setFont(new java.awt.Font("Arctic", 0, 18)); // NOI18N
        btnInsistencia.setForeground(new java.awt.Color(255, 255, 255));
        btnInsistencia.setText("Insistência");
        btnInsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(btnUsaCharm, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(btnEmpatia, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(btnInsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(btnAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(btnAmizade, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(bntOferecer, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnUsaCharm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEmpatia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAmizade, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntOferecer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pActions.add(jPanel4);
        jPanel4.setBounds(80, 428, 890, 190);

        txtQtaconte1.setEditable(false);
        txtQtaconte1.setBackground(new java.awt.Color(255, 255, 255));
        txtQtaconte1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtQtaconte1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtaconte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtaconte1ActionPerformed(evt);
            }
        });
        pActions.add(txtQtaconte1);
        txtQtaconte1.setBounds(260, 320, 520, 60);

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Resposta:");
        pActions.add(jLabel1);
        jLabel1.setBounds(260, 300, 290, 15);

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 0, 16)); // NOI18N
        jLabel7.setText("Informações do cliente:");

        jLabel14.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel14.setText("Curso");

        txtCursoCliente1.setEditable(false);
        txtCursoCliente1.setBackground(new java.awt.Color(255, 255, 255));
        txtCursoCliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCursoCliente1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel16.setText("Ano");

        txtAnoCliente1.setEditable(false);
        txtAnoCliente1.setBackground(new java.awt.Color(255, 255, 255));
        txtAnoCliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAnoCliente1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel17.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel17.setText("Chance");

        txtChance1.setEditable(false);
        txtChance1.setBackground(new java.awt.Color(255, 255, 255));
        txtChance1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtChance1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCursoCliente1)
                            .addComponent(txtAnoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel17)
                        .addGap(48, 48, 48)
                        .addComponent(txtChance1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCursoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtChance1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtAnoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pActions.add(jPanel7);
        jPanel7.setBounds(260, 140, 520, 140);
        pActions.add(lblFundos);
        lblFundos.setBounds(-3, -1, 1050, 640);

        mainPanel.add(pActions, "pActions");

        jPanel1.add(mainPanel);
        mainPanel.setBounds(0, 0, 1050, 660);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/plan de fundo.png"))); // NOI18N
        jTabbedPane1.addTab("tab1", jLabel13);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(-10, -30, 1150, 670);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEstoque.setEditable(false);
        txtEstoque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstoque.setText("0");
        txtEstoque.setBorder(null);
        txtEstoque.setOpaque(false);
        jPanel6.add(txtEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 90, -1));

        txtMovimento.setEditable(false);
        txtMovimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMovimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMovimento.setText("0");
        txtMovimento.setBorder(null);
        txtMovimento.setOpaque(false);
        jPanel6.add(txtMovimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 150, 40));

        txtNome.setBackground(new java.awt.Color(37, 69, 57));
        txtNome.setFont(new java.awt.Font("Arctic", 0, 24)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.setBorder(null);
        txtNome.setOpaque(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel6.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 210, 59));

        txtCharme.setEditable(false);
        txtCharme.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCharme.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCharme.setText("0");
        txtCharme.setBorder(null);
        txtCharme.setOpaque(false);
        jPanel6.add(txtCharme, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 90, -1));

        txtAgilidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAgilidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAgilidade.setBorder(null);
        txtAgilidade.setOpaque(false);
        jPanel6.add(txtAgilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, -1));

        txtPopulari.setEditable(false);
        txtPopulari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPopulari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPopulari.setText("0");
        txtPopulari.setBorder(null);
        txtPopulari.setOpaque(false);
        txtPopulari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPopulariActionPerformed(evt);
            }
        });
        jPanel6.add(txtPopulari, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 70, -1));

        txtMoral.setEditable(false);
        txtMoral.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMoral.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMoral.setText("0");
        txtMoral.setBorder(null);
        txtMoral.setOpaque(false);
        jPanel6.add(txtMoral, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 338, 70, 20));

        txtVidas.setEditable(false);
        txtVidas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVidas.setText("0");
        txtVidas.setBorder(null);
        txtVidas.setOpaque(false);
        txtVidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVidasActionPerformed(evt);
            }
        });
        jPanel6.add(txtVidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 150, -1));

        txtPontos.setEditable(false);
        txtPontos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPontos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPontos.setText("0");
        txtPontos.setBorder(null);
        txtPontos.setOpaque(false);
        jPanel6.add(txtPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 90, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/bara lado.jpg"))); // NOI18N
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 260, 660));

        txtlugaranterior.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        txtlugaranterior.setText("r");
        txtlugaranterior.setBorder(null);
        txtlugaranterior.setEnabled(false);
        txtlugaranterior.setOpaque(false);
        jPanel6.add(txtlugaranterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void administracao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administracao1ActionPerformed
        atacar.setEnabled(false);
        if (gameOver(movimento, vidas, estoque) == true) {
            dispose();
            TelaGameOver tela = new TelaGameOver(usuario.getCurso(), pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        }
        procurar.setEnabled(true);
        lugaratual = 'm';
        movimentacao();

        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "PainelLugares");

        ImageIcon ic = new ImageIcon(getClass().getResource("adm.jpg"));
        jLabel13.setIcon(ic);

        Lugar administracao = new Lugar(alunAdm, servAdm, 3);//vai passar o objeto quant aqui
        lugarEscolhido = administracao;
        lugarEscolhido.setCliques(10);
        lugarEscolhido.setNome(lugaratual);
        txtQuantAlunos.setText("" + administracao.getQuantAlunos());
        txtDificuldades.setText(administracao.getDificuldade() + "");
        txtQuantServidores.setText(administracao.getQuantServidores() + "");
        txtMensagem.setText("Administração");
        txtMensagem1.setText("Aqui, o Sol não brilha.");

        usuario.setCliente(null);
        txtCursoCliente.setText("");
        txtAnoCliente.setText("");

        ativarbotoes();
        administracao1.setEnabled(false);
        atualizarCampos();

    }//GEN-LAST:event_administracao1ActionPerformed

    private void recepcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recepcaoActionPerformed
        atacar.setEnabled(false);
        if (gameOver(movimento, vidas, estoque) == true) {
            dispose();
            TelaGameOver tela = new TelaGameOver(usuario.getCurso(), pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        }
        procurar.setEnabled(true);
        lugaratual = 'r';
        movimentacao();

        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "PainelLugares");
        ImageIcon ic = new ImageIcon(getClass().getResource("recepcao.jpg"));
        jLabel13.setIcon(ic);

        Lugar recepcao2 = new Lugar(alunR, servR, 8);
        lugarEscolhido = recepcao2;
        lugarEscolhido.setCliques(8);
        lugarEscolhido.setNome(lugaratual);
        txtQuantAlunos.setText("" + recepcao2.getQuantAlunos());
        txtDificuldades.setText(recepcao2.getDificuldade() + "");
        txtQuantServidores.setText(recepcao2.getQuantServidores() + "");
        txtMensagem.setText("Recepção");
        txtMensagem1.setText("Não queira passar por aqui por mais de 4 anos.");

        usuario.setCliente(null);

        ativarbotoes();
        this.recepcao.setEnabled(false);
        atualizarCampos();
    }//GEN-LAST:event_recepcaoActionPerformed

    private void patioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patioActionPerformed
        atacar.setEnabled(false);
        if (gameOver(movimento, vidas, estoque) == true) {
            dispose();
            TelaGameOver tela = new TelaGameOver(usuario.getCurso(), pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        }
        procurar.setEnabled(true);
        lugaratual = 'p';
        movimentacao();

        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "PainelLugares");
        ImageIcon ic = new ImageIcon(getClass().getResource("patio.jpg"));
        jLabel13.setIcon(ic);

        Lugar patio = new Lugar(alunP, servP, 4);
        lugarEscolhido = patio;
        lugarEscolhido.setCliques(31);
        lugarEscolhido.setNome(lugaratual);
        txtQuantAlunos.setText("" + patio.getQuantAlunos());
        txtDificuldades.setText(patio.getDificuldade() + "");
        txtQuantServidores.setText(patio.getQuantServidores() + "");
        txtMensagem1.setText("Onde jazia o totó, agora só jaz zuada.");
        txtMensagem.setText("Pátio");
        ativarbotoes();
        this.patio.setEnabled(false);
        usuario.setCliente(null);
        atualizarCampos();
    }//GEN-LAST:event_patioActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        atacar.setEnabled(false);
        if (gameOver(movimento, vidas, estoque) == true) {
            dispose();
            TelaGameOver tela = new TelaGameOver(usuario.getCurso(), pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        }
        procurar.setEnabled(true);
        lugaratual = 'a';
        movimentacao();

        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "PainelLugares");
        ImageIcon ic = new ImageIcon(getClass().getResource("bloco a.jpg"));
        jLabel13.setIcon(ic);

        Lugar a1 = new Lugar(alunA, servA, 3);
        lugarEscolhido = a1;
        lugarEscolhido.setCliques(18);
        lugarEscolhido.setNome(lugaratual);
        txtQuantAlunos.setText("" + a1.getQuantAlunos());
        txtDificuldades.setText(a1.getDificuldade() + "");
        txtQuantServidores.setText(a1.getQuantServidores() + "");
        txtMensagem1.setText("Todo mundo por aqui é melhor do que você.");
        txtMensagem.setText("Bloco A");
        ativarbotoes();
        this.a1.setEnabled(false);
        usuario.setCliente(null);
        atualizarCampos();
    }//GEN-LAST:event_a1ActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        atacar.setEnabled(false);
        if (gameOver(movimento, vidas, estoque) == true) {
            dispose();
            TelaGameOver tela = new TelaGameOver(usuario.getCurso(), pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        }

        procurar.setEnabled(true);
        lugaratual = 'b';
        movimentacao();

        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "PainelLugares");
        ImageIcon ic = new ImageIcon(getClass().getResource("bloco b 1.jpg"));
        jLabel13.setIcon(ic);

        Lugar b = new Lugar(alunB, servB, 4);
        lugarEscolhido = b;
        lugarEscolhido.setCliques(27);
        lugarEscolhido.setNome(lugaratual);
        txtQuantAlunos.setText("" + b.getQuantAlunos());
        txtDificuldades.setText(b.getDificuldade() + "");
        txtQuantServidores.setText(b.getQuantServidores() + "");
        txtMensagem1.setText("Cuidado com os ratos.");
        txtMensagem.setText("Bloco B");
        ativarbotoes();
        this.b.setEnabled(false);
        usuario.setCliente(null);
        atualizarCampos();
    }//GEN-LAST:event_bActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        atacar.setEnabled(false);
        if (gameOver(movimento, vidas, estoque) == true) {
            dispose();
            TelaGameOver tela = new TelaGameOver(usuario.getCurso(), pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        }
        procurar.setEnabled(true);
        lugaratual = 'c';
        movimentacao();

        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "PainelLugares");
        ImageIcon ic = new ImageIcon(getClass().getResource("bloco c.jpg"));
        jLabel13.setIcon(ic);
        Lugar C = new Lugar(alunC, servC, 1);
        lugarEscolhido = C;
        lugarEscolhido.setQuantAlunos(lugarEscolhido.getQuantAlunos());
        lugarEscolhido.setQuantServidores(lugarEscolhido.getQuantServidores());
        lugarEscolhido.setQuantTotal(lugarEscolhido.getQuantAlunos() + lugarEscolhido.getQuantServidores());
        lugarEscolhido.setCliques(lugarEscolhido.getQuantTotal());

        lugarEscolhido.setNome(lugaratual);
        txtQuantAlunos.setText("" + lugarEscolhido.getQuantAlunos());
        txtDificuldades.setText(lugarEscolhido.getDificuldade() + "");
        txtQuantServidores.setText(lugarEscolhido.getQuantServidores() + "");
        txtMensagem1.setText("Se algo se mover, corra.");
        txtMensagem.setText("Bloco C");
        ativarbotoes();
        this.c.setEnabled(false);
        usuario.setCliente(null);
        atualizarCampos();
    }//GEN-LAST:event_cActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        atacar.setEnabled(false);
        if (gameOver(movimento, vidas, estoque) == true) {
            dispose();
            TelaGameOver tela = new TelaGameOver(usuario.getCurso(), pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        }
        procurar.setEnabled(true);
        lugaratual = 'd';
        movimentacao();

        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "PainelLugares");
        ImageIcon ic = new ImageIcon(getClass().getResource("bloco d.jpg"));
        jLabel13.setIcon(ic);

        Lugar d = new Lugar(alunD, servD, 4);
        lugarEscolhido = d;
        lugarEscolhido.setCliques(12);
        lugarEscolhido.setNome(lugaratual);
        txtQuantAlunos.setText("" + d.getQuantAlunos());
        txtDificuldades.setText(d.getDificuldade() + "");
        txtQuantServidores.setText(d.getQuantServidores() + "");
        txtMensagem1.setText("Cuidado pra onde olha.");
        txtMensagem.setText("Bloco D");
        ativarbotoes();
        this.d.setEnabled(false);
        usuario.setCliente(null);
        atualizarCampos();
    }//GEN-LAST:event_dActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtPopulariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPopulariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPopulariActionPerformed

    private void procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarActionPerformed

        atualizarCampos();
        if (vitoria(estoque)) {
            dispose();
            TelaVitoria tela = new TelaVitoria(pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);

        }
        if (usuario.getNivMoral() < 0) {
            usuario.setNivMoral(1);
        }
        chances = usuario.getNivMoral() * 10;
        movimento--;
        if (gameOver(movimento, vidas, estoque) == true) {
            dispose();
            TelaGameOver tela = new TelaGameOver(usuario.getCurso(), pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        }
        int cliques = lugarEscolhido.getCliques();
        if (lugarEscolhido.getQuantAlunos() + lugarEscolhido.getQuantServidores() != 0) {
            if (cliques <= lugarEscolhido.getCliques() && cliques != 0) {
                Random rd = new Random();
                int result = rd.nextInt((lugarEscolhido.getQuantAlunos() + lugarEscolhido.getQuantServidores()));
                int[] numsServidores = new int[lugarEscolhido.getQuantServidores()];
                for (int i = 0; i < lugarEscolhido.getQuantServidores(); i++) {
                    numsServidores[i] = i;
                }
                boolean servidor = false;
                for (int i = 0; i < lugarEscolhido.getQuantServidores(); i++) {

                    if (numsServidores[i] == result) {
                        servidor = true;
                    }
                }
                if (servidor == true) {
                    defineQuant('s');
                    vidas--;

                    atacar.setEnabled(false);
                    txtAnoCliente.setText("error");
                    txtCursoCliente.setText("error");
                    txtChance.setText("error");

                    usuario.setVidas(vidas);
                    //txtQtaconte.setText("Você foi pego.");
                    estoque -= 2;
                    //nesse caso, a quantidade de servidores no local diminui em 1
                    lugarEscolhido.setQuantServidores(lugarEscolhido.getQuantServidores() - 1);
                } else {
                    defineQuant('a');
                    atacar.setEnabled(true);
                    //vetor com quant. de numeros
                    //pegar a porcentagem de chances que terá
                    char[] cursos = {'i', 't', 'e', 'v'};
                    int[] anos = {1, 2, 3, 4};
                    rd = new Random();
                    char curso = cursos[rd.nextInt(cursos.length)];
                    int ano = anos[rd.nextInt(anos.length)];
                    Cliente i = new Cliente();
                    i.setCurso(curso);
                    i.setAno(ano);
                    String texto = "";
                    switch (curso) {
                        case 'i':
                            texto = "Informática";
                            break;
                        case 'v':
                            texto = "Vestuário";
                            break;
                        case 't':
                            texto = "Têxtil";
                            break;
                        case 'e':
                            texto = "Eletrotécnica";
                            break;

                    }
                    //Mandando dados para os campos de texto do cliente:
                    if (usuario.getCurso() == curso && i.getAno() == 2) {
                        chances += 50;
                    }
                    if (curso == 'e' && i.getAno() == 2) {
                        chances = 5;
                    }
                    if (curso == 'v' && i.getAno() == 2) {
                        chances += 50;
                    }
                    if (i.getAno() == 2 || i.getAno() == 4) {
                        chances += 10;
                    }
                    if (i.getAno() == 3) {
                        chances = 10;
                    }
                    txtAnoCliente.setText("" + i.getAno() + "° ano");
                    txtCursoCliente.setText("" + texto);
                    txtChance.setText("" + chances + "%");

                    usuario.setCliente(i);
                    //Diminui um aluno no local:
                    lugarEscolhido.setQuantAlunos(lugarEscolhido.getQuantAlunos() - 1);
                    txtQuantAlunos.setText(lugarEscolhido.getQuantAlunos() + "");
                    cliques--;
                }
            } else { //Assim, irá desabilitar este botão de procurar
                procurar.setEnabled(false);
            }
            lugarEscolhido.setCliques(lugarEscolhido.getCliques() - 1);
            lugarEscolhido.setQuantTotal(lugarEscolhido.getQuantAlunos() + lugarEscolhido.getQuantServidores());
        } else {
            procurar.setEnabled(false);
        }
        atualizarCampos();
        //txtCliques.setText(lugarEscolhido.getCliques() + "");

// cada vez que clicar aqui cria-se um novo "Cliente"(cliente, na verdade)
        //Ver problema do lugar escolhido
        //Para abrir o panel onde vai ser realizado o jogo em si, com os fundos:

    }//GEN-LAST:event_procurarActionPerformed

    private void bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibliotecaActionPerformed
        atacar.setEnabled(false);
        if (gameOver(movimento, vidas, estoque) == true) {
            dispose();
            TelaGameOver tela = new TelaGameOver(usuario.getCurso(), pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        }
        procurar.setEnabled(true);
        lugaratual = 'i';
        movimentacao();
        txtAnoCliente.setText("error");
        txtCursoCliente.setText("error");
        txtChance.setText("error");

        vidas--;
        usuario.setVidas(vidas);
        procurar.setEnabled(false);
        atacar.setEnabled(false);

        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "PainelLugares");
        ImageIcon ic = new ImageIcon(getClass().getResource("biblioteca.jpg"));
        jLabel13.setIcon(ic);
        Lugar C = new Lugar(alunBibli, servBibli, 10);
        lugarEscolhido = C;
        lugarEscolhido.setCliques(13);
        lugarEscolhido.setNome('i');
        txtQuantAlunos.setText("" + C.getQuantAlunos());
        txtDificuldades.setText(C.getDificuldade() + "");
        txtQuantServidores.setText(C.getQuantServidores() + "");
        txtMensagem1.setText("Proibido entrar com comida.");
        txtMensagem.setText("Biblioteca");
        ativarbotoes();
        this.biblioteca.setEnabled(false);
        usuario.setCliente(null);
        atualizarCampos();
    }//GEN-LAST:event_bibliotecaActionPerformed

    private void ginasioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ginasioActionPerformed
        atacar.setEnabled(false);
        if (gameOver(movimento, vidas, estoque) == true) {
            dispose();
            TelaGameOver tela = new TelaGameOver(usuario.getCurso(), pontos);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        }
        procurar.setEnabled(true);
        lugaratual = 'g';
        movimentacao();

        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "PainelLugares");
        ImageIcon ic = new ImageIcon(getClass().getResource("ginasio.jpg"));
        jLabel13.setIcon(ic);
        Lugar C = new Lugar(alunG, servG, 5);
        lugarEscolhido = C;
        lugarEscolhido.setCliques(4);
        lugarEscolhido.setNome('g');
        txtQuantAlunos.setText("" + C.getQuantAlunos());
        txtDificuldades.setText(C.getDificuldade() + "");
        txtQuantServidores.setText(C.getQuantServidores() + "");
        txtMensagem1.setText("No que você estava pensando?");
        txtMensagem.setText("Ginásio");
        ativarbotoes();
        this.ginasio.setEnabled(false);
        usuario.setCliente(null);
        atualizarCampos();
    }//GEN-LAST:event_ginasioActionPerformed

    private void txtVidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVidasActionPerformed

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
        contcharme = 0;
        contamizade = 0;
        contempatia = 0;
        continsist = 0;
        contajuda = 0;
        //Botar as quantidades aqui
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "Extra");
        ImageIcon ic = new ImageIcon(getClass().getResource("plan de fundo.png"));
        jLabel13.setIcon(ic);
        atualizarCampos();

        txtCursoCliente.setText("");
        txtAnoCliente.setText("");
        txtChance.setText("");
        atualizarCampos();

    }//GEN-LAST:event_VOLTARActionPerformed

    private void atacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atacarActionPerformed
        movimento -= 1;
        ativarBotoes();
        txtQtaconte1.setText("");
        txtChance1.setText(txtChance.getText());
        txtCursoCliente1.setText(txtCursoCliente.getText());
        txtAnoCliente1.setText(txtAnoCliente.getText());
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "pActions");
        switch (lugarEscolhido.getNome()) {
            case 'm': {
                ImageIcon ic = new ImageIcon(getClass().getResource("adm.jpg"));
                lblFundos.setIcon(ic);
                break;
            }
            case 'r': {
                ImageIcon ic = new ImageIcon(getClass().getResource("recepcao.jpg"));
                lblFundos.setIcon(ic);
                break;
            }
            case 'a': {
                ImageIcon ic = new ImageIcon(getClass().getResource("bloco a.jpg"));
                lblFundos.setIcon(ic);
                break;
            }
            case 'b': {
                ImageIcon ic = new ImageIcon(getClass().getResource("bloco b 2.jpg"));
                lblFundos.setIcon(ic);
                break;
            }
            case 'c': {
                ImageIcon ic = new ImageIcon(getClass().getResource("bloco c batalha.jpg"));
                lblFundos.setIcon(ic);
                break;
            }
            case 'd': {
                ImageIcon ic = new ImageIcon(getClass().getResource("bloco d batalha.jpg"));
                lblFundos.setIcon(ic);
                break;
            }
            case 'i': {
                ImageIcon ic = new ImageIcon(getClass().getResource("biblioteca.jpg"));
                lblFundos.setIcon(ic);
                break;
            }
            case 'g': {
                ImageIcon ic = new ImageIcon(getClass().getResource("ginasio batalha.jpg"));
                lblFundos.setIcon(ic);
                break;
            }
            case 'p': {
                ImageIcon ic = new ImageIcon(getClass().getResource("patio batalha.jpg"));
                lblFundos.setIcon(ic);
                break;
            }
            default:
                break;
        }
        atualizarCampos();
    }//GEN-LAST:event_atacarActionPerformed

    private void btnUsaCharmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsaCharmActionPerformed

        contcharme++; // quantas vezes pode usar
        if (contcharme == 5) {
            btnUsaCharm.setEnabled(false);
            contcharme = 0;
        }
        movimento--;
        Random rd = new Random();
        int x = 6;
        if (usuario.getCliente().getAno() == 1 || usuario.getCliente().getAno() == 3) {
            x -= 4;
        }

        //se for compativel, x diminui
        //no lugar se simplesmente funcionar, AUMENTA A CHANCE DE DAR CRT
        int result = rd.nextInt(usuario.getNivCharme() + x);
        int[] numCharme = new int[usuario.getNivCharme() + 1];

        for (int i = 0; i < usuario.getNivCharme(); i++) {
            numCharme[i] = i;
        }

        if (chances >= 100) {
            bloquearBotoesAcoes();
            bntOferecer.setEnabled(false);

        }

        boolean crt = false;

        for (int i = 0; i < usuario.getNivCharme(); i++) {
            if (numCharme[i] == result) {
                crt = true;
            }

        }
        if (crt == true) {
            // cliente.setChance();         
            chances += 10;
            txtChance1.setText(chances + "%");
            usuario.setNivCharme(usuario.getNivCharme() + 1);
            txtCharme.setText(usuario.getNivCharme() + "");
        } else {
            chances -= 10;
            if (chances < 0) {
                chances = 0;
            }
            txtChance1.setText(chances + "%");
        }
        atualizarCampos();

    }//GEN-LAST:event_btnUsaCharmActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed

        contajuda++; // quantas vezes pode usar
        if (contajuda == 5) {
            btnAjuda.setEnabled(false);
            contajuda = 0;
        }
        movimento--;
        if (chances >= 100) {
            bloquearBotoesAcoes();
            bntOferecer.setEnabled(false);
        }
        boolean crt = false;

        if (usuario.ajudaAc()) { //essa é a aprte q muda
            crt = true;
        }

        if (crt == true) {
            // cliente.setChance();         
            chances += 10;
            txtChance1.setText(chances + "%");
        } else {
            chances -= 5;
            if (chances < 0) {
                chances = 0;
            }
            txtChance1.setText(chances + "%");
        }
        atualizarCampos();
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void btnEmpatiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpatiaActionPerformed

        contempatia++; // quantas vezes pode usar
        if (contempatia == 3) {
            btnEmpatia.setEnabled(false);
            contempatia = 0;
        }

        movimento--;
        if (chances >= 100) {
            bloquearBotoesAcoes();
            bntOferecer.setEnabled(false);

        }

        Random rd = new Random();
        int x = 3;

        if (usuario.testarEmpatia()) { //essa é a aprte q muda
            x += 5;
        }

        int result = rd.nextInt(8);
        int[] numEmp = new int[x];
        //int chances = 0;
        ///

        for (int i = 0; i < x; i++) {
            numEmp[i] = i;
        }

        boolean crt = false;

        for (int i = 0; i < x; i++) {
            if (numEmp[i] == result) {
                crt = true;
            }
        }
        if (crt == true) {
            // cliente.setChance();         
            chances += 10;
            txtChance1.setText(chances + "%");
            usuario.setNivPop(usuario.getNivPop() + 1);
            txtPopulari.setText(usuario.getNivPop() + "");
        } else {
            chances -= 5;
            if (chances < 0) {
                chances = 0;
            }
            txtChance1.setText(chances + "%");
        }

        atualizarCampos();
    }//GEN-LAST:event_btnEmpatiaActionPerformed

    private void btnAmizadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmizadeActionPerformed

        contamizade++; // quantas vezes pode usar
        if (contamizade == 5) {
            btnAmizade.setEnabled(false);
            contamizade = 0;
        }

        movimento--;
        Random rd = new Random();
        int x = 3;

        if (usuario.testarEmpatia()) { //essa é a aprte q muda
            x += 5;
        }

        int result = rd.nextInt(8);
        int[] numAmi = new int[x];

        if (usuario.getCliente().getTurno() == usuario.getAno() || usuario.getCliente().getTurno() == 2) { //essa é a aprte q muda
            x -= 4;
        }

        if (chances >= 100) {
            bloquearBotoesAcoes();
            bntOferecer.setEnabled(false);

        }

        for (int i = 0; i < x; i++) {
            numAmi[i] = i;
        }

        boolean crt = false;

        for (int i = 0; i < x; i++) {
            if (numAmi[i] == result) {
                crt = true;
            }
        }
        if (crt == true) {
            // cliente.setChance();         
            chances += 10;
            txtChance1.setText(chances + "%");
            usuario.setNivPop(usuario.getNivPop() + 1);
            txtPopulari.setText(usuario.getNivPop() + "");
        } else {
            chances -= 5;
            if (chances < 0) {
                chances = 0;
            }
            txtChance1.setText(chances + "%");
        }
        atualizarCampos();

    }//GEN-LAST:event_btnAmizadeActionPerformed

    private void btnInsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsistenciaActionPerformed

        continsist++; // quantas vezes pode usar
        if (continsist == 5) {
            btnInsistencia.setEnabled(false);
            continsist = 0;
        }
        movimento--;
        if (chances >= 100) {
            bloquearBotoesAcoes();
            bntOferecer.setEnabled(false);
        }
        boolean crt = false;

        usuario.setInsistencia(true);
        if (usuario.insistencia()) { //essa é a aprte q muda
            crt = true;
        }

        if (crt == true) {
            // cliente.setChance();         
            chances += 10;
            txtChance1.setText(chances + "%");
        } else {
            chances -= 10;
            if (chances < 0) {
                chances = 0;
            }
            txtChance1.setText(chances + "%");
        }
        atualizarCampos();
        //        txtInfluNeg.setText(usuario.getCliente().getInfluenciaNegativa()+"");
    }//GEN-LAST:event_btnInsistenciaActionPerformed

    private void bntOferecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOferecerActionPerformed

        Random rd = new Random();
        int x = 85 - chances;

        //se for compativel, x diminui
        //no lugar se simplesmente funcionar, AUMENTA A CHANCE DE DAR CRT
        int result = rd.nextInt(100);
        int[] numChance = new int[chances];
        for (int i = 0; i < chances; i++) {
            numChance[i] = i;
        }

        boolean chance = false;
        for (int i = 0; i < chances; i++) {

            if (numChance[i] == result) {
                chance = true;
            }
        }
        if (chance) {
            int quantidade = rd.nextInt(5);
            if (quantidade == 0) {
                quantidade = 1;
            }
            estoque -= quantidade;
            pontos += quantidade * 0.5;
            movimento += 1;
            txtQtaconte1.setText("OK, quero " + quantidade + ".");
//            txtEstoque.setText("" + estoque);
//            txtPontos.setText("R$" + pontos);
            int a = usuario.getNivMoral();
            a++;
            usuario.setNivMoral(a);
            bloquearBotoesAcoes();
            //vendeu
        } else {
            txtQtaconte1.setText("Amanhã eu compro.");
            bloquearBotoesAcoes();
            int a = usuario.getNivMoral();
            a--;
            usuario.setNivMoral(a);
            //nao vendeu, volta pro mapa
        }
        if (chances < 0) {
            chances = 0;
        }
        atualizarCampos();
    }//GEN-LAST:event_bntOferecerActionPerformed

    private void txtQtaconte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtaconte1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtaconte1ActionPerformed

    private Novato usuario;
    private Lugar lugarEscolhido;
    private int chances;
    private int vidas;
    private int movimento;
    private char lugaranterior = 'r';
    private char lugaratual;
    private int estoque;
    private float pontos;

    private int contcharme;
    private int contamizade;
    private int contempatia;
    private int continsist;
    private int contajuda;

    private int servAdm = 8;
    private int alunAdm = 2;

    private int servB = 10;
    private int alunB = 17;

    private int servC = 2;
    private int alunC = 6;

    private int servD = 2;
    private int alunD = 12;

    private int servA = 7;
    private int alunA = 12;

    private int servG = 4;
    private int alunG = 3;

    private int servR = 2;
    private int alunR = 6;

    private int servBibli = 2;
    private int alunBibli = 8;

    private int servP = 11;
    private int alunP = 20;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VOLTAR;
    private javax.swing.JButton a1;
    private javax.swing.JButton administracao1;
    private javax.swing.JButton atacar;
    private javax.swing.JButton b;
    private javax.swing.JButton biblioteca;
    private javax.swing.JButton bntOferecer;
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnAmizade;
    private javax.swing.JButton btnEmpatia;
    private javax.swing.JButton btnInsistencia;
    private javax.swing.JButton btnUsaCharm;
    private javax.swing.JButton c;
    private javax.swing.JButton d;
    private javax.swing.JButton ginasio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpLugares;
    private javax.swing.JLabel lblFundos;
    private javax.swing.JLabel lblTeste;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pActions;
    private javax.swing.JButton patio;
    private javax.swing.JPanel primPanel;
    private javax.swing.JButton procurar;
    private javax.swing.JButton recepcao;
    private javax.swing.JTextField txtAgilidade;
    private javax.swing.JTextField txtAnoCliente;
    private javax.swing.JTextField txtAnoCliente1;
    private javax.swing.JTextField txtChance;
    private javax.swing.JTextField txtChance1;
    private javax.swing.JTextField txtCharme;
    private javax.swing.JTextField txtCursoCliente;
    private javax.swing.JTextField txtCursoCliente1;
    private javax.swing.JTextField txtDificuldades;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtMensagem;
    private javax.swing.JTextField txtMensagem1;
    private javax.swing.JTextField txtMoral;
    private javax.swing.JTextField txtMovimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPontos;
    private javax.swing.JTextField txtPopulari;
    private javax.swing.JTextField txtQtaconte1;
    private javax.swing.JTextField txtQuantAlunos;
    private javax.swing.JTextField txtQuantServidores;
    private javax.swing.JTextField txtVidas;
    private javax.swing.JTextField txtlugaranterior;
    // End of variables declaration//GEN-END:variables

}
