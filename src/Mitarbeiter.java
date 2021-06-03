public class Mitarbeiter {

    private String firstName;
    private String lastName;
    private String function;
    private int entryYear;

    public Mitarbeiter (String firstName, String lastName, String function, int entryYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.function = function;
        this.entryYear = entryYear;
    }
    public String getInfo(String checkStr) {
        switch (checkStr) {
            case "#firstname":
            return this.firstName;
            case "#lastname":
            return this.lastName;
            case "#function":
            return this.function;
            case "#entryYear":
            return this.checkEntryYear();
            default:
            return "arbeitet hier nicht!";
        }
    }
    private String checkEntryYear() {
        return Integer.toString(this.entryYear);
    }
}