package the_real_stuff;

public class EnumExample {

	//#1
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }

    public static void main(String[] args) {
    	
    	
    	//#2
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);

        //#3
        switch(today) {
            case MONDAY:
                System.out.println("aw geez man nobody likes monday");
                break;
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:
                System.out.println("YIPPEEEEEEE");
                break;
            default:
                System.out.println("meh");
        }
        
        System.out.println("=============");
        
      //#4
    	for (Day i: Day.values()) {
    		System.out.println(i);
    	}
    }
}
