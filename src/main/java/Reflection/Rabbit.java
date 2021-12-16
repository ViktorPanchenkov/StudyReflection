package Reflection;

public class Rabbit {



    @Deprecated
    @SuppressWarnings(value = "")
    private String rabbitName;

    @RabbitAnnotation
    @Deprecated
    private String rabbitAge;

    public String getRabbitName() {
        return rabbitName;
    }

    public String getRabbitAge() {
        return rabbitAge;
    }
}
