package comparison;

public class JavaUser {
    private int id;
    private String name = "Shawn";
    private int age = 32;     // age만 변경 가능

    public JavaUser(int id) {
        System.out.println("생성자에서 ");
        this.id = id;
    }

    {
        System.out.println("It's init block...");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        if(this.age > 32) {
            return String.format("old %s", this.name);
        } else {
            return "still young " + this.name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("나이를 더 먹었구나.");
        this.age = age;
    }
}
