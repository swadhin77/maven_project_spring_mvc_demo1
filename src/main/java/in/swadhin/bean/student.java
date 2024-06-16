package in.swadhin.bean;
public class student 
{
  private String name;
  private int rollno;
  private float mark;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public float getMark() {
	return mark;
}
public void setMark(float mark) {
	this.mark = mark;
}
public void display()
{
	System.out.println("Name is :"+name);
	System.out.println("Roll no is :"+rollno);
	System.out.println("Mark is "+mark);
}
}
