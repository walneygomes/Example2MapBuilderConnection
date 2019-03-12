import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BuilderConexao {

	protected Connection conexao;

	public BuilderConexao() {
		try {
			conexao = DriverManager.getConnection("jdbc:hsqldb:file:sampledb", "SA", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public abstract void  carregarDriver();
	public abstract void abrirConexao();
	public abstract void verificarStatus();
	public abstract void logarAberturaDaconexao();

}
