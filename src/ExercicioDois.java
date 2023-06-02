public class ExercicioDois {
    private double dolarAmericano;
    private double dolarCanandense;
    private double euro;
    private double libraEsterlina;
    int real;

    public ExercicioDois(double dolarAmericano, double dolarCanandense, double euro, double libraEsterlina) {
        this.dolarAmericano = dolarAmericano;
        this.dolarCanandense = dolarCanandense;
        this.euro = euro;
        this.libraEsterlina = libraEsterlina;
    }

    public double getDolarAmericano() {
        return dolarAmericano;
    }

    public void setDolarAmericano(double dolarAmericano) {
        this.dolarAmericano = dolarAmericano;
    }
    public double converterDolar(){
         return dolarAmericano * real;
    }
}
