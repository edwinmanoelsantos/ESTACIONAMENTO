import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	

	static JFrame telainicial = new JFrame();
	static JFrame telamenu = new JFrame();
	static JFrame telaentrada = new JFrame();
	static JFrame telasaida = new JFrame();
	static JFrame telaestacionamento1 = new JFrame();
	static JFrame telaestacionamento2 = new JFrame();
	static JFrame telaestacionamento3 = new JFrame();
	static JFrame telafuncionario = new JFrame();
	static JFrame telavagas = new JFrame();
	static JFrame telavagalivre = new JFrame();
	static JFrame telavagaocupada = new JFrame();
	static JFrame telacarro = new JFrame();
	static JFrame telamoto = new JFrame();
	static JFrame telaprioritaria = new JFrame();
	static JFrame telaconsultavaga = new JFrame();
	static JFrame telafaturamento = new JFrame();
	static JFrame telareserva = new JFrame();
	static JFrame telacliente = new JFrame();

	static JButton inicio = new JButton("INICIO");
	static JButton sair = new JButton("SAIR");
	static JButton vaga = new JButton("VAGA");
	static JButton consultavaga = new JButton("CONSULTA");
	static JButton cliente = new JButton("CLIENTE");
	static JButton operador = new JButton("OPERADOR");
	static JButton reserva = new JButton("RESERVA");
	static JButton vagaslivres = new JButton("VAGAS LIVRES");
	static JButton vagasolcupadas = new JButton("VAGAS OCUPADAS");
	static JButton vagascarro = new JButtron("VAGAS CARRO");
	static JButton vaganmoto = new JButton("VAGAS MOTO");
	static JButton vagasprioritarias = new JButton("VAGAS PRIORITARIAS");
	static JButton faturamento = new JButton("FATURAMENTO");
	static JButton entradaveiculo = new JButton("ENTRADA VEICULO");
	static JButton saidaveiculo = new JButton("SAIDA VEICULO");

	static JButton voltar = new JButton("VOLTAR");
	static JButton voltar0 = new JButton("VOLTAR");
	static JButton voltar1 = new JButton("VOLTAR");
	static JButton voltar2 = new JButton("VOLTAR");
	static JButton voltar3 = new JButton("VOLTAR");
	static JButton voltar4 = new JButton("VOLTAR");
	static JButton voltar5 = new JButton("VOLTAR");
	static JButton voltar6 = new JButton("VOLTAR");
	static JButton voltar7 = new JButton("VOLTAR");
	static JButton voltar8 = new JButton("VOLTAR");
	static JButton voltar9 = new JButton("VOLTAR");
	static JButton voltar10 = new JButton("VOLTAR");
	static JButton voltar11 = new JButton("VOLTAR");

//vagas para o 1°andar:
	static JButton 001 = new JButton("001");
	static JButton 002 = new JButton("002");
	static JButton 003 = new JButton("003");
	static JButton 004 = new JButton("004");
	static JButton 005 = new JButton("005");
	static JButton 006 = new JButton("006");
	static JButton 007 = new JButton("007");
	static JButton 008 = new JButton("008");
	static JButton 009 = new JButton("009");
	static JButton 010 = new JButton("010");
	static JButton 011 = new JButton("011");
	static JButton 012 = new JButton("012");
	static JButton 013 = new JButton("013");
	static JButton 014 = new JButton("014");
	static JButton 015 = new JButton("015");
	static JButton 016 = new JButton("016");
	static JButton 017 = new JButton("017");
	static JButton 018 = new JButton("018");
	static JButton 019 = new JButton("019");
	static JButton 020 = new JButton("020");
