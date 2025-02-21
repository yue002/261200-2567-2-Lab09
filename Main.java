public class Main {
    public static void main(String[] args) {

        
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape ellipse = new Ellipse(10,15);

        AreaCalculator calculator = new AreaCalculator();
        System.out.printf("Rectangle Area: %.2f%n" , calculator.calculateArea(rectangle));
        System.out.printf("Circle Area: %.2f%n" , calculator.calculateArea(circle));
        System.out.printf("Ellipse: %.2f%n" , calculator.calculateArea(ellipse));
        System.out.println();

       
        Penguin Lisa = new Penguin();
        Ostrich Jenny = new Ostrich();
        Sparrow Rose = new Sparrow();
        Eagle Jisoo = new Eagle();
        Lisa.move();
        Jenny.move();
        Rose.move();
        Rose.fly();
        Jisoo.move();
        Jisoo.fly();

        System.out.println();

    
        Order order1 = new Order("666");
        OrderProcessor orderProcessor = new OrderProcessor(new EmailNotifier());
        orderProcessor.processOrder(order1);
        Order order2 = new Order("789");
        OrderProcessor orderProcessorWithSMS = new OrderProcessor(new SMSNotifier());
        orderProcessorWithSMS.processOrder(order2);
    }
}
