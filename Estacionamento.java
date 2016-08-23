import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Estacionamento {

	static JFrame tela = new JFrame();

	static JPanel andar1 = new JPanel();
	static JPanel andar2 = new JPanel();
	static JPanel andar3 = new JPanel();

	static JPanel vaga1 = new JPanel();
	static JPanel vaga2 = new JPanel();
	static JPanel vaga3 = new JPanel();
	static JPanel vaga4 = new JPanel();
	static JPanel vaga5 = new JPanel();
	static JPanel vaga6 = new JPanel();
	static JPanel vaga7 = new JPanel();
	static JPanel vaga8 = new JPanel();
	static JPanel vaga9 = new JPanel();
	static JPanel vaga10 = new JPanel();
	static JPanel vaga11 = new JPanel();
	static JPanel vaga12 = new JPanel();
	static JPanel vaga13 = new JPanel();
	static JPanel vaga14 = new JPanel();
	static JPanel vaga15 = new JPanel();
	static JPanel vaga16 = new JPanel();
	static JPanel vaga17 = new JPanel();
	static JPanel vaga18 = new JPanel();
	static JPanel vaga19 = new JPanel();
	static JPanel vaga20 = new JPanel();

	static JPanel vaga21 = new JPanel();
	static JPanel vaga22 = new JPanel();
	static JPanel vaga23 = new JPanel();
	static JPanel vaga24 = new JPanel();
	static JPanel vaga25 = new JPanel();
	static JPanel vaga26 = new JPanel();
	static JPanel vaga27 = new JPanel();
	static JPanel vaga28 = new JPanel();
	static JPanel vaga29 = new JPanel();
	static JPanel vaga30 = new JPanel();
	static JPanel vaga31 = new JPanel();
	static JPanel vaga32 = new JPanel();
	static JPanel vaga33 = new JPanel();
	static JPanel vaga34 = new JPanel();
	static JPanel vaga35 = new JPanel();
	static JPanel vaga36 = new JPanel();
	static JPanel vaga37 = new JPanel();
	static JPanel vaga38 = new JPanel();
	static JPanel vaga39 = new JPanel();
	static JPanel vaga40 = new JPanel();

	static JPanel vaga41 = new JPanel();
	static JPanel vaga42 = new JPanel();
	static JPanel vaga43 = new JPanel();
	static JPanel vaga44 = new JPanel();
	static JPanel vaga45 = new JPanel();
	static JPanel vaga46 = new JPanel();
	static JPanel vaga47 = new JPanel();
	static JPanel vaga48 = new JPanel();
	static JPanel vaga49 = new JPanel();
	static JPanel vaga50 = new JPanel();
	static JPanel vaga51 = new JPanel();
	static JPanel vaga52 = new JPanel();
	static JPanel vaga53 = new JPanel();
	static JPanel vaga54 = new JPanel();
	static JPanel vaga55 = new JPanel();
	static JPanel vaga56 = new JPanel();
	static JPanel vaga57 = new JPanel();
	static JPanel vaga58 = new JPanel();
	static JPanel vaga59 = new JPanel();
	static JPanel vaga60 = new JPanel();

	static boolean[] vetor = new boolean[60];
	static int vagaocupada = 0;
	static int vagadisponivel = 60;

	static JLabel fundo = new JLabel(new ImageIcon("fundo//fundo.jpg"));
	static JLabel fundo1 = new JLabel(new ImageIcon("fundo//fundo.jpg"));
	static JLabel fundo2 = new JLabel(new ImageIcon("fundo//fundo.jpg"));

	static JButton entraada = new JButton("ENTRADA");
	static JButton saida = new JButton("SAIDA");

	public static void main(String[] args) {
		Botao();
		vaga();

	}

	static void vaga() {
		tela.setBounds(0, 0, 450, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setVisible(true);

		tela.add(andar1);
		andar1.setBounds(5, 10, 400, 150);
		andar1.setBackground(Color.BLACK);
		tela.add(entraada).setBounds(100, 600, 100, 50);
		tela.add(saida).setBounds(200, 600, 100, 50);

		andar1.setLayout(null);

		andar1.add(vaga1);
		vaga1.setBounds(13, 10, 25, 40);
		andar1.add(vaga2);
		vaga2.setBounds(43, 10, 25, 40);
		andar1.add(vaga3);
		vaga3.setBounds(73, 10, 25, 40);
		andar1.add(vaga4);
		vaga4.setBounds(102, 10, 25, 40);
		andar1.add(vaga5);
		vaga5.setBounds(173, 10, 25, 40);
		andar1.add(vaga6);
		vaga6.setBounds(203, 10, 25, 40);
		andar1.add(vaga7);
		vaga7.setBounds(232, 10, 25, 40);
		andar1.add(vaga8);
		vaga8.setBounds(262, 10, 25, 40);
		andar1.add(vaga9);
		vaga9.setBounds(333, 10, 25, 40);
		andar1.add(vaga10);
		vaga10.setBounds(363, 10, 25, 40);
		andar1.add(vaga11);
		vaga11.setBounds(13, 78, 25, 40);
		andar1.add(vaga12);
		vaga12.setBounds(43, 78, 25, 40);
		andar1.add(vaga13);
		vaga13.setBounds(73, 78, 25, 40);
		andar1.add(vaga14);
		vaga14.setBounds(102, 78, 25, 40);
		andar1.add(vaga15);
		vaga15.setBounds(173, 78, 25, 40);
		andar1.add(vaga16);
		vaga16.setBounds(203, 78, 25, 40);
		andar1.add(vaga17);
		vaga17.setBounds(232, 78, 25, 40);
		andar1.add(vaga18);
		vaga18.setBounds(262, 78, 25, 40);
		andar1.add(vaga19);
		vaga19.setBounds(333, 78, 25, 40);
		andar1.add(vaga20);
		vaga20.setBounds(363, 78, 25, 40);

		tela.add(andar2);
		andar2.setBounds(5, 200, 400, 150);
		andar2.setBackground(Color.BLACK);
		andar2.setLayout(null);

		andar2.add(vaga21);
		vaga21.setBounds(13, 10, 25, 40);
		andar2.add(vaga22);
		vaga22.setBounds(43, 10, 25, 40);
		andar2.add(vaga23);
		vaga23.setBounds(73, 10, 25, 40);
		andar2.add(vaga24);
		vaga24.setBounds(102, 10, 25, 40);
		andar2.add(vaga25);
		vaga25.setBounds(173, 10, 25, 40);
		andar2.add(vaga26);
		vaga26.setBounds(203, 10, 25, 40);
		andar2.add(vaga27);
		vaga27.setBounds(232, 10, 25, 40);
		andar2.add(vaga28);
		vaga28.setBounds(262, 10, 25, 40);
		andar2.add(vaga29);
		vaga29.setBounds(333, 10, 25, 40);
		andar2.add(vaga30);
		vaga30.setBounds(363, 10, 25, 40);
		andar2.add(vaga31);
		vaga31.setBounds(13, 78, 25, 40);
		andar2.add(vaga32);
		vaga32.setBounds(43, 78, 25, 40);
		andar2.add(vaga33);
		vaga33.setBounds(73, 78, 25, 40);
		andar2.add(vaga34);
		vaga34.setBounds(102, 78, 25, 40);
		andar2.add(vaga35);
		vaga35.setBounds(173, 78, 25, 40);
		andar2.add(vaga36);
		vaga36.setBounds(203, 78, 25, 40);
		andar2.add(vaga37);
		vaga37.setBounds(232, 78, 25, 40);
		andar2.add(vaga38);
		vaga38.setBounds(262, 78, 25, 40);
		andar2.add(vaga39);
		vaga39.setBounds(333, 78, 25, 40);
		andar2.add(vaga40);
		vaga40.setBounds(363, 78, 25, 40);

		tela.add(andar3);
		andar3.setBounds(5, 400, 400, 150);
		andar3.setBackground(Color.BLACK);
		andar3.setLayout(null);

		andar3.add(vaga41);
		vaga41.setBounds(13, 10, 25, 40);
		andar3.add(vaga42);
		vaga42.setBounds(43, 10, 25, 40);
		andar3.add(vaga43);
		vaga43.setBounds(73, 10, 25, 40);
		andar3.add(vaga44);
		vaga44.setBounds(102, 10, 25, 40);
		andar3.add(vaga45);
		vaga45.setBounds(173, 10, 25, 40);
		andar3.add(vaga46);
		vaga46.setBounds(203, 10, 25, 40);
		andar3.add(vaga47);
		vaga47.setBounds(232, 10, 25, 40);
		andar3.add(vaga48);
		vaga48.setBounds(262, 10, 25, 40);
		andar3.add(vaga49);
		vaga49.setBounds(333, 10, 25, 40);
		andar3.add(vaga50);
		vaga50.setBounds(363, 10, 25, 40);
		andar3.add(vaga51);
		vaga51.setBounds(13, 78, 25, 40);
		andar3.add(vaga52);
		vaga52.setBounds(43, 78, 25, 40);
		andar3.add(vaga53);
		vaga53.setBounds(73, 78, 25, 40);
		andar3.add(vaga54);
		vaga54.setBounds(102, 78, 25, 40);
		andar3.add(vaga55);
		vaga55.setBounds(173, 78, 25, 40);
		andar3.add(vaga56);
		vaga56.setBounds(203, 78, 25, 40);
		andar3.add(vaga57);
		vaga57.setBounds(232, 78, 25, 40);
		andar3.add(vaga58);
		vaga58.setBounds(262, 78, 25, 40);
		andar3.add(vaga59);
		vaga59.setBounds(333, 78, 25, 40);
		andar3.add(vaga60);
		vaga60.setBounds(363, 78, 25, 40);

		andar1.add(fundo);
		fundo.setBounds(0, 0, 400, 150);
		andar2.add(fundo1);
		fundo1.setBounds(0, 0, 400, 150);
		andar3.add(fundo2);
		fundo2.setBounds(0, 0, 400, 150);

	}

	static void dados() {

		vetor[0] = false;
		vetor[1] = false;
		vetor[2] = false;
		vetor[3] = false;
		vetor[4] = false;
		vetor[5] = false;
		vetor[6] = false;
		vetor[7] = false;
		vetor[8] = false;
		vetor[9] = false;
		vetor[10] = false;
		vetor[11] = false;
		vetor[12] = false;
		vetor[13] = false;
		vetor[14] = false;
		vetor[15] = false;
		vetor[16] = false;
		vetor[17] = false;
		vetor[18] = false;
		vetor[19] = false;
		vetor[20] = false;
		vetor[21] = false;
		vetor[22] = false;
		vetor[23] = false;
		vetor[24] = false;
		vetor[25] = false;
		vetor[26] = false;
		vetor[27] = false;
		vetor[28] = false;
		vetor[29] = false;
		vetor[30] = false;
		vetor[31] = false;
		vetor[32] = false;
		vetor[33] = false;
		vetor[34] = false;
		vetor[35] = false;
		vetor[36] = false;
		vetor[37] = false;
		vetor[38] = false;
		vetor[39] = false;
		vetor[40] = false;
		vetor[41] = false;
		vetor[42] = false;
		vetor[43] = false;
		vetor[44] = false;
		vetor[45] = false;
		vetor[46] = false;
		vetor[47] = false;
		vetor[48] = false;
		vetor[49] = false;
		vetor[50] = false;
		vetor[51] = false;
		vetor[52] = false;
		vetor[53] = false;
		vetor[54] = false;
		vetor[55] = false;
		vetor[56] = false;
		vetor[57] = false;
		vetor[58] = false;
		vetor[59] = false;

		mostrarvaga();
	}

	static void mostrarvaga() {

		if (vetor[0] == true) {
			vaga1.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga1.setBackground(Color.green);
		}
		if (vetor[1] == true) {
			vaga2.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga2.setBackground(Color.green);
		}
		if (vetor[2] == true) {
			vaga3.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga3.setBackground(Color.green);
		}
		if (vetor[3] == true) {
			vaga4.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga4.setBackground(Color.green);
		}
		if (vetor[4] == true) {
			vaga5.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga5.setBackground(Color.green);
		}
		if (vetor[5] == true) {
			vaga6.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga6.setBackground(Color.green);
		}
		if (vetor[6] == true) {
			vaga7.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga7.setBackground(Color.green);
		}
		if (vetor[7] == true) {
			vaga8.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga8.setBackground(Color.green);
		}
		if (vetor[8] == true) {
			vaga9.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga9.setBackground(Color.green);
		}
		if (vetor[9] == true) {
			vaga10.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga10.setBackground(Color.green);
		}
		if (vetor[10] == true) {
			vaga11.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga11.setBackground(Color.green);
		}
		if (vetor[11] == true) {
			vaga12.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga12.setBackground(Color.green);
		}
		if (vetor[12] == true) {
			vaga13.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga13.setBackground(Color.green);
		}
		if (vetor[13] == true) {
			vaga14.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga14.setBackground(Color.green);
		}
		if (vetor[14] == true) {
			vaga15.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga15.setBackground(Color.green);
		}
		if (vetor[15] == true) {
			vaga16.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga16.setBackground(Color.green);
		}
		if (vetor[16] == true) {
			vaga17.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga17.setBackground(Color.green);
		}
		if (vetor[17] == true) {
			vaga18.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga18.setBackground(Color.green);
		}
		if (vetor[18] == true) {
			vaga19.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga19.setBackground(Color.green);
		}
		if (vetor[19] == true) {
			vaga20.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga20.setBackground(Color.green);
		}
		if (vetor[20] == true) {
			vaga21.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga21.setBackground(Color.green);
		}
		if (vetor[21] == true) {
			vaga22.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga22.setBackground(Color.green);
		}
		if (vetor[22] == true) {
			vaga23.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga23.setBackground(Color.green);
		}
		if (vetor[23] == true) {
			vaga24.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga24.setBackground(Color.green);
		}
		if (vetor[24] == true) {
			vaga25.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga25.setBackground(Color.green);
		}
		if (vetor[25] == true) {
			vaga26.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga26.setBackground(Color.green);
		}
		if (vetor[26] == true) {
			vaga27.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga27.setBackground(Color.green);
		}
		if (vetor[27] == true) {
			vaga28.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga28.setBackground(Color.green);
		}
		if (vetor[28] == true) {
			vaga29.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga29.setBackground(Color.green);
		}
		if (vetor[29] == true) {
			vaga30.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga30.setBackground(Color.green);
		}
		if (vetor[30] == true) {
			vaga31.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga31.setBackground(Color.green);
		}
		if (vetor[31] == true) {
			vaga32.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga32.setBackground(Color.green);
		}
		if (vetor[32] == true) {
			vaga33.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga33.setBackground(Color.green);
		}
		if (vetor[33] == true) {
			vaga34.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga34.setBackground(Color.green);
		}
		if (vetor[34] == true) {
			vaga35.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga35.setBackground(Color.green);
		}
		if (vetor[35] == true) {
			vaga36.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga36.setBackground(Color.green);
		}
		if (vetor[36] == true) {
			vaga37.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga37.setBackground(Color.green);
		}
		if (vetor[37] == true) {
			vaga38.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga38.setBackground(Color.green);
		}
		if (vetor[38] == true) {
			vaga39.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga39.setBackground(Color.green);
		}
		if (vetor[39] == true) {
			vaga40.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga40.setBackground(Color.green);
		}
		if (vetor[40] == true) {
			vaga41.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga41.setBackground(Color.green);
		}
		if (vetor[41] == true) {
			vaga42.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga42.setBackground(Color.green);
		}
		if (vetor[42] == true) {
			vaga43.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga43.setBackground(Color.green);
		}
		if (vetor[43] == true) {
			vaga44.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga44.setBackground(Color.green);
		}
		if (vetor[44] == true) {
			vaga45.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga45.setBackground(Color.green);
		}
		if (vetor[45] == true) {
			vaga46.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga46.setBackground(Color.green);
		}
		if (vetor[46] == true) {
			vaga47.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga47.setBackground(Color.green);
		}
		if (vetor[47] == true) {
			vaga48.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga48.setBackground(Color.green);
		}
		if (vetor[48] == true) {
			vaga49.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga49.setBackground(Color.green);
		}
		if (vetor[49] == true) {
			vaga50.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga50.setBackground(Color.green);
		}
		if (vetor[50] == true) {
			vaga51.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga51.setBackground(Color.green);
		}
		if (vetor[51] == true) {
			vaga52.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga52.setBackground(Color.green);
		}
		if (vetor[52] == true) {
			vaga53.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga53.setBackground(Color.green);
		}
		if (vetor[53] == true) {
			vaga54.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga54.setBackground(Color.green);
		}
		if (vetor[54] == true) {
			vaga55.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga55.setBackground(Color.green);
		}
		if (vetor[55] == true) {
			vaga56.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga56.setBackground(Color.green);
		}
		if (vetor[56] == true) {
			vaga57.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga57.setBackground(Color.green);
		}
		if (vetor[57] == true) {
			vaga58.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga58.setBackground(Color.green);
		}
		if (vetor[58] == true) {
			vaga59.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga59.setBackground(Color.green);
		}
		if (vetor[59] == true) {
			vaga60.setBackground(Color.red);
			vagaocupada++;
		} else {
			vaga60.setBackground(Color.green);
		}

	}

	static void randomentrada() {
		int r = (int) (Math.random() * 60);

		if (vetor[r] == false) {
			vetor[r] = true;
			if (vagadisponivel > 0) {
				vagadisponivel--;
				vagaocupada++;
			}

		} else if (vetor[r] == true && vagadisponivel > 0) {
			randomentrada();
		} else {
			JOptionPane.showMessageDialog(null, "Todas as vagas estão ocupadas. ");
		}

	}

	static void randomsaida() {
		int r = (int) (Math.random() * 60);

		if (vetor[r] == true) {
			vetor[r] = false;
			if (vagaocupada > 0) {
				vagaocupada--;
				vagadisponivel++;
			}
		} else if (vetor[r] == false && vagaocupada > 0) {
			randomsaida();
		} else {
			JOptionPane.showMessageDialog(null, "Todas as vagas estão livres. ");
		}

	}

	static void Botao() {

		entraada.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent vetor) {

				randomentrada();
				mostrarvaga();

			}
		});

		saida.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent vetor) {

				randomsaida();
				mostrarvaga();

			}
		});
	}

}
