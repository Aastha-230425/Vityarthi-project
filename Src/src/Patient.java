public class Patient {
    private String name;
    private int age;
    private String problem;

    public Patient(String name, int age, String problem) {
        this.name = name;
        this.age = age;
        this.problem = problem;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getProblem() { return problem; }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', age=" + age + ", problem='" + problem + "'}";
    }
}
