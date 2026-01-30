import java.util.Arrays;

public class AnalizarTicketBestPractice {
    public static Double procesarTickets(String[] tickets) {
        Double total = 0.0;
        int ticketsValidos = 0;

        System.out.println("Detalle Venta");
        for(int i=0; i<tickets.length; i++) {
            try {
                String[] pedazos = tickets[i].split(",");
                String nombre = pedazos[0].trim().toUpperCase();
                Double precio = Double.parseDouble(pedazos[1].trim());
                total += precio;
                ticketsValidos ++;

                System.out.println("Producto: " + nombre + " | Precio: $" + precio);
            } catch (NumberFormatException e) {
                System.out.println(">> ALERTA: Ticket corrupto en índice " + i + " ('" + tickets[i] + "')");
            }
        }

        if(ticketsValidos > 0) {
            System.out.println("\n---------------------------");
            System.out.println("TOTAL VENTAS (" + ticketsValidos + " tickets): $" + total);
            System.out.println("PROMEDIO REAL: $" + (total / ticketsValidos));
        } else {
            System.out.println("No hubo ventas validas.");
        }

        return total;
    }

    public static void main(String[] args) {
        String[] tickets = {
                " Camisa, 500 ",
                "Pantalón, 1200.50",
                "Zapatillas, 3500",
                " Gorra , 150.25 ",
                "ErrorData, Texto"
        };

        procesarTickets(tickets);
    }
}
