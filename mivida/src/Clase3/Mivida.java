package Clase3;

import java.util.ArrayList;//Se importan cada una de las librerias
import java.util.List;
import java.util.Scanner;

public class Mivida {
    
    
    public static void main(String[] args) {
        
        
            //Definicion de una clase   
            /*Objeto base para escribir
            las estructuras de los demas
            objetos*/
            List<Perro> perros = new ArrayList();
             CentroDeAdopcion c=//Se crea la instancia con los parametros que se piden 
               new CentroDeAdopcion("La adoptadera","C/ 20, Los Mina",15,"Francisco Liriano", perros);
       Mivida m = new Mivida();
      //**********************************************INICIO DE CREACION DE LISTA PERROS***********************************************************
      
       Perro perro = new Perro();//Se crea la instancia
       c.getPerros().add(new Perro("Manuel","Negro",10.2,"Golden","Crespo",false,'H'));      
       c.getPerros().add(new Perro("Igor","Negro",10.2,"Golden","Lacio",false,'H'));   
       c.getPerros().add(new Perro("Luli","Negro",10.2,"Chow chow","Crespo",false,'H'));
       c.getPerros().add(new Perro("Jesus","Negro",10.2,"Chihuahua","Crespo",false,'H'));
       c.getPerros().add(new Perro("Pedro","Negro",10.2,"Golden","Crespo",false,'H'));
       c.getPerros().add(new Perro("Pepe","Negro",10.2,"Siberiano","Crespo",false,'H'));
       c.getPerros().add(new Perro("Luli","Gris",10.2,"Golden","Crespo",false,'H'));
       c.getPerros().add(new Perro("Luli","Dorado",10.2,"Chow chow","Crespo",false,'H'));     
       c.getPerros().add(new Perro("Luli","Plateado",10.2,"Chihuahua","Crespo",false,'V'));
       c.getPerros().add(new Perro("Luli","Crema",10.2,"Pomeranian","Crespo",false,'V'));
       c.getPerros().add(new Perro("Luli","Gris",10.2,"Chihuahua","Crespo",false,'V'));
       c.getPerros().add(new Perro("Luli","Gris",10.2,"Pomeranian","Crespo",false,'V'));
       c.getPerros().add(new Perro("Luli","Gris",10.2,"Chow chow","Crespo",false,'V'));
       c.getPerros().add(new Perro("Luli","Negro",10.2,"Chow chow","Crespo",false,'V'));
       c.getPerros().add(new Perro("Luli","Gris",10.2,"Chow chow","Crespo",false,'V'));
       
       //*****************************************CREACION DE LISTA PARA PERSONA (ESTO ES OPCIONAL)***********************************************
       Persona1 persona = new Persona1();
       
       persona.setNombre("Johanna");
       persona.setApellido("Perez");
       persona.setCedula(00100020003);
       persona.setCorreo("johana@gmail.com");
       persona.setTelefono(809555555);
       
       persona.personas.add(persona);
       
       persona=new Persona1();
       persona.setNombre("Donald");
       persona.setApellido("Perez");
       persona.setCedula(00300030003);
       persona.setCorreo("donald@gmail.com");
       persona.setTelefono(809555555);
       
       persona.personas.add(persona);
       persona=new Persona1();
       persona.setNombre("Gregor");
       persona.setApellido("Perez");
       persona.setCedula(00200020002);
       persona.setCorreo("gregor@gmail.com");
       persona.setTelefono(809555555);
       
       persona.personas.add(persona);
       
       persona=new Persona1();
       persona.setNombre("Amelia");
       persona.setApellido("Perez");
       persona.setCedula(00400040004);
       persona.setCorreo("amelia@gmail.com");
       persona.setTelefono(809555555);
       
       persona.personas.add(persona);
       
       persona=new Persona1();
       persona.setNombre("Jason");
       persona.setApellido("Perez");
       persona.setCedula(00400040004);
       persona.setCorreo("jason@gmail.com");
       persona.setTelefono(809555555);
       
       persona.personas.add(persona);
      
       //****************************************FIN DE CREACION DE LISTA PERSONAS************************************************************
       
       //****************************************EJECUCIÓN DE LOS MÉTODOS*************************************
       
       String cliente;
       //Todo lo de escanner es opcional lo hice así para que se vea mejor
       Scanner sc = new Scanner(System.in);//Se llama una instancia para el scanner
       
       System.out.println("Por favor escriba el método que desee usar: ");
       cliente=sc.nextLine();//Se pide que la proxima escrita la tomara como el valor de la variable
       
       //Se inician las condiciones para determinar que metodo se desea
       if (null==cliente)System.out.println("Método no disponible");
       
       else switch (cliente) {//Se revisa de la variable todos los valores posibles
            case "Johanna"://Aqui pone un caso en el que la variable pueda ser igual a esto
                m.johannaAdopta(persona, c);//Se llama al metodo correspondiente con los parametros que piden
                break;
            case "Donald":
                m.donaldAdopta(persona, c);//Se llama al metodo correspondiente con los parametros que piden
                break;
            case "Gregor":
                m.gregorAdopta(persona, c);//Se llama al metodo correspondiente con los parametros que piden
                break;
            case "Jason":
                m.jasonAdopta(persona,c);//Se llama al metodo correspondiente con los parametros que piden
                break;
            case "Amelia":
                m.ameliaAdopta(persona,c);//Se llama al metodo correspondiente con los parametros que piden
                break;
            default://En caso de que no sea ninguno presentara este mensaje
                System.out.println("Método no disponible");
            break;  
        }
       //****************************************FIN EJECUCIÓN DE LOS MÉTODOS*************************************
       }
    // **********************************INICIO DE LA CREACION DE LOS METODOS PARA CADA CLIENTE***********************************************
    public void johannaAdopta(Persona1 persona, CentroDeAdopcion centro){
    
        centro.adopcion(
                new Persona1(
                    "Johanna",
                    "Perez",
                    101001,
                    "johana@gmail.com",
                    809555), 
                new Perro(null,
                       "Negro",
                       0,
                       "Chow chow",
                       null,
                       false,
                       'H'));

      }
      public void donaldAdopta(Persona1 persona, CentroDeAdopcion centro){
          
            centro.adopcion(
               new Persona1(
                    "Johanna",
                    "Perez",
                    101001,
                    "johana@gmail.com",
                    809555),  
                new Perro(null,
                       null,
                       0,
                       null,
                       null,
                       false,
                       'V'));
      }
      public void gregorAdopta(Persona1 persona, CentroDeAdopcion centro){
                
          centro.adopcion(
                new Persona1(
                    "Johanna",
                    "Perez",
                    101001,
                    "johana@gmail.com",
                    809555), 
                new Perro(null,
                       "Blanco",
                       0,
                       null,
                       null,
                       false,
                       ' '));

      }
      public void ameliaAdopta(Persona1 persona, CentroDeAdopcion centro){
   
          centro.adopcion(
                new Persona1(
                    "Johanna",
                    "Perez",
                    101001,
                    "johana@gmail.com",
                    809555), 
                new Perro(null,
                       null,
                       0,
                       "Chihuahua",
                       null,
                       false,
                       ' '));

      }
      public void jasonAdopta(Persona1 persona, CentroDeAdopcion centro){
                
          centro.adopcion(
                 new Persona1(
                    "Johanna",
                    "Perez",
                    101001,
                    "johana@gmail.com",
                    809555), 
                new Perro(
                        null,
                       "Chocolate",
                       0,
                       null,
                       null,
                       false,
                       ' '));

      }     
    // **********************************Fin DE LA CREACION DE LOS METODOS PARA CADA CLIENTE***********************************************
    }


