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
        System.out.println("Zadanie 2 LAB01");
        System.out.println("-------------------------------------------------"+'\n');

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
        System.out.println("Zadanie 3 LAB01");
        System.out.println("-------------------------------------------------"+'\n');

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
    System.out.println("Zadanie 4 LAB01 - Tablica");
    System.out.println("-------------------------------------------------"+'\n');


        for(int i=0; i< tasks.length; i++) {
            System.out.println(tasks[i]);
        }

        System.out.println("_________________________________________________");
        System.out.println("Zadanie 4 LAB02 - Lista");
        System.out.println("-------------------------------------------------"+'\n');

        //lista tasków

        List<Task> taskslista = new ArrayList<>();
        taskslista.add(task1);
        taskslista.add(task2);
        taskslista.add(task3);
        taskslista.add(task4);

        System.out.println(taskslista);

        // LAB02 DZIEDZICZENIE, POLIMORFIZM
        // Cwiczenie 1

        System.out.println("_________________________________________________");
        System.out.println("Zadanie 1 LAB02");
        System.out.println("-------------------------------------------------"+'\n');

        Subtask subtask = new Subtask("Example 1",
                "Description 1",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter),
                "subtask1");
        System.out.println(subtask);


        // Cwiczenie 2


        System.out.println("_________________________________________________");
        System.out.println("Zadanie 2 LAB02");
        System.out.println("-------------------------------------------------"+'\n');

        Task subtask11 = new Subtask("Example11",                                       //Polimorfizm, typ Task
                "Description11",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter), "subtask11");

        Task subtask22 = new Subtask("Example22",
                "Description22",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter), "subtask22");

        Task subtask33 = new Subtask("Example33",
                "Description33",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter), "subtask33");

        Task task44 = new Task("Example44",
                "Description44",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter));

        Task task55 = new Task("Example55",
                "Description55",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter));

        Task task66 = new Task("Example66",
                "Description66",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter));


        System.out.println(subtask11);
        System.out.println(subtask22);
        System.out.println(subtask33);
        System.out.println(task44);
        System.out.println(task55);
        System.out.println(task66);


        //Cwiczenie 3

        System.out.println("_________________________________________________");
        System.out.println("Zadanie 3 LAB02");
        System.out.println("-------------------------------------------------"+'\n');


        Object subtask111 = new Subtask("Example111",                                   //Polimorfizm, typ Object
                "Description111",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter), "subtask111");

        Object subtask222 = new Subtask("Example222",
                "Description222",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter), "subtask222");

        Object subtask333 = new Subtask("Example333",
                "Description333",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter), "subtask333");

        Object task444 = new Task("Example444",
                "Description444",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter));

        Object task555 = new Task("Example555",
                "Description555",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter));

        Object task666 = new Task("Example666",
                "Description666",
                CategoryEnum.NEW,
                LocalDateTime.parse(dateStr1, formatter));


        System.out.println(subtask111);
        System.out.println(subtask222);
        System.out.println(subtask333);
        System.out.println(task444);
        System.out.println(task555);
        System.out.println(task666);


        //Cwiczenie 4 getDetailInfo

        System.out.println("_________________________________________________");
        System.out.println("Zadanie 4 LAB02");
        System.out.println("-------------------------------------------------"+'\n');


        getDetailInfo(subtask222);                                                      //przykład z subtaskTitle
        getDetailInfo(task55);                                                          //przykład B/D
    }

    public static void getDetailInfo(Object o){
        String infos = "";
        if(o.getClass() == Task.class || o.getClass() == Subtask.class) {               //sprawdzanie czy obiekt jest typu task   || alternatywa - false tylko wtedy, gdy oba warunki będą false
            Task task = (Task) o;                                                       //rzutowanie przez Object.

            String subtaskName = null;
            if (task.getClass() == Subtask.class)
                subtaskName = ((Subtask) task).getSubtaskName();
            infos += getLine("taskName", task.getTaskName())
                    + getLine("taskDescription", task.getTaskDescription())
                    + getLine("taskCategory", task.getTaskCategory())
                    + getLine("taskDateTimeStart", task.getTaskDateTimeStart())
                    + getLine("taskDateTimeStop", task.getTaskDateTimeStop())
                    + getLine("subtaskTitle", subtaskName);
        }
        System.out.println(infos);

    }

    private static String getLine(String name, Object value){
        int fieldSpace = 35;
        String spaces = "                                   ";
        String valueStr = "B/D";
        if(null != value) {
            valueStr = value.toString();
        }
        return '|' + name + spaces.substring(0,fieldSpace-name.length()) + '|'
                + valueStr + spaces.substring(0,fieldSpace-valueStr.length()) + '|'+ '\n';
    }



}
