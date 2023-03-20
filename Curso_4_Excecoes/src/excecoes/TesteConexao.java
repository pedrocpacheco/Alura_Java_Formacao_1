package excecoes;

public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException e) {
			System.out.println("Erro");
		}
		
		
		/*Conexao con = new Conexao();
		try {
			con.leDados();
		} catch(IllegalStateException e) {
			System.out.println("Erro na Conexão");
			e.printStackTrace();
		}
		finally {
			if(con != null) {
			con.fecha();
			}
		}
		*/
	}
	
}
