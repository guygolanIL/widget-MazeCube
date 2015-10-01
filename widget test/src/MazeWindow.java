

import java.util.ArrayList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import algorithms.mazeGenerators.Maze3d;
import algorithms.mazeGenerators.Position;

public class MazeWindow extends BasicWindow{
	protected Maze3d maze;
	protected Position charPosition;
	
	
	

	public MazeWindow( String title, int width, int height) {
		super(title, width, height);
		
	}



	@Override
	void initWidgets() {
		shell.setLayout(new GridLayout(1, true));
		
		// cube widget
		MazeCube mazeCube = new MazeCube(shell, SWT.BORDER);
		mazeCube.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		
		
		
		
		
	}
	
	protected void exitRequest() {
		shell.dispose();

	}
	
	
	
	public void setPositionData(Position charPosition) {
		this.charPosition = charPosition;
		
		
	}
	
	public void setMazeData(Maze3d maze){
		this.maze = maze;
		
	
	}
	
	public void displayError(String string) {
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				MessageBox errorBox =  new MessageBox(shell, SWT.ICON_ERROR); 
				errorBox.setMessage(string);
				errorBox.setText("Error");
				errorBox.open();				
			}
		});
	}
	public void display(String string) {
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
		    public void run() {
		    	MessageBox messageBox =  new MessageBox(shell, SWT.ICON_INFORMATION); 
		    	messageBox.setMessage(string);
		    	messageBox.setText("hi");
		    	messageBox.open();		
		    	
		    }
		});
	}
	
	
}
