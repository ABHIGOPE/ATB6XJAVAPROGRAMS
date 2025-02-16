package B_May_Code.ex_30052024;
import java.util.*;
public class Practice {
    public static void main(String[] args){
        List yo =new ArrayList();
        yo.add("Piano");
        yo.add("Guitar");
        yo.add("Voilin");
        yo.add("Tabla");

        Collections.sort(yo);
        System.out.println(yo);

        yo.remove("Voilin");

        System.out.println(yo);

        for(int i=0; i<yo.size();i++){
            System.out.println(yo.get(i));
        }

        for (Object ob:yo){
            System.out.println(ob);
        }

        Iterator itr=yo.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());


            Vector v1= new Vector();
            v1.add("qwerty");
            v1.add("velocity");
            v1.add("Soul");
            v1.add("Sail");

            System.out.println(v1);

            System.out.println("TYpe---------1");
            Enumeration e= v1.elements();
            while (e.hasMoreElements()){
                System.out.println(e.nextElement());
            }

            System.out.println(v1.isEmpty());
            System.out.println(v1.get(3));
            System.out.println(v1.indexOf("Soul"));


            Stack S1=new Stack();
            S1.push("koyla");
            S1.push("Sand");
            S1.push("Alkatra");
            S1.push("Cement");

            System.out.println(S1.pop());

            System.out.println(S1);

            System.out.println(S1.peek());

            System.out.println(v1);
        }
    }
}
