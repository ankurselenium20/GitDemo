import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import static jdk.internal.org.jline.utils.Colors.s;
//import static jdk.vm.ci.meta.JavaKind.Char;

public class Stream
{
    public static void main(String[] args)
    {
        List<String> a = new ArrayList<String>();
        a.add("nishi");
        a.add("verma");
        a.add("dhriti");

        //System.out.println(a[0]);
      String [] b = new String[3];
        b[0] = "Ankur";
        b[1] = "kumar";
        b[2] = "verma";
  String c = "mummy";


        Arrays.stream(b).filter(s -> s.endsWith("r")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        a.stream().map(s->s.toUpperCase()).forEach(System.out::println);
   //   c.chars().map(Char c-> c.toUpperCase()).forEach(System.out::println);

     //   Arrays.stream(b).sorted()

}}
