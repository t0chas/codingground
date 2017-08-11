public class Producer{
    
    private MessageBroker mb;
    private String productId;
    private String name;
    
    public Producer(MessageBroker mb, String id, String name)
    {
        this.mb = mb;
        this.productId = id;
        this.name = name;
    }
    
    public void Produce(){
        System.out.println(this.name + " Producing " + this.productId);
        this.mb.SendMessage(new Message(this.productId));
    }
}