//vagas para o 2°andar:
	static JButton 021 = new JButton("021");
	static JButton 022 = new JButton("022");
	static JButton 023 = new JButton("023");
	static JButton 024 = new JButton("024");
	static JButton 025 = new JButton("025");
	static JButton 026 = new JButton("026");
	static JButton 027 = new JButton("027");
	static JButton 028 = new JButton("028");
	static JButton 029 = new JButton("029");
	static JButton 030 = new JButton("030");
	static JButton 031 = new JButton("031");
	static JButton 032 = new JButton("032");
	static JButton 033 = new JButton("033");
	static JButton 034 = new JButton("034");
	static JButton 035 = new JButton("035");
	static JButton 036 = new JButton("036");
	static JButton 037 = new JButton("037");
	static JButton 038 = new JButton("038");
	static JButton 039 = new JButton("039");
	static JButton 040 = new JButton("040");
//vagas para o 3°andar:
	static JButton 041 = new JButton("041");
	static JButton 042 = new JButton("042");
	static JButton 043 = new JButton("043");
	static JButton 044 = new JButton("044");
	static JButton 045 = new JButton("045");
	static JButton 046 = new JButton("046");
	static JButton 047 = new JButton("047");
	static JButton 048 = new JButton("048");
	static JButton 049 = new JButton("049");
	static JButton 050 = new JButton("050");
	static JButton 051 = new JButton("051");
	static JButton 052 = new JButton("052");
	static JButton 053 = new JButton("053");
	static JButton 054 = new JButton("054");
	static JButton 055 = new JButton("055");
	static JButton 056 = new JButton("056");
	static JButton 057 = new JButton("057");
	static JButton 058 = new JButton("058");
	static JButton 059 = new JButton("059");
	static JButton 060 = new JButton("060");

	static JTable tabela1;

	static JScrollPane rolagem1 = new JScrollPane(tabela1);

	static int n1 = 0;
	static int id_consulta1 = 0;
	

	static String[][] introduzir1 = new String[100][6];
	static String[] tabela12 = new String[] { "PLACA", "VAGA", "HORA ENTRADA", "HORA SAIDA", "TOTAL DE HORAS", "VALOR A PAGAR"};
	

	static DefaultTableModel tabela13 = new DefaultTableModel(tabela12, 0);

	static JMenuBar menu1 = new JMenuBar();
	static JMenu menu12 = new JMenu("MENU");
	
	static JMenuItem faturamento1 = new JMenuItem("FATURAMENTO");
	static JMenuItem vagalivre = new JMenuItem("VAGAS LIVRES");
	static JMenuItem vagaocupadas = new JMenuItem("VAGAS OCUPADAS");
	static JMenuItem vagacarro = new JMenuItem("VAGAS DE CARROS");
	static JMenuItem vagamoto = new JMenuItem("VAGAS DE MOTOS");
	static JMenuItem vagaprioritrio = new JMenuItem("VAGAS PRIORITARIAS");
	static JMenuItem excluir = new JMenuItem("EXCLUIR");
	static JMenuItem voltar12 = new JMenuItem("VOLTAR");
	static JMenuItem sair1 = new JMenuItem("SAIR");

public static void main(String[] args) {
		telainicial();
		botoes();

	}

	private static void botoes() {
	// TODO Auto-generated method stub
	
}

	static void telainicial() {

		telainicial.setTitle("TELA INICIAL");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);


	telainicial.add(inicio).setBounds(100, 100, 100, 100);
	telainicial.add(sair).setBounds(100, 100, 100, 100);
	}
static void telamenu() {

		telamenu.setTitle("MENU");
		telamenu.setSize(1365, 700);
		telamenu.setLayout(null);
		telamenu.setVisible(true);
		telamenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telamenu.setResizable(false);
		

	telamenu.add(vaga).setBounds(100, 100, 100, 100);
	telamenu.add(consultavaga).setBounds(100, 100, 100, 100);
	telamenu.add(cliente).setBounds(100, 100, 100, 100);
	telamenu.add(operador).setBounds(100, 100, 100, 100);
	telamenu.add(reserva).setBounds(100, 100, 100, 100);
	telamenu.add(vagaslivres).setBounds(100, 100, 100, 100);
	telamenu.add(vagasocupadas).setBounds(100, 100, 100, 100);
	telamenu.add(vagascarro).setBounds(100, 100, 100, 100);
	telamenu.add(vagasmoto).setBounds(100, 100, 100, 100);
	telamenu.add(vagasprioritarias).setBounds(100, 100, 100, 100);
	telamenu.add().setBounds(100, 100, 100, 100);
	telamenu.add().setBounds(100, 100, 100, 100);
	}

