import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String dateStr1 = "2021-04-10 12:30";
        String dateStr2 = "2021-04-11 12:30";
        String dateStr3 = "2021-04-12 12:30";
        String dateStr4 = "2021-04-13 12:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//zadanie 2

        System.out.println("_________________________________________________");
        System.out.println("Zadanie 2");
        System.out.println("-------------------------------------------------");

        Task task1 = new Task("Example1",
                "Description1",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter));

        Task task2 = new Task("Example2",
                "Description2",
                CategoryEnum.IN_PROGRESS,
                LocalDateTime.parse(dateStr2, formatter));

        Task task3 = new Task("Example3",
                "Description3",
                CategoryEnum.DONE,
                LocalDateTime.parse(dateStr3, formatter));

        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

        //zadanie 3

        System.out.println("_________________________________________________");
        System.out.println("Zadanie 3");
        System.out.println("-------------------------------------------------");

        Task task4 = new Task("Example4",
                "Description4",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr4, formatter));

        System.out.println("Przed dodaniem 3 msc:");
        System.out.println(task4); //wypisanie przed dodaniem 3 msc

        LocalDateTime oldDateTime = task4.getTaskDateTimeStop();
        LocalDateTime newDateTime = oldDateTime.plusMonths(3);

        task4.setTaskDateTimeStop(newDateTime);
        System.out.println("Po dodaniu 3 msc:");
        System.out.println(task4); //wypisanie po dodaniu 3 msc

    //ZADANIE 4

    // tablica tasków

        Task[] tasks = {task1,task2,task3,task4};
    System.out.println("_________________________________________________");
    System.out.println("Zadanie 4 - Tablica");
    System.out.println("-------------------------------------------------");


        for(int i=0; i< tasks.length; i++) {
            System.out.println(tasks[i]);
        }

        System.out.println("_________________________________________________");
        System.out.println("Zadanie 4 - Lista");
        System.out.println("-------------------------------------------------");

        //lista tasków

        List<Task> taskslista = new ArrayList<>();
        taskslista.add(task1);
        taskslista.add(task2);
        taskslista.add(task3);
        taskslista.add(task4);

        System.out.println(taskslista);
    }


}
