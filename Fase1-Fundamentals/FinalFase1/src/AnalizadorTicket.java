public class AnalizadorTicket {

    public static Double procesarTickets(String[] tickets) {
        Double total = 0.0;
        System.out.println("Lista de camisas: ");
        for(int i=0; i<tickets.length; i++) {
            try {
                String[] pedazos = tickets[i].split(",");
                String nombre = pedazos[0].trim().toUpperCase();
                Double precio = Double.parseDouble(pedazos[1].trim()); //el .trim lo hago adentro porque debe hacerse sobre strings, no se puede sobre numeros.
                total += precio;
                System.out.println("Producto: " + nombre + " | Precio: " + precio);
            }
            catch(NumberFormatException e){
                System.out.println("Saltando dato corrupto");
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String[] tickets = {
                " Camisa, 500 ",
                "Pantalón, 1200.50",
                "Zapatillas, 3500",
                " Gorra , 150.25 ",
                "ErrorData, Texto" //Dato corrupto intencionalmente
        };
        Double totalVentas = procesarTickets(tickets);
        Double promVenta = totalVentas/tickets.length;

        System.out.println("TOTAL VENTAS: " + totalVentas);
        System.out.println("PROMEDIO DE VENTA: " + promVenta);

    }
}
