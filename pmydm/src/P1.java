import java.util.ArrayList;
import java.util.List;

public class P1 {

    public static void main(String[] args)
    {
        //crear un arraylist e introducir los numeros impares entre 1 y 100

        List <Integer> alNumerosImpares= new ArrayList<Integer>();
        for(int i=1;i<101;i=i+2)
        {
            alNumerosImpares.add(i);
        }

        //que solo imprima las cosas necesarias
        String sComma="";
      for(Integer numeroI:alNumerosImpares)
      {
        System.out.println(sComma+numeroI);
        sComma=",";
      }


    }
}
