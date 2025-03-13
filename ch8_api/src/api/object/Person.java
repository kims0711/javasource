package api.object;

public class Person {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;

            if (this.id.equals(p.id) && this.name.equals(p.name)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    // toString 오버라이딩
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
