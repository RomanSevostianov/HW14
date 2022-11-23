public class Cars {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Cars (String brand,String model,double engineVolume,String color,int productionYear,String productionCountry){
       this.brand=brand;
        this.model=model;
        this.engineVolume=engineVolume;
        this.color=color;
        this.productionYear=productionYear;
        this.productionCountry =productionCountry;
    }

    void enterCars() {
        System.out.println("Модель "+ brand+ " год выпуска "+productionYear+ " собран в "+ productionCountry+ " "+color+ " объем двигателя  "+ engineVolume);
    }


}
