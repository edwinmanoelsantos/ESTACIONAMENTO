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
	
	static JMenuItem faturamento = new JMenuItem("FATURAMENTO");
	static JMenuItem vagalivre = new JMenuItem("VAGAS LIVRES");
	static JMenuItem vagaocupadas = new JMenuItem("VAGAS OCUPADAS");
	static JMenuItem vagacarro = new JMenuItem("VAGAS DE CARROS");
	static JMenuItem vagamoto = new JMenuItem("VAGAS DE MOTOS");
	static JMenuItem vagaprioritrio = new JMenuItem("VAGAS PRIORITARIAS");
	static JMenuItem excluir = new JMenuItem("EXCLUIR");
	static JMenuItem voltar = new JMenuItem("VOLTAR");
	static JMenuItem sair = new JMenuItem("SAIR");

public static void main(String[] args) {
		Tela_Inicial();
		botoes();

	}

	static void telainicial() {

		telainicial.setTitle("TELA INICIAL");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);

	telainicial.add(inicio).setBounds(, , , );
	telainicial.add(sair).setBounds(, , , );
	}
static void telamenu() {

		telainicial.setTitle("MENU");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);

	telamenu.add(vaga).setBounds(, , , );
	telamenu.add(consultavaga).setBounds(, , , );
	telamenu.add(cliente).setBounds(, , , );
	telamenu.add(operador).setBounds(, , , );
	telamenu.add(reserva).setBounds(, , , );
	telamenu.add(vagaslivres).setBounds(, , , );
	telamenu.add(vagasocupadas).setBounds(, , , );
	telamenu.add(vagascarro).setBounds(, , , );
	telamenu.add(vagasmoto).setBounds(, , , );
	telamenu.add(vagasprioritarias).setBounds(, , , );
	telamenu.add().setBounds(, , , );
	telamenu.add().setBounds(, , , );
	}

static void telaentrada() {

		telainicial.setTitle("ENTRADA");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telasaida() {

		telainicial.setTitle("SAIDA");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telaestacionamento1() {

		telainicial.setTitle("1°ANDAR DO ESTACIONAMENTO");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telaestacionamento2() {

		telainicial.setTitle("2°ANDAR DO ESTACIONAMENTO");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telaestacionamento3() {

		telainicial.setTitle("3°ANDAR DO ESTACIONAMENTO");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telafuncionario() {

		telainicial.setTitle("FUNCIONARIO");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telavagas() {

		telainicial.setTitle("VAGAS");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telacarro() {

		telainicial.setTitle("VAGAS DE CARROS NORMAIS");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telamoto() {

		telainicial.setTitle("VAGAS DE MOTOS");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telaprioritario() {

		telainicial.setTitle("VAGAS PRIORITARIAS");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telaconsultavaga() {

		telainicial.setTitle("CONSULTA VAGA");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telafaturamnento() {

		telainicial.setTitle("FATURAMENTO");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telareserva() {

		telainicial.setTitle("RESERVA");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}
static void telacliente() {

		telainicial.setTitle("CLIENTE");
		telainicial.setSize(1365, 700);
		telainicial.setLayout(null);
		telainicial.setVisible(true);
		telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telainicial.setResizable(false);
		telainicial.add(cadastrar).setBounds(300, 300, 300, 100);
		telainicial.add(sair1).setBounds(700, 300, 300, 100);
	}

static void botoes() {

		cadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				telainicial.setVisible(false);

			}
		});
