package InUppg.uppg1;

public enum WaterType {
    TAP_WATER("kranvatten"),
    MINERAL_WATER("mineralvatten"),
    PROTEIN_SOLUTION("proteinlösning");

    public final String type;

    WaterType(String type) {
        this.type = type;
    }
}
