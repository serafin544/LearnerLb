import java.util.ArrayList;
public class Peoples {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person p){
        personList.add(p);
    }


    public void remove(Person p){
        personList.remove(p);
    }
    public void removeByID(long id){
        for(Person tmp: personList){
            if(tmp.getId() == id){
                personList.remove(tmp);
            }
        }
    }



    public String findByID(long id){
        String tmp = " ";
        for(Person p: personList){
            if(p.getId() == id){
                tmp = " " +p.getName();
            }
        }

        return tmp;

    }
    public boolean contains(Person p){
        boolean yon =(personList.contains(p));

        return yon;
    }


}
