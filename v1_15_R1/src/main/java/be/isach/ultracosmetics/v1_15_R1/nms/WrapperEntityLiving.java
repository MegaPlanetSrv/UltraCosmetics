package be.isach.ultracosmetics.v1_15_R1.nms;

import net.minecraft.server.v1_15_R1.EntityLiving;

/**
 * @author RadBuilder
 */
public class WrapperEntityLiving extends WrapperEntity {

    protected EntityLiving handle;

    public WrapperEntityLiving(EntityLiving handle) {
        super(handle);

        this.handle = handle;
    }

    public float getRotationYawHead() {
        return handle.aK;
    }

    public void setRotationYawHead(float rotationYawHead) {
        handle.aK = rotationYawHead;
    }

    public float getRenderYawOffset() {
        return handle.aI;
    }

    public void setRenderYawOffset(float renderYawOffset) {
        handle.aI = renderYawOffset;
    }

    public float getMoveStrafing() {
        return handle.aZ;
    }

    public void setMoveStrafing(float moveStrafing) {
        handle.aZ = moveStrafing;
    }

    public float getMoveForward() {
        return handle.bb;
    }

    public void setMoveForward(float moveForward) {
        handle.bb = moveForward;
    }

    public boolean isJumping() {
        return getField("jumping", EntityLiving.class, Boolean.class);
    }

    public void setJumping(boolean jumping) {
        setField("jumping", EntityLiving.class, jumping);
    }

    public float getJumpMovementFactor() {
        return handle.aL;
    }

    public void setJumpMovementFactor(float jumpMovementFactor) {
        handle.aL = jumpMovementFactor;
    }

    public float getPrevLimbSwingAmount() {
        return handle.aC;
    }

    public void setPrevLimbSwingAmount(float prevLimbSwingAmount) {
        handle.aC = prevLimbSwingAmount;
    }

    public float getLimbSwingAmount() {
        return handle.aD;
    }

    public void setLimbSwingAmount(float limbSwingAmount) {
        handle.aD = limbSwingAmount;
    }

    public float getLimbSwing() {
        return handle.aE;
    }

    public void setLimbSwing(float limbSwing) {
        handle.aE = limbSwing;
    }

    public float getMoveSpeed() {
        return handle.dt();
    }

    public void setMoveSpeed(float moveSpeed) {
        handle.o(moveSpeed);
    }

    @Override
    public EntityLiving getHandle() {
        return handle;
    }
}
