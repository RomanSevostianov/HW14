public class Main {
    public static void main(String[] args) {

        Human Maksim = new Human("Максим", "Москва",1985,"бренд меннеджер");
        Human Anna = new Human("Анна", "Саратов",1975,"методист образовательных программ");
        Human Katy = new Human("Катя ", "Пенза",1995,"прадакт менеджер");
        Human Artem = new Human("Артем ", "Калининград",1990,"директор по развитию бизнеса");
        Maksim.enter();
        Anna.enter();
        Katy.enter();
        Artem.enter();


        Cars Lada = new Cars("Lada ", " Granta ",1.9," желтый  ",2003," Россия");
        Cars VW = new Cars("VW ", " Tiguan ",2.0," желтый  ",2023," Германия");

        Cars Audi = new Cars("Audi ", " Q3 ",2.4," черный ",2020," Германия");
        Lada.enterCars();
        Audi.enterCars();
        VW.enterCars();
    }
}