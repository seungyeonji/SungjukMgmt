
public class Student {		//멤버변수
	private String hakbun;	
	private String name;
	private int kor, eng, mat, edp, tot;
	private double avg;
	private char grade;
	
	public Student() {	//기본생성자

	}

	public Student(String hakbun, String name, int kor, int eng, int mat, int edp) {		//생성자
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEdp() {
		return edp;
	}

	public void setEdp(int edp) {
		this.edp = edp;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override	//object의 자식이니까 object의 메소드인 toString을 재정의하겠다
	public String toString() {
		return String.format("%-10s\t%10s\t%5d%5d%5d%5d\t\t%5d%8.2f%3c",
				hakbun, name, kor, eng, mat, edp, tot, avg, grade);	//-10s : 왼쪽정렬, 10자리 확보
	}
}
