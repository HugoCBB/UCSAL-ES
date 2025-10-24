package poo.estatico.atividade1;

public class Contador {
    static int count = 0;

    Contador() {
        Contador.count = proximoContado();
    }

    static int proximoContado() {
        return count += 1;
    }
    
}