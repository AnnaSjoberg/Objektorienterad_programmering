package InUppg.uppg3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class MouseClickListener extends MouseAdapter {
    protected List<String> currentOrder;
    public MouseClickListener(List<String> currentOrder){
        this.currentOrder=currentOrder;
    }
    @Override
    public void mouseClicked(MouseEvent e) {


    }
}
