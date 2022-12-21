public class BandDemo{

	public static void main(String[] args) {
		BandType band1=new BandType("Green Day", "Punk Rock");
		BandType band2=new BandType("System of a Down");
		BandType band3=new BandType("Linkin Park", "Alternative Rock");
		BandType band4=new BandType(band3);
		BandType.band.add(new BandType("Green Day", 3, 1, 1));
		BandType.band.add(new BandType("System of a Down", 3, 2, 1));
		BandType.band.add(new BandType("Linkin Park", 3, 2, 2));
		
		System.out.println(band1.getDetail());
		System.out.println(BandType.band.get(0));
		System.out.println(band2.getDetail());
		System.out.println(BandType.band.get(1));
		System.out.println(band4.getDetail());
		System.out.println(BandType.band.get(2));

		System.out.println(BandType.totalMember()+"\nTotal Bands: "+BandType.band.size());
	}
}
