package TreeSet;

public  class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }

    public boolean equals(Person p){
        if ( this.name == p.getName() && this.age == p.getAge()){
            return true;
        } else
            return false;

    }

}