
class Data
{
	private Object str;

	public Data(Object str) {
		
		this.str = str;
	}

	public Object getStr() {
		return str;
	}

	@Override
	public String toString() {
		return "Data [str=" + str + ", getStr()=" + getStr() + "]";
	}
}
public class Non_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data obj = new Data(12);
		Integer out = (Integer)obj.getStr();
		
		System.out.println(out);
	}

}
