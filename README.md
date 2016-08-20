import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class Edwin {

	static JPanel painel1 = new JPanel();
	static JPanel painel2 = new JPanel();
	

	static JFrame inicial = new JFrame();
	static JFrame menu = new JFrame();
	static JFrame andar01 = new JFrame();
	static JFrame andar02 = new JFrame();
	static JFrame andar03 = new JFrame();
	static JFrame consulta = new JFrame();


	static JButton inicio = new JButton("INICIO");
	static JButton sair = new JButton("SAIR");
	static JButton consultar = new JButton("CONSULTA");
	static JButton carro = new JButton("VAGAS CARRO");
	static JButton moto = new JButton("VAGAS MOTO");
	static JButton prioritarias = new JButton("VAGAS PRIORITARIAS");
	
	static JButton andar1 = new JButton("1°ANDAR");	
	static JButton andar2 = new JButton("2°ANDAR");
	static JButton andar3 = new JButton("3°ANDAR");

	static JButton voltar = new JButton("VOLTAR");
	static JButton voltar0 = new JButton("VOLTAR");
	static JButton voltar1 = new JButton("VOLTAR");
	static JButton voltar2 = new JButton("VOLTAR");
	static JButton voltar3 = new JButton("VOLTAR");
	static JButton voltar4 = new JButton("VOLTAR");
	static JButton voltar5 = new JButton("VOLTAR");


	static JTable tabela;
	

	static JScrollPane rolagem = new JScrollPane(tabela);
	

	static int n = 0;


	static String[][] introduzir11 = new String[100][6];
	static String[][] introduzir = new String[100][4];
	static String[] tabela0 = new String[] { "N°PLACA", "N°VAGA", "VEICULO", "TIPO DE VAGA"};
	static DefaultTableModel tabela2 = new DefaultTableModel(tabela0, 0);
	
//vagas para o 1°andar:
	static JLabel vaga1 = new JLabel("01");
	static JLabel vaga2 = new JLabel("02");
	static JLabel vaga3 = new JLabel("03");
	static JLabel vaga4 = new JLabel("04");
	static JLabel vaga5 = new JLabel("05");
	static JLabel vaga6 = new JLabel("06");
	static JLabel vaga7 = new JLabel("07");
	static JLabel vaga8 = new JLabel("08");
	static JLabel vaga9 = new JLabel("09");
	static JLabel vaga10 = new JLabel("10");
	static JLabel vaga11 = new JLabel("11");
	static JLabel vaga12 = new JLabel("12");
	static JLabel vaga13 = new JLabel("13");
	static JLabel vaga14 = new JLabel("14");
	static JLabel vaga15 = new JLabel("15");
	static JLabel vaga16 = new JLabel("16");
	static JLabel vaga17 = new JLabel("17");
	static JLabel vaga18 = new JLabel("18");
	static JLabel vaga19 = new JLabel("19");
	static JLabel vaga20 = new JLabel("20");
//vagas para o 2°andar:
	static JLabel vaga21 = new JLabel("21");
	static JLabel vaga22 = new JLabel("22");
	static JLabel vaga23 = new JLabel("23");
	static JLabel vaga24 = new JLabel("24");
	static JLabel vaga25 = new JLabel("25");
	static JLabel vaga26 = new JLabel("26");
	static JLabel vaga27 = new JLabel("27");
	static JLabel vaga28 = new JLabel("28");
	static JLabel vaga29 = new JLabel("29");
	static JLabel vaga30 = new JLabel("30");
	static JLabel vaga31 = new JLabel("31");
	static JLabel vaga32 = new JLabel("32");
	static JLabel vaga33 = new JLabel("33");
	static JLabel vaga34 = new JLabel("34");
	static JLabel vaga35 = new JLabel("35");
	static JLabel vaga36 = new JLabel("36");
	static JLabel vaga37 = new JLabel("37");
	static JLabel vaga38 = new JLabel("38");
	static JLabel vaga39 = new JLabel("39");
	static JLabel vaga40 = new JLabel("40");
//vagas para o 3°andar:
	static JLabel vaga41 = new JLabel("41");
	static JLabel vaga42 = new JLabel("42");
	static JLabel vaga43 = new JLabel("43");
	static JLabel vaga44 = new JLabel("44");
	static JLabel vaga45 = new JLabel("45");
	static JLabel vaga46 = new JLabel("46");
	static JLabel vaga47 = new JLabel("47");
	static JLabel vaga48 = new JLabel("48");
	static JLabel vaga49 = new JLabel("49");
	static JLabel vaga50 = new JLabel("50");
	static JLabel vaga51 = new JLabel("51");
	static JLabel vaga52 = new JLabel("52");
	static JLabel vaga53 = new JLabel("53");
	static JLabel vaga54 = new JLabel("54");
	static JLabel vaga55 = new JLabel("55");
	static JLabel vaga56 = new JLabel("56");
	static JLabel vaga57 = new JLabel("57");
	static JLabel vaga58 = new JLabel("58");
	static JLabel vaga59 = new JLabel("59");
	static JLabel vaga60 = new JLabel("60");

	static JTable tabela1;

	static JScrollPane rolagem1 = new JScrollPane(tabela1);

	static int n1 = 0;
	static int id_consulta1 = 0;
	

	static String[][] introduzir1 = new String[60][4];
	static String[] tabela12 = new String[] { "N°PLACA", "N°VAGA", "VEICULO", "TIPO DE VAGA"};
	

	static DefaultTableModel tabela13 = new DefaultTableModel(tabela12, 0);


public static void main(String[] args) {
	
	ArrayList lista = new ArrayList();
     ArrayList<Integer> possiveis = new ArrayList<Integer>();
     for (int i = 0; i < 60; i++) {
         possiveis.add(i);
     }
     Collections.shuffle(possiveis);

     for (int i = 0; i < 1 ; i++) {
         System.out.println(possiveis.get(i));
       }
	
		inicial();
		menu();
		consulta();
		andar01();
		andar02();
		andar03();
		botoes();
		

	}


	static void inicial() {

		inicial.setTitle("TELA INICIAL");
		inicial.setSize(1365, 700);
		inicial.setLayout(null);
		inicial.setVisible(true);
		inicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicial.setResizable(false);


	inicial.add(inicio).setBounds(100, 100, 100, 100);
	inicial.add(sair).setBounds(100, 100, 100, 100);
	}
	static void menu() {

		menu.setTitle("MENU");
		menu.setSize(1365, 700);
		menu.setLayout(null);
		menu.setVisible(true);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setResizable(false);


		menu.add(voltar).setBounds(100, 100, 100, 100);
		menu.add(consulta).setBounds(100, 100, 100, 100);
		menu.add(carro).setBounds(100, 100, 100, 100);
		menu.add(moto).setBounds(100, 100, 100, 100);
		menu.add(prioritarias).setBounds(100, 100, 100, 100);
		menu.add(andar1).setBounds(100, 100, 100, 100);
		menu.add(andar2).setBounds(100, 100, 100, 100);
		menu.add(andar3).setBounds(100, 100, 100, 100);
	}
	static void andar01() {

		andar01.setTitle("1°ANDAR");
		andar01.setSize(1365, 700);
		andar01.setLayout(null);
		andar01.setVisible(true);
		andar01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		andar01.setResizable(false);
		
		andar01.add(vaga1).setBounds(10, 70, 50, 20);
		andar01.add(vaga2).setBounds(10, 70, 50, 20);
		andar01.add(vaga2).setBounds(10, 70, 50, 20);
		andar01.add(vaga3).setBounds(10, 70, 50, 20);
		andar01.add(vaga4).setBounds(10, 70, 50, 20);
		andar01.add(vaga5).setBounds(10, 70, 50, 20);
		andar01.add(vaga6).setBounds(10, 70, 50, 20);
		andar01.add(vaga7).setBounds(10, 70, 50, 20);
		andar01.add(vaga8).setBounds(10, 70, 50, 20);
		andar01.add(vaga9).setBounds(10, 70, 50, 20);
		andar01.add(vaga10).setBounds(10, 70, 50, 20);
		andar01.add(vaga11).setBounds(10, 70, 50, 20);
		andar01.add(vaga12).setBounds(10, 70, 50, 20);
		andar01.add(vaga13).setBounds(10, 70, 50, 20);
		andar01.add(vaga14).setBounds(10, 70, 50, 20);
		andar01.add(vaga15).setBounds(10, 70, 50, 20);
		andar01.add(vaga16).setBounds(10, 70, 50, 20);
		andar01.add(vaga17).setBounds(10, 70, 50, 20);
		andar01.add(vaga18).setBounds(10, 70, 50, 20);
		andar01.add(vaga19).setBounds(10, 70, 50, 20);
		andar01.add(vaga20).setBounds(10, 70, 50, 20);

		andar01.add(voltar).setBounds(100, 100, 100, 100);
		andar01.add(consultar).setBounds(100, 100, 100, 100);
		andar01.add(andar02).setBounds(100, 100, 100, 100);
		andar01.add(andar03).setBounds(100, 100, 100, 100);
	}
	static void andar02() {

		andar02.setTitle("2°ANDAR");
		andar02.setSize(1365, 700);
		andar02.setLayout(null);
		andar02.setVisible(true);
		andar02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		andar02.setResizable(false);
		
		andar02.add(vaga21).setBounds(10, 70, 50, 20);
		andar02.add(vaga22).setBounds(10, 70, 50, 20);
		andar02.add(vaga22).setBounds(10, 70, 50, 20);
		andar02.add(vaga23).setBounds(10, 70, 50, 20);
		andar02.add(vaga24).setBounds(10, 70, 50, 20);
		andar02.add(vaga25).setBounds(10, 70, 50, 20);
		andar02.add(vaga26).setBounds(10, 70, 50, 20);
		andar02.add(vaga27).setBounds(10, 70, 50, 20);
		andar02.add(vaga28).setBounds(10, 70, 50, 20);
		andar02.add(vaga29).setBounds(10, 70, 50, 20);
		andar02.add(vaga30).setBounds(10, 70, 50, 20);
		andar02.add(vaga31).setBounds(10, 70, 50, 20);
		andar02.add(vaga32).setBounds(10, 70, 50, 20);
		andar02.add(vaga33).setBounds(10, 70, 50, 20);
		andar02.add(vaga34).setBounds(10, 70, 50, 20);
		andar02.add(vaga35).setBounds(10, 70, 50, 20);
		andar02.add(vaga36).setBounds(10, 70, 50, 20);
		andar02.add(vaga37).setBounds(10, 70, 50, 20);
		andar02.add(vaga38).setBounds(10, 70, 50, 20);
		andar02.add(vaga39).setBounds(10, 70, 50, 20);
		andar02.add(vaga40).setBounds(10, 70, 50, 20);


		andar02.add(voltar).setBounds(100, 100, 100, 100);
		andar02.add(consultar).setBounds(100, 100, 100, 100);
		andar02.add(andar01).setBounds(100, 100, 100, 100);
		andar02.add(andar03).setBounds(100, 100, 100, 100);
	}
	static void andar03() {

		andar03.setTitle("3°ANDAR");
		andar03.setSize(1365, 700);
		andar03.setLayout(null);
		andar03.setVisible(true);
		andar03.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		andar03.setResizable(false);
		
		andar03.add(vaga41).setBounds(10, 70, 50, 20);
		andar03.add(vaga42).setBounds(10, 70, 50, 20);
		andar03.add(vaga42).setBounds(10, 70, 50, 20);
		andar03.add(vaga43).setBounds(10, 70, 50, 20);
		andar03.add(vaga44).setBounds(10, 70, 50, 20);
		andar03.add(vaga45).setBounds(10, 70, 50, 20);
		andar03.add(vaga46).setBounds(10, 70, 50, 20);
		andar03.add(vaga47).setBounds(10, 70, 50, 20);
		andar03.add(vaga48).setBounds(10, 70, 50, 20);
		andar03.add(vaga49).setBounds(10, 70, 50, 20);
		andar03.add(vaga50).setBounds(10, 70, 50, 20);
		andar03.add(vaga51).setBounds(10, 70, 50, 20);
		andar03.add(vaga52).setBounds(10, 70, 50, 20);
		andar03.add(vaga53).setBounds(10, 70, 50, 20);
		andar03.add(vaga54).setBounds(10, 70, 50, 20);
		andar03.add(vaga55).setBounds(10, 70, 50, 20);
		andar03.add(vaga56).setBounds(10, 70, 50, 20);
		andar03.add(vaga57).setBounds(10, 70, 50, 20);
		andar03.add(vaga58).setBounds(10, 70, 50, 20);
		andar03.add(vaga59).setBounds(10, 70, 50, 20);
		andar03.add(vaga60).setBounds(10, 70, 50, 20);

		andar03.add(voltar).setBounds(100, 100, 100, 100);
		andar03.add(consultar).setBounds(100, 100, 100, 100);
		andar03.add(andar01).setBounds(100, 100, 100, 100);
		andar03.add(andar02).setBounds(100, 100, 100, 100);
		
	}
	static void consulta() {

		consulta.setTitle("CONSULTA");
		consulta.setSize(1365, 700);
		consulta.setLayout(null);
		consulta.setVisible(true);
		consulta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		consulta.setResizable(false);
		



		consulta.add(inicio).setBounds(100, 100, 100, 100);
		consulta.add(sair).setBounds(100, 100, 100, 100);
	}

	static void botoes() {

		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				inicial.setVisible(false);
				menu();

			}
		});
		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				menu.setVisible(false);
				consulta();

			}
		});
		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				menu.setVisible(false);
				andar01();

			}
		});
		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				menu.setVisible(false);
				andar02();

			}
		});
		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				menu.setVisible(false);
				andar03();

			}
		});
		andar01.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				andar01(false);
				andar02();

			}
		});
		andar01.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				andar01(false);
				andar03();

			}
		});
		andar02.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				andar02(false);
				andar01();

			}
		});
		andar02.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				andar02(false);
				andar03();

			}
		});
		andar03.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				andar03(false);
				andar01();

			}
		});
		andar03.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				andar03(false);
				andar02();

			}
		});
		voltar1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				menu.setVisible(false);
				inicial();
			}

		});
		voltar2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				consulta.setVisible(false);
				menu();
			}

		});
		voltar3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				andar01.setVisible(false);
				menu();
			}

		});
		voltar4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				andar02.setVisible(false);
				menu();
			}

		});
		voltar5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				andar03.setVisible(false);
				menu();
			}

		});
		sair.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});

}
