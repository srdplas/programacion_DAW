package srdplas.u3e17libro;

/**
 *
 * @author srdpl
 */
public class LibrosApilados implements IPilaLibros {

    private int tamanioPila, numElementos;
    private Libro monton[];

    public LibrosApilados(int tamanioPila) {
        this.tamanioPila = tamanioPila;
        monton = new Libro[tamanioPila];
    }

    @Override
    public void apilar(Libro l) {

        for (int i = 0; i < monton.length; i++) {
            if (monton[i] == null) {
                monton[i] = l;
                break;
            }
        }
        numElementos++;
        if (numElementos > monton.length) {
            System.out.println("Error maximo de libros apilados");
            numElementos--;
        }
    }

    public void muestraMonton() {
        System.out.println("Monton");
        for (Libro ls : monton) {
            System.out.println(ls);
        }
    }

    @Override
    public Libro desapilar() {
        Libro librillo = null;
        int tam = tamanioPila - 1;
        for (int i = tam; i < monton.length; i--) {
            if (monton[i] != null) {
                numElementos--;
                librillo = monton[i];
                monton[i] = null;
                return librillo;
            }
        }

        return librillo;
    }

    @Override
    public Libro verCima() {
        Libro librillo = null;
        int tam = tamanioPila - 1;
        for (int i = tam; i < monton.length; i--) {
            if (monton[i] == null) {

            } else {
                if (monton[i] != null) {
                    return monton[i];
                }
            }
        }
        return librillo;
    }

    @Override
    public int getNumElementos() {
        return numElementos;
    }

    @Override
    public void vaciar() {
        Libro monton[] = new Libro[tamanioPila];
    }

}
