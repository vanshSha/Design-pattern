package com.creational_design_pattern.BuilderPattern.problem;

public class Home {

    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;


    public Home(String foundation, String structure, String roof, boolean hasGarage, boolean hasSwimmingPool, boolean hasGarden) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = false;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "Home{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
