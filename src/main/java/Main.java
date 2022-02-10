
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.IntStream;

public class Main
{

    // Se va a utilizar un map Para los registros
    public static void main(String[] args) {
        Instrucciones intrucciones=new Instrucciones();
        Map<String, Integer> registros = new HashMap<>();

        IntStream numeroRegistro = IntStream.range(0, 42);
        numeroRegistro.forEach(x ->
                registros.put(String.format("R"+ (x>=10? "":"0") +"%s", x), 0));
        intrucciones.setMap(registros);
        registros.forEach((k, v) -> System.out.printf("%s : %s%n", k, v));

        Iterator it=registros.keySet().iterator();
    /*    while(it.hasNext()){
            System.out.println(it.next());
        }*/
        String subrutina[]={
                "MOV 5,R00",
                "MOV 10,R01",
                "JZ 4",
                "ADD R02,R01",
                "DEC R00",
                "JMP 3",
                "MOV R02,R42"
        } ;
        int input = 20;
        String result = Integer.toBinaryString(input);
        System.out.println(result);
        String cad="";
        for (int a=0; a<result.length();a++){
            char d=result.charAt(a);

            if(Character.compare(d,'0')==0){
               cad=cad+"1";
            }else{
                cad=cad+"0";
            }

        }
        System.out.println(cad);

       /*
        for (int i=0;i<subrutina.length;i++){
            String[] algo=subrutina[i].split("\\s+");
            String accion=algo[0];
            switch (accion){
                case "MOV":
                    intrucciones.mov(algo[1]);
                    break;
                case "JZ":
                    if(registros.get("R00")==0){
                        i=Integer.valueOf(algo[1])-2;
                    }
                    break;
                case "ADD":
                    intrucciones.add(algo[1]);
                    break;
                case "DEC":
                    intrucciones.dec(algo[1]);
                    break;
                case "INC":
                    intrucciones.inc(algo[1]);
                    break;
                case "INV":
                    break;
                case "JMP":
                    i=Integer.valueOf(algo[1])-2;
                    break;
                case "NOM":
                    break;

            }

            System.out.println(registros.get("R42"));
        }
*/
        //registros.forEach(System.out::println());

        /* for(int i = 42; i <=0; i--){
            registros.put()
        } */
    }
    
}

