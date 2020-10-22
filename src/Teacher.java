public class Teacher{
  private String id;
  private String name;
  private String subject;
  
  public Teacher(String id,String name,String subject){
    this.id = id;
    this.name = name;
    this.subject = subject;
  }
  
  public void setId(String id){
    this.id = id;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setSubject(String subject){
    this.subject = subject;
  }
  
  public String getId(){
    return id;
  }
  
  public String getName(){
    return name;
  }
  
  public String getSubject(){
    return subject;
  }

}
