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

// switch (mes) {
// case "enero":
// signo1 = "Capricornio";
// signo2 = "Aquario";
// break;
// case "febrero":
// signo1 = "Aquario";
// signo2 = "Piscis";
// break;
// case "marzo":
// signo1 = "Piscis";
// signo2 = "Aries";
// break;
// case "abril":
// signo1 = "Aries";
// signo2 = "Tauro";
// break;
// case "mayo":
// signo1 = "Tauro";
// signo2 = "Geminis";
// break;
// case "junio":
// signo1 = "Geminis";
// signo2 = "Cancer";
// break;
// case "julio":
// signo1 = "Cancer";
// signo2 = "Leo";
// break;
// case "agosto":
// signo1 = "Leo";
// signo2 = "Virgo";
// break;
// case "septiembre":
// signo1 = "Virgo";
// signo2 = "Libra";
// break;
// case "octubre":
// signo1 = "Libra";
// signo2 = "Escorpio";
// break;
// case "noviembre":
// signo1 = "Escorpio";
// signo2 = "Sagitario";
// break;
// case "diciembre":
// signo1 = "Sagitario";
// signo2 = "Capricornio";
// break;
// default:
// System.out.println("Error, formato del mes incorrecto!");
// }

// Àries-Aries (21.03 — 19.04)
// Taure-Tauro (20.04 — 20.05)
// Bessons-Géminis (21.05 — 20.06)
// Cranc-Cáncer (21.06 — 22.07)
// LLeó-Leo (23.07 — 22.08)
// Verge-Virgo (23.08 — 22.09)
// Balança-Libra (23.09 — 22.10)
// Escorpi-Escorpio (23.10 — 21.11)
// Sagitario-Sagitario (22.11 — 21.12)
// Capricorn-Capricornio (22.12 — 19.01)
// Aquari-Acuario (20.01 — 18.02)
// Peixos-Piscis (19.02 — 20.03)