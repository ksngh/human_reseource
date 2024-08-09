import java.io.IOException;

import service.HRService;
import service.HRServiceImpl;
import util.DBConnection;
import util.InputOutput;


public class Main {
	public static void main(String[] args) throws IOException {
		 DBConnection dbConnection = new DBConnection();
		 InputOutput inputOutput = new InputOutput();

		 HRServiceImpl hrService = new HRServiceImpl(inputOutput, dbConnection);
		 hrService.run();
	}
}