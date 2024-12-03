public class TestPeople {
    public static void main(String[] args) {
        person aPerson;
        Boy Rahul;
        Girl Siri;
        aPerson = new person("Chandu");
        Rahul = new Boy();
        Siri = new Girl("Siri");
        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(Rahul);
        System.out.println(Rahul.talk());
        System.out.println(Rahul.walk());
        System.out.println();

        System.out.println(Siri);
        System.out.println(Siri.talk());
        System.out.println(Siri.walk());
        System.out.println();

        System.out.println((person)Rahul);
        System.out.println(((person)Rahul).talk());
        System.out.println(((person)Rahul).walk());
        System.out.println();

        System.out.println((person)Siri);
        System.out.println(((person)Siri).talk());
        System.out.println(((person)Siri).walk());

        System.out.println();

        System.out.println(person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());
        System.out.println(((Boy)aPerson).talk());






    }
}
