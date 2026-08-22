package Assuntos.a09Encapsulamento.aula;

public class Pessoa {
    private String name;
    private int age;
    private String password;
    private String email;

    public Pessoa(String name, int age, String password, String email) {

        setName(name);
        setAge(age);
        setPassword(password);
        setEmail(email);

    }

    //Sem idade 
    public Pessoa(String name, String password, String email) {

        setName(name);
        setPassword(password);
        setEmail(email);

    }

    //Setters

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setPassword(String p) {
        if (p.length() >= 8) {
            this.password = p;
        }
    }

    public void setEmail(String e) {
        this.email = e;
    }

    // get(não mostra senha)

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

}
