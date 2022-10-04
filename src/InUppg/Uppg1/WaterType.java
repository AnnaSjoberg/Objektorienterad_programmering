package InUppg.Uppg1;

public enum WaterType {
    TAP_WATER("kranvatten", 1),
    MINERAL_WATER("mineralvatten", 2),
    PROTEIN_SOLUTION("proteinlösning", 3);

    public final String type;
    public final Integer typeAsInt;

    WaterType(String type, Integer typeAsInt) {
        this.type = type;
        this.typeAsInt = typeAsInt;
    }

}
