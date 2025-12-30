package com.vti.backend.Assignment_05.Assignment_05_EX1;

public class KhoiA extends ThiSinh {

    private float math;
    private float physics;
    private float chemistry;

    public KhoiA(int id, String name, String address, int level, float math, float physics, float chemistry) {
        super(id, name, address, level);
        this.chemistry = chemistry;
        this.math = math;
        this.physics = physics;
    }

    public KhoiA() {
        super();
    }

    // Getter & Setter
    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

    public float getChemistry() {
        return chemistry;
    }


    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "KhoiA{" +
                "math=" + math +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                "} " + super.toString();
    }
}