static void telaentrada() {

		telaentrada.setTitle("ENTRADA");
		telaentrada.setSize(1365, 700);
		telaentrada.setLayout(null);
		telaentrada.setVisible(true);
		telaentrada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaentrada.setResizable(false);
	
	}
static void telasaida() {

		telasaida.setTitle("SAIDA");
		telasaida.setSize(1365, 700);
		telasaida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telasaida.setResizable(false);
		
	}
static void telaestacionamento1() {

		telaestacionamento1.setTitle("1°ANDAR DO ESTACIONAMENTO");
		telaestacionamento1.setSize(1365, 700);
		telaestacionamento1.setVisible(true);
		telaestacionamento1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaestacionamento1.setResizable(false);
	
	}
static void telaestacionamento2() {

		telaestacionamento2.setTitle("2°ANDAR DO ESTACIONAMENTO");
		telaestacionamento2.setSize(1365, 700);
		telaestacionamento2.setVisible(true);
		telaestacionamento2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaestacionamento2.setResizable(false);
		
	}
static void telaestacionamento3() {

		telaestacionamento3.setTitle("3°ANDAR DO ESTACIONAMENTO");
		telaestacionamento3.setSize(1365, 700);
		telaestacionamento3.setVisible(true);
		telaestacionamento3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaestacionamento3.setResizable(false);
		
	}
static void telafuncionario() {

		telafuncionario.setTitle("FUNCIONARIO");
		telafuncionario.setSize(1365, 700);
		telafuncionario.setVisible(true);
		telafuncionario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telafuncionario.setResizable(false);
	
	}
static void telavagas() {

		telavagas.setTitle("VAGAS");
		telavagas.setSize(1365, 700);
		telavagas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telavagas.setResizable(false);
		
	}
static void telacarro() {

		telacarro.setTitle("VAGAS DE CARROS NORMAIS");
		telacarro.setSize(1365, 700);
		telacarro.setVisible(true);
		telacarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telacarro.setResizable(false);
		
	}
static void telamoto() {

		telamoto.setTitle("VAGAS DE MOTOS");
		telamoto.setSize(1365, 700);
		telamoto.setVisible(true);
		telamoto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telamoto.setResizable(false);
		
	}
static void telaprioritario() {

		Frame telaprioritario;
		telaprioritario.setTitle("VAGAS PRIORITARIAS");
		telaprioritario.setSize(1365, 700);
		telaprioritario.setVisible(true);
		((JFrame) telaprioritario).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaprioritario.setResizable(false);
		
	}
static void telaconsultavaga() {

		telaconsultavaga.setTitle("CONSULTA VAGA");
		telaconsultavaga.setSize(1365, 700);
		telaconsultavaga.setVisible(true);
		telaconsultavaga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaconsultavaga.setResizable(false);
		
	}
static void telafaturamnento() {

		Frame telafaturamnento;
		telafaturamnento.setTitle("FATURAMENTO");
		telafaturamnento.setSize(1365, 700);
		telafaturamnento.setVisible(true);
		((JFrame) telafaturamnento).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telafaturamnento.setResizable(false);
		
	}
static void telareserva() {

		telareserva.setTitle("RESERVA");
		telareserva.setSize(1365, 700);
		telareserva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telareserva.setResizable(false);
		
	}
static void telacliente() {

		telacliente.setTitle("CLIENTE");
		telacliente.setSize(1365, 700);
		telacliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telacliente.setResizable(false);
		
	}


}
