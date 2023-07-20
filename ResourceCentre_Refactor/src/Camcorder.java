
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
<<<<<<< HEAD
=======
		String output = super.toString();

		output+=String.format(" %-20d",opticalZoom);

>>>>>>> branch 'master' of https://github.com/nicholas-nilz/ResourceCentre_Refactor
		// Write your codes here
		String output = super.toString();
		output=String.format("%-63s %-20d", output,opticalZoom);
		
		return output;
	}
}


