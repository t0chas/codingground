//import com.ktc.messaging;

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        MessageBroker mb = new MessageBroker();
        Producer producerA1 = new Producer(mb, "prodA", "producerA1");
        Consumer consumerA1 = new Consumer(mb, "prodA", "consumerA1");
        Consumer consumerA2 = new Consumer(mb, "prodA", "consumerA2");
        Consumer consumerA3 = new Consumer(mb, "prodA", "consumerA3");
        Consumer consumerA4 = new Consumer(mb, "prodA", "consumerA4");
        
        Producer producerB1 = new Producer(mb, "prodB", "producerB1");
        Producer producerB2 = new Producer(mb, "prodB", "producerB2");
        Consumer consumerB1 = new Consumer(mb, "prodB", "consumerB1");
        
        producerA1.Produce();
        producerB1.Produce();
        producerB2.Produce();
     }
}
