public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!"+"Lidt is good!");
        Student stu = new Student();
        stu.setId("001");
        stu.setName("张三");
        stu.setAge(10);

        System.out.println("id:"+stu.getId());
        System.out.println("name;"+stu.getName());
        System.out.println("age:"+stu.getAge());
        
        Teacher tc = new Teacher("t001","李云","chinese");
        System.out.println("teacher id:"+tc.getId());
        System.out.println("teacher name:"+tc.getName());
        System.out.println("teacher subject:"+tc.getSubject());
        
    }
}
