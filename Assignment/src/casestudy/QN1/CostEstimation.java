package casestudy.QN1;

public class CostEstimation extends ConstructionMaterial{
    public CostEstimation(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void receiveMaterial() {

    }

    @Override
    public void useMaterial() {

    }

    @Override
    public void estimateCost() {
        double costPerTon = 0;
        double quantity = getMaterialQuantity();
        if(quantity >= 5 && quantity <= 15){
            costPerTon = 200_000;
        }else if(quantity > 15){
            costPerTon = 180_000;
        }else {
            System.out.println("The quantity must be 5 tons and above");
        }
        double totalCost = costPerTon * quantity;

        System.out.println("=== Cost Estimation ===");
        System.out.println("Contractor ID: "+ getContractorId());
        System.out.println("Contractor Name: "+ getContractorName());
        System.out.println("Quantity used: "+ getMaterialQuantity());
        System.out.printf("Total cost: %, .2f RWF%n", totalCost);
    }
}
