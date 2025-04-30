package casestudy.QN1;

public abstract class ConstructionMaterial extends Constructor{
    public ConstructionMaterial(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    public abstract void receiveMaterial();
    public abstract void useMaterial();
    public abstract void estimateCost();
}
