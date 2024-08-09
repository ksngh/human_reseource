import dto.DeleteDTO;
import dto.UpdateDTO;
import service.HRService;
import service.HRServiceImpl;
import util.DBConnection;
import util.InputOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
		// to see how IntelliJ IDEA suggests fixing it.
		HRService hrService = new HRServiceImpl(
				new DBConnection(),
				new InputOutput()
		);
		hrService.updateHR(new UpdateDTO("EMP_03","2024-08-14","휴가"));
		hrService.deleteHR(new DeleteDTO("EMP_02","2024-08-12"));
	}
}