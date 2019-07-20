package Clase1y2;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author alexv
 */
public class Clase1y2 {
    public static void main(String args[]){
        //Definicion de las variables
        int x = 10;
        List<Perro> perros = new ArrayList();
        
        Perro perro=new Perro();
        
        Persona persona = new Persona();
        persona.setAltura(5.5);
        persona.setColorPiel("Blanca");
        persona.setEdad(16);
        persona.setGenero('f');
        persona.setNacionalidad("Japonesa");
        persona.setPeso(130);
        persona.setTipoDePelo("Lacio");      
        persona.setOcupacion("Dinero");
 
        //Se dan todas las características
       perro.setNombre("Manuel");
       perro.setColor("Negro");
       perro.setTamano(10.2);
       perro.setRaza("Golden");
       perro.setTipoDePelo("Crespo");
       perro.setAdoptado(false);
       perro.setGenero('H');
       
       perros.add(perro);//Se añade a la instancia
       
       perro = new Perro();//Se limpia y se vuelve a llamar la instancia
       perro.setNombre("Igor");
       perro.setColor("Negro");
       perro.setTamano(10.2);
       perro.setRaza("Golden");
       perro.setTipoDePelo("Lacio");
       perro.setAdoptado(false);
       perro.setGenero('H');
       
       perros.add(perro);
       
       perro = new Perro();
       perro.setNombre("Luli");
       perro.setColor("Negro");
       perro.setTamano(10.2);
       perro.setRaza("Siberiano");
       perro.setTipoDePelo("Crespo");
       perro.setAdoptado(false);
       perro.setGenero('H');
       
       perros.add(perro);
       //****************CUANDO EJECUTES ESTO VE COMENTADO LOS BLOQUES QUE NO QUIERES QUE SE USEN*************
       //foreach y for hace la misma funcion
       //Uso de for
       for (Perro perro1:perros){
           System.out.println(perro1.getNombre());
           System.out.println(perro1.getColor());
           System.out.println(perro1.getTamano());
           System.out.println(perro1.getRaza());
           System.out.println(perro1.getTipoDePelo());
       }
       
       //Formas de uso del for each
       perros.forEach(perro1->
               System.out.println(perro1.getNombre()));
       
       perros.forEach(perro1 ->{//Se define una variable que es perro1 y esta recorrera toda la lista
           System.out.println(perro1.getNombre());
           System.out.println(perro1.getColor());
           System.out.println(perro1.getTamano());
           System.out.println(perro1.getRaza());
           System.out.println(perro1.getTipoDePelo()); 
           System.out.println();
       });
       
       
       System.out.println("Blanco".equals(perro.color)? "Si es blanco":"No es blanco");
  
       //Uso del if
       if (((4/2==0)&&(10/5 !=0))||(100/20==0)){
           System.out.println("Es bisiesto");
       }else{
           System.out.println("No es bisiesto");
       }
       
       //Uso del switcH
       switch(x){
           case 6:
               System.out.println("Es verdadero");
               break;
           case 2:
               System.out.println("Es falso");
               break;
           default:
               System.out.println("No es ninguna");
       
            //Uso de la lista de un item en especifico 
            System.out.println("Nombre: " + perros.get(2).getNombre());//El número del get
            System.out.println("Color: "+perros.get(2).getColor());//define que item es que tomará
            System.out.println("Raza: "+perros.get(2).getRaza());
        
      
      //Demostración del uso de getters
        System.out.println("Nombre: ");
        System.out.println("Altura: " + persona.getAltura());
        System.out.println("Color: " + persona.getColorPiel());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Genero: "+persona.getGenero());
        System.out.println("Nacionalidad: "+persona.getNacionalidad());
        System.out.println("Peso: "+persona.getPeso());
        System.out.println("Tipo de Pelo: "+persona.getTipoDePelo());
        
    }
    
}
}

