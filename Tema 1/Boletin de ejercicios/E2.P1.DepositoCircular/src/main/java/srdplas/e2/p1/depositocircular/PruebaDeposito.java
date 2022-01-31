package srdplas.e2.p1.depositocircular;

public class PruebaDeposito {
    public static void main(String[] args) {
        DepositoCircular dp = new DepositoCircular();
        double radio, altura, litrosHora, litrosActual, capacidad, perimetro, superfice, carga;
        
        
        dp.setRadio(0);
        dp.setAltura(0);
        dp.setLitrosRiegoHora(0);
        dp.cargaDeposito(0);
        dp.riega(0);
        radio=dp.getRadio();
        altura=dp.getAltura();
        litrosHora=dp.getLitrosRiegoHora();
        litrosActual=dp.getNumLitrosActual();
        
        System.out.println("Radio del Deposito Circular: " +radio);
        System.out.println("Altura del Deposito Circular: " +altura);
        System.out.println("Litros de riego por hora del Deposito Circular: " +litrosHora);
        System.out.println("Litros en Deposito Circular: " +litrosActual);
        perimetro=dp.calculaPerimetroBase();
        System.out.println("El perimetro del Deposito es de "+perimetro);
        superfice=dp.calculaSuperficieBase();
        System.out.println("La supercie del Deposito Circular: " +superfice);
        capacidad=dp.calculaCapacidad();
        System.out.println("La capacidad de Litros del Deposito es de "+capacidad);
        
        dp.setRadio(2);
        dp.setAltura(3);
        dp.setLitrosRiegoHora(4);
        dp.cargaDeposito(20);
        dp.riega(20);
        radio=dp.getRadio();
        altura=dp.getAltura();
        litrosHora=dp.getLitrosRiegoHora();
        litrosActual=dp.getNumLitrosActual();
        System.out.println("Radio del Deposito Circular: " +radio);
        System.out.println("Altura del Deposito Circular: " +altura);
        System.out.println("Litros de riego por hora del Deposito Circular: " +litrosHora);
        System.out.println("Litros en Deposito Circular: " +litrosActual);
        perimetro=dp.calculaPerimetroBase();
        System.out.println("El perimetro del Deposito es de "+perimetro);
        superfice=dp.calculaSuperficieBase();
        System.out.println("La supercie del Deposito Circular: " +superfice);
        capacidad=dp.calculaCapacidad();
        System.out.println("La capacidad de Litros del Deposito es de "+capacidad);
       
    }
}
