public class Circulo extends Figura implements Comparatorio<Circulo>{
    private double radio;
    private double lados = 0;

    public Circulo(double pRadio){
        radio = pRadio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    // IMPLEMENTR EL METODO DE COMPARAR

    public int compareTo(Circulo circPorComparar){
        double areaPorComparar = circPorComparar.calcularArea();
        double miArea = this.calcularArea();

        if(miArea == areaPorComparar){
            if(this.lados == circPorComparar.devolverLados()){
                return 0;
            }
            else if(this.lados > circPorComparar.devolverLados()){
                return 2;
            }
            else{
                return -2;
            }
        }
        else if(miArea > areaPorComparar){
            if(this.lados == circPorComparar.devolverLados()){
                return 1;
            }
            else if(this.lados > circPorComparar.devolverLados()){
                return 3;
            }
            else{
                return -3;
            }
        }
        else{
            if(this.lados == circPorComparar.devolverLados()){
                return -1;
            }
            else if(this.lados > circPorComparar.devolverLados()){
                return 4;
            }
            else{
                return -4;
            }
        }

    }

    public double devolverLados(){
        return lados;
    }

}
