
public class Finalone {

	
	public static void main(String[] args) {
		College co=new College();
		co.collegeName();
	}

}




class Data{
	final  void collegeID(){
		System.out.println(10160543);
	}
	
	void collegeName(){
		System.out.println("Thapar University");
	}
}


class College extends Data{
	@Override
	void collegeName() {
		super.collegeName();
	}
}