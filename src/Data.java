import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import br.com.ajudantes.MySqlConexao;

public class Data {

	private Date data1;
	private Date data2;
	private Date data3;
	
	
	public Date getData1() {
		return data1;
	}
	public void setData1(Date data1) {
		this.data1 = data1;
	}
	public Date getData2() {
		return data2;
	}
	public void setData2(Date data2) {
		this.data2 = data2;
	}
	public Date getData3() {
		return data3;
	}
	public void setData3(Date data3) {
		this.data3 = data3;
	}
	
	
	public static boolean inserirData(Data data){
		
		Connection c = MySqlConexao.ConectarDb();
		
		String sqlInsertCliente = "INSERT INTO data "
				+ "(data_um, data_dois, data_tres) "
				+ "VALUES (?, ?, ?); ";
		
		try {
			PreparedStatement parametros = c.prepareStatement(sqlInsertCliente);
			
			parametros.setDate(1, data.getData1());
			parametros.setDate(2, data.getData2());
			parametros.setDate(3, data.getData3());
			
			parametros.executeUpdate();
			
			c.close();
			
			return true;
			
		} catch (Exception e) {
			
			return false;
		}
	}
	
}
