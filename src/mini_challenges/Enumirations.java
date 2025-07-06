package mini_challenges;
class Enumirations {
  public static void main(String[] args){
    Pizza myPizza = new Pizza();
    myPizza.setStatus(PizzaStatus.READY);  // Use setter to set status
    System.out.println(myPizza.isDeliverable());
  }
}

enum PizzaStatus {
  ORDERED,
  MAKING,
  READY,
  DELIVERED;
}

class Pizza{
  private PizzaStatus status;
    
  public boolean isDeliverable() {
    if (this.status == PizzaStatus.READY) {  // Compare instance field to enum constant
      System.out.println("Pizza is ready for delivery");
      return true;  // Return boolean value
    } else {
      System.out.println("The pizza is not ready for delivery");
      return false;  // Return boolean value
    }
  }
    
  public void setStatus(PizzaStatus status){
    this.status = status;
  }
       
  public PizzaStatus getStatus(){
    return this.status;
  }  
}