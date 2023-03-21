public class Triangulo extends Figura implements Comparatorio<Triangulo>{
    private double base;
    private double altura;
    private double lados = 3;


    public Triangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea(){
        return base* altura / 2;
    }

    // IMPLEMENTAR EL METODO DE COMPARAR

    public int compareTo(Triangulo triPorCompararTriangulo){
        double areaPorComparar = triPorCompararTriangulo.calcularArea();
        double miArea = this.calcularArea();
        if(miArea == areaPorComparar){
            if(this.lados == triPorCompararTriangulo.devolverLados()){
                return 0;
            }
            else if(this.lados > triPorCompararTriangulo.devolverLados()){
                return 2;
            }
            else{
                return -2;
            }
        }
        else if(miArea > areaPorComparar){
            if(this.lados == triPorCompararTriangulo.devolverLados()){
                return 1;
            }
            else if(this.lados > triPorCompararTriangulo.devolverLados()){
                return 3;
            }
            else{
                return -3;
            }
        }
        else{
            if(this.lados == triPorCompararTriangulo.devolverLados()){
                return -1;
            }
            else if(this.lados > triPorCompararTriangulo.devolverLados()){
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
