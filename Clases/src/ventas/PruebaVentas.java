package ventas;

public class PruebaVentas {
    static void main(String[] args) {
        System.out.println("-- Sisteam de ventas --");
        var producto1 = new Producto("Blusa", 30.00);
        var producto2 = new Producto("Zapatos", 50.00);
        //Primera orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        //orden1.mostrarOrden();
        //Segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Playera", 15.00));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        //orden2.mostrarOrden();
    }
}
