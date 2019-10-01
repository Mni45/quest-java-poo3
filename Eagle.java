public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

  
    public String sing() {
        return "Screech!";
    }
   
    public void takeOff() {
	this.flying=true;
        System.out.println(this.getName() + " takes off in the Sky.");
    }

    
    public int ascend(int meters) {
	this.altitude=this.altitude+meters;
        System.out.println(this.getName() + " flies uppward "+ meters+ "m.");
	return this.altitude ;
    }


    
    public int descend(int meters) {
	this.altitude=this.altitude - meters;
	System.out.println("It flies downward " + meters+"m.");
        return this.altitude ;
    }

    
    public void land() {
	if(this.altitude>1){
       		System.out.println("It can't land.");
	} else {
		System.out.println("It can land.");
	}
    }

}
