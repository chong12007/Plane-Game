package plane.plane_game;




import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlaneObj extends GameObj {
    @Override
    public Image getImg() {
        return super.getImg();
    }

    public PlaneObj() {
        super();
    }

    public PlaneObj(Image img, int x, int y, int width, int height, double speed, Plane_game frame) {
        super(img, x, y, width, height, speed, frame);
        this.frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                PlaneObj.super.x = e.getX() - 11;
                PlaneObj.super.y = e.getY() - 16;
            }
        });
    }

    @Override
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        //我方飞机与敌方boss的碰撞检测
        if (this.frame.bossObj != null && this.getRec().intersects(this.frame.bossObj.getRec())){
            Plane_game .state = 3;
        }
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
