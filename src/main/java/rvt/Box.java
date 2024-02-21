package rvt;

public class Box implements Packable{
    private double maxWeight;
    private double currentWeight;
    private int count;
    private Packable[] items;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.count = 0;
        this.items = new Packable[100];
    }
    
    String text = "";
    public void add(Packable item){
        if(this.currentWeight + item.weight() <= this.maxWeight){
            this.items[this.count] = item;
            this.count++;
            this.currentWeight += item.weight();
            
        }
        if (this.currentWeight <= this.maxWeight){
            text = "Box: " + this.count + " items, total weight " + this.currentWeight + " kg";
        }else{
            text = "Box is full!";
        }

        
    }
    
    @Override
    public double weight(){
        return this.currentWeight;
    }
    
    
    public String toString(){
        return text;
    }
    
}
