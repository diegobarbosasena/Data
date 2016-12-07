import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws Exception {
		
	
	System.out.println(formataData("03/03/2013"));
	
		
		Data d= new Data();
		
		d.setData1(formataData("03/03/2016"));
		d.setData2(formataData("04/04/2012"));
		d.setData3(formataData("05/05/2014"));
		
		
		if(Data.inserirData(d)){
			System.out.println("INSERIU");
		} 
		else{
			System.out.println("NAO INSERIU");
		}
	}
	
	public static java.sql.Date formataData(String data) throws Exception { 
 		if (data == null || data.equals(""))
 			return null;
         java.sql.Date date = null;
         try {
             DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
             date = new java.sql.Date( ((java.util.Date)formatter.parse(data)).getTime() );
         } catch (Exception e) {            
             e.printStackTrace();
         }
         return date;
 	}

}
