public class Rectangulo extends Figura implements Comparatorio<Rectangulo>{
    private double base;
    private double altura;
    private double lados = 4;

    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea(){
        return base*altura;
    }

    // IMPLEMENTAR EL METODO DE COMPARAR

    public int compareTo(Rectangulo rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();

        if(miArea == areaPorComparar){
            if(this.lados == rectPorComparar.devolverLados()){
                return 0;
            }
            else if(this.lados > rectPorComparar.devolverLados()){
                return 2;
            }
            else{
                return -2;
            }
        }
        else if(miArea > areaPorComparar){
            if(this.lados == rectPorComparar.devolverLados()){
                return 1;
            }
            else if(this.lados > rectPorComparar.devolverLados()){
                return 3;
            }
            else{
                return -3;
            }
        }
        else{
            if(this.lados == rectPorComparar.devolverLados()){
                return -1;
            }
            else if(this.lados > rectPorComparar.devolverLados()){
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
