import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {


	@Test
	public void test_executeCommand() {
		
		PlanetExplorer explorer = new PlanetExplorer(6,6, null);
		int x=0;
		int y=0;
		
		String commandF = "f";
		String commandB = "B";
		String commandL = "l";
		String commandR = "r";
		
		explorer.executeCommand(commandF);
		explorer.executeCommand(commandB);
		
	}
}
