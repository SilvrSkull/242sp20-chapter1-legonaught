/**
 * This class draws a picture of a vase, on the vase is an etching
 * of the Triforce and an etching of the Hero of Time.
 * 
 * @author  Benjamin E. Kiley
 * @version 2020.09.14
 */
public class Picture
{
    private Circle vHandle;
    private Circle vInHandle;
    private Circle vBase;
    private Square vNeck;
    private Circle vTop;
    private Triangle vSpout;
    private Triangle triforce;
    private Triangle inForce;
    private Person link;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        vHandle = new Circle();
        vInHandle = new Circle();
        vBase = new Circle();
        vNeck = new Square();
        vTop = new Circle();
        vSpout = new Triangle();
        triforce = new Triangle();
        inForce = new Triangle();
        link = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            vHandle.changeColor("blue");
            vHandle.changeSize(80);
            vHandle.moveHorizontal(18);
            vHandle.moveVertical(82);
            vHandle.makeVisible();
            
            vInHandle.changeColor("black");
            vInHandle.changeSize(70);
            vInHandle.moveHorizontal(20);
            vInHandle.moveVertical(90);
            vInHandle.makeVisible();
            
            vBase.changeColor("blue");
            vBase.changeSize(100);
            vBase.moveHorizontal(-20);
            vBase.moveVertical(120);
            vBase.makeVisible();
            
            vNeck.changeColor("blue");
            vNeck.changeSize(40);
            vNeck.moveHorizontal(-70);
            vNeck.moveVertical(58);
            vNeck.makeVisible();
            
            vTop.changeColor("blue");
            vTop.changeSize(42);
            vTop.moveHorizontal(8);
            vTop.moveVertical(60);
            vTop.makeVisible();
            
            vSpout.changeColor("blue");
            vSpout.changeSize(-25, 30);
            vSpout.moveHorizontal(30);
            vSpout.moveVertical(50);
            vSpout.makeVisible();
            
            triforce.changeColor("yellow");
            triforce.changeSize(50, 60);
            triforce.moveHorizontal(50);
            triforce.moveVertical(85);
            triforce.makeVisible();
            
            inForce.changeColor("blue");
            inForce.changeSize(-25, 28);
            inForce.moveHorizontal(50);
            inForce.moveVertical(135);
            inForce.makeVisible();
            
            link.changeColor("green");
            link.changeSize(30, 18);
            link.moveHorizontal(-19);
            link.moveVertical(0);
            link.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        vHandle.changeColor("white");
        vInHandle.changeColor("black");
        vBase.changeColor("white");
        vNeck.changeColor("white");
        vTop.changeColor("white");
        vSpout.changeColor("white");
        triforce.changeColor("black");
        inForce.changeColor("white");
        link.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        vHandle.changeColor("blue");
        vInHandle.changeColor("black");
        vBase.changeColor("blue");
        vNeck.changeColor("blue");
        vTop.changeColor("blue");
        vSpout.changeColor("blue");
        triforce.changeColor("yellow");
        inForce.changeColor("blue");
        link.changeColor("green");
    }
}
