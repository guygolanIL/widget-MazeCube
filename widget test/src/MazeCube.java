
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

public class MazeCube extends MazeDisplayer {

	protected int xAxis;
	protected int yAxis;
	protected int zAxis;
	protected int visualAngle;
	protected int[] canvasCenter;
	protected int[] upperShapeVertices;
	protected int[] lowerShapeVertices;
	
	public MazeCube(Composite parent, int style) {
		super(parent, style);
		visualAngle = 120 ; //default
		xAxis = 10;//default
		yAxis = 10;//default
		zAxis = 10;//default
		canvasCenter = new int[2];
		upperShapeVertices = new int[8];
		lowerShapeVertices = new int[8];
		
		setBackground(new Color(null, 255, 255, 255));

		
		addPaintListener(new PaintListener() {
			
			@Override
			public void paintControl(PaintEvent event) {
				System.out.println("MazeCube paintControl");
//				xAxis = mazeData.getxAxis();	get from real maze3d
//				yAxis = mazeData.getyAxis();
//				zAxis = mazeData.getzAxis();
				
				xAxis = 10;	
				yAxis = 10;
				zAxis = 10;
				
				double[] pointA = new double[2];
				double[] pointB = new double[2];
				double[] pointC = new double[2];
				double[] pointD = new double[2];
				double[] pointE = new double[2];
				double[] pointF = new double[2];
				double[] pointG = new double[2];
				double[] pointH = new double[2];
				
				pointA[0] = canvasCenter[0];
				pointA[1] = canvasCenter[1];
				pointB[0] = canvasCenter[0] + zAxis*Math.cos(30);
				pointB[1] = canvasCenter[1] - zAxis*Math.sin(30);
				pointC[0] = canvasCenter[0];
				pointC[1] = canvasCenter[1];//-/////////////
				pointD[0] = canvasCenter[0] - yAxis*Math.cos(30);
				pointD[1] = canvasCenter[1] - yAxis*Math.sin(30);
				pointG[0] = pointA[0];
				pointG[1] = pointA[1];
				pointE[0] = canvasCenter[0];
				pointE[1] = canvasCenter[1];//+/////////////
				pointF[0] = canvasCenter[0] + zAxis*Math.cos(30);
				pointF[1] = pointB[1] = canvasCenter[1] + zAxis*Math.sin(30);
				pointH[0] =	canvasCenter[0] - yAxis*Math.cos(30);
				pointH[1] = canvasCenter[1] + yAxis*Math.sin(30);
				
				
				//Image image = new Image(getDisplay(),"resources/locationIcon.png");
//				int imageWidth = image.getBounds().width;
//				int imageHeight = image.getBounds().height;
//				int width = (int) Math.round(getSize().x*0.1);
//				int height = (int) Math.round(getSize().y*0.2);
				//e.gc.drawImage(image,0,0,imageWidth,imageHeight,(int)Math.round(getSize().x*0.5),(int)Math.round(getSize().y*0.5),width,height);
				
			}
		});
	}
}
