import com.googlecode.jmapper.JMapper;

public class Main {
    public static void main(String[] args) {
        JMapper<Destination, Source> mapper = new JMapper<Destination, Source>(Destination.class, Source.class);

        Source source = new Source();
        source.setInner(new InnerClass("Murad", "Imanbayli"));
        source.setInner2(new InnerClass("Ilkin", "Abdullayev"));

        Destination destination = mapper.getDestination(source);

        System.out.println(destination.getName()+" " + destination.getName2());

        JMapper<Source, Destination> jMapper = new JMapper<>(Source.class, Destination.class);

        Destination destination1=new Destination();
        destination.setName("Source Name 1");
        destination.setName2("Source Name 2");

        Source converted = jMapper.getDestination(destination);

        System.out.println(converted.getInner() + " " + converted.getInner2());
    }
}
