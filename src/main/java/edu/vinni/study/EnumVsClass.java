package edu.vinni.study;

/**
 * @author anton.v.filimonov@gmail.com
 * @since 23.10.2014
 */
public class EnumVsClass {
    public static void main(String[] args) {
        print(SexEnum.MALE);

    }

    private static void print(SexEnum sex) {
        switch (sex) {
            case MALE :
                System.out.println("mujik");
                break;
            case FEMALE:
                System.out.println("baba");
        }
    }

}


enum SexEnum {

    MALE("male"),
    FEMALE("female");

    private final String name;

    SexEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}