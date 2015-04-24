package riskyken.armourersWorkshop.common.skin.type;

import org.lwjgl.opengl.GL11;

import riskyken.armourersWorkshop.api.common.skin.type.ISkinType;
import riskyken.armourersWorkshop.common.skin.Point3D;
import riskyken.armourersWorkshop.common.skin.Rectangle3D;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SkinBowPartArrow extends AbstractSkinPartTypeBase {
    
    public SkinBowPartArrow(ISkinType baseType) {
        super(baseType);
        this.buildingSpace = new Rectangle3D(-4, -4, -14, 8, 8, 28);
        this.guideSpace = new Rectangle3D(0, 0, 0, 1, 1, 1);
        this.offset = new Point3D(25, 0, 0);
    }

    @Override
    public String getPartName() {
        return "arrow";
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void renderBuildingGuide(float scale, boolean showSkinOverlay, boolean showHelper) {
        GL11.glTranslated(0, this.buildingSpace.getY() * scale, 0);
        GL11.glTranslated(0, -this.guideSpace.getY() * scale, 0);
        //partModel.render(scale);
        GL11.glTranslated(0, this.guideSpace.getY() * scale, 0);
        GL11.glTranslated(0, -this.buildingSpace.getY() * scale, 0);
    }
}
