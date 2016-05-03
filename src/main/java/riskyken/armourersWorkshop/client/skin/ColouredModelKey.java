package riskyken.armourersWorkshop.client.skin;

import java.util.Arrays;

import riskyken.armourersWorkshop.api.common.skin.data.ISkinDye;

public class ColouredModelKey {
    
    private final int skinId;
    private final ISkinDye skinDye;
    private final byte[] extraColours;
    
    public ColouredModelKey(int skinId, ISkinDye skinDye, byte[] extraColours) {
        this.skinId = skinId;
        this.skinDye = skinDye;
        this.extraColours = extraColours;
    }
    
    public ISkinDye getSkinDye() {
        return skinDye;
    }
    
    public byte[] getExtraColours() {
        return extraColours;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(extraColours);
        result = prime * result + ((skinDye == null) ? 0 : skinDye.hashCode());
        result = prime * result + skinId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ColouredModelKey other = (ColouredModelKey) obj;
        if (!Arrays.equals(extraColours, other.extraColours))
            return false;
        if (skinDye == null) {
            if (other.skinDye != null)
                return false;
        } else if (!skinDye.equals(other.skinDye))
            return false;
        if (skinId != other.skinId)
            return false;
        return true;
    }
}
