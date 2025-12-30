package com.vti.backend.Assignment_05.Assignment_05_EX1;

public class KhoiB extends ThiSinh {
    private float math;
    private float chemistry;
    private float biology;

    public KhoiB(int id, String name, String address, int level, float math, float biology, float chemistry) {
        super(id, name, address, level);
        this.math = math;
        this.chemistry = chemistry;
        this.biology = biology;
    }

    public KhoiB() {
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
        return biology;
    }

    public void setPhysics(float physics) {
        this.biology = physics;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "KhoiB{" +
                "math=" + math +
                ", chemistry=" + chemistry +
                ", biology=" + biology +
                "} " + super.toString();
    }
}
