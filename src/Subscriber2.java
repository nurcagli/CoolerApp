


public class Subscriber2 implements IObserver {
	
    @Override
    public void getBrief(String message) {
        System.out.println("Abone2'ye gelen mesaj = "+message);
    }
}
