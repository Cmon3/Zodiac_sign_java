import java.util.Scanner; // Import the Scanner class

public class M4_Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Create a Scanner object
        String signo = "";

        System.out.println("Introduzca el mes de su nacimiento: ");
        String mes = entrada.nextLine();
        mes = mes.toLowerCase();

        System.out.println("Introduzca el número del dia de su nacimiento: ");
        int dia = entrada.nextInt();

        if (mes.equals("enero")) {
            if (dia < 20) {
                signo = "Capricornio";
            } else {
                signo = "Acuario";
            }
        } else if (mes.equals("febrero")) {
            if (dia < 19) {
                signo = "Acuario";
            } else {
                signo = "Piscis";
            }
        } else if (mes.equals("marzo")) {
            if (dia < 21) {
                signo = "Piscis";
            } else {
                signo = "Aries";
            }
        } else if (mes.equals("abril")) {
            if (dia < 20) {
                signo = "Aries";
            } else {
                signo = "Tauro";
            }
        } else if (mes.equals("mayo")) {
            if (dia < 21) {
                signo = "Tauro";
            } else {
                signo = "Gemini";
            }
        } else if (mes.equals("junio")) {
            if (dia < 21) {
                signo = "Gemini";
            } else {
                signo = "Cancer";
            }
        } else if (mes.equals("julio")) {
            if (dia < 23) {
                signo = "Cancer";
            } else {
                signo = "Leo";
            }
        } else if (mes.equals("agosto")) {
            if (dia < 23) {
                signo = "Leo";
            } else {
                signo = "Virgo";
            }
        } else if (mes.equals("septiembre")) {
            if (dia < 23) {
                signo = "Virgo";
            } else {
                signo = "Libra";
            }
        } else if (mes.equals("octubre")) {
            if (dia < 23) {
                signo = "Libra";
            } else {
                signo = "Escorpio";
            }
        } else if (mes.equals("noviembre")) {
            if (dia < 22) {
                signo = "Escorpio";
            } else {
                signo = "Sagitario";
            }
        } else if (mes.equals("diciembre")) {
            if (dia < 22) {
                signo = "Sagitario";
            } else {
                signo = "Capricornio";
            }
        }
        System.out.println("El signo del zodiaco del " + dia + " " + mes + " es " + signo);
    }
}

