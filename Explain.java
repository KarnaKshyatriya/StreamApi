import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Explain {
    public static void main(String args[])
    {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,4,5,6,7,4,5));
        
        list=list.stream().map(x->x*x).collect(Collectors.toList());
        
        Set<Integer> newSet=list.stream().collect(Collectors.toSet());
        System.out.println("Printing List element");
        list.forEach(p-> System.out.print(p+" "));
        System.out.println();
        System.out.println("Printing Set element");
        newSet.forEach(p-> System.out.print(p+" "));
        System.out.println();
System.out.println("Printing the list elements greater than 10");
        list.stream().filter(p->p>10).forEach(p->System.out.print(p+" "));
        System.out.println();
System.out.println("Printing the Set elements greater than 10");
        newSet.stream().filter(p->p>10).forEach(p->System.out.print(p+" "));
            
        }
//



    }
    
