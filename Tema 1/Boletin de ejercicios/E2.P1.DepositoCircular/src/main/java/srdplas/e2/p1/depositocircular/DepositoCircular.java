package srdplas.e2.p1.depositocircular;

public class DepositoCircular {
    public double radio, altura, litrosRiegoHora,numLitrosActual;
  
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLitrosRiegoHora() {
        return litrosRiegoHora;
    }
    

    public void setLitrosRiegoHora(double litrosRiegoHora) {
        this.litrosRiegoHora = litrosRiegoHora;
    }
    
    public double getNumLitrosActual(){
        return numLitrosActual;
    }
    
    public double calculaSuperficieBase(){
        double superficie;
        superficie = (Math.PI * Math.pow(radio, 2));
        return superficie;
    }
    public double calculaPerimetroBase(){
        double perimetro;
        perimetro= 2*(Math.PI * radio);
        return perimetro;
    }
    public double calculaCapacidad(){
        double capacidad;
        capacidad= calculaSuperficieBase()*altura;
        //     capacidad= (Math.PI * Math.pow(radio, 2))*altura;
        return capacidad;
    }
    public void cargaDeposito( double numLitros){
        numLitrosActual+=numLitros;
    }
    public void riega(double numMinutos){
        double calculo;
        calculo= numLitrosActual-((numMinutos/60)*litrosRiegoHora);
       // numLitrosActual=numLitrosActual((numMinutos/60)*litrosRiegoHora);
        numLitrosActual = calculo;
    }
}
