public class Human {

String name;
int yearOfBirth;
String town;
String job;

Human (String name,String town, int yearOfBirth, String job){
    this.name= name;
    this.town=town;
    this.yearOfBirth=yearOfBirth;
    this.job=job;


}

void enter() {
    System.out.println("Привет! Меня зовут "+ name + "  Я из города "+ town+ "  Я родился в "+yearOfBirth+" Я работаю на должности "+job+ " Будем знакомы!");

    }

}
