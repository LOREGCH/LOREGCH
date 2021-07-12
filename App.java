package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

//import jdk.nashorn.internal.objects.NativeInt32Array; 

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        //System.out.println("Hello World!");
        //System.out.println(NS("12/07/1980"));

        /** double precioUnidad, cantidad, iva, precioSinIva, totalIva;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca precio por unidad del producto: ");                                          
        precioUnidad = sc.nextDouble();
        System.out.print("Introduzca número de productos vendidos: ");
        cantidad = sc.nextDouble();
        System.out.print("Introduzca %IVA: ");
        iva = sc.nextDouble();
        */
        //double pu=8000;
        //int c=10;
       // double iva=16;
        //System.out.println(IVA(pu,c,iva));

        /** int N, m;
        Scanner sc = new Scanner(System.in);    
        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt();
        System.out.print("Introduzca valor de m: ");
        m = sc.nextInt();*/
        
        //System.out.print(numeroSinU(123456,2));
        
        /** double Km;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca velocidad en Km/h: ");
        Km = sc.nextDouble();
        */
        //double Km=600;
        //System.out.println("la velocidad " +Km + "En m/S es: "+ DKmaM(Km));
        //double cateto1=10.5, cateto2=52.2;
        /** Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca longitud del primer cateto: ");
        cateto1 = sc.nextDouble();
        System.out.print("Introduzca longitud del segundo cateto: ");
        cateto2 = sc.nextDouble();*/
        //System.out.println("La hipotenusa es: "+Pitagoras(cateto1, cateto2));
        
        //int num=50;
        /**Scanner sc = new Scanner(System.in);
        System.out.print("Número entero: ");
        N = sc.nextInt();*/
        //System.out.println(num+" "+MultiD(num));

        //char c='a';
        /** System.out.print("Introduzca un carácter: ");
        car = (char) System.in.read(); //lee un solo caracter
        */
        //System.out.println(c+" "+Caracter(c));

        //double n1=10, n2=10;
        /** Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el dividendo: ");
        n1 = sc.nextDouble();
        System.out.print("Introduzca el divisor: ");
        n2 = sc.nextDouble();*/
        //System.out.println(DivisionNumeros(n1,n2));

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, H, M, S;
        System.out.print("Introduzca primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = sc.nextInt();
        
        System.out.print("Introduzca hora: ");
        H =  sc.nextInt();
        System.out.print("Introduzca minutos: ");
        M =  sc.nextInt();
        System.out.print("Introduzca segundos: ");
        S =  sc.nextInt();
        
    }
    public static int NS(String FN){
        var indice=FN.indexOf('/');//devuelve la posición, del caracter, por medio de un entero, si no existe devuelve -1
        //Integer.parseInt convierte una cadena a entero primitivo
        //substring Devuelve una subcadena, contenida entre beginIndex y endIndex. 
        //si no esta endIndex, se asumirá como el final de la cadena.
        //substring(beginIndex, endIndex)
        var dia=Integer.parseInt(FN.substring(0, indice));
        var indiceM=FN.indexOf('/',++indice);
        var mes=Integer.parseInt(FN.substring(indice, indiceM++));
        var a=Integer.parseInt(FN.substring(indiceM));

        var ns1= dia + mes +a;
        var ns=0;
        while (ns1 != 0){
            ns+=ns1%10;
            ns1 /=10;

        }

        return ns;
    }
    public static double IVA(double pu, int c, double iva){
        
        var precioSinIva = pu * c;
        var totalIva = precioSinIva * iva / 100;
        var totalPagar = precioSinIva + totalIva;   
        return totalPagar;                                 
    }

    public static int numeroSinU(int N, int m){
       
        var r=(int)Math.pow(10,m);
        var NN = N / r; 
        //Math.pow devuelve un número de tipo double                 
        //es necesario convertirlo a int para hacer la                                                  
        //división entre enteros
        return NN;
    }
    public static double DKmaM(double Km)
    {
        var M=Km*1000/3600;
        return M;
          
    }
    public static double Pitagoras(double cateto1, double cateto2)
    {
        var h= Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2));
        return h;
    }
    public static String MultiD(int num)
    {
        String a;
        if(num%10==0){
            a="Es múltiplo de 10"; 
        }   
        else{
            a="No es múltiplo de 10";
        }  
    return a;
    }
    public static String Caracter(char c)
    {
        String salida;
        if (Character.isUpperCase(c)) 
        //método isUpperCase de la clase Character 
        //determina si el valor de carácter especificado está en mayúsculas       
        {
            salida="Es una letra mayúscula";
        } else {
            salida="No es una letra mayúscula";
        }
        return salida;
    }
    public static String DivisionNumeros(double n1, double n2)
    {
        String e;
        if(n2==0){
           e="No se puede dividir por cero";   
        }else{
           e=n1 + " / " + n2 + " = " +n1/n2;       
        }
        return e;
    }

    public static int numeromayor(int n1, int n2,int n3) 
    {
        if (n1 > n2) {
            if (n1 > n3){ 
                System.out.println("El mayor es: " + n1);                                             
            } else { 
                System.out.println("el mayor es: " + n3);     
            }
        } else if (n2 > n3) { 
            System.out.println("el mayor es: " + n2);
        } else {
            System.out.println("el mayor es: " + n3);
        }
        int mx= n3;
        return mx;
    } 
    public static int Hora(int H,int M,int S)
    { 
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60) {                                                        
           System.out.println("Hora correcta");   
        }  else {
            System.out.println("Hora incorrecta");
        }
        int hr= H ;
        return hr; 
    }

    

}


