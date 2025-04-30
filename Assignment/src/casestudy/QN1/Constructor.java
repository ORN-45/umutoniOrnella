package casestudy.QN1;

public class Constructor {
        private String contractorId;
        private String contractorName;
        private double materialQuantity;
        private double materialBalance;

        public Constructor(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
            this.contractorId = contractorId;
            this.contractorName = contractorName;
            this.materialQuantity = materialQuantity;
            this.materialBalance = materialBalance;
        }

        public String getContractorId() {
            return contractorId;
        }

        public void setContractorId(String contractorId) {
            this.contractorId = contractorId;
        }

        public String getContractorName() {
            return contractorName;
        }

        public void setContractorName(String contractorName) {
            this.contractorName = contractorName;
        }

        public double getMaterialQuantity() {
            return materialQuantity;
        }

        public void setMaterialQuantity(double materialQuantity) {
            this.materialQuantity = materialQuantity;
        }

        public double getMaterialBalance() {
            return materialBalance;
        }

        public void setMaterialBalance(double materialBalance) {
            this.materialBalance = materialBalance;
        }
    }


