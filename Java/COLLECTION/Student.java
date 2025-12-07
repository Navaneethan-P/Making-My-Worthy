public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Alice", 20));    
    students.add(new Student("Charlie", 19));  
    students.add(new Student("Ethan", 23)); 

    List<Student> filtered = new ArrayList<>();
    for(Student s:list){
        if(s.mark>20){
            filtered.add(s);
        }
    } 
     filtered.sort((a, b) -> b.mark - a.mark);
    for(Student s : filtered){
        System.out.println(s.name);
    }
}