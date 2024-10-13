package ponomarenko;

class OverTheCounterDrug extends Drug { // лекарство без рецепта
    public OverTheCounterDrug(String name, String dosage) {
        super(name, dosage);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " (OTC)";
    }
}