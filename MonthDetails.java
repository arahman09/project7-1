



public class MonthDetails {

    Year month;

    public MonthDetails() {}

    public MonthDetails(Year month) {
        this.month = month;

    }

    public void whatToDo() {

        switch (month) {
            case January:
                System.out.println("Read Book 1");
                break;
            case February:
                System.out.println("Read Book 2");
                break;
            case March:
                System.out.println("Read Book 3");
                break;
            case April:
                System.out.println("Read Book 4");
                break;
            case May:
                System.out.println("Read Book 5'");
                break;
            case June:
                System.out.println("Read Book 6");
                break;
            case July:
                System.out.println("Read Book 7");
                break;
            case August:
                System.out.println("Read Book 8");
                break;
            case September:
                System.out.println("Read Book 9");
                break;
            case October:
                System.out.println("Read Book 10");
                break;
            case November:
                System.out.println("Read Book 11");
                break;
            case December:
                System.out.println("Read Book 12");

            default:
                System.out.println();
        }
    }

        public void whatToDo (Year month){

            switch (month) {
                case January:
                    System.out.println("Read Book 1");
                    break;
                case February:
                    System.out.println("Read Book 2");
                    break;
                case March:
                    System.out.println("Read Book 3");
                    break;
                case April:
                    System.out.println("Read Book 4");
                    break;
                case May:
                    System.out.println("Read Book 5'");
                    break;
                case June:
                    System.out.println("Read Book 6");
                    break;
                case July:
                    System.out.println("Read Book t");
                    break;
                case August:
                    System.out.println("Read Book 8");
                    break;
                case September:
                    System.out.println("Read Book 9");
                    break;
                case October:
                    System.out.println("Read Book 10");
                    break;
                case November:
                    System.out.println("Read Book 11");
                    break;
                case December:
                    System.out.println("Read Book 12");

                default:
                    System.out.println();
            }


        }


    }
