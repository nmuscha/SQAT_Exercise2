
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 2520627
// Finish time: 14.28

public class PlanetExplorer {
	
	private String obstacles;
	public int x;
	public int y;
	
	public PlanetExplorer(int x, int y, String obstacles){
		this.obstacles = obstacles ;
		this.x= x;
		this.y= y;
	}
	public String getObstacle(){
		return obstacles;
	}
	public void setObstacle(String obstacles){
		this.obstacles = obstacles;
	}
	public int getX(){
		return x;
	}
	public void setX (int x){
		this.x=x;
	}
	public int getY(){
		return y;
	}
	public void setY (int y){
		this.y=y;
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		return null;
	}
}

/*	x and y represent the size of the grid.
 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
 *  
	Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
	PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
	 
 */