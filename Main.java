import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {
  public static void main(String[] args) {
    Person me = new Person("Nick", 21, "blue");
    Person one = new Person("A", 87, "pink");
    Person two = new Person("B", 13, "yellow");
    Person three = new Person("C", 55, "black");
    Person four = new Person ("D", 4, "green");
    ArrayList<Person> people = new ArrayList<Person>();

    people.add(me);
    people.add(one);
    people.add(two);
    people.add(three);
    people.add(four);


try{
  FileWriter toWriteFile = new FileWriter("data.txt");

  BufferedWriter output = new BufferedWriter(toWriteFile);

  for(int i =0; i<people.size(); i++){
   
    output.write(people.get(i).getName());  
    output.newLine();  
    output.write(Integer.toString(people.get(i).getAge())); 
    output.newLine(); 
    output.write(people.get(i).getColor());  
    output.newLine(); 
    output.flush();
  }
  output.close();
}
catch (IOException excpt){
  excpt.printStackTrace();
}
try{
FileReader myFile = new FileReader("data.txt");
BufferedReader reader = new BufferedReader(myFile);

while (reader.ready()){
String name = reader.readLine();
String age = reader.readLine();
String color = reader.readLine();
System.out.printf("%-10s %-10s %-10s %n", name, age, color);
}
reader.close();
}

catch (IOException excpt){
  excpt.printStackTrace();
}

  }
}