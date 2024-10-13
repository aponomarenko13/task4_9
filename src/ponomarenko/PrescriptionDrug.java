package ponomarenko;

class PrescriptionDrug extends Drug { // лекарство по рецепту
    private String prescriptionId;

    public PrescriptionDrug(String name, String dosage, String prescriptionId) {
        super(name, dosage);
        this.prescriptionId = prescriptionId;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", ID Рецепта: " + prescriptionId;
    }
}