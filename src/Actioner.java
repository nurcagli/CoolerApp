public class Actioner implements IActioner{
	
    private IProcess openCooler;
    private IProcess closeCooler;

    public Actioner(){
    	openCooler=new OpenCooler();
    	closeCooler=new CloseCooler();
    }
 
	@Override
	public void openCooler() {
		openCooler.makeProcess1();	
	}

	@Override
	public void closeCooler() {
		closeCooler.makeProcess1();	
	}
}
