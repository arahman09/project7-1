

public class TestMonth {

    public static void main (String [] args) {

        MonthDetails toDoTask1 = new MonthDetails(Year.January);
        toDoTask1.whatToDo();

        MonthDetails toDoTask2 = new MonthDetails();
        toDoTask2.whatToDo(Year.August);



    }
}
