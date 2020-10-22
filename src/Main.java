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

    }
}
