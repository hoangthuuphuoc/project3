
package studentsystem;

public class Student {
    private String ID;
    private String name;
    private int age;
    private String diachi;
    private int diemrenluyen;
    private float Gpa;
    private String Gioitinh;

    public Student(String ID, String name, int age, String diachi, int diemrenluyen, String Gioitinh,float Gpa ) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.diachi = diachi;
        this.diemrenluyen = diemrenluyen;
        this.Gpa = Gpa;
        this.Gioitinh = Gioitinh;
    }

    

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getDiemrenluyen() {
        return diemrenluyen;
    }

    public void setDiemrenluyen(int diemrenluyen) {
        this.diemrenluyen = diemrenluyen;
    }

    public float getGpa() {
        return Gpa;
    }

    public void setGpa(float Gpa) {
        this.Gpa = Gpa;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }
    
}
