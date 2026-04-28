package _13_Final;

public class FinalStudent {
    private final String name;
    private final int studentId;
    private int age;

    // final -> 반드시 1회 초기화 되어야 하는 필드
    public FinalStudent(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // setName (String name) - > 불가능
    //final 필드이기 때문
    //public void setName(String name) {
    //    this.name = name;
    //}

    // final 매개변수 - 외부에서 들어온 앖을 변경할 수 있음
    public void printInfo(String school){
        // school = "코리아아이티"; => 오류발생
        System.out.println("학교 : " + school);
        System.out.println("이름 : " + name);
        System.out.println("학번 : "+ studentId);
    }
}
