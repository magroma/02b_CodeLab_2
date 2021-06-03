public class App {
    public static void main(String[] args) {

        String name = "Name des Mitarbeiters: ";
        String aufgabe = "Arbeitet in: ";
        String entry = "Eintrittsjahr: ";   

        Mitarbeiter mA1 = new Mitarbeiter("Karl", "Heinz", "Entwicklung", 2007);
        ausgabe(name + mA1.getInfo("#firstname") +" " + mA1.getInfo("#lastname"));
        // ausgabe(mA1.getInfo("#lastname"));
        ausgabe(aufgabe + mA1.getInfo("#function"));
        ausgabe(entry + mA1.getInfo("#entryYear"));

        ausgabe("--------------------------");

        Mitarbeiter mA2 = new Mitarbeiter("Heinz", "Dall", "Werbung", 1996);
        ausgabe(name + mA2.getInfo("#firstname") +" " + mA2.getInfo("#lastname"));
        // ausgabe(mA2.getInfo("#lastname"));
        ausgabe(aufgabe + mA2.getInfo("#function"));
        ausgabe(entry + mA2.getInfo("#entryYear"));
        
        ausgabe("--------------------------");

        Mitarbeiter mA3 = new Mitarbeiter("Hans", "Hanz", "Vertrieb", 2002);
        ausgabe(name + mA3.getInfo("#firstname") +" " + mA3.getInfo("#lastname"));
        // ausgabe(mA3.getInfo("#lastname"));
        ausgabe(aufgabe + mA3.getInfo("#function"));
        ausgabe(entry + mA3.getInfo("#entryYear"));
    }
    public static void ausgabe(String outputStr) {
        System.out.println(outputStr);
    }
}
