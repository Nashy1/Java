package Book4.Chapter6;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Spell {
    public String name;
    public SpellType type;
    public String decription;
    public int price;

    public enum SpellType{SPELL,CHARM,CURSE}

    public Spell(String name, SpellType type, String decription, Integer price) {
        this.name = name;
        this.type = type;
        this.decription = decription;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", decription='" + decription + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparcium", Spell.SpellType.SPELL,
                "Makes invisible ink appear.",20));
        spells.add(new Spell("Avs", Spell.SpellType.SPELL,
                "Launches birds from your wand.",50));
        spells.add(new Spell("Engrgio", Spell.SpellType.CHARM,
                "Enlarges something.",80));
        spells.add(new Spell("Fidlius", Spell.SpellType.CHARM,
                "Hides a secret within someone.",70));
        spells.add(new Spell("Fiite Inatatum", Spell.SpellType.SPELL,
                "Stops all current spells.",60));
        spells.add(new Spell("Locmotor Mrtis", Spell.SpellType.CURSE,
                "Locks an opponent's legs.",40));
//        for (Spell spell : spells)
//            System.out.println(spell.toString());
//        spells.stream().forEach(s -> System.out.println(s));

        //a filtered way
//        for (Spell spell : spells){
//            if (spell.type == SpellType.SPELL){
//                System.out.println(spell);
//            }
//        }

//       double total = spells.stream()
////                .filter(s -> s.type == SpellType.SPELL)
////                .filter(s-> s.name.toLowerCase().startsWith("a"))
////                .mapToDouble(s->s.price)
//                .count();
//
////        System.out.println("Total: "+total);
//        System.out.println("There are: " +total+" spells");



//        OptionalDouble avg = spells.stream()
//                .mapToDouble(s->s.price)
//                .average();
//        if (avg.isPresent())
//        System.out.println("Average = " + avg.getAsDouble());


        spells.parallelStream()
                .forEach(s-> System.out.println("First parallelStream: "+s.name));
        spells.parallelStream()
                .forEach(s-> System.out.println("Second parallelStream: "+s.name));
        spells.parallelStream()
                .forEach(s-> System.out.println("\nLast parallelStream: "+s.name));

    }


}
