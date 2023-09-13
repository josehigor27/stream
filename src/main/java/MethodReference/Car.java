package MethodReference;

public class Car {
    private String name;
    private Integer ano;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", ano=" + ano +
                '}';
    }

    public Car(String name, Integer ano) {
        this.name = name;
        this.ano = ano;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
