package riskyken.armourersWorkshop.common.skin.type;

import java.awt.Point;

import org.lwjgl.opengl.GL11;

import riskyken.armourersWorkshop.api.common.IPoint3D;
import riskyken.armourersWorkshop.api.common.skin.type.ISkinPartTypeTextured;
import riskyken.armourersWorkshop.api.common.skin.type.ISkinType;
import riskyken.armourersWorkshop.client.model.armourer.ModelChest;
import riskyken.armourersWorkshop.common.skin.Point3D;
import riskyken.armourersWorkshop.common.skin.Rectangle3D;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SkinChestPartRightArm extends AbstractSkinPartTypeBase implements ISkinPartTypeTextured {
    
    public SkinChestPartRightArm(ISkinType baseType) {
        super(baseType);
        this.buildingSpace = new Rectangle3D(-3, -11, -4, 9, 17, 8);
        this.guideSpace = new Rectangle3D(-1, -10, -2, 4, 12, 4);
        this.offset = new Point3D(-10, 0, 0);
    }
    
    @Override
    public String getPartName() {
        return "rightArm";
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void renderBuildingGuide(float scale, boolean showSkinOverlay, boolean showHelper) {
        GL11.glTranslated(0, this.buildingSpace.getY() * scale, 0);
        GL11.glTranslated(0, -this.guideSpace.getY() * scale, 0);
        ModelChest.MODEL.renderRightArm(scale);
        GL11.glTranslated(0, this.guideSpace.getY() * scale, 0);
        GL11.glTranslated(0, -this.buildingSpace.getY() * scale, 0);
    }

    @Override
    public Point getTextureLocation() {
        return new Point(40, 16);
    }

    @Override
    public boolean isTextureMirrored() {
        return false;
    }

    @Override
    public IPoint3D getTextureModelSize() {
        return new Point3D(4, 12, 4);
    }
}