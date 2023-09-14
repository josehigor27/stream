package Lambda.Predicate;

public class Car {
   private String name = "Audi";
   private Integer year;
   private String color;

   public Car(String color, Integer year) {
      this.year = year;
      this.color = color;
   }

   public Integer getYear() {
      return year;
   }

   public void setYear(Integer year) {
      this.year = year;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   @Override
   public String toString() {
      return "Car{" +
              "name='" + name + '\'' +
              ", year=" + year +
              ", color='" + color + '\'' +
              '}';
   }
}
