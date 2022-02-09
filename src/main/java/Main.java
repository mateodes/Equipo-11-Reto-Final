
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Main
{
    // Se va a utilizar un map Para los registros
    public static void main(String[] args) {
        System.out.println("hola");

        Map<String, Integer> registros = new HashMap<>();

        IntStream numeroRegistro = IntStream.range(0,42);
        numeroRegistro.forEach( x -> registros.put("R"+x,0));

        registros.forEach(System.out::println();

        /* for(int i = 42; i <=0; i--){
            registros.put()
        } */
    }
    
}

