package ponomarenko;

import java.util.ArrayList;
import java.util.List;

class Schedule {
    private Patient patient;
    private List<Medication> medications;
    private String deliveryTime;

    public Schedule(Patient patient, String deliveryTime) {
        this.patient = patient;
        this.medications = new ArrayList<>();
        this.deliveryTime = deliveryTime;
    }

    public void addMedication(Medication medication) {
        medications.add(medication);
    }

    public Patient getPatient() {
        return patient;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "patient=" + patient +
                ", drugs=" + deliveryTime +
                ", deliveryTime='" + deliveryTime + '\'' +
                '}';
    }
}
