
public class DirectorioBuilderConnection {
	
	
	protected BuilderConexao con;
	public DirectorioBuilderConnection(BuilderConexao connection){
		this.con=connection;
		
	}
	public void criarConexao(){
		con.abrirConexao();
	    con.carregarDriver();
	    con.logarAberturaDaconexao();
	    con.verificarStatus();
	   
	}
	public BuilderConexao getSuaConection(){
		return con;
	}
	
	

}
