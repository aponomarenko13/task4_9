package ponomarenko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScheduleManager scheduleManager = new ScheduleManager();

        while (true) {
            System.out.println("Введите имя пациента (или 'выход' для выхода):");
            String patientName = scanner.nextLine();
            if (patientName.equalsIgnoreCase("выход")) break;

            System.out.println("Введите возраст пациента:");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Введите время доставки (например, '2023-10-01 10:00'):");
            String deliveryTime = scanner.nextLine();

            Patient patient = new Patient(patientName, age);
            Schedule schedule = new Schedule(patient, deliveryTime);

            while (true) {
                System.out.println("Введите тип лекарства (1 - рецепт, 2 - безрецептурное, или 'готово' для завершения):");
                String type = scanner.nextLine();
                if (type.equalsIgnoreCase("готово")) break;

                System.out.println("Введите название лекарства:");
                String drugName = scanner.nextLine();

                System.out.println("Введите дозировку лекарства:");
                String dosage = scanner.nextLine();

                Medication medication;
                if (type.equals("1")) {
                    System.out.println("Введите ID рецепта:");
                    String prescriptionId = scanner.nextLine();
                    medication = new PrescriptionDrug(drugName, dosage, prescriptionId);
                } else {
                    medication = new OverTheCounterDrug(drugName, dosage);
                }

                schedule.addMedication(medication);
            }
            scheduleManager.addSchedule(schedule);
        }

        System.out.println("Все расписания:");
        scheduleManager.displaySchedules();

        scanner.close();
    }
}