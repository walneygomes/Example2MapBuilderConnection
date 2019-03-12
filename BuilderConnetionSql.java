import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuilderConnetionSql extends BuilderConexao {

	@Override
	public void carregarDriver() {
		try {
			Class.forName("com.br.driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void abrirConexao() {
		try {
			if (!(conexao.isClosed())) {
				try {
					conexao = DriverManager.getConnection("abrir");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void verificarStatus() {
		try {
			if (!conexao.isClosed()) {
				System.out.print("ATIVA");
			} else {
				System.out.print("DESATIVADA");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void logarAberturaDaconexao() {
		Logger.getGlobal().log(Level.ALL, "SUA CONEXÃO TA ATIVA. APROVEITE");
	}

}
