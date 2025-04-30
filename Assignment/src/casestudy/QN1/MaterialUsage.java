package casestudy.QN1;
public class MaterialUsage extends ConstructionMaterial{
    public MaterialUsage(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void receiveMaterial() {

    }

    @Override
    public void useMaterial() {
        if(getMaterialBalance() - getMaterialQuantity() >= 2){
            setMaterialBalance(getMaterialBalance() - getMaterialQuantity());
            System.out.println("You have successfully used "+ getMaterialQuantity()+ " tons of material");
        }else {
            System.out.println("You have insufficient materials. The material balance should remain at least 2 tons");
        }
    }

    @Override
    public void estimateCost() {

    }
}
