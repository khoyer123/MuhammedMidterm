package design;

public class Year {


      Months months;

    public Year(Months months){
        this.months = months;
    }

    public void myPlan() {
        switch(months){
            case January:
                System.out.println("working");
                break;
            case February:
                System.out.println("working & studing");
                break;
            case March:
                System.out.println("work from home");
                break;
            case April:
                System.out.println("work fulltime");
                break;
            case May:
            case June:
            case July:
            case August:
            case September:
            case October:
            case November:
            case December:
                System.out.println("work");
                break;
            default:
                System.out.println("vacation");
                break;
        }


    }
}
